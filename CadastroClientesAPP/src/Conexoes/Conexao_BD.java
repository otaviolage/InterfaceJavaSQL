/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexoes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mathe
 */
public class Conexao_BD {
    
    
    //atributos de conexão com o banco
    private Connection conn = null; //variável de conexão com o banco
    private Statement statement; //variável de manipulação do SQL
    private ResultSet resultSet;
 
    private String servidor = "localhost:3306";
    private String nomeDoBanco = "bd_loja";
    private String usuario = "root";
    private String senha = "root";
 
    //Construtor    
    public Conexao_BD(){
 
    }
 
    public Conexao_BD(String servidor, String nomeDoBanco, String usuario, String senha){
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;
    }
 
    public Connection getConn() {
        return conn;
    }
 
    public void setConn(Connection conn) {
        this.conn = conn;
    }
 
    public Statement getStatement() {
        return statement;
    }
 
    public void setStatement(Statement statement) {
        this.statement = statement;
    }
 
    public ResultSet getResultSet() {
        return resultSet;
    }
 
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
 
    public void conectaBanco(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomeDoBanco, usuario, senha);
            if(conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }            
        } catch (Exception e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }
    
 
    public boolean fechaBanco(){
        try {
            conn.close();
            return true;
            
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao " + e.getMessage());
            return false;
        }
    }
 
    public int insertSQL(String SQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement                   
            this.setStatement(getConn().createStatement());
 
            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(SQL);
 
            return status;
        } catch (SQLException ex) {
          
            return status;
        }
    }
 
    public void executarSQL(String sql) {
        try {
            this.statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(sql);
 
//            while (this.getResultSet().next()) {
//                System.out.println(this.getResultSet().getInt(1));
//            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }
}
