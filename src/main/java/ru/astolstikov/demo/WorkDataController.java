package ru.astolstikov.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkDataController {
//	@RequestMapping("/")
//	String home() {
//		return "Hello, my dear friend!<br><a href=\"/data\">Go to data!</a>";
//	}
	
	@RequestMapping("/data")
    public WorkData data(
    		@RequestParam(value="name", defaultValue="defaultUser") String name, 
    		@RequestParam(value="userID", defaultValue="123456") long userID) {
        return new WorkData(
        		name, "jndi://jndi.username", "Work data description",
        		"cathegory", "http://astolstikov.ru", "noname", userID, "passw0rd", 100, 100, 0);
    }
}