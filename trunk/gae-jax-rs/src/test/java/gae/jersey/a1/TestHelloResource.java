package gae.jersey.a1;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class TestHelloResource {
	
	@Ignore
	@Test
	public void testCreatePersonByXml() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource("http://localhost:8080/jersey/hello/xml");
		String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><hello><name>Helloworld by xml</name></hello>";
		String actual = service.get(String.class).toString();
		
		assertEquals(expected, actual);
	}
	
	@Ignore
	@Test
	public void testCreatePersonByJson() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource("http://localhost:8080/jersey/hello/json");
		String expected = "{\"name\":\"Helloworld by json\"}";
		String actual = service.get(String.class).toString();
		
		assertEquals(expected, actual);
	}
	
	@Ignore
	@Test
	public void testFindPerson() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource("http://localhost:8080/jersey/hello/1");
		String expected = "Helloworld 1";
		String actual = service.get(String.class).toString();
		
		assertEquals(expected, actual);
	}
	
	
}
