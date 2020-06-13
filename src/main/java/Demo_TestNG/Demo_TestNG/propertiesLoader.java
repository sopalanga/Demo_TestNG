package Demo_TestNG.Demo_TestNG;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

public class propertiesLoader {
	static void loadLog4jPropertyFile(String sPathLog4jPropertyFile) throws Exception{
		FileInputStream fi = new FileInputStream(sPathLog4jPropertyFile);
		Properties props = new Properties();
		props.load(fi);
		PropertyConfigurator.configure(props);
	}

}
