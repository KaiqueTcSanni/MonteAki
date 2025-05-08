package com.br.monteaki.controller;

import com.br.monteaki.conn.Conexao;
import com.br.monteaki.model.Usuario;

import java.sql.*;

public class UsuarioController {

 // Método para cadastrar um usuário usando um objeto Usuario
 public void cadastrar(Usuario usuario) throws SQLException {
     String sql = "INSERT INTO tblUsuario (nome, email, senha) VALUES (?, ?, ?)";
     try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
         stmt.setString(1, usuario.getNome());
         stmt.setString(2, usuario.getEmail());
         stmt.setString(3, usuario.getSenha());
         stmt.executeUpdate();
     }
 }

 // Método para login, retorna um objeto Usuario se as credenciais forem válidas
 public Usuario login(String email, String senha) throws SQLException {
     String sql = "SELECT * FROM tblUsuario WHERE email = ? AND senha = ?";
     try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
         stmt.setString(1, email);
         stmt.setString(2, senha);
         ResultSet rs = stmt.executeQuery();

         if (rs.next()) {
             Usuario usuario = new Usuario();
             usuario.setId(rs.getLong("id"));
             usuario.setNome(rs.getString("nome"));
             usuario.setEmail(rs.getString("email"));
             usuario.setSenha(rs.getString("senha"));
             return usuario; // Retorna o objeto Usuario preenchido
         } else {
             return null; // Retorna null se não encontrar o usuário
         }
     }
 }

 // Método para limpar todos os usuários
 public void limparUsuarios() throws SQLException {
     try (Connection con = Conexao.getConexao(); Statement stmt = con.createStatement()) {
         stmt.execute("DELETE FROM tblUsuario");
     }
 }

 // Método para obter o nome de um usuário pelo email
 public String getNome(String email) throws SQLException {
     String sql = "SELECT nome FROM tblUsuario WHERE email = ?";
     try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
         stmt.setString(1, email);
         ResultSet rs = stmt.executeQuery();

         if (rs.next()) {
             return rs.getString("nome");
         } else {
             return null; // Retorna null se não encontrar o email
         }
     }
 }

 // Método para buscar um usuário completo pelo email
 public Usuario buscarPorEmail(String email) throws SQLException {
     String sql = "SELECT * FROM tblUsuario WHERE email = ?";
     try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
         stmt.setString(1, email);
         ResultSet rs = stmt.executeQuery();

         if (rs.next()) {
             Usuario usuario = new Usuario();
             usuario.setId(rs.getLong("id"));
             usuario.setNome(rs.getString("nome"));
             usuario.setEmail(rs.getString("email"));
             usuario.setSenha(rs.getString("senha"));
             return usuario; // Retorna o objeto Usuario preenchido
         } else {
             return null; // Retorna null se não encontrar o email
         }
     }
 }
}