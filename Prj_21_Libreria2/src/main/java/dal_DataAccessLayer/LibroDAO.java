package dal_DataAccessLayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import model.Libro;

public class LibroDAO {
	
	
	private DB db=new DB();
	private Statement stat=null;
	private ResultSet rs= null;
	private ArrayList<Libro> libri=new ArrayList<>();
	public ArrayList<Libro> findAll() {
		try {
			stat=db.getConn().createStatement();
			String sql="select * from libro";
			rs=stat.executeQuery(sql);
			while (rs.next()) {
				int id=rs.getInt("id");
				int pagine=rs.getInt("pagine");
				int editoreId=rs.getInt("editore_id");
				String titolo = rs.getString("titolo");
				double prezzo= rs.getDouble("prezzo");
				Libro l=new Libro(id, pagine, editoreId, titolo, prezzo);
				libri.add(l);
			}
		} catch (SQLException e) {
			System.err.println("Si è verificato un problema nella connessione: "+e.getMessage());		}
		return libri;
	}
	
	public void addLibro(Libro l) {
		try {
			stat=db.getConn().createStatement();
			String sql="insert into libro(titolo, pagine, editore_id, prezzo) values ('";
			sql+=l.getTitolo()+"','";
			sql+=l.getPagine()+"','";
			sql+=l.getId_editore()+"','";
			sql+=l.getPrezzo()+"')";
			int i=stat.executeUpdate(sql);
			System.out.println("libri inseriti: "+i);
			
		} catch (SQLException e) {
			System.err.println("Si è verificato un problema nella connessione: "+e.getMessage());
		}
	}
	public void deleteLibro(int id) {
		try {
			stat=db.getConn().createStatement();
			int i= stat.executeUpdate("delete from libro where id="+id);
			System.out.println("libri eliminati: "+i);
		} catch (SQLException e) {
				System.err.println("Si è verificato un problema nella connessione: "+e.getMessage());
		}
	}
	
	public void updateLibro(Libro l) {
		try {
			stat=db.getConn().createStatement();
			String sql="update libro set ";
			sql+="'titolo'='"+l.getTitolo()+"',";
			sql+="'pagine'='"+l.getPagine()+"','";
			sql+="'id_editore'='"+l.getId_editore()+"','";
			sql+="'prezzo'='"+l.getPrezzo()+"'";
			sql+="where id"+l.getId();
			int i= stat.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.err.println("Si è verificato un problema nella connessione: "+e.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		LibroDAO ld=new LibroDAO();
		ArrayList<Libro> libririsultanti=ld.findAll();
		for (Libro libro : libririsultanti) {
			System.out.println(libro);
		} 
		//ld.addLibro(new Libro(200, 1800, 4, "Java: mattone dopo mattone", 600));
//		libririsultanti=ld.findAll();
//		for (Libro libro : libririsultanti) {
//			System.out.println(libro);
//		} 
		//ld.deleteLibro(25);
		libririsultanti=ld.findAll();
		for (Libro libro : libririsultanti) {
			System.out.println(libro);
		} 
		Libro l=libririsultanti.get(5);
		l.setPagine(5555);
		libririsultanti=ld.findAll();
		for (Libro libro : libririsultanti) {
			System.out.println(libro);
		} 
	}

//	
//	public ArrayList<Libro> getLibri() {
//		return libri;
//	}
//	public void setLibri(ArrayList<Libro> libri) {
//		this.libri = libri;
//	}
//	private ArrayList<Libro> libri= new ArrayList<>();
//	//blocco di inizializzazione
//	{
//		libri.add(new Libro(1,25,1,"i malavoglia",15.20));
//		libri.add(new Libro(2,1002,3,"guerra e pace",10.9));
//		libri.add(new Libro(3,50,1,"zanna bianca",20));
//		libri.add(new Libro(4,10,1,"Pokemon gt",19.9));
//		libri.add(new Libro(5,3503,1,"Pinocchio",14.60));
//		libri.add(new Libro(6,600,2,"Ventimiglia",3.99));
//	}


}
