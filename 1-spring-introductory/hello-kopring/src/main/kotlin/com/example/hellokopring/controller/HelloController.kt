package com.example.hellokopring.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloController {
    @GetMapping("hello")
    fun hello(model: Model): String {
        model.addAttribute("data", "mildsalmon")
        return "hello"
    }

    @GetMapping("hello-mvc")
    fun hellMvc(
        @RequestParam("name") name: String,
        model: Model,
    ): String {
        model.addAttribute("name", name)
        return "hello-template"
    }

    @GetMapping("hello-string")
    @ResponseBody
    fun helloString(
        @RequestParam("name") name: String,
    ): String {
        return "hello  $name"
    }

    @GetMapping("hello-api")
    @ResponseBody
    fun helloApi(
        @RequestParam("name") name: String,
    ): Hello {
        val hello: Hello = Hello()
        hello.name = name

        return hello
    }

    class Hello {
        var name: String? = null
    }
}
