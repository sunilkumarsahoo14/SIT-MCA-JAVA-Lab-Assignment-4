import java.sql.*;  
class jdbc{  
public static void main(String args[]){  
try{  
  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","iamsunil");  
  
//step3 create the statement object  
//Statement stmt=con.createStatement();  
  
//step4 execute query  
//ResultSet rs=stmt.executeQuery("select * from employee");  
//while(rs.next())  
//System.out.println(rs.getInt(2)+"  "+rs.getString(1)+"  "+rs.getString(3));  
  if(con!=null)
  {
	  System.out.println("Connected.");
  }
//step5 close the connection object  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  