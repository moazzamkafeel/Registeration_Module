package com.controllers;

public class RestResponse<T> {
	
	 /** The response message. */
	  private String responseMessage;

	  /** The response status. */
	  private Boolean responseStatus = true;
	  
	  /** The response status code. */
	  private Integer responseStatusCode = 200;

	  /** The response object. */
	  private T responseObject;
	  


}
