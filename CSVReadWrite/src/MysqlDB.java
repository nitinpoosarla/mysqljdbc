import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class MysqlDB {

	public static void main(String[] args) {
		
		 String csvFile = "C://Users//Administrator//eclipse-workspace5//CSVReadWrite//arabicdata.csv";
		 //C:\Users\Administrator\eclipse-workspace5\CSVReadWrite\
		 //E:\\DATA\\arabicdata.csv
		 BufferedReader br = null;
		 String line = "";
	        String cvsSplitBy = ",";
String d="المؤتمر";
int  i=1;
		
		try
	    {
			 br = new BufferedReader(new FileReader(csvFile));
	           
	            while ((line = br.readLine()) != null) {

	            	i=i+1;
	                // use comma as separator
	                String[] country = line.split(cvsSplitBy); 
	      // create a mysql database connection
	     
	      Class.forName("com.mysql.jdbc.Driver");
	      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/miracle?useUnicode=yes&characterEncoding=UTF-8","root","root");
	    
	      
	      // the mysql insert statement
	      String query = " insert into dat (id,data) values (?, ?)";

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setInt(1, 5);
	      preparedStmt.setNString(2,d);
	    

	      // execute the preparedstatement
	      preparedStmt.execute();
	      System.out.println("done---"+i);
	      conn.close();
	    }
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	    finally {
            if (br != null) {
                try {
                    br.close();
                  
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

	}

}
