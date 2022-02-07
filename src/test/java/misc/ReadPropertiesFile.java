package misc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertiesFile {

	@Test
	public void test() throws IOException {
		File file = new File(System.getProperty("user.dir")+ "//src//test//java//resources//configuration.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
	}
}
