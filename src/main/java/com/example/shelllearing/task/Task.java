package com.example.shelllearing.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Aiden
 * @version 1.0
 * @description
 * @date 2021-4-3 14:04:26
 */

@Slf4j
@Component
public class Task {

    // 定时任务 程序启动10秒后开始执行 每5秒执行一次
    @Scheduled(initialDelay = 1000 * 10, fixedRate = 1000 * 5)
    public void taskEchoData() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatTime = formatter.format(now);
        log.info("你好, 当前时间为:::{}", formatTime);
    }
}
