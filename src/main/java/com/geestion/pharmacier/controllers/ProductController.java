package com.geestion.pharmacier.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ProductController {
    @RequestMapping("/createProduct")
    public String createProduct(){
        return "CreateProduct";
    }
}
