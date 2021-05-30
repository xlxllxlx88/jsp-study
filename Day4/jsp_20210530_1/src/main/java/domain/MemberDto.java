package domain;

import java.util.Date;

public class MemberDto {
	
	private String id;
	private String pw;
	private String name;
	private String phone1;
	private String phone2;
	private String phone3;
	private String address;
	private Date joindate;
	
	public MemberDto() {}
	
	public MemberDto(String id, String pw, String name, String phone1, String phone2, String phone3, String address,
			Date joindate) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.address = address;
		this.joindate = joindate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	
	// DTO 전체 필드들의 내용 확인
	@Override
	public String toString() {
		return String.format(
				"MemberDto [id=%s, pw=%s, name=%s, phone1=%s, phone2=%s, phone3=%s, address=%s, joindate=%s]", id, pw,
				name, phone1, phone2, phone3, address, joindate);
	}
	
//	public static void main(String[] args) {
//		
//		MemberDto member = new MemberDto();
//		System.out.println(member);
//		System.out.println(member.toString());
//	}

	
}
