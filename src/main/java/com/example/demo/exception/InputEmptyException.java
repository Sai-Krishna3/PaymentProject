package com.example.demo.exception;

import com.example.demo.entity.Payment;

public class InputEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public InputEmptyException(String message) {
    	super(message);
    }
    
	public static boolean validatePaymentBody(Payment payment) {
		// TODO Auto-generated method stub
		return false;
	}
}
