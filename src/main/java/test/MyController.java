package test;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE;
import static org.springframework.http.MediaType.TEXT_HTML_VALUE;

@Controller
public class MyController
{
	@GetMapping(path = "/form", produces = TEXT_HTML_VALUE)
	public String form()
	{
		return "formView";
	}
	
	@PostMapping(path = "/submit", consumes = APPLICATION_FORM_URLENCODED_VALUE, produces = TEXT_HTML_VALUE)
	public String submit(@RequestBody MultiValueMap<String, String> payload)
	{
		return "submitView";
	}
}
