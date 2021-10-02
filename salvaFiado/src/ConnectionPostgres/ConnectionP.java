package ConnectionPostgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionP {
	private final String DRIVE = "org.postgresql.Driver";
	private final String URL = "jdbc:postgresql://localhost:5432/cadastro";
	private final String PASSWORD = "postgres";
	private final String USER = "postgres";
	private Connection CON;
	
	public ConnectionP() {

		try {
			Class.forName(DRIVE);
		    this.setCON(DriverManager.getConnection(URL, USER, PASSWORD));
			System.out.println("conexao feita com sucesso!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int executarSQL(String sql) {
		try {
			Statement stm = this.CON.createStatement();
			int res = stm.executeUpdate(sql);
			this.CON.close();
			return res;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public Connection getCON() {
		return this.CON;
	}

	public void setCON(Connection cON) {
		CON = cON;
	}
}
