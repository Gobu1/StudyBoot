package com.iu.home.board.qna;

import java.sql.Date;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class QnaVO {
	

	private Long num;
	private String title;
	private String writer;
	private String contents;

	
	private MultipartFile [] files;
}
