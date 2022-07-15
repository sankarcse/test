package com.cardverify.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class CardVerifyReq {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cardnum;
	
	private int cvv;
	private String nameOnCard;
	private Date expDate;
	
	
}
