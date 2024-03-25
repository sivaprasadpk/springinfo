package com.sathya.spring;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Person {
	private int personId;
	private String personName;
	

}
