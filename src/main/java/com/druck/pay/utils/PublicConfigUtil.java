package com.druck.pay.utils;

import java.util.Properties;

public class PublicConfigUtil {
	private static Properties properties = new Properties();
	
	// 通过类装载器装载进来
	static {
		try {
			// 从类路径下读取属性文件
			properties.load(PublicConfigUtil.class.getClassLoader().getResourceAsStream("public_system.properties"));
		} catch (Exception e) {
		}
	}
	
	public static String readConfig(String key) {
		return (String) properties.get(key);
	}
}
