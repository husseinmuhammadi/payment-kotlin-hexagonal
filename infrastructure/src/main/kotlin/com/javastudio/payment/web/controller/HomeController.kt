package com.javastudio.payment.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {

    @GetMapping("/index")
    @ResponseBody
    fun index():String{
        return "It is working!"
    }
}