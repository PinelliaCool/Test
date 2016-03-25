package com.weixin.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.weixin.Configuration;
import com.weixin.message.IMessageHandler;
import com.weixin.message.OutputMessage;
import com.weixin.spi.InputMessage;

public class Test01 {

	private InputMessage inputMsg = null;
	private static IMessageHandler messageHandler = null;
	private static String defaultHandler = "org.weixin4j.spi.DefaultMessageHandler";
	@Before
	public void init(){		
		inputMsg = new InputMessage();
		inputMsg.setMsgType("image");
		System.out.println("init()..................");
	}
	@After
	public void destory(){
		System.out.println("destory()...............");
	}
	/**
	 *基于不同传入，进行不同 方法调用
	 */
	@Test
	public void test(){
        OutputMessage outputMsg = null;
		defaultHandler=Configuration.getProperty("weixin.deal",defaultHandler);
		try {
			Class<?> clazz =Class.forName(defaultHandler);
			messageHandler = (IMessageHandler) clazz.newInstance();
			Method mt = messageHandler.getClass().getMethod(inputMsg.getMsgType() + "TypeMsg", InputMessage.class);
			outputMsg = (OutputMessage)mt.invoke(messageHandler, inputMsg);
			System.out.println(outputMsg.toString());
		} catch (ClassNotFoundException e) {
			System.out.println("找不到：" + defaultHandler + "类！");
			e.printStackTrace();
		} catch (InstantiationException e) {
			System.out.println("初始化：messageHandler异常！");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			System.out.println("无法获取相关方法！");
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("test()..................");
	}
}
