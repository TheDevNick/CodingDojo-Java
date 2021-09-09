package com.codingdojo.GroupLanguages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.GroupLanguages.models.Language;
import com.codingdojo.GroupLanguages.services.LanguageService;

@SpringBootApplication
@Controller
public class LanguageController {
	private final LanguageService languageService;
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	
	@GetMapping("/")
	public String index() {
		return "redirect:/languages";
	}
	
	@GetMapping("/languages")
	   public String newLanguage(Model model, @ModelAttribute("language") Language language) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);// "languages" is what gets passed into the view, the second language is the value
        return "index.jsp";
    }
	
    @PostMapping("/languages")
    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            languageService.createLanguage(language);
            return "redirect:/languages";
        }
    }
    
	// edit routing
	@GetMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		// edit a form
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}
	
	//show specific language
	@GetMapping("/languages/{id}")
	public String showLang(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "showLanguage.jsp";
	}

	@PostMapping("languages/update/{id}")
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		languageService.createLanguage(language);
		return "redirect:/languages";
				
	}
    
	@RequestMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}
	
}
