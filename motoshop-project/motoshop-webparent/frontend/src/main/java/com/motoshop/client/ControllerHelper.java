package com.motoshop.client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.motoshop.client.costomer.CustomerService;
import com.motoshop.common.entity.Customer;

@Component
public class ControllerHelper {

	@Autowired
	private CustomerService customerService;

	public Customer getAuthenticatedCustomer(HttpServletRequest request) {
		String email = Utility.getEmailOfAuthenticatedCustomer(request);
		return customerService.getCustomerByEmail(email);
	}
}
