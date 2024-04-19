package com.fastcampus.projectboardadmin.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "forward:/management/articles";
    }

    @ModelAttribute("requestURI")
    public String requestURI(final HttpServletRequest request) {
        return request.getRequestURI();
    }

    @ModelAttribute("startsWithManagement")
    public String startsWithManagement(final HttpServletRequest request) {
        if(request.getRequestURI().startsWith("/management")){
            return  "/management";
        };
        return "";
    }

    @ModelAttribute("startsWithAdmin")
    public String startsWithAdmin(final HttpServletRequest request) {
        if(request.getRequestURI().startsWith("/admin")){
            return  "/admin";
        };
        return "";
    }

}
