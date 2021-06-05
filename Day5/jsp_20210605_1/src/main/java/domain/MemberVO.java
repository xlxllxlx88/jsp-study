package domain;

public class MemberVO {
	
	private String phone;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("MemberVO [phone=%s]", phone);
	}
	
	
	

}
