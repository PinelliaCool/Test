package com.weixin.message.impl;

import com.weixin.message.IMessageHandler;
import com.weixin.message.OutputMessage;
import com.weixin.message.TextOutputMessage;
import com.weixin.spi.InputMessage;

public class DefaultMessageHandler implements IMessageHandler {

	@Override
	public OutputMessage textTypeMsg(InputMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("你的文本消息已经收到！");
        System.out.println("进入文本消息处理方法。。。。。。。。。。");
		return out;
	}

	@Override
	public OutputMessage imageTypeMsg(InputMessage msg) {
		 TextOutputMessage out = new TextOutputMessage();
		out.setContent("你的图片消息已经收到！");
		System.out.println("进入图片消息处理方法。。。。。。。。。。");
		return out;
	}

	@Override
	public OutputMessage voiceTypeMsg(InputMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputMessage videoTypeMsg(InputMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputMessage shortvideoTypeMsg(InputMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputMessage locationTypeMsg(InputMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputMessage linkTypeMsg(InputMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OutputMessage eventTypeMsg(InputMessage msg) {
		// TODO Auto-generated method stub
		return null;
	}

}
