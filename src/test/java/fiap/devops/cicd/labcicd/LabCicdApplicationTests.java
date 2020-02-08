package fiap.devops.cicd.labcicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import fiap.*;
import fiap.devops.cicd.labcicd.models.Task;

@SpringBootTest
class LabCicdApplicationTests {

	Task task = new Task();
	
	@Test
	void contextLoads() {
		
		task.setDescription("132");
		task.setDone(true);
		task.setEventDate(null);
		task.setId(12);
		assertEquals("132", task.getDescription());
		assertEquals(true, task.getDone());
		assertEquals(null, task.getEventDate());
		assertEquals(12, task.getId());
	}

}	
