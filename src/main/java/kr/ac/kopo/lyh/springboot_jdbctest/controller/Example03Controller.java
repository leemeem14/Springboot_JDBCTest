package kr.ac.kopo.lyh.springboot_jdbctest.controller;

import kr.ac.kopo.lyh.springboot_jdbctest.domain.Member;
import kr.ac.kopo.lyh.springboot_jdbctest.repository.MemberRepository03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Example03Controller {
    @Autowired
    MemberRepository03 repository;

    @GetMapping
    public String viewHomePage(Model model){
        Iterable<Member> memberList = repository.selectMethod();
        model.addAttribute("memberList",memberList);
        return "viewPage03";
    }
//    @GetMapping("/new")
//    public String newMethod(Model model){
//        Member member = new Member();
//        model.addAttribute("member",member);
//        return "viewPage03_new";
//    }

}
