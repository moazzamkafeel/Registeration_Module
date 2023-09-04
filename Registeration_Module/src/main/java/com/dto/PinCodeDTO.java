package com.dto;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PinCodeDTO {
	
	    private String pinCode;
	    private String status;
	    private Long count;
	    
		public PinCodeDTO(String pinCode, String status, Long count) {
			super();
			this.pinCode = pinCode;
			this.status = status;
			this.count = count;
		}
		public String getPinCode() {
			return pinCode;
		}
		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Long getCount() {
			return count;
		}
		public void setCount(Long count) {
			this.count = count;
		}

	}

