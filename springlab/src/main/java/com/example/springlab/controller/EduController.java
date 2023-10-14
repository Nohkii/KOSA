package com.example.springlab.controller;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/educontroller")
public class EduController {
    @PostMapping
    public ModelAndView get_score(int avgScore, String name, HttpServletRequest req) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", name);
        mav.addObject("refinfo", req.getHeader("referer"));
        if (avgScore >= 90) {
            mav.addObject("avgScore", "A");
            mav.setViewName("gradeA");
        } else if (avgScore >= 80) {
            mav.addObject("avgScore", "B");
            mav.setViewName("gradeB");
        } else if (avgScore >= 70) {
            mav.addObject("avgScore", "C");
            mav.setViewName("gradeC");
        } else {
            mav.addObject("avgScore", "D");
            mav.setViewName("gradeD");
        }
        return mav;
    }
}