/**
 * 项目名称: 20160324_AM
 * 创建日期: 2016年3月24日
 * 创建时间: 下午12:06:06
 */
package com.weixin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.AccessControlException;
import java.util.Properties;

import org.junit.Test;

/**
 * 用于加载配置文件
 */
public class Configuration {

	private static Properties defaultProperty;

	static {
		init();
	}

	static void init() {
		defaultProperty = new Properties();
		String path = "weixin.properties";
		boolean load = loadProperties(defaultProperty, "." + File.separatorChar + path)
				|| loadProperties(defaultProperty, Configuration.class.getClassLoader().getResourceAsStream(path));;
		if (!load) {
			System.out.println("加载微信配置文件失败。。。。。。。。。。。。！");
		}
	}

	/**
	 * 加载配置文件
	 */
	private static boolean loadProperties(Properties props, String path) {
		File file = new File(path);
		try {
			if (file.exists() && file.isFile()) {
				props.load(new FileInputStream(file));
				return true;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 加载属性文件
	 *
	 * @param props
	 *            属性文件实例
	 * @param is
	 *            属性文件流
	 * @return 是否加载成功
	 */
	private static boolean loadProperties(Properties props, InputStream is) {
		try {
			if (is != null) {
				props.load(is);
				return true;
			}
		} catch (IOException ignore) {
			// 异常忽略
			ignore.printStackTrace();
		}
		return false;
	}

	/**
	 * 获取 是否为调试模式
	 *
	 * @return 是否为调试模式
	 */
	public static boolean isDebug() {
		return getBoolean("weixin.debug");
	}

	public static boolean getBoolean(String name) {
		String value = getProperty(name);
		return Boolean.valueOf(value);
	}

	public static int getIntProperty(String name) {
		String value = getProperty(name);
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException nfe) {
			return -1;
		}
	}

	public static int getIntProperty(String name, int fallbackValue) {
		String value = getProperty(name, String.valueOf(fallbackValue));
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException nfe) {
			return -1;
		}
	}

	/**
	 * 获取属性值
	 *
	 * @param name
	 *            属性名称
	 * @return 属性值
	 */
	public static String getProperty(String name) {
		return getProperty(name, null);
	}

	/**
	 * 获取属性值
	 * 
	 * @param name
	 *            属性名
	 * @param fallbackValue
	 *            默认返回值
	 * @return 属性值
	 */
	public static String getProperty(String name, String fallbackValue) {
		String value;
		try {
			// 从全局获取系统获取
			value = System.getProperty(name, null);
			if (null == value) {
				value = defaultProperty.getProperty(name, fallbackValue);
			}
		} catch (AccessControlException e) {
			value = fallbackValue;
		}
		return value;
	}

	@Test
	public void test() {
		System.out.println(isDebug());
	}
}
