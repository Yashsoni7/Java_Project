
import java.awt.event.KeyEvent;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viram
 */
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
public class cardata extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    int i=0,a=0,b=0;
    /**
     * Creates new form cardata
     */
    public void groupbutton( ) {

ButtonGroup bg1 = new ButtonGroup( );

bg1.add(jRadioButton1);
bg1.add(jRadioButton2);
}


    public cardata() {
        super("cardata");
        initComponents();
        groupbutton();
        conn=javaconnect.ConnecrDb();
    }
    
    public void SubmitButton()
    {
         String sql1="Insert into cardata (Model,Company,CarNo,Seater,Charge) values (?,?,?,?,?)";
        try{
           if(jTextField1.getText().length()!=0 && jTextField2.getText().length()!=0 && jTextField1.getText().length()!=0 && jTextField1.getText().length()!=0)
           {    
         
            pst=conn.prepareStatement(sql1);
            Statement stmt = conn.createStatement();
            //pst.setInt(1, ++i);
            pst.setString(1,jTextField1.getText());
            pst.setString(2,jTextField2.getText());
            pst.setString(3,jTextField3.getText());
            pst.setString(4,cartype);
            pst.setString(5,jTextField4.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Car data taken");
            setVisible(false);
            congrats cc=new congrats();
            cc.setVisible(true);
              
            System.out.println("value entered");
           }
           else
           {
               JOptionPane.showMessageDialog(null,"All fields are cumpulsory");
           }
               
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.println("value not entered");
                 
        }
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
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 450));

        jPanel1.setBackground(new java.awt.Color(254, 234, 147));
        jPanel1.setMinimumSize(new java.awt.Dimension(434, 424));
        jPanel1.setPreferredSize(new java.awt.Dimension(434, 424));
        jPanel1.setLayout(null);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 280, 150, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 190, 150, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 90, 150, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 140, 151, 30);

        jButton1.setBackground(new java.awt.Color(251, 42, 0));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(280, 340, 80, 29);

        jLabel5.setText("Charges per Day");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 280, 120, 30);

        jLabel4.setText("License Plate Number ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 190, 210, 30);

        jLabel3.setText("Model Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 140, 110, 30);

        jLabel2.setText("Company Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 120, 30);

        jRadioButton2.setText("6 Seater");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(250, 240, 80, 20);

        jRadioButton1.setText("4 Seater");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(170, 240, 80, 20);

        jLabel1.setText("Car Capacity");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 240, 100, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_1car.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 0, 205, 62);

        jButton2.setBackground(new java.awt.Color(251, 42, 0));
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(76, 340, 80, 29);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SubmitButton();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        a = 1;
        cartype="6 seater";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        b = 1;
        cartype="4 seater";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
 if(evt.getKeyCode() == KeyEvent.VK_ENTER)
 {
     SubmitButton();
 }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 entrypage ab = new entrypage();
 setVisible(false);
 ab.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(cardata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cardata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cardata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cardata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new cardata().setVisible(true);
            }
        });
    }
    private String cartype=null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
