package com.codingdojo.Idea.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.Idea.models.Idea;
import com.codingdojo.Idea.models.Message;
import com.codingdojo.Idea.models.User;
import com.codingdojo.Idea.repositories.IdeaRepository;
import com.codingdojo.Idea.repositories.MessageRepository;

@Service
public class IdeaService {
private final IdeaRepository ideaRepository;
@Autowired
private MessageRepository mRepo;

    
    public IdeaService (IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }
    public Iterable<Idea> allIdeas() {
        return ideaRepository.findAll();
    }

    public Iterable<Idea> allIdeasHighest() {
        return ideaRepository.findAllByOrderByLikesDesc();
    }
    public Iterable<Idea> allIdeasLowest() {
        return ideaRepository.findAllByOrderByLikesAsc();
    }
    public Idea findIdea (Long id) {
        Optional<Idea> optionalIdea = ideaRepository.findById(id);
        if(optionalIdea.isPresent()) {
            return optionalIdea.get();
        } else {
            return null;
        }
    }
    
    public Idea createIdea(Idea i) {
        return ideaRepository.save(i);
    }
    
//    comments
	public void comment(User user, Idea idea, String comment) {
		this.mRepo.save(new Message(user, idea, comment));
	}
    
    
    
    public Idea updateIdea(Idea UIdea ) {
        Optional<Idea> optionalIdea = ideaRepository.findById(UIdea.getId());
        if(optionalIdea.isPresent()) {
            Idea i= optionalIdea.get();
            i.setTitle(UIdea.getTitle());
            i.setArtist(UIdea.getArtist());
            i.setAlbum(UIdea.getAlbum());
            i.setCreatedBy(UIdea.getCreatedBy());
            i.setLikes(UIdea.getLikes());
            i.setUsers(UIdea.getUsers());
            return ideaRepository.save(i);  
        } else {
            return null;
        }
        
    }

    //Delete
    public  void deleteIdea(Long id) {
    	ideaRepository.deleteById(id);
    	
    }
}
