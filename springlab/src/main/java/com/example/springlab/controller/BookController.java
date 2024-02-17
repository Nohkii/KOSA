package com.example.springlab.controller;

import com.example.springlab.dao.BookMapper;
import com.example.springlab.domain.BookDTO;
import com.example.springlab.domain.BookResultDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {
    @Autowired
    BookMapper dao;
    @GetMapping("/book/main") // 메인
    public String main() {
        return "bookPage";
    }
    @GetMapping("/book/{bnum}")
    public ModelAndView list(@PathVariable("bnum") String bnum ) {
        List<BookDTO> list = new ArrayList<>();
        List<BookResultDTO> dList = new ArrayList<>();
        ModelAndView mav = new ModelAndView();
        switch(bnum){
            case "b1" :
                list = dao.list();
                break;
            case "b2" :
                list = dao.highPriceOrderList();
                break;
                case "b3" :
                list = dao.limitPriceList();
                break;
            case "b4" :
                list = dao.webProgrammingList();
                break;
            case "b5" :
                list = dao.dataNInfraList();
                break;
            case "b6" :
                list = dao.javaList();
                break;
            case "b7" :
                dList = dao.averagePrice();
                break;
        }
        if (!list.isEmpty()) {
            mav.addObject("list", list);
        }else if(!dList.isEmpty()) {
            mav.addObject("list", dList);
        }
        else {
            mav.addObject("msg", "추출된 결과가 없어요.");
        }
        mav.setViewName("bookPage");
        return mav;
    }
    @PostMapping("/book/bookCreate")
    public ModelAndView insert(BookDTO dto) {
        boolean result = dao.insert(dto);
        ModelAndView mav = new ModelAndView();
        if (result) {
            mav.addObject("list", dao.list());
        } else {
            mav.addObject("msg", "글 작성을 처리하는 동안 오류 발생");
        }
        mav.setViewName("bookPage");
        return mav;
    }
}
