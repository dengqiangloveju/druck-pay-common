package com.druck.pay;

import org.junit.Test;

import com.druck.pay.utils.CommonUtils;

public class CommonTest {
	@Test
	public void testNULL() throws Exception {
		String str = "dsfdsf";
		if(CommonUtils.isNotEmpty(str)) {
			System.out.println("============>"+str);
		} else {
			System.out.println("============>"+null);
			System.out.println("============>2");
		}
	}
}
