import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionTester {
	
	public ConnectionTester(){
		
	}
	
	public static void main(String[] args){	
		new ConnectionTester().test(args);
	}
	
	public void test(String[] dbParameter){
		Connection con=null;
		try{
			Class.forName(dbParameter[0]);
			con=DriverManager.getConnection(dbParameter[1],dbParameter[2],dbParameter[3]);
			System.out.println("================= DBConnection Success");
		}catch(Exception e){
			System.err.println("================= DBConnection Failed");
			e.printStackTrace();
		}finally{
			try{
				if(con!=null){con.close();}
			}catch(Exception e){
			}
		}	
	}
	
}
