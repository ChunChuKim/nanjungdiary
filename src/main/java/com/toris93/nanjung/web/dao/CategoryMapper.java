package com.toris93.nanjung.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.toris93.nanjung.web.domain.CategoryVO;

@Repository
@Mapper
public interface CategoryMapper {

	public List<CategoryVO> getCategoryList();
}
