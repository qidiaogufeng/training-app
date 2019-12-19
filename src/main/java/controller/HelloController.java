package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基于SSM框架的第一个控制器
 * １.添加＠Controller
 * ２.方法添加映射路径
 * 
 * 
 */
@Controller
public class HelloController {
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hello() {
		return "Hello Spring!";
	}
	
}
