package com.example.gateway_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GatewayController {

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of("message", "Gateway is running!");
    }
}
