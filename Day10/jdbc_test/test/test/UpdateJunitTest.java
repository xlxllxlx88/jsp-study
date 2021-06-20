package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.javateam.project.domain.MemberVo;
import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

public class UpdateJunitTest {
	
	MemberDao dao;
	MemberVo member;

	@Before
	public void setUp() throws Exception {
		
		dao = MemberDaoImpl.getInstance();
		member = new MemberVo();
		member.setId("spring");
		member.setPw("123456789");
		member.setAddress("송파");
	}

	@Test
	public void test() {

		assertTrue(dao.updateMember(member));
	} //
	
//	@Test
//	public void test2() {
//
//		assertFalse(dao.updateMember(member));
//	} //
//	
//	@Test
//	public void test3() {
//
//		assertEquals(true, dao.updateMember(member));
//	} //

}
