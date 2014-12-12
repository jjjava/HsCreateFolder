package br.com.schumaker.gfx;

import br.com.schumaker.core.CoreFrMain;

/**
 *
 * @author hudson.sales
 */
public class FrMain extends javax.swing.JFrame {
    
    public FrMain() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfSourceFile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfOut = new javax.swing.JTextField();
        btCreate = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemOpenFile = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HsCreateFolder");
        setResizable(false);

        jLabel1.setText("Arquivo origem:");

        tfSourceFile.setEditable(false);

        jLabel2.setText("Local de criação:");

        tfOut.setEditable(false);

        btCreate.setText("Criar");
        btCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCreateActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        jMenuItemOpenFile.setText("Abrir arquivo");
        jMenuItemOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenFileActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemOpenFile);

        jMenuItemExit.setText("Sair");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItemOut.setText("Saída");
        jMenuItemOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOutActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemOut);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSourceFile)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 300, Short.MAX_VALUE))
                    .addComponent(tfOut)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCreate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSourceFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenFileActionPerformed
        tfSourceFile.setText(CoreFrMain.getInstance().openFile());
    }//GEN-LAST:event_jMenuItemOpenFileActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        CoreFrMain.getInstance().close();
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOutActionPerformed
        tfOut.setText(CoreFrMain.getInstance().setOut());
    }//GEN-LAST:event_jMenuItemOutActionPerformed

    private void btCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCreateActionPerformed
        CoreFrMain.getInstance().create();
    }//GEN-LAST:event_btCreateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemOpenFile;
    private javax.swing.JMenuItem jMenuItemOut;
    private javax.swing.JTextField tfOut;
    private javax.swing.JTextField tfSourceFile;
    // End of variables declaration//GEN-END:variables
}
