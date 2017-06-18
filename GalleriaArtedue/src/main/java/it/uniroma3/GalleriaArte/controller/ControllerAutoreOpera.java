package it.uniroma3.GalleriaArte.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.GalleriaArte.model.Autore;
import it.uniroma3.GalleriaArte.model.Opera;
import it.uniroma3.GalleriaArte.service.AutoreService;
import it.uniroma3.GalleriaArte.service.OperaService;


@Controller
public class ControllerAutoreOpera {

	@Autowired
	private AutoreService autoreservice;

	@Autowired
	private OperaService operaservice;



	@RequestMapping("autore/new")
	public String newAutore(Model model){
		model.addAttribute("autore", new Autore());
		return "AutoreForm";
	}
	@RequestMapping("opera/new")
	public String newOpera(Model model){
		model.addAttribute("opera", new Opera());
		return "OperaForm";
	}




	@RequestMapping(value = "opera", method = RequestMethod.POST)
	public String saveOpera(Opera opera){
		operaservice.add(opera);
		return "redirect:/opera/" + opera.getId();
	}

	@RequestMapping("opera/edit/{id}")
	public String editOpera(@PathVariable Long id, Model model){
		model.addAttribute("opera", operaservice.getOperaById(id));
		return "OperaForm";
	}

	@RequestMapping("autore/edit/{id}")
	public String edit(@PathVariable Long id, Model model){
		model.addAttribute("autore", autoreservice.getAutoreById(id));
		return "Autoreform";
	}

	@RequestMapping(value = "autore", method = RequestMethod.POST)
	public String saveAutore(Autore autore){
		autoreservice.add(autore);
		return "redirect:/autore/" + autore.getId();
	}


	@RequestMapping(value = "/autori", method = RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("autori", autoreservice.findAll());
		return "Autori";
	}

	@RequestMapping(value = "/opere", method = RequestMethod.GET)
	public String listOpere(Model model){
		model.addAttribute("opere", operaservice.findAll());
		return "Opere";
	}



	@RequestMapping("opera/{id}")
	public String showOpere(@PathVariable Long id, Model model){
		model.addAttribute("opera", operaservice.getOperaById(id));
		return "OperaShow";
	}

	@RequestMapping("autore/{id}")
	public String mostraAutore(@PathVariable Long id, Model model){
		model.addAttribute("autore", autoreservice.getAutoreById(id));
		return "AutoreShow";
	}



	@RequestMapping("autore/delete/{id}")
	public String delete(@PathVariable Long id){
		autoreservice.remove(id);
		return "redirect:/autori";
	}

	@RequestMapping("opera/delete/{id}")
	public String deleteOpera(@PathVariable Long id){
		operaservice.remove(id);
		return "redirect:/opere";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
//prova ciao
}
