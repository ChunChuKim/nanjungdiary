package com.toris93.nanjung.web.service;

import java.util.List;

import com.toris93.nanjung.web.domain.ContentsVO;
import com.toris93.nanjung.web.domain.FileVO;

public interface ContentsService {

	public FileVO fileDetail(int bno);

	public void fileInsert(FileVO file);

	public void contentsInsert(ContentsVO contents);

	public ContentsVO contentsDetail(int bno);

	public String getExtension(String fileName);

	void contentsUpdate(ContentsVO contents);

	void contentsDelete(int bno);

	public List<ContentsVO> contentsList();


}
