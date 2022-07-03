package net.openwebinars.springboot.i18n.controller;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class MainController {


    @GetMapping("/")
    public String index(HttpServletRequest request) {
        return "index";
    }


}
