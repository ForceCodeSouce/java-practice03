package prob05;

public class Account {

	private String accountNo;
	private int balance;

	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
		this.balance = 0;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
		System.out.println(accountNo + "계좌의 잔고는"+ balance +"만원입니다.");
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save(int i) {
		// TODO Auto-generated method stub
		balance = i;
		System.out.println(accountNo + "계좌에"+ i +"만원이 입금되었습니다.");
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		int money = i;
		balance -= i;
		System.out.println(accountNo + "계좌에"+ money +"만원이 출금되었습니다.");
		
	}

}
