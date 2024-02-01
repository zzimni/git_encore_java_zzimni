import com.encore.account.Account;

public class AccountMain {

	public static void main(String[] args) {
		// 계좌 생성
		Account acc=new Account("CUST01","소지섭","1-22-333",100000);
		System.out.println("=======================\r\n"
				+ "고객번호 : " + acc.getCustId() +"\r\n"
				+ "고객명 : "+acc.getCustName()+"\r\n"
				+ "계좌번호 : "+acc.getAccountNumber()+"\r\n"
				+ "잔액 : "+acc.getBalance()+"\r\n"
				+ "========================");
		System.out.println("10000원을 입금합니다.");
		acc.addBalance(10000);
		System.out.println("증가 후 잔액 : "+acc.getBalance());
		System.out.println("20000원을 출금합니다.");
		acc.subtractBalance(20000);
		System.out.println("감소 후 잔액 : "+acc.getBalance());
	}

}
