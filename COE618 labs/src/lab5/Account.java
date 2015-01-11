package lab5;

import java.io.Serializable;

public class Account implements Serializable {

	private String username;
	private String password;
	private String name;
	
	
	
	public Account(String username, String password,String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public Account (String username, String password){
		this.username = username;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof Account){
			Account c = (Account) obj;
			if (username.equals(c.getUsername()))
				if (password.equals(c.getPassword()))
					return true;
		}
		return false;
	}
	
	public String getName(){
		return name;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}


	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password
				+ ", name=" + name + "]";
	}


	
	
	

	
}
