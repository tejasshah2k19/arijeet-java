package task.expmanager;

import java.util.Random;
import java.util.Scanner;

public class UserBean {

	private Integer userId;
	private String firstName;
	private String userName;
	private String password;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void signup() {
		Scanner scr = new Scanner(System.in);
		Random r = new Random();
		this.userId = r.nextInt();
		System.out.println("Enter name : ");
		this.firstName = scr.next();
		System.out.println("Enter userName : ");
		this.userName = scr.next();
		System.out.println("Enter pasword");
		this.password = scr.next();
	}

	public boolean login(String uname, String pwd) {
		return this.userName.equals(uname) && this.password.equals(pwd);
	}

}
