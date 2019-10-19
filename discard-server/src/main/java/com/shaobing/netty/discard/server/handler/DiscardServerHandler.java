package com.shaobing.netty.discard.server.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

/**
 * @author llpin
 * @version V1.0
 * @ClassName DiscardServerHandler
 * @Description
 * @time 2019/10/19 18:05
 */
@Slf4j
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg){
        log.debug("msg = {}", msg);
        ((ByteBuf)msg).release();
    }
}
