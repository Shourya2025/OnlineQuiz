package model;

import java.sql.ResultSet;

import dbutil.DBConnect;

public class RegModel {

	private String name;
	private String email;
	private String mobile;
	private String password;
	
	public RegModel()
	{
		
	}
	public RegModel(String n,String e,String m,String p)
	{
		this.name=n;
		this.email=e;
		this.mobile=m;
		this.password=p;
	}
	
	public String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public  String getEmail() {
		return email;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public boolean createUser() throws Exception
	{
		DBConnect d = new DBConnect();
		String sql = "insert into quizreg values('"+
		this.name+"','"+this.email+"','"+this.mobile+"','"+
				this.password+"')";
		boolean chk=d.queryExecuter(sql);
		return chk;
	}
	
	public boolean checkUser(String e,String p) throws Exception
	{
		this.setEmail(e);
		this.setPassword(p);
		DBConnect d = new DBConnect();
		String sql = "select * from quizreg where email='"+
		this.email+"' and password='"+this.password+"'";
		ResultSet rs = d.queryReturner(sql);
		rs.next();
		this.setName(rs.getString(1));
		this.setMobile(rs.getString(3));
		return true;
	}
	
	
}
