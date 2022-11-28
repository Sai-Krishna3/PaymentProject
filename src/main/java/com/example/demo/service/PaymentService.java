package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Payment;
import com.example.demo.exception.PaymentException;

public interface PaymentService {

	
	
	public List<Payment> getAllTransactions()throws PaymentException;

	public Payment getTransactionById(int transactionId) throws PaymentException;

	public void deleteTransaction(int transactionId)throws PaymentException;

	/*public Payment updatePayment(int transactionId, Payment payment)throws PaymentException;*/

	public Payment addPayment(Payment payment);



}
