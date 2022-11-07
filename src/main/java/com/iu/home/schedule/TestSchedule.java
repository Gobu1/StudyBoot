package com.iu.home.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestSchedule {
	
	
	
	@Scheduled(cron = "* * * * * *")
	public void cron() {
		log.info("cron 매초 실행");
	}
	
//	@Scheduled(fixedRate = 3000, initialDelayString = "1000" )
//	public void ts1() {
//		log.info("스케쥴 실행 -----");
//	}
}