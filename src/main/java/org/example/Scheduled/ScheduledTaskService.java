package org.example.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    //定时任务
    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    //定时任务 5秒刷新一下
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒刷新一下" + dataFormat.format(new Date()));
    }

    //秒 分 时 日 月 星期
    @Scheduled(cron = "0/5 55 12 * * *")
    public void FixTimeExctution() {
        System.out.println("指定时间执行" + dataFormat.format(new Date()));
    }
}
