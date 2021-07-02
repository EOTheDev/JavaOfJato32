package service;

import java.util.List;

import entities.Alimento;

public interface AlimentoService {

	List<Alimento> findAll();
	List<Alimento> findByCat(String category);
	List<String> findCategorie();

	
}
