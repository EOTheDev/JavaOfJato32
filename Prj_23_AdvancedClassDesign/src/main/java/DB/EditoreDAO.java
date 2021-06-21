package DB;

import java.util.List;

import model.Editore;

public interface EditoreDAO {
	
		//Create
		String ADD="INSERT INTO EDITORE (NOME) VALUES (?)";
		
		//Read
		String FIND_ALL="SELECT * FROM EDITORE";
		String FIND_ONE="SELECT * FROM EDITORE WHERE ID=?";
		
		
		//U: Update
		String UPDATE = "UPDATE editore set nome = ? where id = ?";
		//Delete
		String DELETE_ONE="delete * FROM EDITORE WHERE ID=?";
		
		//create
		void addEditore(Editore e);
		//read
		List<Editore> getAll();
		Editore getOneById(int id);
		Editore getOneByName(String name);
		
		//update
		void updEditore(Editore e);
		
		//delete
		void deleteEditoreById(int id);
		
		
		
	

}
