package com.yunhongmin.springboot.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainControllers {
    @GetMapping("/")
    public SimpleResponse main(HttpServletRequest request) {
        String sourceAddr = request.getRemoteAddr();
        String destAddr = request.getServerName();
        String response = "source_addr: " + sourceAddr + ", dest_addr: " + destAddr;
        return new SimpleResponse(response);
    }

    @Getter
    class SimpleResponse {
        private String data;

        public SimpleResponse(String data) {
            this.data = data;
        }
    }
}
