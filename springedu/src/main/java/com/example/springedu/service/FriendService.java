package com.example.springedu.service;

import org.springframework.stereotype.Service;

import com.example.springedu.domain.FriendDTO;

@Service // 서비스 역할을 하는 클래스다~ 알려줌
public class FriendService {
	public FriendDTO get(int num) {
		FriendDTO vo = null;
		if (num == 10) {
			vo = new FriendDTO();
			vo.setPhoneNum("010-1111-2222");
			vo.setName("Dooly");			
		}
		return vo;
	}
}
