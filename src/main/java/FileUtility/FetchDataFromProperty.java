package FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromProperty 
{
	public static String fetchData(String keys) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\ForgetPassdata.properties");
		prop.load(fis);
		String data = prop.getProperty(keys);
		return data;
	}
	
}
