package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.AeroportoEntity;

public interface AeroportoRepo extends JpaRepository<AeroportoEntity, Long> {

	List<AeroportoEntity> localizacaoPorCidade (String cidade);
	List<AeroportoEntity> localizacaoPorPais (String pais);
	AeroportoEntity localizacaoPorIataCodeIgnoreCase (String iataCode);

	
}
