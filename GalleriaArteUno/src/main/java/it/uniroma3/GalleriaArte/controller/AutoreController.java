package it.uniroma3.GalleriaArte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.GalleriaArte.model.Autore;
import it.uniroma3.GalleriaArte.service.AutoreService;

@Controller
public class AutoreController {

	

	    private AutoreService autoreService;

	    @Autowired
	    public void setAutoreService(AutoreService autoreService) {
	        this.autoreService = autoreService;
	    }

	    @RequestMapping(value = "/autori", method = RequestMethod.GET)
	    public String list(Model model){
	        model.addAttribute("autori", autoreService.listAllAutori());
	        return "autori";
	    }

	    @RequestMapping("autore/{id}")
	    public String showProduct(@PathVariable Long id, Model model){
	        model.addAttribute("product", autoreService.getAutoreById(id));
	        return "autoreshow";
	    }

	    @RequestMapping("autore/edit/{id}")
	    public String edit(@PathVariable Long id, Model model){
	        model.addAttribute("product", autoreService.getAutoreById(id));
	        return "autoreform";
	    }

	    @RequestMapping("autore/new")
	    public String newProduct(Model model){
	        model.addAttribute("autore", new Autore());
	        return "autoreform";
	    }

	    @RequestMapping(value = "autore", method = RequestMethod.POST)
	    public String saveAutore(Autore autore){
	        autoreService.saveAutore(autore);
	        return "redirect:/autore/" + autore.getId();
	    }

	    @RequestMapping("autore/delete/{id}")
	    public String delete(@PathVariable Long id){
	        autoreService.deleteAutore(id);
	        return "redirect:/autori";
	    }

	}
