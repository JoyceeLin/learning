package learning.others.framework.netty3;//package learning.others.framework.netty3;
//
//import io.netty.channel.ChannelHandlerContext;
//import io.netty.channel.SimpleChannelInboundHandler;
//
///**
// * Created by MANGOCOOL on 2015/10/30.
// */
//public class SimpleChatClientHandler extends  SimpleChannelInboundHandler<String> {
//
////    优先级高于messageReceived方法，有了这个方法就会屏蔽messageReceived方法
////    @Override
////    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
////        System.out.println(msg.toString());
////    }
//
//    @Override
//    protected void messageReceived(ChannelHandlerContext ctx, String msg)
//            throws Exception {
//        System.out.println(msg);
//    }
//}