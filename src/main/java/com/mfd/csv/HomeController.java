package com.mfd.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import au.com.bytecode.opencsv.CSVReader;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public String home(Model model) throws FileNotFoundException, IOException {
		ArrayList<Person> personList = new ArrayList<Person>();

		// Resource klasörü altına koyduğumuz herşeyi isim vererek ulaşabiliriz.
		Resource resource = new ClassPathResource("Names.csv");
		
		CSVReader reader = new CSVReader(new FileReader(resource.getFile()));
		String[] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			Person p = new Person();
			p.setName(nextLine[0]);
			p.setSurname(nextLine[1]);
			personList.add(p);
		}
		reader.close();
		
		// JSP sayfasına göndereceğimiz verileri gönderiyoruz
		model.addAttribute("personList", personList);
		return "home";
	}

}
