package com.cafelivro.etc;



import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class SystemEnvTest {
	
	public static void main(String[] args){
		
		Map map = System.getenv();
		
		Iterator set =map.keySet().iterator();
		Properties prop =System.getProperties();
		Enumeration enu=prop.elements();
		Enumeration enu2 = prop.keys();
		/*
		while(enu2.hasMoreElements()){
			
			Object key =enu2.nextElement();
			String ob =prop.getProperty(key.toString());
			 System.out.println(" key : "+key+" /  value : "+ob);
			 
		}
		*/
		
		while(set.hasNext()){
			 String key = set.next().toString();
			 Object ob = map.get(key); 
			 System.out.println(" key : "+key+" /  value : "+ob);
			 
		}
		

		
	}
}

