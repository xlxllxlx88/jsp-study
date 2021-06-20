package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.javateam.project.domain.MemberVo;
import com.javateam.project.repository.MemberDao;
import com.javateam.project.repository.MemberDaoImpl;

public class SelectJunitTest {
	
	MemberDao dao;
	List<MemberVo> members;

	@Before
	public void setUp() throws Exception {
		
		dao = MemberDaoImpl.getInstance();
	}

	@Test
	public void test() {

		members = dao.getAllMembers();
		
		// 결과 유무 점검
		assertNotNull(members); 
		
		// 결과의 개수(기대값)로 점검
		assertEquals(12, members.size());
		
		int lastNum = members.size() - 1;
		// 맨 처음, 마지막 요소(회원)이 동일한 지 점검
		// 중복 데이터 출력 여부 점검
		System.out.println("1 : " +members.get(0));
		System.out.println("12 : " +members.get(lastNum));
		System.out.println(members.get(0).equals(members.get(lastNum)));
		
		assertFalse(members.get(0).equals(members.get(lastNum)));
		assertFalse(members.get(0).getId().equals(members.get(lastNum).getId()));
	} //
	
}
