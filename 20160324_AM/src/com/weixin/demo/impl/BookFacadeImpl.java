package com.weixin.demo.impl;

import com.weixin.demo.BookFacade;
import com.weixin.spi.InputMessage;

public class BookFacadeImpl implements BookFacade {  

	@Override
	public void allType(InputMessage msg) {
		System.out.println("信息已收到！");
	}  
  
}  
