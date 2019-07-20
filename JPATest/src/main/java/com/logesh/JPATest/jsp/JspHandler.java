package com.logesh.JPATest.jsp;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class JspHandler {

	@RequestMapping("home")
	public String readJsp(Model model) {
		return "home";
	}

	@PostMapping(value = "handleForm")
	public String handleForm(@RequestParam("userName") String name, @RequestParam("file") MultipartFile file) {
		System.out.println("Your form has been submitted successfully!" + file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		try {
			Scanner scanner = new Scanner(file.getInputStream());
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "form";
	}
}
