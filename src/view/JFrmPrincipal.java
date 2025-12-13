/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author u04893768190
 */
public class JFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Sistema de vendas Veiculoa");
    }

   
 

//    /**
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnVendedor = new javax.swing.JButton();
        jBtnCliente = new javax.swing.JButton();
        jBtnVeiculos = new javax.swing.JButton();
        jBtnConsultaVenda = new javax.swing.JButton();
        jBtnConsultaVeiculos = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMnuCadastro = new javax.swing.JMenu();
        jMnuUsuarios = new javax.swing.JMenuItem();
        jMnuVendedor = new javax.swing.JMenuItem();
        jMnuClientes = new javax.swing.JMenuItem();
        jMnuVeiculos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMnuSair = new javax.swing.JMenuItem();
        jMnuMovimento = new javax.swing.JMenu();
        jMniVenda = new javax.swing.JMenuItem();
        jMnuConsultas = new javax.swing.JMenu();
        jMniCnsVeiculo = new javax.swing.JMenuItem();
        jMniConsCliente = new javax.swing.JMenuItem();
        jMniConsVenda = new javax.swing.JMenuItem();
        jMniConsVendedor = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        jBtnVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/usuario.png"))); // NOI18N
        jBtnVendedor.setFocusable(false);
        jBtnVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnVendedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVendedorActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnVendedor);

        jBtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cliente.png"))); // NOI18N
        jBtnCliente.setFocusable(false);
        jBtnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnCliente);

        jBtnVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/produto.png"))); // NOI18N
        jBtnVeiculos.setFocusable(false);
        jBtnVeiculos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnVeiculos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVeiculosActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnVeiculos);

        jBtnConsultaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pesquisar_1.png"))); // NOI18N
        jBtnConsultaVenda.setFocusable(false);
        jBtnConsultaVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnConsultaVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnConsultaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultaVendaActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnConsultaVenda);

        jBtnConsultaVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/confirmar.png"))); // NOI18N
        jBtnConsultaVeiculos.setFocusable(false);
        jBtnConsultaVeiculos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnConsultaVeiculos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnConsultaVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultaVeiculosActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnConsultaVeiculos);

        jMnuCadastro.setMnemonic('c');
        jMnuCadastro.setText("Cadastros");
        jMnuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuCadastroActionPerformed(evt);
            }
        });

        jMnuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente_1.png"))); // NOI18N
        jMnuUsuarios.setMnemonic('u');
        jMnuUsuarios.setText("Usuarios");
        jMnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuUsuariosActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuUsuarios);

        jMnuVendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jMnuVendedor.setText("Vendedor");
        jMnuVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVendedorActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuVendedor);

        jMnuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK));
        jMnuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jMnuClientes.setText("Clientes");
        jMnuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuClientesActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuClientes);

        jMnuVeiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imagemCarro.png"))); // NOI18N
        jMnuVeiculos.setMnemonic('p');
        jMnuVeiculos.setText("Veiculos");
        jMnuVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuVeiculosActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuVeiculos);
        jMnuCadastro.add(jSeparator1);

        jMnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exit_1.png"))); // NOI18N
        jMnuSair.setText("Sair");
        jMnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuSairActionPerformed(evt);
            }
        });
        jMnuCadastro.add(jMnuSair);

        jMenuBar2.add(jMnuCadastro);

        jMnuMovimento.setText("Movimento");

        jMniVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMniVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/produto.png"))); // NOI18N
        jMniVenda.setText("Venda");
        jMniVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniVendaActionPerformed(evt);
            }
        });
        jMnuMovimento.add(jMniVenda);

        jMenuBar2.add(jMnuMovimento);

        jMnuConsultas.setText("Consulta");

        jMniCnsVeiculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMniCnsVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/produto.png"))); // NOI18N
        jMniCnsVeiculo.setText("Veiculo");
        jMniCnsVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniCnsVeiculoActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMniCnsVeiculo);

        jMniConsCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMniConsCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cliente_1.png"))); // NOI18N
        jMniConsCliente.setText("Clientes");
        jMniConsCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniConsClienteActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMniConsCliente);

        jMniConsVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMniConsVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/incluir.png"))); // NOI18N
        jMniConsVenda.setText("Vendas");
        jMniConsVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniConsVendaActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMniConsVenda);

        jMniConsVendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMniConsVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/exit.png"))); // NOI18N
        jMniConsVendedor.setText("Vendedor");
        jMniConsVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMniConsVendedorActionPerformed(evt);
            }
        });
        jMnuConsultas.add(jMniConsVendedor);

        jMenuBar2.add(jMnuConsultas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 232, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMnuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuCadastroActionPerformed

    private void jMnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuSairActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMnuSairActionPerformed

    private void jMnuVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVeiculosActionPerformed
        JDlgVeiculos jDlgVeiculos = new JDlgVeiculos(null, true);
        jDlgVeiculos.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMnuVeiculosActionPerformed

    private void jMnuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuClientesActionPerformed
        JDlgClientes jDlgClientes = new JDlgClientes(null, true);
        jDlgClientes.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jMnuClientesActionPerformed

    private void jMnuVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuVendedorActionPerformed
        // TODO add your handling code here:
        JDlgVendedor jDlgVendedor = new JDlgVendedor(null, true);
        jDlgVendedor.setVisible(true);
    }//GEN-LAST:event_jMnuVendedorActionPerformed

    private void jMnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuUsuariosActionPerformed
        // TODO add your handling code here:
        JDlgUsuarios jDlgUsuarios = new JDlgUsuarios(null, true);
        jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMnuUsuariosActionPerformed

    private void jMniVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniVendaActionPerformed
        // TODO add your handling code here:
        JDlgVenda jDlgVenda = new JDlgVenda(null, true);
        jDlgVenda.setVisible(true);
    }//GEN-LAST:event_jMniVendaActionPerformed

    private void jBtnVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVendedorActionPerformed
        // TODO add your handling code here:
        jMnuVendedorActionPerformed(evt);
    }//GEN-LAST:event_jBtnVendedorActionPerformed

    private void jBtnConsultaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultaVendaActionPerformed
        // TODO add your handling code here:
        jMniConsVendaActionPerformed(evt);
    }//GEN-LAST:event_jBtnConsultaVendaActionPerformed

    private void jMniCnsVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniCnsVeiculoActionPerformed
        // TODO add your handling code here:]
        JDlgConsultaVeiculos jDlgConsultaVeiculos = new JDlgConsultaVeiculos(null, true);
        jDlgConsultaVeiculos.setVisible(true);
    }//GEN-LAST:event_jMniCnsVeiculoActionPerformed

    private void jMniConsClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniConsClienteActionPerformed
        // TODO add your handling code here:
        JDlgConsultaClientes jDlgConsultaClientes = new JDlgConsultaClientes(null, true);
        jDlgConsultaClientes.setVisible(true);
    }//GEN-LAST:event_jMniConsClienteActionPerformed

    private void jMniConsVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniConsVendaActionPerformed
        // TODO add your handling code here:
        JDlgConsultaVendas jDlgConsultaVendas = new JDlgConsultaVendas(null, true);
        jDlgConsultaVendas.setVisible(true);
    }//GEN-LAST:event_jMniConsVendaActionPerformed

    private void jMniConsVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMniConsVendedorActionPerformed
        // TODO add your handling code here:
        JDlgConsultaVendedor jDlgConsultaVendedor = new JDlgConsultaVendedor(null, true);
        jDlgConsultaVendedor.setVisible(true);
    }//GEN-LAST:event_jMniConsVendedorActionPerformed

    private void jBtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClienteActionPerformed
        // TODO add your handling code here:
        jMnuClientesActionPerformed(evt);
    }//GEN-LAST:event_jBtnClienteActionPerformed

    private void jBtnVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVeiculosActionPerformed
        // TODO add your handling code here:
        jMnuVeiculosActionPerformed(evt);
    }//GEN-LAST:event_jBtnVeiculosActionPerformed

    private void jBtnConsultaVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultaVeiculosActionPerformed
        // TODO add your handling code here:
        jMniCnsVeiculoActionPerformed(evt);
    }//GEN-LAST:event_jBtnConsultaVeiculosActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCliente;
    private javax.swing.JButton jBtnConsultaVeiculos;
    private javax.swing.JButton jBtnConsultaVenda;
    private javax.swing.JButton jBtnVeiculos;
    private javax.swing.JButton jBtnVendedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMniCnsVeiculo;
    private javax.swing.JMenuItem jMniConsCliente;
    private javax.swing.JMenuItem jMniConsVenda;
    private javax.swing.JMenuItem jMniConsVendedor;
    private javax.swing.JMenuItem jMniVenda;
    private javax.swing.JMenu jMnuCadastro;
    private javax.swing.JMenuItem jMnuClientes;
    private javax.swing.JMenu jMnuConsultas;
    private javax.swing.JMenu jMnuMovimento;
    private javax.swing.JMenuItem jMnuSair;
    private javax.swing.JMenuItem jMnuUsuarios;
    private javax.swing.JMenuItem jMnuVeiculos;
    private javax.swing.JMenuItem jMnuVendedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
