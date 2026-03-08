package com.br.monteaki.model.view;

import com.br.monteaki.controller.ProdutoController;
import com.br.monteaki.model.Produto;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class TelaCadastroProduto extends javax.swing.JFrame {

    private byte[] imagemBytes;
    private JLabel lblFotoPrevia;

    public TelaCadastroProduto(String nomeUsuario) {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255)); // Branco ou a cor que preferir
        configurarExibicaoFoto();
        // Faz a descrição quebrar linha automaticamente no preview
        lblPreviewDescricao.setText("<html><body style='width: 300px'>Descrição do Produto: </body></html>");

        // 1. Forçamos o painel a ter o tamanho que você quer
        jPanel1.setPreferredSize(new java.awt.Dimension(489, 305));
        jPanel1.setSize(new java.awt.Dimension(489, 305));

        // 2. Preparamos o Label que vai segurar a foto
        lblFotoPrevia = new javax.swing.JLabel();
        lblFotoPrevia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        // 3. Colocamos o Label dentro do seu painel cinza
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(lblFotoPrevia, java.awt.BorderLayout.CENTER);

        //txtBoasVindas.setText("Seja Bem-Vindo(a), " + nomeUsuario);
        jLabel3.setText(nomeUsuario);
    }

    private void configurarExibicaoFoto() {
        lblFotoPrevia = new JLabel();
        lblFotoPrevia.setHorizontalAlignment(SwingConstants.CENTER);
        lblFotoPrevia.setVerticalAlignment(SwingConstants.CENTER);

        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(lblFotoPrevia, BorderLayout.CENTER);
    }

    private Produto produtoEmEdicao = null;

// Construtor para NOVO produto
    public TelaCadastroProduto() {
        initComponents();
        configurarExibicaoFoto();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255)); // Branco ou a cor que preferir
    }

// Construtor para EDITAR produto existente
    public TelaCadastroProduto(Produto p) {
        initComponents();
        configurarExibicaoFoto();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255)); // Branco ou a cor que preferir
        this.produtoEmEdicao = p; // Guarda o produto que estamos editando

        // Preenche os campos
        jTextField1.setText(p.getNomeProduto());
        jTextField2.setText(p.getTipo_produto());
        jTextField3.setText(p.getFornecedor());
        jTextArea2.setText(p.getDescProduto());
        jTextField4.setText(String.valueOf(p.getValorProduto()));

        // Carrega a foto no preview
        if (p.getImagem() != null) {
            imagemBytes = p.getImagem();
            ImageIcon icon = new ImageIcon(imagemBytes);
            Image img = icon.getImage().getScaledInstance(jPanel1.getWidth(), jPanel1.getHeight(), Image.SCALE_SMOOTH);
            lblFotoPrevia.setIcon(new ImageIcon(img));
        }

        jButton2.setText("Atualizar"); // Muda o texto do botão Salvar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TelaImg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblPreviewNome = new javax.swing.JLabel();
        lblPreviewTipo = new javax.swing.JLabel();
        lblPreviewFornecedor = new javax.swing.JLabel();
        lblPreviewDescricao = new javax.swing.JLabel();
        lblPreviewValor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1300, 850));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TelaImg.setBackground(new java.awt.Color(245, 245, 245));
        TelaImg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        TelaImg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(489, 305));
        jPanel1.setPreferredSize(new java.awt.Dimension(489, 305));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TelaImg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 37, 450, 310));

        lblPreviewNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPreviewNome.setText("Nome do Produto");
        TelaImg.add(lblPreviewNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 353, 489, -1));

        lblPreviewTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPreviewTipo.setText("Tipo do Produto");
        TelaImg.add(lblPreviewTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 384, 489, -1));

        lblPreviewFornecedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPreviewFornecedor.setText("Fornecedor");
        TelaImg.add(lblPreviewFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 415, 489, -1));

        lblPreviewDescricao.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lblPreviewDescricao.setText("Descrição do Produto ");
        lblPreviewDescricao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        TelaImg.add(lblPreviewDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 450, 160));

        lblPreviewValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TelaImg.add(lblPreviewValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 450, 32));

        getContentPane().add(TelaImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, 670));

        jPanel3.setBackground(new java.awt.Color(106, 13, 173));
        jPanel3.setFocusCycleRoot(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Produtos");

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

        jLabel3.getAccessibleContext().setAccessibleName("name");
        jLabel3.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, -1));
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Cadastro do Produto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 85, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Nome do Produto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 175, -1, -1));

        jTextField1.setBackground(new java.awt.Color(245, 245, 245));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 206, 444, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Tipo do Produto ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 291, -1, -1));

        jTextField2.setBackground(new java.awt.Color(245, 245, 245));
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 322, 255, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Fornecedor ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 291, 160, -1));

        jTextField3.setBackground(new java.awt.Color(245, 245, 245));
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 322, 255, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Descrição do Produto ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 384, 206, -1));

        jTextArea2.setBackground(new java.awt.Color(245, 245, 245));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea2KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 415, 400, 149));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Valor");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 582, 102, -1));

        jTextField4.setBackground(new java.awt.Color(245, 245, 245));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTextField4.setText(" R$:");
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 613, 210, 38));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Imagem do Produto ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 175, 183, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Upload");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 206, 173, 38));

        jButton2.setBackground(new java.awt.Color(66, 222, 90));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Salvar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 173, 38));

        jButton3.setBackground(new java.awt.Color(87, 190, 253));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Publicar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 710, 173, 38));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCampos() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextArea2.setText("");
        jTextField4.setText("R$:");
        lblFotoPrevia.setIcon(null);
        imagemBytes = null;
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
        int res = chooser.showOpenDialog(this);

        if (res == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File arquivo = chooser.getSelectedFile();
            try {
                imagemBytes = java.nio.file.Files.readAllBytes(arquivo.toPath());

                // Cria a imagem e redimensiona para o tamanho do jPanel1
                javax.swing.ImageIcon icon = new javax.swing.ImageIcon(imagemBytes);
                java.awt.Image img = icon.getImage().getScaledInstance(jPanel1.getWidth(), jPanel1.getHeight(), java.awt.Image.SCALE_SMOOTH);

                lblFotoPrevia.setIcon(new javax.swing.ImageIcon(img));
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar imagem: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        lblPreviewNome.setText(jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        lblPreviewTipo.setText(jTextField2.getText());
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextArea2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea2KeyTyped

    private void jTextArea2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyReleased
        // TODO add your handling code here:
        String texto = jTextArea2.getText();

        // Limita a 255 caracteres
        if (texto.length() > 255) {
            texto = texto.substring(0, 255);
            jTextArea2.setText(texto);
        }
        // O segredo do HTML: O JLabel entende que deve quebrar linha se estiver dentro de <html>
        // O style 'width: 300px' força o texto a descer quando atingir essa largura
        lblPreviewDescricao.setText("<html><body style='width: 350px'>" + texto + "</body></html>");
    }//GEN-LAST:event_jTextArea2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        lblPreviewFornecedor.setText(jTextField3.getText());
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        // 1. Remove tudo que não for número
        String original = jTextField4.getText().replaceAll("[^\\d]", "");

        // 2. Limita a 7 dígitos (5 esquerda + 2 direita)
        if (original.length() > 7) {
            original = original.substring(0, 7);
        }

        // 3. Formata visualmente para o usuário: 00000,00
        String formatado = "";
        if (original.length() > 2) {
            String parteInteira = original.substring(0, original.length() - 2);
            String parteDecimal = original.substring(original.length() - 2);
            formatado = parteInteira + "," + parteDecimal;
        } else {
            formatado = original;
        }

        // Atualiza o campo de digitação (mantendo o R$: se desejar)
        jTextField4.setText(formatado);

        // 4. Atualiza o PREVIEW com o R$:
        lblPreviewValor.setText("Valor R$: " + formatado);
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // 1. Validação Básica: Não permite salvar sem nome ou sem imagem
            if (jTextField1.getText().trim().isEmpty() || imagemBytes == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Por favor, preencha o nome e selecione uma imagem!");
                return;
            }

            // 2. Instancia o objeto de modelo
            Produto p = new Produto();
            p.setNomeProduto(jTextField1.getText());
            p.setTipo_produto(jTextField2.getText());
            p.setFornecedor(jTextField3.getText());
            p.setDescProduto(jTextArea2.getText());
            p.setImagem(imagemBytes);
            p.setQntProduto(1); // Valor padrão

            // 3. TRATAMENTO DO VALOR (O que você perguntou)
            // Remove o "R$:", troca a vírgula por ponto para o Java entender como número
            String valorLimpo = jTextField4.getText().replace("R$", "").replace(":", "").trim();
            if (!valorLimpo.isEmpty()) {
                String valorParaBanco = valorLimpo.replace(",", ".");
                float preco = Float.parseFloat(valorParaBanco);
                p.setValorProduto(preco);
            }

            // 4. ENVIO PARA O BANCO DE DADOS
            ProdutoController controller = new ProdutoController();
            controller.cadastrar(p);

            // 5. Feedback e Limpeza
            javax.swing.JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
            //limparCampos();

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: O valor informado é inválido.");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar no banco: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastroProduto("").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaImg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblPreviewDescricao;
    private javax.swing.JLabel lblPreviewFornecedor;
    private javax.swing.JLabel lblPreviewNome;
    private javax.swing.JLabel lblPreviewTipo;
    private javax.swing.JLabel lblPreviewValor;
    // End of variables declaration//GEN-END:variables
}
