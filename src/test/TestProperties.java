package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        Properties pps = System.getProperties();
//        pps.list(System.out);
    	Properties pps = new Properties();
    	pps.load(new FileInputStream("quickfix-client.properties"));
    	Enumeration<?> enum1 = pps.propertyNames();//得到配置文件的名字
    	while(enum1.hasMoreElements()) {
    		String strKey = (String) enum1.nextElement();
    	    String strValue = pps.getProperty(strKey);
    	    System.out.println(strKey + "=" + strValue);
    	}
    }

}
