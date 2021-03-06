
package inventory;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.util.*;
import javax.swing.text.Element;
import javax.swing.text.TableView.TableRow;
import javax.swing.JOptionPane;

///////////////////////////////////////////////////////////////////////////////////
public class PurInvoice extends javax.swing.JFrame {
 
    /** Creates new form PurInvoice */
     int r=0;
     int s=0;
     int row=0,col=0;
     double amt;
     boolean v=false;
     private  int totalRowsPrinted=0;
     float quantity,baseprice;
     public PurInvoice() {
        initComponents();
         int w1=getWidth();
        int h1=getHeight();
        int a=(1024/2)-w1/2;
        int b=(768/2)-h1/2;
        setBounds(a, b, w1, h1);
    }
/** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
 //////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Purchase Entries-Inventory Management System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 482));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jLabel2.setText("Choose Product ");

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("enter Purchase  details");

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/OK.gif"))); // NOI18N
        jButton2.setText("SAVE CHANGES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jButton1.setText("NEXT >");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sr No.", "Batch No.", "Name", "Net Weight", "Quantity", "Base Price", "M.R.P.", "Expiry Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jButton3.setText("Go To Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jLabel3.setText("Update Product Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(198, 198, 198))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(339, 339, 339))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     JOptionPane jp=new JOptionPane();
     Connection conn=null;
     ResultSet rs=null;
     PreparedStatement st=null;
            
         try
           {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          conn=DriverManager.getConnection("jdbc:odbc:mat");
          
          for(int i=0;i<totalRowsPrinted;i++){
              
          st=conn.prepareStatement("update product set p_batch=?,p_name=?,p_netwt=?,p_quantity=?,p_base=?,p_mrp=?,p_expdt=? where p_name=?");
        
          st.setString(1,jTable1.getValueAt(i,1).toString());
          st.setString(2,jTable1.getValueAt(i,2).toString());
       
          st.setString(3,jTable1.getValueAt(i,3).toString());
          st.setString(4, jTable1.getValueAt(i,4).toString());

          st.setString(5,jTable1.getValueAt(i,5).toString());
          
          st.setString(6,jTable1.getValueAt(i,6).toString());
           
          st.setString(7,jTable1.getValueAt(i,7).toString());
            
          st.setString(8,jTable1.getValueAt(i,2).toString());
          int r=st.executeUpdate();
             
             System.out.println(r+" rows updated");        

          }
          
          conn.close();      
        } catch(Exception e){
        
           System.out.println(e);
        }

         jp.showMessageDialog(this,""+totalRowsPrinted+" Products Updated");

}//GEN-LAST:event_jButton2ActionPerformed

///////////////////////////////////////////////////////////////////////////////////////
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        JOptionPane jp=new JOptionPane();
        Connection conn=null;
      Statement st=null;
      ResultSet rs=null;
   if(v==false)
   {
       
      try
      {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          conn=DriverManager.getConnection("jdbc:odbc:mat");
          st=conn.createStatement();
          String q="SELECT * FROM product where p_name='"+jComboBox1.getSelectedItem()+"' ";
          System.out.println(jComboBox1.getSelectedItem());
          st.execute(q);
          rs=st.getResultSet();

          String qu=jp.showInputDialog(this,"Enter quantity to be added of Selected product","Product Quantity",JOptionPane.INFORMATION_MESSAGE);


          while(rs.next())
          {
              totalRowsPrinted++;
              s++;
              String bat,name,netw,bprice,mrp,exp,quan;
             float e;float f;
             
              bat=rs.getString(1);
             
              name=rs.getString(2);
             
              netw=rs.getString(5);
              
              quan=rs.getString(6);
             e=Float.parseFloat(quan);
             f=Float.parseFloat(qu);
              bprice=rs.getString(7);
            
              mrp=rs.getString(8);
             
              exp=rs.getString(9);
              
          
              jTable1.setValueAt(s, r,0);
              jTable1.setValueAt(bat,r,1);
              jTable1.setValueAt(name,r,2);
              jTable1.setValueAt(netw,r,3);
              jTable1.setValueAt(e+f,r,4);
              jTable1.setValueAt(bprice,r,5);
              
              jTable1.setValueAt(mrp,r,6);
              jTable1.setValueAt(exp,r,7);
              r++;

          }
       conn.close();
      }

      catch(Exception e)
      {
System.out.println(e);
      }

        }
 
}//GEN-LAST:event_jButton1ActionPerformed

 ////////////////////////////////////////////////////////////////////////////////////////
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    
    Connection conn=null;
    Statement st=null;
    ResultSet rs=null;

    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:odbc:mat");
        st=conn.createStatement();
        String q="SELECT p_name FROM product";
        st.executeQuery(q);
        rs=st.getResultSet();
        jComboBox1.addItem("..Select Any..");
        while(rs.next())
        {
            jComboBox1.addItem(rs.getString("p_name"));
        }
    }
    catch(Exception e)
    {
System.out.println(e);
    }

     
    }//GEN-LAST:event_formWindowOpened
/////////////////////////////////////////////////////////////////////////////////////
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
   
    public static void main(String[] args) {
        new PurInvoice().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
