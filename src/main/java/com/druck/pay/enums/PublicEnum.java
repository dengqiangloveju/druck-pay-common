package com.druck.pay.enums;


/**
 * 公共枚举. 针对只有“是”，“否”两种状态
 * @author zh
 */
public enum PublicEnum {

	YES("是"),

	NO("否");

	/** 描述 */
	private String desc;

	private PublicEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
