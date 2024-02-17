package com.example.springlab.controller;

import com.example.springlab.domain.TeamDTO;
import com.example.springlab.domain.TeamMemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MyTeamController2 {
    @ModelAttribute("my")
    public TeamDTO createTeamDTO() {
        return new TeamDTO();
    }
    @ResponseBody
    @RequestMapping(value = "/myTeam2", produces="application/json; charset=utf-8")
    public  TeamDTO teamIntro(@RequestParam(name = "type", required = false) String type, @ModelAttribute TeamDTO dto) {
            dto.setTeamName("Null");
            dto.setTeamMember(new ArrayList<>());
            TeamMemberVO vo = new TeamMemberVO("문호준", "호구", "에그타르트");
            dto.getTeamMember().add(vo);
            vo = new TeamMemberVO("노은기", "노키", "초코케이크");
            dto.getTeamMember().add(vo);
            vo = new TeamMemberVO("손승범", "범", "와플");
            dto.getTeamMember().add(vo);
            vo = new TeamMemberVO("이해성", "해쏭", "에그타르트");
            dto.getTeamMember().add(vo);
        return dto;
    }
}