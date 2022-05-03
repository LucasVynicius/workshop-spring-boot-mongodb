package com.lvyni.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvyni.workshopmongo.domain.User;
import com.lvyni.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> fidAll(){
		return repo.findAll();
	}
}
