package com.bjsxt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 完成页面跳转控制器
 */
@Controller
@RequestMapping("/page")
public class PageController {
    @RequestMapping("/{page}/{userid}")
    public String showPage(@PathVariable("page") String p, @PathVariable("userid") int i, Model model){
        model.addAttribute("msg",i);
        return p;
    }
}
