package test;

import java.sql.Date;

import com.javateam.project.domain.MemberVO;
import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

public class InsertTest {
	
	public static void main(String[] args) {
		
		MemberDao dao = MemberDaoImpl.getInstance();
		MemberVO member = new MemberVO();
		
		for (int i=0; i<10; i++) {
			member.setId("java" + i);
			member.setPw("1234");
			member.setName("홍길동");
			member.setAddress("김포시 풍무동");
			member.setJoindate(new Date(System.currentTimeMillis()));
			
			System.out.println("저장 성공 여부" + dao.insertMember(member));
		}
	}

}
