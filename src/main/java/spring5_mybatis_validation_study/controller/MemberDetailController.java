package spring5_mybatis_validation_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import spring5_mybatis_validation_study.dto.Member;
import spring5_mybatis_validation_study.exception.MemberNotFoundException;
import spring5_mybatis_validation_study.mapper.MemberMapper;

@Controller
public class MemberDetailController {
		
		@Autowired
		private MemberMapper memberMapper;
		
		@GetMapping("/members/{id}")
		public ModelAndView detail(@PathVariable("id") Long memId) {
			Member member = memberMapper.selectById(memId);
			System.out.println(member);
			if(member == null) {
				throw new MemberNotFoundException();
			}
			ModelAndView mav = new ModelAndView();
			mav.addObject("member", member);
			mav.setViewName("member/memberDetail");
			
			return mav; 
			
		}
}
