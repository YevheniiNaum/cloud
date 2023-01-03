package com.example.helloworldlab2.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class HomeController {

    @GetMapping("/")
    fun userPage(model: Model): String {
//        model.addAttribute("id", user.id)
//        model.addAttribute("username", user.username)
//        model.addAttribute("rateLimit", user.rateLimit)
//        model.addAttribute("errorFlag", user.errorFlag)

        return "home"
    }

}