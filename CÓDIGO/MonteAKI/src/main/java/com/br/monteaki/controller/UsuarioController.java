package com.br.monteaki.controller;

import com.br.monteaki.conn.Conexao;
import com.br.monteaki.model.Usuario;
import java.sql.*;

public class UsuarioController {

// Método para cadastrar um usuário usando um objeto Usuario
// Modificado para retornar boolean e verificar duplicidade
    public boolean cadastrar(Usuario usuario) throws SQLException {
        // 1. Verificar se já existe um usuário com este e-mail
        if (buscarPorEmail(usuario.getEmail()) != null) {
            System.out.println("Usuário já cadastrado com o email: " + usuario.getEmail());
            return false; // Indica que o cadastro não foi realizado pois o usuário já existe
        }

        // 2. Se não existir, prosseguir com o cadastro
        String sql = "INSERT INTO tblUsuario (nome, email, senha) VALUES (?, ?, ?)";
        try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha()); // Lembre-se da importância de hashear senhas em produção!
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Usuário '" + usuario.getNome() + "' cadastrado com sucesso!");
                return true; // Cadastro realizado com sucesso
            } else {
                // Isso não deveria acontecer se a conexão estiver ok e o SQL correto,
                // mas é uma verificação adicional.
                System.out.println("Falha ao cadastrar o usuário '" + usuario.getNome() + "'. Nenhuma linha afetada.");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
            throw e; // Re-lança a exceção para ser tratada pelo chamador
        }
    }

    // Método para buscar por nome de usuário pelo email
    public String buscarPorEmail(String email) throws SQLException {
        String sql = "SELECT * FROM tblUsuario WHERE email = ?";
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
            System.out.println("Todos os usuários foram limpos da tabela tblUsuario.");
        }
    }

   
}
