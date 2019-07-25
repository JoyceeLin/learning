package learning.framework.netty;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @Author Lin JingHui
 * @Date 2019/3/26
 */
public class PlainNioServer {

    public void server(int port) throws Exception {
        System.out.println("Listenering for connections on port" + port);
        Selector selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.bind(new InetSocketAddress(port));
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        final ByteBuffer msg = ByteBuffer.wrap("Hi\r\n".getBytes());
        while (true) {
            int n = selector.select();
            if (n > 0) {
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    iterator.remove();
                    try {
                        if (key.isAcceptable()) {
                            ServerSocketChannel server = (ServerSocketChannel) key.channel();
                            SocketChannel client = server.accept();
                            System.out.println("Accepted connection from " + client);
                            client.configureBlocking(false);
                            client.register(selector, SelectionKey.OP_WRITE, msg.duplicate());
                        }
                        if (key.isWritable()) {
                            SocketChannel client = (SocketChannel) key.channel();
                            ByteBuffer buff = (ByteBuffer) key.attachment();
                            while (buff.hasRemaining()) {
                                if (client.write(buff) == 0) {
                                    break;
                                }
                            }
                            client.close();
                        }
                    } catch (Exception e) {
                        key.cancel();
                        key.channel().close();
                    }
                }
            }
        }
    }
}
