package com.br.monteaki.controller;
 
import com.br.monteaki.conn.Conexao;
import com.br.monteaki.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
public class ProdutoController {
 
    // Método para cadastrar um produto
    public void cadastrar(Produto produto) throws SQLException {
        String sql = "INSERT INTO tbl_produto (nome, descricao, preco, quantidade_estoque) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getDescProduto());
            stmt.setDouble(3, produto.getValorProdtuo());
            stmt.setInt(4, produto.getQntProduto());
            stmt.executeUpdate();
        }
    }
// Método para listar todos os produtos
   public List<Produto> listarTodos() throws SQLException {
       String sql = "SELECT * FROM tbl_produto";
       List<Produto> produtos = new ArrayList();
       try (Connection con = Conexao.getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
           while (rs.next()) {
               Produto produto = new Produto();
               produto.setId(rs.getLong("id"));
               produto.setNomeProduto(rs.getString("nome"));
               produto.setDescProduto(rs.getString("descricao"));
               produto.setValorProduto((float) rs.getDouble("preco"));
               produto.setQntProduto(rs.getInt("quantidade_estoque"));
               produtos.add(produto);
           }
       }
       return produtos;
   }
 
   // Método para atualizar um produto
   public void atualizar(Produto produto) throws SQLException {
       String sql = "UPDATE tbl_produto SET nome = ?, descricao = ?, preco = ?, quantidade_estoque = ? WHERE id = ?";
       try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
           stmt.setString(1, produto.getNomeProduto());
           stmt.setString(2, produto.getDescProduto());
           stmt.setDouble(3, produto.getValorProdtuo());
           stmt.setInt(4, produto.getQntProduto());
           stmt.setLong(5, produto.getId());
           stmt.executeUpdate();
       }
   }
 
   // Método para excluir um produto
   public void excluir(Long id) throws SQLException {
       String sql = "DELETE FROM tbl_produto WHERE id = ?";
       try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
           stmt.setLong(1, id);
           stmt.executeUpdate();
       }
   }
}