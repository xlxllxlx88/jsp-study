package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.javateam.project.domain.MemberVo;
import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

public class SelectJunitTest2 {
	
	MemberDao dao;
	MemberVo member;
	String id ="spring";

	@Before
	public void setUp() throws Exception {
		
		dao = MemberDaoImpl.getInstance();
	}

	@Test
	public void test() {

		member = dao.getMember(id);
		
		// 결과 유무 점검
		assertNotNull(member); 
		
		assertEquals("임꺽정123213", member.getName());
	} //
	
}
