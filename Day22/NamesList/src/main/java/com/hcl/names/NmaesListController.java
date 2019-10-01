package com.hcl.names;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NmaesListController {
	@RequestMapping("/names")
	public ModelAndView nameDemo(){
		List<String> lstNames= new ArrayList<String>();
		lstNames.add("Bindu");
		lstNames.add("Mohan");
		lstNames.add("Neethu");
		lstNames.add("Vishnu");
		lstNames.add("Lakshmi");
		lstNames.add("Narendra");
		return new ModelAndView("ShowPage","Lists",lstNames);
	}
}
