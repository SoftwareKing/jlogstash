package com.dtstack.logstash.exception;

/**
 * 
 * Reason: TODO ADD REASON(可选)
 * Date: 2016年8月31日 下午1:26:07
 * Company: www.dtstack.com
 * @author sishu.yss
 *
 */
@SuppressWarnings("serial")
public class LogstashException extends Exception{
	
	public LogstashException(String message){
		super(message);
	}

}
