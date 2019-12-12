package com.dmti.sgroe.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.dmti.sgroe.domain.Ocorrencia;
import com.dmti.sgroe.domain.User;
import com.dmti.sgroe.repository.OcorrenciaRepository;
import com.dmti.sgroe.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userReposiroty;
	
	@Autowired
	private OcorrenciaRepository ocorrenciaReposiroty;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userReposiroty.deleteAll();
		ocorrenciaReposiroty.deleteAll();
		
		User jhon = new User(null, "Jhon scuber", "Jhon.scuber@gmail.com");
		User frederic = new User(null, "Frederic marata", "Frederic@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Ocorrencia ocorrencia1 = new Ocorrencia(null, sdf.parse("01/12/2019"), "Briga de alunos", "alunos brigando na sala", jhon);
		Ocorrencia ocorrencia2 = new Ocorrencia(null, sdf.parse("01/12/2019"), "Aluno Doente", "aluno doente", jhon);
		
		userReposiroty.saveAll(Arrays.asList(jhon, frederic, bob));
		ocorrenciaReposiroty.saveAll(Arrays.asList(ocorrencia1, ocorrencia2));
		
		
		
	}

}
