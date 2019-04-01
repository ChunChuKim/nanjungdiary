package com.toris93.nanjung.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toris93.nanjung.web.dao.UserMapper;
import com.toris93.nanjung.web.domain.UserVO;
import com.toris93.nanjung.web.service.UserService;

@Service("userservice")
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userRepository;
	
	
	public UserVO getUser(UserVO user) {
		return userRepository.getUser(user);
	}
	
	public int insertUser(UserVO user) {
		return userRepository.insertUser(user);
	}
	
	public List<UserVO> getUserList(){
		return userRepository.getUserList();
	}
}
