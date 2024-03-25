package com.sathya.springboot;


import java.time.LocalDate;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product 
{
	@Id
	private int proId;
	private String proName;
	private double proPrice;
	
	@CreatedBy
	private String createAt;
	
	@CreatedDate
	private LocalDate updateAt;
	
	
}
