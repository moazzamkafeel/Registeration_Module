package com.dto;

import java.util.List;

public class PinCodeDataDTO {
    private String currentDate;
    private List<PinCodeDTO> data;
    
    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public List<PinCodeDTO> getData() {
        return data;
    }

    public void setData(List<PinCodeDTO> data) {
        this.data = data;
    }

	public PinCodeDataDTO(String currentDate, List<PinCodeDTO> data) {
		super();
		this.currentDate = currentDate;
		this.data = data;
	}

	 public PinCodeDataDTO() {
	    }
    
}


