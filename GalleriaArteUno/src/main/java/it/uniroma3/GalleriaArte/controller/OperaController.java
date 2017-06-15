package it.uniroma3.GalleriaArte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.GalleriaArte.model.Opera;
import it.uniroma3.GalleriaArte.service.OperaService;

@Controller
public class OperaController {
	
	public class ProductController {

	    private OperaService operaService;

	    @Autowired
	    public void setOperaService(OperaService operaService) {
	        this.operaService = operaService;
	    }

	    @RequestMapping(value = "/opere", method = RequestMethod.GET)
	    public String list(Model model){
	        model.addAttribute("opere", operaService.listAllOpere());
	        return "opere";
	    }

	    @RequestMapping("opera/{id}")
	    public String showOpera(@PathVariable Long id, Model model){
	        model.addAttribute("opera", operaService.getOperaById(id));
	        return "operashow";
	    }

	    @RequestMapping("opera/edit/{id}")
	    public String edit(@PathVariable Long id, Model model){
	        model.addAttribute("opera", operaService.getOperaById(id));
	        return "operaform";
	    }

	    @RequestMapping("opera/new")
	    public String newProduct(Model model){
	        model.addAttribute("opera", new Opera());
	        return "operaform";
	    }

	    @RequestMapping(value = "opera", method = RequestMethod.POST)
	    public String saveOpera(Opera opera){
	        operaService.saveOpera(opera);
	        return "redirect:/opera/" + opera.getId();
	    }

	    @RequestMapping("opera/delete/{id}")
	    public String delete(@PathVariable Long id){
	        operaService.deleteOpera(id);
	        return "redirect:/opere";
	    }

	}
}
