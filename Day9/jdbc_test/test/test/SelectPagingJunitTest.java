package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.javateam.project.domain.MemberVo;
import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

public class SelectPagingJunitTest {
	
	MemberDao dao;
	List<MemberVo> members;

	@Before
	public void setUp() throws Exception {
		
		dao = MemberDaoImpl.getInstance();
	}

	@Test
	public void test() {

		members = dao.getMembersByPage(1, 5);
		
		// 결과 유무 점검
		assertNotNull(members); 
		
		// 결과의 개수(기대값)로 점검
		assertEquals(5, members.size());
		
		// 특정 데이터 일치 여부 점검
		// 1 페이지의 마지막 레코드의 id가 "java2" 인지 점검
		assertEquals("java2", members.get(4).getId());
	} //
	
}