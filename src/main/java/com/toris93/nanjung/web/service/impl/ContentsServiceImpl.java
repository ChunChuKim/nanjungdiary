package com.toris93.nanjung.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toris93.nanjung.web.dao.ContentsMapper;
import com.toris93.nanjung.web.domain.ContentsVO;
import com.toris93.nanjung.web.domain.FileVO;
import com.toris93.nanjung.web.service.ContentsService;

@Service("com.toris93.nanjung.web.service.ContentsService")
public class ContentsServiceImpl implements ContentsService{

	@Autowired
	ContentsMapper contentsRepository;
	

	@Override
	public List<ContentsVO> contentsList() {
		// TODO Auto-generated method stub
		return contentsRepository.getContentsList();
	}


	@Override
	public FileVO fileDetail(int bno) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void fileInsert(FileVO file) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void contentsInsert(ContentsVO contents) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ContentsVO contentsDetail(int bno) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getExtension(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void contentsUpdate(ContentsVO contents) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void contentsDelete(int bno) {
		// TODO Auto-generated method stub
		
	}


}
