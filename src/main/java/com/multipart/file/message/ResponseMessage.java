/**
 *
 */
package com.multipart.file.message;

/**
 * @author manoranjan
 *
 */
public class ResponseMessage {

	private String message;

	/**
	 *
	 */
	public ResponseMessage() {

	}

	/**
	 * @param message
	 */
	public ResponseMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
