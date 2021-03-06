package spring5_mybatis_validation_study.mapper;

import java.util.List;

import spring5_mybatis_validation_study.dto.ListCommand;
import spring5_mybatis_validation_study.dto.Member;

public interface MemberMapper {
		
		Member selectByEmail(String email);				
		List<Member> selectAll();
	
		int insert(Member member);
		int update(Member member);
		int delete(Member member);
		
		List<Member> selectByRedate(ListCommand listCommand);
		Member selectById(Long memId);
		
}
