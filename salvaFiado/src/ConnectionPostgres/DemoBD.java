package ConnectionPostgres;

public class DemoBD {

	public static void main(String[] args) {
		ConnectionP p = new ConnectionP();
		
		String sql = "insert into pessoas(id, nome, nascimento, sexo, peso, nacionalidade)"+
		"values (6,'tunico','2001-12-30','M',89.89,'Angelina')";
        
		int res = p.executarSQL(sql);
		
		if(res > 0) {
			System.out.println("Sucesso!");
		}else {
			System.out.println("Erro!");
		}
		
		System.out.println(p);
	}

}
