package dal;

import java.util.List;

public interface LibroDAO {
	String TROVA_TUTTI= "select id, titolo from libro";
	
	List <LibroDAO> getAll();
}
