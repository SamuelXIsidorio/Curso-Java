package capitulo11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploException02 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/cadaluno";
		String user = "impacta";
		String password = "impacta";
		
		Connection conn;
		
		try{
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão realizada com sucesso!");
			
			Statement st = conn.createStatement();
			st.execute("INSERT INTO aluno (nome, curso, mensalidade) VALUES ('Fulano de Tal', 'NodeJS', '1020.89')");
			ResultSet rst = st.executeQuery("SELECT * FROM aluno");
			
			System.out.println("Registros encontrados");
			
			while (rst.next()) {
				System.out.printf("Nome: %s | Curso: %s | Mensalidade: %.2f\n",
						rst.getString("nome"),
						rst.getString("curso"),
						rst.getFloat("mensalidade"));
			}
			
			System.out.println("--- Fim dos resgistros ---");
		} catch (SQLException sql) {
			System.out.println(sql.getMessage());
		}
	}
}
