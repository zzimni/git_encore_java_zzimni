package com.encore.post.domain;

public class PostRequestDTO { // Data Transfer Object // Data를 담는 그릇, 변수가 private으로 정의 돼있고 setter와 getter가 있음
	// Data를 object로 전달하기 위한?
	private String id ;
	private String title ;
	private String content ;
	private int cnt ;
	private boolean isFlag ;
	
	// 기본 생성자 
	public PostRequestDTO() {
		
	}
	// 스페셜 생성자
	public PostRequestDTO(String id) { // 생성자 오버로딩
		this.id=id;
	}
	
	// 마우스 우클릭 -> source -> Generate Constructor using Fields (스페셜 생성자 생성)
	public PostRequestDTO(String id, String title, String content, int cnt, boolean isFlag) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.cnt = cnt;
		this.isFlag = isFlag;
	}
	
	
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id; // 지역변수와 전역변수 중에서는 지역변수가 우선권?을 갖고있어서 this로 전역변수를 구분해줌 -> 결국 이 this는 instance의 id임을 지칭하는 키워드가 됨
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public boolean isFlag() {
		return isFlag;
	}
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	
	
}
