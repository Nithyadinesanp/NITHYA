package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHome {
@RequestMapping("/helo")
public String welcome()
{
return "welcome";
}
}