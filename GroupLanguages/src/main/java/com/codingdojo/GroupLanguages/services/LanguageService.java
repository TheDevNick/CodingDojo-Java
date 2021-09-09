package com.codingdojo.GroupLanguages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.GroupLanguages.models.Language;
import com.codingdojo.GroupLanguages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	// returns all the languages
	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}
	
	// creates a language
	public Language createLanguage(Language l) {
		return languageRepository.save(l);
	}
	
	// retrieves a specific language
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}
	
	//save method
	public void save(Language language) {
		this.languageRepository.save(language);
	}
	
	public Language updateLanguage(Long id, String name, String creator, String version) {
		
		Language language = findLanguage(id);
		if(language.getId()== id) {
			language.setName(name);
			language.setCreator(creator);
			language.setversion(version);
			return language;
		}else {
			return null;
		}
	}
	
	
	// Delete a language by id
	public void deleteLanguage(Long id) {
		Optional<Language> language = languageRepository.findById(id);
		if(language.isPresent()) {
			languageRepository.deleteById(id);
		}
	}
	
	
}
