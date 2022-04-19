package controller;

import java.util.List;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import model.AeroportoEntity;
import service.AbrirVooService;
import service.VoarService;

@Configuration
@ComponentScan(basePackages = { "com.api-rest.aeroporto" })

@RestController
@RequestMapping(value= "/cidade")
public class ProcurarCidadeController {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ProcurarCidadeController.class);
	
	@Autowired
	private AbrirVooService abrirVooService;
	
	@RequestMapping(value= "/{cidade}", method= RequestMethod.GET)
	public List<AeroportoEntity> procurar(String cidade) {
		List<AeroportoEntity> retval = abrirVooService.aeroportoCidade(cidade);
		
		if(retval != null) {
			logger.info("Aeroporto para a cidade {}: {}", cidade, retval.size());
		} else {
			logger.info("Aeroporto para a cidade {}: 0", cidade);
		}
		return retval;
	}
	
	
	
}
