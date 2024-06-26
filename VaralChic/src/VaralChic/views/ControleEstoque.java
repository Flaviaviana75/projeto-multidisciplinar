package VaralChic.views;

public class ControleEstoque extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ControleEstoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Preco = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JLabel();
        btnPesquisarProduto = new javax.swing.JToggleButton();
        txtPesquisarProduto = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnEditarProduto = new javax.swing.JButton();
        btnDeleteProduto = new javax.swing.JButton();
        lblLogotipo = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Categoria de roupa");

        Preco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROLE DE ESTOQUE");
        setLocation(new java.awt.Point(100, 100));
        setMinimumSize(new java.awt.Dimension(920, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTitulo.setText("Controle de estoque");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 16, -1, -1));

        btnPesquisarProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPesquisarProduto.setText("Pesquisar");
        getContentPane().add(btnPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        txtPesquisarProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 500, 30));

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 23, -1, -1));

        tblProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CATEGORIA DE ROUPA", "QUANTIDADE", "PREÇO"
            }
        ));
        tblProduto.setAutoscrolls(false);
        tblProduto.setMinimumSize(new java.awt.Dimension(80, 80));
        jScrollPane1.setViewportView(tblProduto);
        if (tblProduto.getColumnModel().getColumnCount() > 0) {
            tblProduto.getColumnModel().getColumn(0).setMinWidth(150);
            tblProduto.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblProduto.getColumnModel().getColumn(0).setMaxWidth(150);
            tblProduto.getColumnModel().getColumn(2).setMinWidth(100);
            tblProduto.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblProduto.getColumnModel().getColumn(2).setMaxWidth(100);
            tblProduto.getColumnModel().getColumn(3).setMinWidth(100);
            tblProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblProduto.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 790, 280));

        btnEditarProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarProduto.setText("EDITAR");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 103, 36));

        btnDeleteProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeleteProduto.setText("EXCLUIR");
        btnDeleteProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 103, 36));

        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoVaralChic/VARALCHIC logo.png"))); // NOI18N
        getContentPane().add(lblLogotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecoActionPerformed

    private void txtPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarProdutoActionPerformed

    private void btnDeleteProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteProdutoActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Preco;
    private javax.swing.JButton btnDeleteProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JToggleButton btnPesquisarProduto;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtPesquisarProduto;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
