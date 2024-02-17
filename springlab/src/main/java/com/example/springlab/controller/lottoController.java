package com.example.springlab.controller;

import com.example.springlab.domain.LottoDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class lottoController {

    @RequestMapping(value = "/lotto")
    public String lotto(LottoDTO dto, HttpServletRequest req, Model model, HttpSession sess) {
        model.addAttribute("refinfo", req.getHeader("referer"));
        if(sess.getAttribute("count") == null){
            sess.setAttribute("count", 0);
        }
        int count = (int)sess.getAttribute("count");
        if((int)sess.getAttribute("count")>2) {
            dto.setResult("로또 응모는 낙첨된 경우에 한하여 3번 까지만 가능합니다. <br> 브라우저를 재기동 한 후에 응모해 주세요.");
            dto.setImgName("snow");
            return "lottoView";
        }
        int ran = (int) Math.floor(Math.random() * 6) + 1;
        if (ran == dto.getLottoNum()) {
            dto.setResult("추카추카!!");
            dto.setImgName("sun");
        } else {
            sess.setAttribute("count", ++count);
            dto.setResult("아쉽네요~ 다음 기회를!!");
                dto.setImgName("rain");
        }
        return "lottoView";
    }
}