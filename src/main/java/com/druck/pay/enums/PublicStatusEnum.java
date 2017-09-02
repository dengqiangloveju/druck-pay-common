package com.druck.pay.enums;


/**
 * 公共状态枚举. 只有 (冻结) 与(激活) 两种状态
 * 
 * @author along
 */
public enum PublicStatusEnum {

	ACTIVE("激活"),

	UNACTIVE("冻结");

	/** 描述 */
	private String desc;

	private PublicStatusEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
