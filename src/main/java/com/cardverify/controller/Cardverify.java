package com.cardverify.controller;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cardverify.beans.CardVerifyReq;

@RestController
public class Cardverify {

	@Autowired
	private CardVerifyService cardVerifyService;

	private Logger logger=Logger.getLogger(Cardverify.class);
	
	@PostMapping("/verify-card")
	public CardVerifyReq verify(@RequestBody CardVerifyReq requestEntity) {
//		CardVerifyRes resp = null;
//		if (requestEntity.getCardnum() > 0 && requestEntity.getCvv() > 0
//				&& requestEntity.getExpDate().before(new Date())) {
//			resp = cardVerifyService.verify(requestEntity);
//		}

		return requestEntity;

	}
	
	@GetMapping("/getValue")
	public CardVerifyReq getVavlue() throws FileNotFoundException {
		try {
			int i=1/0;
			
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
		logger.debug("log message "+this.getClass().getSimpleName());
		
		return new CardVerifyReq(1,1,"Sankar",new Date());
	}

}
