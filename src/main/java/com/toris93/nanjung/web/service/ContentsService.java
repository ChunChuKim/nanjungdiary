package com.toris93.nanjung.web.service;

import com.toris93.nanjung.web.domain.ContentsVO;
import com.toris93.nanjung.web.domain.FileVO;

public interface ContentsService {

	FileVO fileDetailService(int bno);

	void fileInsertService(FileVO file);

	void contentsInsertService(ContentsVO contents);

	Object contentsListService();

	Object contentsDetailService(int bno);

	String getExtension(String fileName);

	void contentsUpdateService(ContentsVO contents);

	void contentsDeleteService(int bno);


}
