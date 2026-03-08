<<<<<<< HEAD
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
=======
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
        // AQUI ESTAVA O ERRO: Adicionei 'valor' e 'foto_produto' para bater com os 6 '?'
        String sql = "INSERT INTO tbl_produtos (nome_produto, tipo_produto, fornecedor, descricao, valor, foto_produto) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getTipo_produto());
            stmt.setString(3, produto.getFornecedor());
            stmt.setString(4, produto.getDescProduto());
            stmt.setDouble(5, produto.getValorProduto()); // Use o nome correto do seu getter
            stmt.setBytes(6, produto.getImagem());        // Imagem é o 6º parâmetro

            stmt.executeUpdate();
        }
    }

    // Método para listar todos os produtos
    public List<Produto> listarTodos() throws SQLException {
        String sql = "SELECT * FROM tbl_produtos";
        List<Produto> produtos = new ArrayList<>();

        try (Connection con = Conexao.getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Produto produto = new Produto();
                // Ajustado para os nomes exatos das colunas do seu SQL Server
                produto.setId(rs.getLong("id_produto"));
                produto.setNomeProduto(rs.getString("nome_produto"));
                produto.setTipo_produto(rs.getString("tipo_produto"));
                produto.setFornecedor(rs.getString("fornecedor"));
                produto.setDescProduto(rs.getString("descricao"));
                produto.setValorProduto((float) rs.getDouble("valor"));
                produto.setImagem(rs.getBytes("foto_produto"));

                produtos.add(produto);
            }
        }
        return produtos;
    }

    // Método para atualizar um produto
    public void atualizar(Produto produto) throws SQLException {
        // Ajustado para bater com as colunas do banco
        String sql = "UPDATE tbl_produtos SET nome_produto = ?, tipo_produto = ?, fornecedor = ?, descricao = ?, valor = ?, foto_produto = ? WHERE id_produto = ?";

        try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getTipo_produto());
            stmt.setString(3, produto.getFornecedor());
            stmt.setString(4, produto.getDescProduto());
            stmt.setDouble(5, produto.getValorProduto());
            stmt.setBytes(6, produto.getImagem());
            stmt.setLong(7, produto.getId());

            stmt.executeUpdate();
        }
    }

    public void excluir(Long id) throws SQLException {
        String sql = "DELETE FROM tbl_produtos WHERE id_produto = ?";
        try (Connection con = Conexao.getConexao(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}
>>>>>>> 5af5902 (Tela Cadastro de Produtos)
