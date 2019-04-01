package com.toris93.nanjung.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.toris93.nanjung.web.domain.UserVO;

@Repository
@Mapper
public interface UserMapper {

	public UserVO getUser(UserVO user);
	
	public int insertUser(UserVO user);
	
	public List<UserVO> getUserList();
}
