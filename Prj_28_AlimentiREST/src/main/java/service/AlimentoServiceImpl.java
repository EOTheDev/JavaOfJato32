package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import entities.Alimento;
import repos.AlimentoDAO;
import repos.AlimentoDAOImpl;

public class AlimentoServiceImpl implements AlimentoService{

	private AlimentoDAO repo=new AlimentoDAOImpl();

	@Override
	public List<Alimento> findAll() {
		return repo.findAll();
	}

	@Override
	public List<Alimento> findByCat(String category) {
		return repo.findAlimentiByCat(category);
	}

	@Override
	public List<String> findCategorie() {
		List<String> categorie= new ArrayList();
		Set<String> findCategorie= repo.findCategorie();
		for (String categoria : findCategorie) {
			categorie.add(categoria);
		}
		return categorie;
	}
	
	
	
	
	
	
}
