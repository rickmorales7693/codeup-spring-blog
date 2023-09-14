package edu.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "posts/index";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String show() {
        return "posts/show";
    }

    @GetMapping("/create")
    @ResponseBody
    public String create() {
        return "posts/create";
    }

    @GetMapping("/create")
    @RequestMapping("/create")
    @ResponseBody
    public String insert() {
        return "posts/insert";
    }

}
