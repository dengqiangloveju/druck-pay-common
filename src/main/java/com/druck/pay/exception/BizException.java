package com.druck.pay.exception;

public class BizException extends RuntimeException {

	private static final long serialVersionUID = 6673396161463053882L;
	/**
     * 具体异常码
     */
	protected int code;
	/**
     * 异常信息
     */
    protected String msg;
    
    public BizException() {
        super();
    }
    
    public BizException(String message) {
        super(message);
    }
    
    public BizException(Throwable cause) {
        super(cause);
    }
    
    public BizException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public BizException(int code, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
        this.msg = String.format(msgFormat, args);
    }

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
    
}
