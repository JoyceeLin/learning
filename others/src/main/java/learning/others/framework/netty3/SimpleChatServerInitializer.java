package learning.others.framework.netty3;//package learning.others.framework.netty3;
//
//import io.netty.channel.ChannelInitializer;
//import io.netty.channel.ChannelPipeline;
//import io.netty.channel.socket.SocketChannel;
//import io.netty.handler.codec.DelimiterBasedFrameDecoder;
//import io.netty.handler.codec.Delimiters;
//import io.netty.handler.codec.string.StringDecoder;
//import io.netty.handler.codec.string.StringEncoder;
//
///**
// * Created by MANGOCOOL on 2015/10/30.
// */
//public class SimpleChatServerInitializer extends ChannelInitializer<SocketChannel> {
//
//    @Override
//    public void initChannel(SocketChannel ch) throws Exception
//    {
//        ChannelPipeline pipeline = ch.pipeline();
//
//        pipeline.addLast("framer", new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));
//        pipeline.addLast("decoder", new StringDecoder());
//        pipeline.addLast("encoder", new StringEncoder());
//        pipeline.addLast("handler", new SimpleChatServerHandler());
//
//        System.out.println("client "+ch.remoteAddress() +" 连接上");
//    }
//}
