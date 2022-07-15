package com.cardverify.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class CardVerifyRes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusCode;
	
	private String msg;
	
	private String description;
	
	
	

}
