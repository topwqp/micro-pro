package com.xs.micro.up.domain.service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClickImpl implements Click {


    @Override
    public void click() {
        log.info("call click action...");
    }
}
