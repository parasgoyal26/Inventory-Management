package inventory;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.sql.*;
/////////////////////////////////////////////////////////////////////////////////////////

public class mainMenu extends javax.swing.JFrame{
    /** Creates new form mainMenu */
    
    public mainMenu() {
        setVisible(true);
        initComponents();
    custMnu.setMnemonic(KeyEvent.VK_C);
    KeyStroke keystroke1=KeyStroke.getKeyStroke(KeyEvent.VK_C,Event.ALT_MASK);
    prodMnu.setMnemonic(KeyEvent.VK_P);
    KeyStroke keystroke2=KeyStroke.getKeyStroke(KeyEvent.VK_P,Event.ALT_MASK);
    jMenu9.setMnemonic(KeyEvent.VK_V);
    KeyStroke keystroke3=KeyStroke.getKeyStroke(KeyEvent.VK_V,Event.ALT_MASK);
    jMenu5.setMnemonic(KeyEvent.VK_I);
    KeyStroke keystroke4=KeyStroke.getKeyStroke(KeyEvent.VK_I,Event.ALT_MASK);
    jMenu2.setMnemonic(KeyEvent.VK_S);
    KeyStroke keystroke5=KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.ALT_MASK);
    jMenu3.setMnemonic(KeyEvent.VK_H);
    KeyStroke keystroke6=KeyStroke.getKeyStroke(KeyEvent.VK_H,Event.ALT_MASK);
    jMenu4.setMnemonic(KeyEvent.VK_E);
    KeyStroke keystroke7=KeyStroke.getKeyStroke(KeyEvent.VK_E,Event.ALT_MASK);

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
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        custMnu = new javax.swing.JMenu();
        addNewCust = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        srchCust = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        prodMnu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        addVndrmnu = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mdfyVndrMnu = new javax.swing.JMenuItem();
        dltvndrmnu = new javax.swing.JMenuItem();
        srchVndrMnu = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inventory Management System");
        setBackground(new java.awt.Color(255, 204, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48));
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Inventory Management System");
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentMoved(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/024.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(80, 80, 80)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 848, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(jLabel1)
                .add(40, 40, 40)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 501, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        custMnu.setMnemonic(KeyEvent.VK_ALT|KeyEvent.VK_F);
        custMnu.setText("Customer");
        custMnu.setIconTextGap(5);
        custMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custMnuActionPerformed(evt);
            }
        });
        custMnu.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                custMnuMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });

        addNewCust.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addNewCust.setText("Add New");
        addNewCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCustActionPerformed(evt);
            }
        });
        custMnu.add(addNewCust);

        jMenu6.setText("Customer Maintenance");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Modify Details");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Delete Customer");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        custMnu.add(jMenu6);

        srchCust.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        srchCust.setText("Search ");
        srchCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchCustActionPerformed(evt);
            }
        });
        custMnu.add(srchCust);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Customers Database");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        custMnu.add(jMenuItem7);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Ledger");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        custMnu.add(jMenuItem5);

        menuBar.add(custMnu);

        prodMnu.setText("Product");

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        cutMenuItem.setText("Add New");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        prodMnu.add(cutMenuItem);

        jMenu7.setText("Product Maintenance");

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        copyMenuItem.setText("Modify Details");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        jMenu7.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        pasteMenuItem.setText("Delete Product");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        jMenu7.add(pasteMenuItem);

        prodMnu.add(jMenu7);

        deleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        deleteMenuItem.setText("Search Product");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        prodMnu.add(deleteMenuItem);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setText("Stock Available");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        prodMnu.add(jMenuItem8);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setText("Enter Purchase Invoice Details");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        prodMnu.add(jMenuItem10);

        menuBar.add(prodMnu);

        jMenu9.setText("Vendor");

        addVndrmnu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        addVndrmnu.setText("Add Vendor");
        addVndrmnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVndrmnuActionPerformed(evt);
            }
        });
        jMenu9.add(addVndrmnu);

        jMenu8.setText("Vendor Maintenance");

        mdfyVndrMnu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        mdfyVndrMnu.setText("Modify Details");
        mdfyVndrMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdfyVndrMnuActionPerformed(evt);
            }
        });
        jMenu8.add(mdfyVndrMnu);

        dltvndrmnu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        dltvndrmnu.setText("Delete Vendor");
        dltvndrmnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltvndrmnuActionPerformed(evt);
            }
        });
        jMenu8.add(dltvndrmnu);

        jMenu9.add(jMenu8);

        srchVndrMnu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        srchVndrMnu.setText("Search");
        srchVndrMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchVndrMnuActionPerformed(evt);
            }
        });
        jMenu9.add(srchVndrMnu);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem9.setText("Vendors Database");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem9);

        menuBar.add(jMenu9);

        jMenu5.setText("Invoicing");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Generate Retail Invoice");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        menuBar.add(jMenu5);

        jMenu2.setText("Settings");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Administrator's Settings");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        menuBar.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("About System");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        menuBar.add(jMenu3);

        jMenu4.setText("Exit");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void srchCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchCustActionPerformed
      searchCust cust= new searchCust();
    
     cust.setVisible(true);

}//GEN-LAST:event_srchCustActionPerformed

private void srchVndrMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchVndrMnuActionPerformed
// TODO add your handling code here:
    srchVndr obj=new srchVndr();
    obj.setVisible(true);
}//GEN-LAST:event_srchVndrMnuActionPerformed

private void addNewCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewCustActionPerformed
    newCustomer obj=new newCustomer();
    obj.setVisible(true);

}//GEN-LAST:event_addNewCustActionPerformed

private void custMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custMnuActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_custMnuActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
   helpAbout obj=new helpAbout();
   obj.setVisible(true);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

   Admin ob=new Admin();
   ob.setVisible(true);
}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
// TODO add your handling code here:
    bill obj=new bill();
    obj.setVisible(true);
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void addVndrmnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVndrmnuActionPerformed
// TODO add your handling code here:
    NewVendor obj=new NewVendor();
    obj.setVisible(true);
}//GEN-LAST:event_addVndrmnuActionPerformed

private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
// TODO add your handling code here:
    newProduct obj=new newProduct();
    obj.setVisible(true);
}//GEN-LAST:event_cutMenuItemActionPerformed

private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
// TODO add your handling code here:
    new prodMain().srchProd_Byname();
   
}//GEN-LAST:event_deleteMenuItemActionPerformed

private void mdfyVndrMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdfyVndrMnuActionPerformed
// TODO add your handling code here:
    vendorMain obj=new vendorMain();
    obj.setVisible(true);
}//GEN-LAST:event_mdfyVndrMnuActionPerformed

private void dltvndrmnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltvndrmnuActionPerformed
// TODO add your handling code here:
  new vendorMain().vdel();
}//GEN-LAST:event_dltvndrmnuActionPerformed

private void jLabel1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentMoved
    // TODO add your handling code here:
    
}//GEN-LAST:event_jLabel1ComponentMoved

private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
    // TODO add your handling code here:
}//GEN-LAST:event_jLabel1ComponentHidden

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    // TODO add your handling code here:
   
}//GEN-LAST:event_formWindowOpened

private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
    // TODO add your handling code here:
    prodMain obj=new prodMain();
    obj.prodel();

}//GEN-LAST:event_pasteMenuItemActionPerformed

private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
    // TODO add your handling code here:
    prodMain obj=new prodMain();
    obj.setVisible(true);
}//GEN-LAST:event_copyMenuItemActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    // TODO add your handling code here:
    cust_main cst=new cust_main();
    cst.setVisible(true);
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
    // TODO add your handling code here:
    cust_main m=new cust_main();
    m.del();
}

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
    searchCust src= new searchCust();
    src.setVisible(true);
}//GEN-LAST:event_jMenuItem11ActionPerformed

private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
    // TODO add your handling code here:
   dispose();
}//GEN-LAST:event_jMenu4ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    // TODO add your handling code here:
    new listcust().setVisible(true);
}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    // TODO add your handling code here:
    new listprod().setVisible(true);
}//GEN-LAST:event_jMenuItem8ActionPerformed

private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
    // TODO add your handling code here:
    new listvend().setVisible(true);
}//GEN-LAST:event_jMenuItem9ActionPerformed

private void custMnuMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_custMnuMenuKeyPressed
    // TODO add your handling code here:
}//GEN-LAST:event_custMnuMenuKeyPressed

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    // TODO add your handling code here:

    JMenu  opened=null;
    if(evt.getKeyCode()==KeyEvent.VK_C && evt.isAltDown()){
       custMnu.setPopupMenuVisible(true);
       opened=custMnu;
    }

    if(evt.getKeyCode()==KeyEvent.VK_ESCAPE){
        if(opened!=null)
        opened.setPopupMenuVisible(false);
    }

}//GEN-LAST:event_formKeyPressed

private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
    // TODO add your handling code here:
    new PurInvoice().setVisible(true);
}//GEN-LAST:event_jMenuItem10ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    // TODO add your handling code here:
    new CustLedger().setVisible(true);
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
    // TODO add your handling code here:
    dispose();
}//GEN-LAST:event_jMenu4MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addNewCust;
    private javax.swing.JMenuItem addVndrmnu;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenu custMnu;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem dltvndrmnu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mdfyVndrMnu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenu prodMnu;
    private javax.swing.JMenuItem srchCust;
    private javax.swing.JMenuItem srchVndrMnu;
    // End of variables declaration//GEN-END:variables

}
