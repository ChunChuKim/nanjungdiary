package com.toris93.nanjung.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toris93.nanjung.web.dao.CategoryMapper;
import com.toris93.nanjung.web.domain.CategoryVO;
import com.toris93.nanjung.web.service.CategoryService;

@Service("com.toris93.nanjung.web.service.CategoryService")
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryMapper categoryRepository;
	
	public List<CategoryVO> getCategoryList() {
		return categoryRepository.getCategoryList();
	}
}
