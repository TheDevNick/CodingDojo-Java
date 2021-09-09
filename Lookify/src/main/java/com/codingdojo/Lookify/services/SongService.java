package com.codingdojo.Lookify.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.codingdojo.Lookify.models.Song;
import com.codingdojo.Lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepository;
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	
	
	// add a song
	public void addSong(Song song) {
		songRepository.save(song);
	}
	
	//find all songs
	public List<Song> findAllSong() {
		return (List<Song>) songRepository.findAll();
	}
	
	public Song addSong(Long myId) {
		Optional<Song> findSong = songRepository.findById(myId);
		if (findSong.isPresent()) {
			return findSong.get();
		} else {
			return null;
		}
	}
	
	//delete song
	public void deleteSong(Long id) {
		songRepository.deleteById(id);
	}
	
	public List<Song> getTopTen() {
		return songRepository.findTop10ByOrderByRatingDesc();
	}
	public List<Song> findbyArtist(String name){
		return songRepository.findByArtist(name);
	}
}
