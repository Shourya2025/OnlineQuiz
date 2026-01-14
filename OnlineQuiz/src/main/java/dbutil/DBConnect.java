package dbutil;
import java.sql.*;
public class DBConnect {

	public  Connection cn=null;
	public DBConnect() throws Exception
	{
		Class.forName("org.postgresql.Driver");
		cn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/postgres",
				"postgres",
				"Password#12");
	}
	
	public boolean queryExecuter(String sql) throws Exception
	{//DML
		Statement stmt = cn.createStatement();
		stmt.execute(sql);
		stmt.close();
		cn.close();
		return true;
	}
	public ResultSet queryReturner(String sql) throws Exception
	{//ddl
		Statement stmt = cn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs;
	}
}

/*
 * create table quizreg(
 name      varchar(50),
email     varchar(100) primary key,
mobile    varchar(15),
password  varchar(50),
);
 

create table testresult( 
testid serial PRIMARY KEY,
 emailid varchar(100), 
name varchar(100), 
subject varchar(100), 
dateofexam TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP);
 
  create table testresultdesc(
     testid int,
     qno int, 	
     question varchar(500),
     yourans varchar(1),
     correctans varchar(1));
     
     
     create table resultanalysis(
  testid int,
   name varchar(100),
    subject varchar(100),
    marks int);
 */
 