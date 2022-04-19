package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.AeroportoEntity;
import repository.AeroportoRepo;

@Service
public class AbrirVooService extends VoarService {
	
	@Autowired
	AeroportoRepo repo;
	
	
	public List<AeroportoEntity> nomeCidade(String cidade) {
		return (List<AeroportoEntity>) repo.localizacaoPorIataCodeIgnoreCase(cidade);
	    }
	
	public List<AeroportoEntity> nomePais(String Pais) {
        return repo.localizacaoPorPais(Pais);
	    }
	
    public AeroportoEntity NomeIataCode(String iataCode) {
	    return repo.localizacaoPorIataCodeIgnoreCase(iataCode);
	    }
	
}
