package com.dmti.sgroe.dto;

import java.io.Serializable;

import com.dmti.sgroe.domain.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String email;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User Obj) {
		
		id = Obj.getId();
		nome = Obj.getId();
		email = Obj.getId();
		}

	//GETTERS E SETTERS
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
