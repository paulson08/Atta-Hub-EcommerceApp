package com.simpleecommerceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpleecommerceapp.entity.Message;

public interface ContactRepo extends JpaRepository<Message, Long> {

}