package com.dmti.sgroe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dmti.sgroe.domain.Ocorrencia;

@Repository
public interface OcorrenciaRepository extends MongoRepository<Ocorrencia, String> {

}
