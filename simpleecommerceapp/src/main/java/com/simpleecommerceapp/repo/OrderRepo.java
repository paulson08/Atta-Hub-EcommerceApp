package com.simpleecommerceapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpleecommerceapp.entity.Order;
import com.simpleecommerceapp.entity.User;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
	
	public List<Order> findByUser(User user);

}