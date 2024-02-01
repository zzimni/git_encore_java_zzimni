// import com.encore.post.domain.PostRequestDTO; // 가져온 클래스 이름 위에 커서 두면 해당 클래스 import할거냐는 버튼 나오는데 그거 누르면 됨
// import com.encore.post.service.PostService;
import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;
import com.encore.post.view.PostView;

public class PostMain {
	public static void main(String[] args) {
//		PostService service = new PostService() ;
//		System.out.println("debug >>>> main caller -> service savePost working method");
//		
//		// Case 01. PostService 인스턴스의 메소드의 매개변수에 직접 값 입력해서 출력하는 방법?
//		// String msg = service.savePost("zzimni", "공지사항", "내일은 휴강입니다", 0, true);
//		// System.out.println("Result >>>> "+msg);
//		
//		// Case 02. DTO를 통해 데이터를 object로 전달해보기? -> 장점이? 데이터를 객체로 관리하면 효율적??
//		PostRequestDTO request = new PostRequestDTO("zzimni", "공지사항", "내일은 휴강입니다", 0, true);
//		String msg=service.savePost(request);
//		System.out.println("Result >>>> "+msg);
		
		// Case 03. view를 이용한 사용자 입력과 연결... 여기서 view는 브라우저/콘솔창과 비슷한 역할임
		// PostView view = new PostView();
		// view.menu();
		
		// Case 04. 불필요하게 발생되는 객체생성을 효율적으로 관리하기 위해서 얕은 복사 개념을 사용할 수 있다.
		PostService service = new PostService(); 
		PostRequestDTO params = new PostRequestDTO(); // main에서 Service와 DTO 인스턴스를 생성해 해당 주소값(참조객체이므로)을 View에게 넘겨주자 ?
		
		PostView view = new PostView(service,params) ;
		view.menu();
		
	}
}
