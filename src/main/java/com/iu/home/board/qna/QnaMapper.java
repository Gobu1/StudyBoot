package com.iu.home.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iu.home.util.Pager;

@Mapper
public interface QnaMapper {
	
	public List<QnaVO> getList(Pager pager)throws Exception;
	
	public int setAdd(QnaVO qnaVO)throws Exception;
		
	public int setFileAdd(QnaFileVO qnaFileVO)throws Exception;

}
