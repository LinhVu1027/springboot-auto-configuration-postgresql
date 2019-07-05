package com.cloud.postgresql.app;

import com.cloud.postgresql.app.jpa.entity.House;
import com.cloud.postgresql.app.jpa.repository.HouseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class Application {

    @Autowired
    private HouseRepository houseRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init() {
        House whiteHouse = houseRepository.save(new House(1,"White House"));
        log.info(whiteHouse.toString());
    }
}
