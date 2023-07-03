
package MainFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

 
public class addproduct extends javax.swing.JFrame {

    
    public addproduct() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextBox1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextBox2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextBox4 = new javax.swing.JTextField();
        TextBox3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextBox5 = new javax.swing.JTextField();
        TextBox6 = new javax.swing.JTextField();
        TextBox7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextBox8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1299, 812));
        setPreferredSize(new java.awt.Dimension(1299, 812));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("  Add Product");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 20, 240, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Item Id:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(281, 123, 88, 27);

        TextBox1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(TextBox1);
        TextBox1.setBounds(480, 121, 173, 34);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Item Name:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(281, 183, 128, 29);

        TextBox2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(TextBox2);
        TextBox2.setBounds(480, 182, 173, 34);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Quantity:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(281, 246, 97, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Price Per Unit:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(281, 308, 152, 29);

        TextBox4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(TextBox4);
        TextBox4.setBounds(480, 307, 173, 34);

        TextBox3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(TextBox3);
        TextBox3.setBounds(480, 245, 173, 34);

        jButton1.setBackground(new java.awt.Color(189, 189, 241));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("Add Product");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 610, 190, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 20, 96, 37);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("EXP:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(281, 423, 48, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("MFD:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(281, 360, 56, 29);

        TextBox5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(TextBox5);
        TextBox5.setBounds(480, 359, 173, 34);

        TextBox6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(TextBox6);
        TextBox6.setBounds(480, 422, 173, 34);

        TextBox7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(TextBox7);
        TextBox7.setBounds(480, 485, 173, 34);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Category");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(281, 486, 95, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Date");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(281, 548, 50, 29);

        TextBox8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(TextBox8);
        TextBox8.setBounds(480, 548, 173, 34);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainFiles/add.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(720, 30, 490, 676);

        jLabel11.setBackground(new java.awt.Color(241, 237, 237));
        jLabel11.setMaximumSize(new java.awt.Dimension(1299, 812));
        jLabel11.setMinimumSize(new java.awt.Dimension(1299, 812));
        jLabel11.setPreferredSize(new java.awt.Dimension(1299, 812));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1190, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String item_id=TextBox1.getText();
        String item_name=TextBox2.getText();
        String quantity=TextBox3.getText();
        String price=TextBox4.getText();
        String mfd = TextBox5.getText();
        String exp = TextBox6.getText();
        String category = TextBox7.getText();
        String date = TextBox8.getText();
    
        try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/java_stock","root","");
             String query = "insert into inventory(item_id,item_name,quantity,price,mfd,exp,category,date) values('"+item_id+"','"+item_name+"','"+quantity+"','"+price+"','"+mfd+"','"+exp+"','"+category+"','"+date+"')";
             Statement smt3=con.createStatement();
         //ResultSet   rs=smt3.executeQueryUpdate(query);
             
                       int success=smt3.executeUpdate(query);
                            if(success==1)
                            {
                                JOptionPane.showMessageDialog(this, "Product Successfully Added ");
                               //emp1.showMessageDialog(this, "Problem in Saving. Retry");
                            }
                            else
                            {

                                JOptionPane.showMessageDialog(this, "Problem in Saving. Retry");
                            }


        }

    catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        mainFrame mm=new mainFrame();
        mm.setVisible(true); 
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBox7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addproduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextBox1;
    private javax.swing.JTextField TextBox2;
    private javax.swing.JTextField TextBox3;
    private javax.swing.JTextField TextBox4;
    private javax.swing.JTextField TextBox5;
    private javax.swing.JTextField TextBox6;
    private javax.swing.JTextField TextBox7;
    private javax.swing.JTextField TextBox8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
