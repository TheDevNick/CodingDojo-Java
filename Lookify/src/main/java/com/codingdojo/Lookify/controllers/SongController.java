package com.codingdojo.Lookify.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

import javax.validation.Valid;

import com.codingdojo.Lookify.models.Song;
import com.codingdojo.Lookify.services.SongService;

@SpringBootApplication
@Controller
public class SongController {
	private final SongService songService;
	
	public SongController(SongService songService) {
		this.songService = songService;
	}
	
	//home view
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> listofSongs = songService.findAllSong();
		model.addAttribute("songs", listofSongs);
		System.out.println("---- Songs ---- : "+listofSongs);
		return "dashboard.jsp";
	}
	
	@GetMapping("/songs/new")
	public String renderAddSong(@ModelAttribute("addsong")Song song) {
		return "addSong.jsp";
	}
	
	@PostMapping("/songs/new")
	public String createSong(@Valid @ModelAttribute("addsong")Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "addSong.jsp";
		}else {
			songService.addSong(song);
			return "redirect:/dashboard";
		}
			
	}
	
	@GetMapping("/songs/{id}")
	public String showSong(Model model,@PathVariable("id")Long myId) {
		Song mySong = songService.addSong(myId);
		model.addAttribute("song", mySong);
		return "showSong.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteSong(@PathVariable("id")Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/search/topTen")
	public String topTenSong(Model model) {
		List<Song> top10Songs=songService.getTopTen();
		model.addAttribute("songs", top10Songs);
		System.out.println("---top 10 --- " + top10Songs);
		return "top10.jsp";
	}
	
	@PostMapping("/search")
	public String searchArtist(@RequestParam("artist")String artist) {
		return "redirect:/search/"+artist;
	}
	
	@GetMapping("/search/{artist}")
	public String showSearch(Model model,@PathVariable("artist")String artist) {
		List<Song> songs = songService.findbyArtist(artist);
		model.addAttribute("songs",songs);
		model.addAttribute("artist",artist);
		return "search.jsp";
	}
}
