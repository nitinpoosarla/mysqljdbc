import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SL4JHello {

	 private final static Logger slf4jLogger = LoggerFactory.getLogger(SL4JHello.class);
	public static void main(String[] args) {
		int x=0,y=10;
		slf4jLogger.info("datainfo");
		List<Integer> ll =new ArrayList<Integer>();
		for(int i=0;i< 30;i++)
		{
			ll.add(i);
		}
		
		System.out.println(ll.subList(10,20));
		System.out.println("hello world");
		SL4JHello s=new SL4JHello();
		s.sayHello();

	}
	
	public void sayHello()
	{
		slf4jLogger.info("sayhello info");
	}

}
