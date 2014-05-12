/**
 * @版权所有 聚光科技（杭州）股份有限公司
 * 
 */
package com.fpi.json.parttime.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Date: 2014-5-12
 * 
 * @author yang_qiao
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "/")
public class HelloWorldController {
	@RequestMapping("/hello")
	public String hello(
	        @RequestParam(value = "name", required = false, defaultValue = "World") String name,
	        Model model) {
		model.addAttribute("name", name);
		return "helloworld";
	}
}