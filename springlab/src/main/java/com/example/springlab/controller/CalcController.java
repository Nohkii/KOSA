package com.example.springlab.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    @RequestMapping(value = "/calc")
    public ModelAndView operator(@RequestParam("firstNum") int fNum, @RequestParam("secondNum") int sNum, String operator, HttpServletRequest req) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("refinfo", req.getHeader("referer"));
        switch (operator) {
            case "plus":
                mav.addObject("result", fNum + sNum);
                break;
            case "minus":
                mav.addObject("result", fNum - sNum);
                break;
            case "multiply":
                mav.addObject("result", fNum * sNum);
                break;
            case "divide":
                if(sNum==0){
                    mav.addObject("result", "나눗셈 연산시 두 번째 숫자는 0일 수 없습니다!!");
                    mav.setViewName("errorResult");
                    return mav;
                }else {
                    mav.addObject("result", fNum / sNum);
                }
                break;
        }
        mav.setViewName("calcResult");
        return mav;
    }
}