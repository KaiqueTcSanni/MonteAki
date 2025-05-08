package com.br.monteaki;

import com.br.monteaki.conn.Conexao;
import com.br.monteaki.controller.UsuarioController;
import com.br.monteaki.model.Usuario;
import java.sql.SQLException;

public class Monteaki {

    public static void main(String[] args) {

        // Testando a conexão com o banco de dados
        Conexao.testarConexao();

        UsuarioController usuarioController = new UsuarioController();

        try {

            // Criando um novo usuário
            Usuario novoUsuario = new Usuario();
            novoUsuario.setNome("João Silva");
            novoUsuario.setEmail("joao.silva@email.com");
            novoUsuario.setSenha("123456");

            // Cadastrando o usuário
            usuarioController.cadastrar(novoUsuario);

            // Realizando login
            Usuario usuarioLogado = usuarioController.login("joao.silva@email.com", "123456");
            if (usuarioLogado != null) {
                System.out.println("Login realizado com sucesso!");
                System.out.println("Bem-vindo, " + usuarioLogado.getNome());
            } else {
                System.out.println("Credenciais inválidas.");
            }

            // Obtendo o nome pelo email
            String nome = usuarioController.getNome("joao.silva@email.com");
            System.out.println("Nome do usuário: " + nome);

        } catch (SQLException e) {
            System.out.println("Erro durate testes");
        }
    }
}
