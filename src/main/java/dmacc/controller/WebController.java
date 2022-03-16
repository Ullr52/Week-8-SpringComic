package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Comic;
import dmacc.repository.ComicRepository;

/**
 * @author jword - jord
 * CIS175 - Spring - 2022
 * Mar 15, 2022
 */
@Controller
public class WebController {
	
	@Autowired
	ComicRepository repo;
	
	/*
	 * @GetMapping("viewAll") public String viewAllComics(Model model) {
	 * if(repo.findAll().isEmpty()) { return addNewComic(model); }
	 * model.addAttribute("comics", repo.findAll());
	 * 
	 * return "results"; }
	 */
	
	@GetMapping({"/", "viewAll"})
	public String viewAllComics(Model model) {
		if(repo.findAll().isEmpty()) {
			return addNewComic(model);
		}
		model.addAttribute("comics", repo.findAll());
		return "results";
	}
	

	@GetMapping("/inputComic")
	public String addNewComic(Model model) {
		Comic c = new Comic();
		model.addAttribute("newComic", c);
		return "input";
	}
	
	@PostMapping("/inputComic")
	public String addNewComic(@ModelAttribute Comic c, Model model) {
		repo.save(c);
		return viewAllComics(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateComic(@PathVariable("id") long id, Model model) {
		Comic c = repo.findById(id).orElse(null);
		model.addAttribute("newComic", c);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String revisedComic(Comic c, Model model) {
		repo.save(c);
		return viewAllComics(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deletePullList(@PathVariable("id") long id, Model model) {
		Comic c = repo.findById(id).orElse(null);
		repo.delete(c);
		return viewAllComics(model);
	}
}
