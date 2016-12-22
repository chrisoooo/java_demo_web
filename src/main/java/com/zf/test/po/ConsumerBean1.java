package com.zf.test.po;

import java.io.Serializable;

/**
 * Created by chris on 16/9/21.
 */
public class ConsumerBean1 implements Serializable {

	private String interfaceName;

	private String version;

	private String methodName;

	private Object[] args;

	private static final long serialVersionUID = 1L;

	public String getInterfaceName() {
		return interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}
}
