package com.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import net.bytebuddy.asm.Advice.Return;

public class Config_properties {

	
	public String getproperties(String key) throws Exception
	{
		
			Properties prop= new Properties();
			String project_path=System.getProperty("user.dir");
			FileInputStream input=new FileInputStream(project_path+"/src/main/java/com/properties/config.properties");
			prop.load(input);
			
		/*get keys from properties file*/	
		String value=	prop.getProperty(key);
		
		System.out.println(value);
		
		return value;
		
}
}
