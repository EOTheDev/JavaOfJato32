package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Editore;

public class EditoreDAOImpl implements EditoreDAO{

	private DB db=new DB();
	private Connection conn;
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	@Override
	public void addEditore(Editore e) {
		this.conn=db.getConn();
		try {
			ps=conn.prepareStatement(ADD);
			ps.setString(1, e.getNome());
			boolean ok=ps.execute();
			if (ok) {
				System.out.println("Editore aggiunto con successo");
			} else {
				System.out.println("Editore NON aggiunto con successo");

			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public Editore getOneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Editore getOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updEditore(Editore e) {
		this.conn=db.getConn();
		try {
			ps=conn.prepareStatement(UPDATE);
			ps.setString(1, e.getNome());
			ps.setInt(1, e.getId());
			boolean ok=ps.execute();
			if (ok) {
				System.out.println("Editore eliminato con successo");
			} else {
				System.out.println("Editore NON eliminato con successo");

			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void deleteEditoreById(int id) {
		this.conn=db.getConn();
		try {
			ps=conn.prepareStatement(DELETE_ONE);
			ps.setInt(1, id);
			boolean ok=ps.execute();
			if (ok) {
				System.out.println("Editore eliminato con successo");
			} else {
				System.out.println("Editore NON eliminato con successo");

			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public List<Editore> getAll() {
		List<Editore> editori = new ArrayList<>();

		try {
			rs = db.getConn().createStatement().executeQuery(FIND_ALL);
		
			while (rs.next()) {
				Editore e = new Editore();
				e.setId(rs.getInt("id"));
				e.setNome(rs.getString("nome"));
				
				editori.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return editori;
	}
	
}
