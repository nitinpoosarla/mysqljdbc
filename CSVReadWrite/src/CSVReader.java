import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) throws IOException {
		

        String csvFile = "C:\\Users\\Administrator\\eclipse-workspace5\\CSVReadWrite\\country.csv";
        String csvFile1 = "C:\\Users\\Administrator\\eclipse-workspace5\\CSVReadWrite\\rollnum.csv";
        FileWriter fw=new FileWriter("C:\\Users\\Administrator\\eclipse-workspace5\\CSVReadWrite\\src\\dest.txt");
        BufferedReader br = null;
        BufferedReader br1 = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
           
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);               
               // System.out.println(country[0] + country[1] +   country[2] + country[3] + country[4] );
                br1 = new BufferedReader(new FileReader(csvFile1));
                while((line = br1.readLine()) != null)
                {
                	
                	String[] rollnum = line.split(cvsSplitBy);  
                //	System.out.println("data" + rollnum[0] + rollnum[1]);
                	if(country[0].equals(rollnum[0]))
                	{
                		System.out.println(country[0]+',' + country[1] +','+country[2]+',' + country[3]+',' + country[4]+',' + rollnum[1] );
                		    
                        fw.write(country[0]+',' + country[1] +','+country[2]+',' + country[3]+',' + country[4]+',' + rollnum[1] );    
                        fw.write("\r\n");
                	}
                }
                
            }

           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

		

	}

}
