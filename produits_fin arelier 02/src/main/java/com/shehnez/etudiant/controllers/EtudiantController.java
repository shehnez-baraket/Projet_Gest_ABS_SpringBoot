package com.shehnez.etudiant.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shehnez.etudiant.entities.Etudiant;
import com.shehnez.etudiant.service.EtudiantService;

@Controller
public class EtudiantController {
	@Autowired
	EtudiantService EtudiantService;
	
	@RequestMapping("/showCreate")
	public String showCreate()
	{
		return "createEtudiant";
	}
	
	@RequestMapping("/saveEtudiant")
	public String saveEtudiant(@ModelAttribute("Etudiant") Etudiant Etudiant, 
							  @RequestParam("date") String date,
							  ModelMap modelMap) throws ParseException 
	{
		//conversion de la date 
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateformat.parse(String.valueOf(date));
        Etudiant.setDateNaissance(dateCreation);
      
		 Etudiant saveEtudiant = EtudiantService.saveEtudiant(Etudiant);
		 String msg ="Etudiant enregistré avec Id "+saveEtudiant.getIdEtudiant();
		 modelMap.addAttribute("msg", msg);
		return "createEtudiant";
	}
	
	@RequestMapping("/ListeEtudiants")
	public String listeEtudiants(ModelMap modelMap)
	{
		List<Etudiant> prods = EtudiantService.getAllEtudiants();
		modelMap.addAttribute("Etudiants", prods);		
		return "listeEtudiants";	
	}
	
	@RequestMapping("/supprimerEtudiant")
	public String supprimerEtudiant(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Etudiant p= new Etudiant();
		p.setIdEtudiant(id);
		EtudiantService.deleteEtudiant(p);
		List<Etudiant> prods = EtudiantService.getAllEtudiants();
		modelMap.addAttribute("Etudiants", prods);	
		return "listeEtudiants";	
	}
	
	@RequestMapping("/modifierEtudiant")
	public String editerEtudiant(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Etudiant p= 	EtudiantService.getEtudiant(id);
		modelMap.addAttribute("Etudiant", p);	
		return "editerEtudiant";	
	}

	@RequestMapping("/updateEtudiant")
	public String updateEtudiant(@ModelAttribute("Etudiant") Etudiant Etudiant,
								@RequestParam("date") String date,
			                    ModelMap modelMap) throws ParseException 
	{
		
		//conversion de la date 
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateformat.parse(String.valueOf(date));
        Etudiant.setDateNaissance(dateCreation);
        
		  EtudiantService.updateEtudiant(Etudiant);
		  List<Etudiant> prods = EtudiantService.getAllEtudiants();
		  modelMap.addAttribute("Etudiants", prods);	
		
		return "ListeEtudiants";
	}



}

