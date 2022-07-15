package com.cardverify.controller;

import org.springframework.stereotype.Service;

import com.cardverify.beans.CardVerifyReq;
import com.cardverify.beans.CardVerifyRes;

@Service
public class CardVerifyService {

	public CardVerifyRes verify(CardVerifyReq request) {

		CardVerifyRes cardVerifyRes = new CardVerifyRes();
		cardVerifyRes.setStatusCode(200);
		cardVerifyRes.setMsg("success");
		cardVerifyRes.setDescription("it is valid card");

		return cardVerifyRes;

	}
}
