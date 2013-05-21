/**
 * 
 */
package rs.in.staleksit.learning.mandrill.handlers;

import java.io.Serializable;

/**
 * @author aleksandar
 *
 */
public class ErrorResponse implements Serializable {
	private static final long serialVersionUID = -3664159609040261435L;
	
	private String status;
	private Integer code;
	private String name;
	private String message;
	
	public ErrorResponse() {
		
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
