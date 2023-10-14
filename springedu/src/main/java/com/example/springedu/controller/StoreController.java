package com.example.springedu.controller;

import com.example.springedu.dao.StoreDAO;
import com.example.springedu.domain.StoreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StoreController {
    @Autowired
    StoreDAO dao;
    ModelAndView mav = new ModelAndView();
    @PostMapping("/store") // 글목록 출력
    public ModelAndView readStore() {
        // 게시물 제목, (작성자 아이디), 조회수, 댓글수, 하트수, 이미지가 담기고 최신순으로 3개가 담긴 storeDTO배열
        List<StoreDTO> list = dao.readStore();
        if (list.size() != 0) {
            mav.addObject("list", list);
        } else {
            mav.addObject("msg", "추출된 결과가 없습니다.");
        }
        mav.setViewName("store");
        return mav;
    }
    @PostMapping("/write") // 가게 등록
    public ModelAndView createStore(StoreDTO dto) {
        // 가게명, 번호, 주소, 메뉴이미지(여러 개), 대표사진이미지, 설명 등록
        boolean result = dao.createStore(dto);
        if (result) {
            mav.addObject("list", dao.readStore());
            mav.addObject("msg", "가게가 정상적으로 등록되었습니다.");
        } else {
            mav.addObject("msg", "추출된 결과가 없습니다.");
        }
         mav.setViewName("store"); //작성한 글로 이동
        return mav;
    }
    @PostMapping("/edit") // 가게 수정
    public ModelAndView updateStore(StoreDTO dto) {
        boolean result = dao.updateStore(dto);
        if (result) {
            mav.addObject("list", dao.readStore());
        } else {
            mav.addObject("msg", "추출된 결과가 없습니다.");
        }
        // mav.setViewName("index"); 작성한 글로 이동
        return mav;
    }
    @PostMapping("/delete") // 가게 삭제(모달창으로 확인받기)
    public ModelAndView deleteStore(String storeId) {
        boolean result = dao.deleteStore(storeId);
        if (result) {
            mav.addObject("list", dao.readStore());
        } else {
            mav.addObject("msg", "추출된 결과가 없습니다.");
        }
        // mav.setViewName("index"); 작성한 글로 이동
        return mav;
    }
}
