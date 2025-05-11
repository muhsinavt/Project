package juint;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.junit.Test;

public class ResponseCode {
String url = "https://www.google.com/";
@Test
public void linktest() throws Exception {
	URI ob = new URI (url);
	URL Link =ob.toURL();
	HttpURLConnection con = (HttpURLConnection)Link.openConnection();
	int responsecode= con.getResponseCode();
	System.out.println("Response code " +responsecode);
	if(responsecode==200)
	{
		System.out.println("url is valid");
	}
	else
	{
		System.out.println("url is not valid");
	}
}

}
