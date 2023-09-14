package edu.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping("")
    @ResponseBody
    public String index() {
        return "posts index page";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String show(@PathVariable long id) {
        return String.format("view an individual post with id of %s", id);
    }

    @GetMapping("/create")
    @ResponseBody
    public String create() {
        return "view the form for creating a post";
    }

    @PostMapping("/create")
    @ResponseBody
    public String createNewPost(@RequestParam String title, @RequestParam String body) {
        return String.format("create a new post with title of %s and body of %s", title, body);
    }

}
