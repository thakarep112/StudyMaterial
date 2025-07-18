package features;

import com.intuit.karate.junit5.Karate;

public class Runner {
	
	@Karate.Test
	Karate deleteAPI() {
		
		return Karate.run("DELETEAPI").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate putAPI() {
		
		return Karate.run("PUTAPI").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate patchAPI() {
		
		return Karate.run("PATCHAPI").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate postAPI() {
		
		return Karate.run("POSTAPI").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate randomString() {
		
		return Karate.run("GenerateRandomString").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate payloadFromJsonFile() {
		
		return Karate.run("ReadPayloadFromJsonFile").relativeTo(getClass());
	}
}
