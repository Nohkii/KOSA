package com.example.springlab.controller;

import com.example.springlab.domain.TeamDTO;
import com.example.springlab.domain.TeamMemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class MyTeamController1 {
    @ModelAttribute("my")
    public TeamDTO createTeamDTO() {
        return new TeamDTO();
    }
    @GetMapping("/myTeam1")
    public String teamIntro(@RequestParam(name = "type", required = false) String type, @ModelAttribute TeamDTO my) {
        if ("팀명".equals(type)) {
            my.setTeamName("Null");
//            my.setTeamMember(null);
            System.out.println("우리 팀명");
        } else {
            System.out.println("우리 팀원");
            ArrayList<TeamMemberVO> ary = new ArrayList<>();
            ary.add(new TeamMemberVO("문호준", "호구", "에그타르트"));
            ary.add(new TeamMemberVO("노은기", "노키", "초코케이크"));
            ary.add(new TeamMemberVO("손승범", "범", "와플"));
            ary.add(new TeamMemberVO("문호준", "호구", "에그타르트"));
            my.setTeamMember(ary);
            my.setTeamName("Null");
        }
        return "myTeamView";
    }
}