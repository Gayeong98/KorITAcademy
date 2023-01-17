package chapter03;

public class Modifier {
	private String name;
	private String address;
	private String telNumber;
	
	// private으로 선언된 멤버변수를 초기화하기 위한 첫번째 방법
	// 생성자를 이용
	// 생성자를 이용한 방법은 인스턴스를 생성할 때만 멤버 변수를 초기화
	public Modifier (String name, String address, String telNumber) {
		this.setName(name);
		this.address = address;
		this.telNumber = telNumber;
	}

	
	// 두번째 방법: Setter 메서드 이용
	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}
	
	// 외부에서 멤버변수에 접근하기 위한 방법
	// Getter 메서드 이용
		
}
