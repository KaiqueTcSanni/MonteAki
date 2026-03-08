/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.br.monteaki.model.view;

import com.br.monteaki.controller.ProdutoController;
import com.br.monteaki.model.Produto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class ControleEstoque extends javax.swing.JFrame {

    public ControleEstoque(String nomeUsuario) {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText(nomeUsuario);
        // 1. Mudando o cursor para indicar que é clicável
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

// 2. Adicionando os eventos de clique e feedback visual
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Ação que o "botão" vai executar
                executarAcaoDoBotao();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                // Efeito de Hover (ex: mudar a cor do texto para azul)
                jLabel4.setForeground(java.awt.Color.BLUE);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                // Volta à cor original quando o mouse sai
                jLabel4.setForeground(java.awt.Color.BLACK);
            }
        });

        // 1. Mudando o cursor para indicar que é clicável
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

// 2. Adicionando os eventos de clique e feedback visual
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Ação que o "botão" vai executar
                executarAcaoDoBotao();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                // Efeito de Hover (ex: mudar a cor do texto para azul)
                jLabel5.setForeground(java.awt.Color.BLUE);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                // Volta à cor original quando o mouse sai
                jLabel5.setForeground(java.awt.Color.BLACK);
            }
        });
        // 1. Mudando o cursor para indicar que é clicável
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

// 2. Adicionando os eventos de clique e feedback visual
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // 1. Instancia a nova tela
                TelaCadastroProduto novaTela = new TelaCadastroProduto();

                // 2. Torna a nova tela visível
                novaTela.setVisible(true);

                // 3. (Opcional) Fecha ou esconde a tela atual (ControleEstoque)
                dispose();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                // Efeito de Hover (ex: mudar a cor do texto para azul)
                jLabel6.setForeground(java.awt.Color.BLUE);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                // Volta à cor original quando o mouse sai
                jLabel6.setForeground(java.awt.Color.BLACK);
            }
        });

        // 1. Mudando o cursor para indicar que é clicável
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

// 2. Adicionando os eventos de clique e feedback visual
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Ação que o "botão" vai executar
                executarAcaoDoBotao();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                // Efeito de Hover (ex: mudar a cor do texto para azul)
                jLabel7.setForeground(java.awt.Color.BLUE);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                // Volta à cor original quando o mouse sai
                jLabel7.setForeground(java.awt.Color.BLACK);
            }
        });

        // 1. Mudando o cursor para indicar que é clicável
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

// 2. Adicionando os eventos de clique e feedback visual
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Ação que o "botão" vai executar
                executarAcaoDoBotao();
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                // Efeito de Hover (ex: mudar a cor do texto para azul)
                jLabel8.setForeground(java.awt.Color.BLUE);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                // Volta à cor original quando o mouse sai
                jLabel8.setForeground(java.awt.Color.BLACK);
            }
        });

    }
// Método de exemplo para a ação

    private void executarAcaoDoBotao() {
        javax.swing.JOptionPane.showMessageDialog(null, "jLabel4 clicado!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Sair");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 190, 30));

        jPanel3.setBackground(new java.awt.Color(106, 13, 173));
        jPanel3.setFocusCycleRoot(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Controle de Estoque");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Mini_Logo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icone-usuario.png"))); // NOI18N
        jLabel3.setText("nome usuario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Produtos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Cadastro de Produtos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 190, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Funcionários ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 190, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Configuração ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 190, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel10.setText("128xp");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 140, -1, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel11.setText("128xp");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel12.setText("128xp");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, 70));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel13.setText("128xp");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, -1, 70));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel14.setText("128xp");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel15.setText("128xp");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, 70));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel16.setText("128xp");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, 70));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel17.setText("128xp");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 240, -1, 70));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel18.setText("128xp");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 340, -1, 70));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel19.setText("128xp");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, 70));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel20.setText("128xp");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, -1, 70));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel21.setText("128xp");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, 70));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel22.setText("128xp");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, -1, 70));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel23.setText("128xp");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, 70));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel24.setText("128xp");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, 70));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel25.setText("128xp");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, -1, 70));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel26.setText("128xp");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, -1, 70));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel27.setText("128xp");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 530, -1, 70));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel28.setText("128xp");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, -1, 70));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel29.setText("128xp");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 530, -1, 70));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel31.setText("128xp");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, -1, 70));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel32.setText("128xp");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, -1, 70));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/graphic-card (2).png"))); // NOI18N
        jLabel33.setText("128xp");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, -1, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleEstoque("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
