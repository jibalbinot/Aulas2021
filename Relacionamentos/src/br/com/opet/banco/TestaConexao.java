package br.com.opet.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) {
		/*
		 * package java.sql
		 * Connection
		 * DriverManager
		 * PreparedStatement
		 * ResultSet
		 * SQLException
		 * 
		 */
		
		//variaveis
		Connection c = null; //para a conexao
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String usuario = "system";
		String senha = "admin";
		String clausula = "";//comando a ser executado (CRUD)
		PreparedStatement ps = null;//carregamento e execução do comando
		ResultSet rs = null;//conjunto de resultados
		
		// 1) Conexao com o banco
		try {
			c = DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar: " + e);
		}
		System.out.println("Conectou com sucesso");
		
		
		/*
		 * 2) preparar a cláusula (CRUD - create, read, update ou delete)
		 * create - insert
		 */
		clausula = "INSERT INTO CLIENTE(IDCLIENTE,NOMECLIENTE,EMAILCLIENTE,SENHACLIENTE) VALUES (3,'Marcos','marcos@uniopet.edu.br','teste321')";
		try {
			ps = c.prepareStatement(clausula);//carrega o comando
		    ps.execute();//executa o comando no banco
		} catch (SQLException e) {
			System.out.println("Erro ao executar o insert: " + e);
		}
		
		
		/*
		 * 3) preparar a cláusula (CRUD - create, read, update ou delete)
		 * read - select
		 */
		clausula = "SELECT * FROM CLIENTE";
		try {
			ps = c.prepareStatement(clausula);//carrega o comando
		    rs = ps.executeQuery();//executa o comando no banco e armazena o resultado em rs
		    //mostrar na tela o resultado
		    while(rs.next()) {//equanto tiver linha no resultado
		    	System.out.print(rs.getInt("IDCLIENTE")+" ");
		    	System.out.print(rs.getString("NOMECLIENTE")+" ");
		    	System.out.print(rs.getString("EMAILCLIENTE")+" ");
		    	System.out.println(rs.getString("SENHACLIENTE")+" ");
		    }
		} catch (SQLException e) {
			System.out.println("Erro ao executar o select: " + e);
		}
		
		

	}

}
