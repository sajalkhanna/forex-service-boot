package com.sk.springboot.microservice.forex.forexservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.springboot.microservice.forex.forexservice.model.ExchangeValue;

public interface ExchangeValueRepository extends 
JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);

}
