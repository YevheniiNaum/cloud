package com.example.helloworldlab2.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/calculator")
class CalculatorController {

    @GetMapping("")
    fun calculatePage(model: Model, @RequestParam(value = "plantType", required = false) plantType: String? = ""): String {
        model.addAttribute("plantType", plantType)
        return "calculator"
    }

    @PostMapping("/calculate")
    fun calculate(@ModelAttribute("plantType") plantType: String?, model: Model): String {
        return "redirect:/calculator?plantType=$plantType"
    }

}