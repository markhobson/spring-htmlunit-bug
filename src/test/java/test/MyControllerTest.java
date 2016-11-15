package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MyControllerTest
{
	@Autowired
	private WebDriver driver;
	
	@Test
	public void canSubmit()
	{
		driver.get("/form");
		
		driver.findElement(By.className("submit")).click();
		
		assertThat(driver.findElement(By.className("message")).getText(), is("OK"));
	}
}
