
public class smsUser {
	protected String name;
	 protected String password;
	 protected String email;
	 protected String department;
	 
	 
	 
	public smsUser(String name, String password, String email, String department) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.department = department;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


}