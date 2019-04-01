package com.toris93.nanjung.web.service;

import java.util.List;

import com.toris93.nanjung.web.domain.UserVO;

public interface UserService {

	public UserVO getUser(UserVO user);
	
	public List<UserVO> getUserList();
	
	public int insertUser(UserVO user);

}
