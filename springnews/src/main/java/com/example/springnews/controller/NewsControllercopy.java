//package com.example.springnews.controller;
//
//import com.example.springnews.model.News;
//import com.example.springnews.repository.NewsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@Controller
//public class NewsControllercopy {
//    @Autowired
//    NewsRepository newsR;
//    // 전체 뉴스 출력
//    @GetMapping("/newsmain")
//    public ModelAndView list() {
//        List<News> list = newsR.findAll();
//        ModelAndView mav = new ModelAndView();
//        if (list.size() != 0) {
//            mav.addObject("list", list);
//        } else {
//            mav.addObject("msg", "뉴스가 없습니다.");
//        }
//        mav.setViewName("newsView");
//        return mav;
//    }
//    // 뉴스 작성
//    @PostMapping("/insert")
//    @Transactional
//    public ModelAndView insert(News vo){
//        System.out.println("등록한 뉴스 "+vo);
//        ModelAndView mav = new ModelAndView();
//        try {
//            newsR.save(vo);
//            mav.addObject("list", newsR.findAll());
//        }catch (Exception e){
//            mav.addObject("msg", "뉴스 작성을 실패했습니다.");
//        }
//        mav.setViewName("newsView");
//        return mav;
//    }
//    // 뉴스 수정
//    @PostMapping("/update")
//    @Transactional
//    public ModelAndView update(News vo){
//        System.out.println("수정한 뉴스:"+vo);
//        ModelAndView mav = new ModelAndView();
//        try {
//            News newvo =  newsR.findById(vo.getId()).get();
//            newvo.setContent(vo.getContent());
//            newvo.setTitle(vo.getTitle());
//            mav.addObject("list", newsR.findAll());
//        }catch (Exception e){
//            mav.addObject("msg", "뉴스 수정을 실패했습니다.");
//        }
//        mav.setViewName("newsView");
//        return mav;
//    }
//    @GetMapping("/delete")
//    @Transactional
//    public ModelAndView delete(int id) {
//        ModelAndView mav = new ModelAndView();
//        try {
//            newsR.deleteById(id);
//            mav.addObject("list", newsR.findAll());
//        } catch(Exception e) {
//            mav.addObject("msg", "삭제를 처리하는 동안 오류 발생");
//        }
//        mav.setViewName("newsView");
//        return mav;
//    }
//}