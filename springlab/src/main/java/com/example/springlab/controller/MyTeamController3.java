package com.example.springlab.controller;

import com.example.springlab.domain.TeamDTO;
import com.example.springlab.domain.TeamMemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MyTeamController3 {
    @ModelAttribute("my")
    public TeamDTO createTeamDTO(){
        return new TeamDTO();
    }
    @RequestMapping("/myTeam3")
    public String showTeam(@ModelAttribute TeamDTO dto, @RequestParam(required = false) String show){
        if(show != null && show.equals("team"))
            dto.setTeamName("오조의 마법사");
        else if(show != null && show.equals("member")) {
            dto.setTeamName("오조의 마법사");
            dto.setTeamMember(new ArrayList<>());
            TeamMemberVO vo = new TeamMemberVO("박희지", "개굴이", "떡볶이");
            dto.getTeamMember().add(vo);
            vo = new TeamMemberVO("윤상혁", "커피", "커피");
            dto.getTeamMember().add(vo);
            vo = new TeamMemberVO("김진수", "참물", "없음");
            dto.getTeamMember().add(vo);
            vo = new TeamMemberVO("이승우", "해골", "피자");
            dto.getTeamMember().add(vo);
        }
        return "myTeamView1";
    }
}
