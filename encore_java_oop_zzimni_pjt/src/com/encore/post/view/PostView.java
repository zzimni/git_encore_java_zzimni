package com.encore.post.view; // 브라우저나 터미널과 같은 역할

import java.util.Scanner;

import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;


public class PostView {
	
	// 참조타입의 멤버변수
	private PostService service;
	private PostRequestDTO params;

	// 생성자 오버로딩
	public PostView() {
		
	}
	public PostView(PostService service, PostRequestDTO params) { // main에서 객체 생성해서 주소값을 넘겨받음 (Case 04?)
		this.service=service;
		this.params=params;
		
	}

	public void menu() {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println(">>>> Hanhwa software camp Beyond 5th <<<<");
			System.out.println("1. login");
			System.out.println("2. join");
			System.out.println("3. post write");
			System.out.println("4. post delete");
			System.out.println("99. exit");
			System.out.print("input number : ");
			int number = scan.nextInt();
			
			if(number==99) {
				System.exit(0);
			}
			if (number==3) {
				requestSave(); // 같은 클래스에 있는 메소드에서는 다른 메소드를 호출할 수 있다.
			}
			if (number==4) {
				requestDelete();
			}
		}
	}
	
	public void requestSave() {
		System.out.println("debug >>>> client post view");
		Scanner scan = new Scanner(System.in) ;
		System.out.print("아이디 : ");
		String id = scan.nextLine();
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String content = scan.nextLine();
		System.out.print("조회수 : ");
		int cnt = scan.nextInt();
		System.out.print("공개여부 : ");
		boolean isFlag = scan.nextBoolean();
		// view has a service <- ??
		
		// Before Case 04
		// requestSave 메소드가 10번 호출되면 다음 주석 코드들도 10번 실행되어 객체가 10개 생성됨
		
		// PostService service = new PostService();
		// service.savePost(id,title,content,cnt, isFlag);
		
		// PostRequestDTO request = new PostRequestDTO(id,title, content, cnt, isFlag);
		
		// Case 04 
		// 객체는 main에서 한 번 생성한 후 view로 넘어왔고 다음 코드에서는 객체에 값만 할당해주고있어 requestSave 메소드가 10번 호출되어도 객체는 한 번만 실행된다.
		params.setId(id);
		params.setTitle(title);
		params.setContent(content);
		params.setCnt(cnt);
		params.setFlag(isFlag);
		String msg=service.savePost(params) ;
		
		System.out.println("Result >>>> "+msg);
		
	}
	
	// request delete
	// terminal로부터 사용자의 아이디만 입력받아서
	// 해당 아이디를 DTO에 담고 
	// PostService 클래스에 정의된 deletePost(PostRequestDTO params)
	// 메서드를 호출하여 '작성하신 글이 삭제되었습니다'라는 메시지를 반환받아서 출력
	public void requestDelete() {
		System.out.println("debug >>>> client post delete view");
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("id : ");
		String id = scan.nextLine();

//		PostRequestDTO request = new PostRequestDTO(id);
//		PostService service = new PostService();
		params.setId(id);
		String msg = service.deletePost(params);
		System.out.println("Result >>>> "+msg);
	}
	
}
