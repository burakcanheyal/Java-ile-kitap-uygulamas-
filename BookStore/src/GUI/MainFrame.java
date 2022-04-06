/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author HeyAl
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        disp = new javax.swing.JButton();
        rem = new javax.swing.JButton();
        sea = new javax.swing.JButton();
        sto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Main Page"));

        add.setText("Add Book");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        disp.setText("Display Books");
        disp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispActionPerformed(evt);
            }
        });

        rem.setText("Remove Book");
        rem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remActionPerformed(evt);
            }
        });

        sea.setText("Search Book");
        sea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaActionPerformed(evt);
            }
        });

        sto.setText("Show Stock");
        sto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stoActionPerformed(evt);
            }
        });

        ar.setColumns(20);
        ar.setRows(5);
        jScrollPane1.setViewportView(ar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(disp)
                .addGap(39, 39, 39)
                .addComponent(rem)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(sea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sto)
                .addGap(61, 61, 61))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(disp)
                    .addComponent(rem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sea)
                    .addComponent(sto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        AddFrame a1 = new AddFrame(this);
        ar.append("\nAdd Frame is opening.");
        a1.setVisible(true);
        dispose();
    }//GEN-LAST:event_addActionPerformed

    private void dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispActionPerformed
        // TODO add your handling code here:
        DispFrame d1 = new DispFrame(this);
        ar.append("\nDisplay Frame is opening.");
        d1.setVisible(true);
        dispose();
    }//GEN-LAST:event_dispActionPerformed

    private void remActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remActionPerformed
        // TODO add your handling code here:
        RemFrame r1 = new RemFrame(this);
        ar.append("\nRemove Frame is opening.");
        r1.setVisible(true);
        dispose();
    }//GEN-LAST:event_remActionPerformed

    private void seaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaActionPerformed
        // TODO add your handling code here:
        SeaFrame s1 = new SeaFrame(this);
        ar.append("\nSearch Frame is opening.");
        s1.setVisible(true);
        dispose();
    }//GEN-LAST:event_seaActionPerformed

    private void stoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stoActionPerformed
        // TODO add your handling code here:
        StoFrame st1 = new StoFrame(this);
        ar.append("\nStock Frame is opening.");
        st1.setVisible(true);
        dispose();
    }//GEN-LAST:event_stoActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextArea ar;
    private javax.swing.JButton disp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rem;
    private javax.swing.JButton sea;
    private javax.swing.JButton sto;
    // End of variables declaration//GEN-END:variables
}