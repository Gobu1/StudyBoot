package com.iu.home.board.qna;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.iu.home.util.FileManager;
import com.iu.home.util.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional(rollbackFor = Exception.class)
public class QnaService {
	
	@Autowired
	private QnaMapper qnaMapper;
	@Autowired
	private FileManager fileManager;
	@Value("${app.upload.qna}")
	private String path;
	
	public List<QnaVO> getList(Pager pager)throws Exception{
		pager.getRowNum();
		return qnaMapper.getList(pager);
	}
	
	public int setAdd(QnaVO qnaVO)throws Exception{

		int result = qnaMapper.setAdd(qnaVO);
		
		File file = new File(path);
		
		if(!file.exists()) {
			boolean check=file.mkdirs();
		}
	
		
		for(MultipartFile f : qnaVO.getFiles()) {
			if(!f.isEmpty()) {
				log.info("FileName : {}", f.getOriginalFilename());
				log.info("패스테스트");
				log.info("filepath : {}", path);
				String fileName = fileManager.saveFile(f, path);
				log.info("테스트 파일테임 {}", fileName);
				QnaFileVO qnaFileVO = new QnaFileVO();
				qnaFileVO.setFileName(fileName);
				qnaFileVO.setOriName(f.getOriginalFilename());
				qnaFileVO.setNum(qnaVO.getNum());
				qnaMapper.setFileAdd(qnaFileVO);
				log.info("테스트2");
				
			}
		}
		
		return result;
	
	}
}
