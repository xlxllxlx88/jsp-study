package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.javateam.project.domain.MemberVo;
import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

public class InsertJunitTest {
	
	MemberDao dao;
	MemberVo member;

	@Before
	public void setUp() throws Exception {
		
		dao = MemberDaoImpl.getInstance();
		member = new MemberVo();
		member.setId("spring789");
		member.setPw("1234");
		member.setName("임꺽정");
		member.setAddress("서초");
		// member.setJoindate(new Date(System.currentTimeMillis()));
	}

//	@Test
//	public void test() {
//
//		// 성공여부 점검(테스트) : 단언(단정) : assert
//		// 기대값 : true => green light
//		// 기대값(X) => red light		
//		assertTrue(dao.insertMember(member));
//		
//	} //
	
	// 반대 조건 테스트
//	@Test
//	public void test2() {
//
//		// 성공여부 점검(테스트) : 단언(단정) : assert
//		// 기대값 : false => green light
//		// 기대값(X) => red light		
//		assertFalse(dao.insertMember(member));
//		
//	} //
	
	@Test
	public void test3() {

		// 성공여부 점검(테스트) : 단언(단정) : assert
		assertEquals(true, dao.insertMember(member));
		
	} //

}
