package com.example.springnews.controller;

import com.example.springnews.model.News;
import com.example.springnews.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class NewsController {
    @Autowired
    NewsRepository newsR;

    @GetMapping("/newsmain")
    public ModelAndView list() {
        List<News> list = newsR.findAll();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        for (News news : list) {
            LocalDateTime writedate = news.getWritedate();
            String formattedDate = writedate.format(formatter);
            news.setWritedate(LocalDateTime.parse(formattedDate, formatter));
        }
        ModelAndView mav = new ModelAndView();
        if (!list.isEmpty()) {
            mav.addObject("list", list);
        } else {
            mav.addObject("msg", "뉴스가 없습니다.");
        }
        mav.setViewName("newsView");
        return mav;
    }

    @PostMapping("/insert")
    @Transactional
    public ModelAndView insert(News vo) {
        System.out.println("등록한 뉴스 " + vo);
        ModelAndView mav = new ModelAndView();
        try {
            newsR.save(vo);
            mav.addObject("list", newsR.findAll());
        } catch (Exception e) {
            mav.addObject("msg", "뉴스 작성을 실패했습니다.");
        }
        mav.setViewName("newsView");
        return mav;
    }

    @PostMapping("/update")
    @Transactional
    public ModelAndView update(News vo) {
        System.out.println("수정한 뉴스:" + vo);
        ModelAndView mav = new ModelAndView();
        try {
            News newvo = newsR.findById(vo.getId()).get();
            newvo.setContent(vo.getContent());
            newvo.setTitle(vo.getTitle());
            mav.addObject("list", newsR.findAll());
        } catch (Exception e) {
            mav.addObject("msg", "뉴스 수정을 실패했습니다.");
        }
        mav.setViewName("newsView");
        return mav;
    }

    @GetMapping("/delete")
    @Transactional
    public ModelAndView delete(int id) {
        ModelAndView mav = new ModelAndView();
        try {
            newsR.deleteById(id);
            mav.addObject("list", newsR.findAll());
        } catch (Exception e) {
            mav.addObject("msg", "삭제를 처리하는 동안 오류 발생");
        }
        mav.setViewName("newsView");
        return mav;
    }

    @RequestMapping(value = "/one", produces = "application/json; charset=utf-8")
    @ResponseBody
    public News one(int id) {
        ModelAndView mav = new ModelAndView();
        News news = newsR.findById(id).get();
        news.setCnt(news.getCnt() + 1);
        newsR.save(news);
        return news;
    }

    @GetMapping("/search")
    public ModelAndView search(String keyword) {
        ModelAndView mav = new ModelAndView();
        try {
            List<News> list = newsR.findByContentContains(keyword);
            mav.addObject("list", list);
        } catch (Exception e) {
            mav.addObject("msg", "검색하던 중 오류가 발생했어요");
        }
        mav.setViewName("newsView");
        return mav;
    }

    @GetMapping("/writer")
    public ModelAndView writer(String writer) {
        ModelAndView mav = new ModelAndView();
        try {
            List<News> list = newsR.findByWriterContains(writer);
            mav.addObject("list", list);
        } catch (Exception e) {
            mav.addObject("msg", "검색하던 중 오류가 발생했어요");
        }
        mav.setViewName("newsView");
        return mav;
    }
}