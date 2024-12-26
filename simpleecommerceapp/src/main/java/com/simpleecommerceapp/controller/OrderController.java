package com.simpleecommerceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.simpleecommerceapp.entity.Order;
import com.simpleecommerceapp.service.OrderService;

import ch.qos.logback.core.model.Model;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	
}