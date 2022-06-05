package ru.tretyakov.demoserver.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration
public class AppConfig {
    @Bean("date_bean")
    public SimpleDateFormat simpleDateForDate() {
        return new SimpleDateFormat("yyyy-MM-dd");
    }

    @Bean("date_bean")
    public SimpleDateFormat simpleDateFormatForTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH");

    }

}
