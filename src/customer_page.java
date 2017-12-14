
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * customer_page.java
 *
 * Created on Jun 7, 2016, 11:01:09 AM
 */

/**
 *
 * @author ACER
 */
public class customer_page extends javax.swing.JFrame {

    /** Creates new form customer_page */
    public customer_page() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PROFILE = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        ORDERS = new javax.swing.JButton();
        N = new javax.swing.JLabel();
        SHOP = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("CUSTOMER PAGE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 401, 40);

        PROFILE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PROFILE.setForeground(new java.awt.Color(0, 102, 0));
        PROFILE.setText("VIEW YOUR PROFILE");
        PROFILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROFILEActionPerformed(evt);
            }
        });
        jPanel1.add(PROFILE);
        PROFILE.setBounds(60, 120, 190, 50);

        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UPDATE.setForeground(new java.awt.Color(0, 102, 0));
        UPDATE.setText("UPDATE YOUR PROFILE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE);
        UPDATE.setBounds(420, 120, 200, 50);

        ORDERS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ORDERS.setForeground(new java.awt.Color(0, 102, 0));
        ORDERS.setText("VIEW YOUR ORDERS");
        ORDERS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDERSActionPerformed(evt);
            }
        });
        jPanel1.add(ORDERS);
        ORDERS.setBounds(60, 220, 190, 50);

        N.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        N.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(N);
        N.setBounds(420, 20, 280, 40);

        SHOP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SHOP.setForeground(new java.awt.Color(0, 102, 0));
        SHOP.setText("GET NEW  MOBILE");
        SHOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOPActionPerformed(evt);
            }
        });
        jPanel1.add(SHOP);
        SHOP.setBounds(420, 220, 200, 50);

        LOGOUT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LOGOUT.setForeground(new java.awt.Color(0, 102, 0));
        LOGOUT.setText("LOG OUT");
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });
        jPanel1.add(LOGOUT);
        LOGOUT.setBounds(240, 340, 200, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PROFILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROFILEActionPerformed
        new customer_profile().show();
        this.dispose();
    }//GEN-LAST:event_PROFILEActionPerformed

    private void SHOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOPActionPerformed
        new MOBILE().show();
        this.dispose();
    }//GEN-LAST:event_SHOPActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed
           int m=JOptionPane.showConfirmDialog(this, "Do you really want to log out?", null,JOptionPane.YES_NO_OPTION);
           if(m==0)
           {
              try
              {
                  Class.forName("java.sql.Driver");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/projectas","root","modi");
                  Statement stmt=con.createStatement();
                  String q1="update customer set log='n' where log='y';";
                 stmt.executeUpdate(q1);           
              }
              catch(Exception e)
              {
                  JOptionPane.showMessageDialog(this, e.getMessage());
              }
               new welcome().show();
              this.dispose();
           }
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        new CUSTOMER_UPDATE().show();
        this.dispose();
    }//GEN-LAST:event_UPDATEActionPerformed

    private void ORDERSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDERSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ORDERSActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      try
{   

    Class.forName("java.sql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/projectas","root","modi");
Statement stmt=con.createStatement();
String q1="select first_name from customer where log='y';";
ResultSet rs=stmt.executeQuery(q1);
rs.next();
String n=rs.getString("first_name");
N.setText("HI"+" "+n.toUpperCase()+"....");
}
 catch(Exception e)
 {
     JOptionPane.showMessageDialog(this, e.getMessage());
 }
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGOUT;
    private javax.swing.JLabel N;
    private javax.swing.JButton ORDERS;
    private javax.swing.JButton PROFILE;
    private javax.swing.JButton SHOP;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
