package com.example.bt03_database_auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bt03_database_authController {

    @GetMapping("/")
    public String home() {
        return "Xin chào! Hệ thống Spring Security Database Authentication đang hoạt động bình thường.";
    }

    @GetMapping("/admin/hello")
    public String adminAccess() {
        return "Xin chào ADMIN! Bạn đã truy cập thành công khu vực quản trị.";
    }

    @GetMapping("/manager/hello")
    public String managerAccess() {
        return "Xin chào MANAGER! Bạn đã truy cập thành công khu vực quản lý.";
    }

    @GetMapping("/user/hello")
    public String userAccess() {
        return "Xin chào USER! Bạn đã truy cập thành công khu vực người dùng.";
    }
}