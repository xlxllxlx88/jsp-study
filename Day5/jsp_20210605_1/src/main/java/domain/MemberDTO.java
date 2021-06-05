package domain;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// DTO(Data Transfer Object)
// form field 1:1 대응(mapping)
public class MemberDTO {

	private String phone1;
	private String phone2;
	private String phone3;
	
	
	public MemberDTO() {}
	
	public MemberDTO(Map<String,String[]> map) {
		
		Set<String> keys = map.keySet(); //인자명(들)
		Iterator<String> it = keys.iterator();
		Field fld;
		
		while(it.hasNext()) {
			// 인자명 => DTO의 해당 인자명의 멤버 필드
			// reflection 활용
			
		}
		
	}
	
	
	
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getPhone3() {
		return phone3;
	}
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	@Override
	public String toString() {
		return String.format("MemberDTO [phone1=%s, phone2=%s, phone3=%s]", phone1, phone2, phone3);
	}
	
	
}
