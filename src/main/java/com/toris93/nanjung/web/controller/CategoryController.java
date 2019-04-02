package com.toris93.nanjung.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toris93.nanjung.web.service.CategoryService;


@Controller
public class CategoryController {

	@Resource(name = "com.toris93.nanjung.web.service.CategoryService")
	CategoryService categoryService;
	
	@RequestMapping("/categoryList") // 게시판 리스트 화면 호출
	private String categoryList(Model model) throws Exception {

		model.addAttribute("categorylist", categoryService.getCategoryList());

		return "list"; // 생성할 jsp
	}
	
}
