package com.weixin.test;

import org.junit.Test;

import com.weixin.demo.BookFacade;
import com.weixin.demo.BookFacadeProxy;
import com.weixin.demo.impl.BookFacadeImpl;
import com.weixin.spi.InputMessage;

public class Test02 {

	@Test
	public void test() {
		InputMessage msg = new InputMessage();
		msg.setMsgType("text");
		BookFacadeProxy proxy = new BookFacadeProxy();
		BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());
		bookProxy.allType(msg);
	}

}
