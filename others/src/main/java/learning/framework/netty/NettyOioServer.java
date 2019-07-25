package learning.framework.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.oio.OioServerSocketChannel;
import io.netty.util.CharsetUtil;

import java.net.InetSocketAddress;

/**
 * @Author Lin JingHui
 * @Date 2019/3/26
 */
public class NettyOioServer {
    public void server(int port) {
        final ByteBuf buf = Unpooled.unreleasableBuffer(Unpooled.copiedBuffer("Hi\r\n", CharsetUtil.UTF_8));
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            // b.group(group).channel(NioServerSocketChannel.class).localAddress(...)
            b.group(group).channel(OioServerSocketChannel.class).localAddress(new InetSocketAddress(port)).childHandler(new ChannelInitializer<Channel>() {
                @Override
                protected void initChannel(Channel channel) throws Exception {
                    channel.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                      @Override
                      public void channelActive(ChannelHandlerContext ctx) {
                          ctx.writeAndFlush(buf.duplicate()).addListener(ChannelFutureListener.CLOSE);
                      }
                    });
                }
            });
            ChannelFuture f = b.bind().sync();
            f.channel().closeFuture().sync();
        } catch (Exception e) {
            group.shutdownGracefully();
        }
    }
}
