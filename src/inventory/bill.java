package inventory;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.PreparedStatement;
import sun.print.PrinterGraphicsDevice;
import java.util.*;
//////////////////////////////////////////////////////////////////////////////////////

public class bill extends javax.swing.JFrame {
   float tot,sal,dis,gtot;
   float totalamt=0;
   int row=0;int sr=0;
   String item[],ino[];
   boolean v=false;
   int r;
   public bill() {
        initComponents();
        int w1=getWidth();
        int h1=getHeight();
        int a=(1024/2)-w1/2;
        int b=(768/2)-h1/2;
        setBounds(a, b, w1, h1);
    }
   public  void cust()
    {}

  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Retail Invoice-Inventory Management System");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 482));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jLabel2.setText("Product ");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18));
        jLabel3.setText("Quantity");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel9.setText("Invoice No.");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel10.setText("Invoice Date");

        jTextField4.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("retail invoice");

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventory/OK.gif"))); // NOI18N
        jButton2.setText("OK");
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

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sr. No.", "Product Name", "Quantity", "M.R.P.", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel6.setText("Total Amount");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel4.setText("AB Sales Corporation");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel5.setText("F-109, Jeewan Park");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel7.setText("Pankha Road, Uttam Nagar");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel8.setText("New Delhi-110059");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel8)
                    .add(jLabel5)
                    .add(jLabel4)
                    .add(jLabel7))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel8)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel11.setText("Sales Tax %");

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel12.setText("Discount %");

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel13.setText("Gross Total");

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel14.setText("Cash Paid");

        jLabel15.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jLabel15.setText("Balance");

        jButton4.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        jButton4.setText("SAVE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel16.setText("Customer ID");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel17.setText("First Name");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jLabel18.setText("Last Name");

        jButton5.setFont(new java.awt.Font("Bookman Old Style", 1, 12));
        jButton5.setText("PRINT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bookman Old Style", 1, 14));
        jButton3.setText("Payment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(28, 28, 28)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel2)
                                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel16)
                                            .add(jLabel17))
                                        .add(6, 6, 6)))
                                .add(18, 18, 18)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                            .add(jTextField11)
                                            .add(jTextField10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                        .add(56, 56, 56)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel18)
                                            .add(jButton1)
                                            .add(jLabel9)
                                            .add(jLabel10)))))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(341, 341, 341)
                                .add(jLabel1)))
                        .add(18, 18, 18)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jTextField12)
                            .add(jTextField5)
                            .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(48, 48, 48)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 809, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel14)
                                    .add(jLabel11))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(jTextField9)
                                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(27, 27, 27)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel12)
                                    .add(jLabel15))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jTextField6)
                                    .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(86, 86, 86)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel13)
                                    .add(jLabel6))
                                .add(18, 18, 18)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jTextField3)
                                    .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(34, 34, 34)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(55, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(338, 338, 338)
                .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .add(42, 42, 42)
                .add(jButton3)
                .add(359, 359, 359))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jLabel10)
                    .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(4, 4, 4)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9)
                            .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel16))
                        .add(27, 27, 27)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel17)
                            .add(jTextField11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel18)
                            .add(jTextField12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(18, 18, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1))
                .add(36, 36, 36)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 279, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton3)
                    .add(jButton2))
                .add(32, 32, 32)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11)
                    .add(jLabel12)
                    .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton4))
                .add(33, 33, 33)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel14)
                    .add(jTextField9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel13)
                    .add(jLabel15)
                    .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton5))
                .add(198, 198, 198))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 923, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 708, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("static-access")

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      String s2;
      s2=jTextField2.getText();
      jTextField2.setText("");
      jComboBox1.requestFocusInWindow();
      Statement st,st1;
      Connection con=null;
      ResultSet rs;

   try{
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     con=DriverManager.getConnection("jdbc:odbc:mat");
     System.out.println("connection created successfully:");
   }catch(Exception e){System.out.println(e.getMessage());}
   try{
    st=con.createStatement();
    rs=st.executeQuery("select p_name, p_umeas,p_quantity,p_mrp from product where p_name='"+jComboBox1.getSelectedItem()+"'");
    
    if(rs.next()){
        String pumeas,pquantity,psaleprice;
        pumeas=rs.getString(2);
        pquantity=rs.getString(3);
        psaleprice=rs.getString(4);
        if(Float.valueOf(pquantity)<Float.valueOf(s2)){
        JOptionPane j=new JOptionPane();
        j.showMessageDialog(null, "Available quanttiy is less ");
        }
        else{
        sr++;
        jTable1.setValueAt(sr, row, 0);
        jTable1.setValueAt(jComboBox1.getSelectedItem(),row,1);
        jTable1.setValueAt(s2+pumeas,row,2);
        jTable1.setValueAt(psaleprice,row,3);
       double amt;
       Float quantity,saleprice;
       String s3;
       try{
          
          saleprice=Float.valueOf(psaleprice);
          System.out.println("i am in next");
          quantity=Float.valueOf(s2);
          amt=saleprice*quantity;
          amt=(double)amt;
          s3=String.valueOf(amt);
          jTable1.setValueAt(s3, row, 4);
       }catch(Exception e){System.out.println(e.getMessage());}
        
       row++;
   
       try{
           String s;
           float dq,bq,aq;
           dq=Float.valueOf(pquantity);
           bq=Float.valueOf(s2);
           aq=dq-bq;
           s=String.valueOf(aq);
       
          st1=con.createStatement();
          st.executeUpdate("update product set p_quantity='"+s+"'where p_name='"+jComboBox1.getSelectedItem()+"'");
         }catch(Exception e){
           JOptionPane j=new JOptionPane();
           j.showMessageDialog(this, "ERROR OCCURED");
       }
      }
    }
    
}catch(Exception ex){System.out.println(ex.getMessage());}
        
 
}//GEN-LAST:event_jButton1ActionPerformed
//////////////////////////////////////////////////////////////////////////////////////////////

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jButton3.setEnabled(true);
    String s;
    row--;
    System.out.println("i am in ok");
    try{
      while(row>=0){
      s=(String) jTable1.getValueAt(row, 4);
      totalamt+=Float.valueOf(s);
      row--;
      }
      s=String.valueOf(totalamt);
      jTextField3.setText(s);
       tot = Float.valueOf(jTextField3.getText());
       
       sal=Float.valueOf(jTextField1.getText());
        dis=Float.valueOf(jTextField8.getText());
         gtot=(tot+(tot*sal)/100)-((tot*dis)/100);

         jTextField7.setText(""+gtot);

        jButton3.setEnabled(true);
       
    }catch(Exception e){System.out.println(e.getMessage());}
}//GEN-LAST:event_jButton2ActionPerformed
///////////////////////////////////////////////////////////////////////////////////
private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    // TODO add your handling code here:
    
}//GEN-LAST:event_jComboBox1ActionPerformed

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    // TODO add your handling code here
     Date d=new java.util.Date();
    jTextField4.setText(""+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
     Connection conn2;
        Statement st2;
        ResultSet rs2;

        try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn2=DriverManager.getConnection("jdbc:odbc:mat");
        st2=conn2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        st2.execute("Select invno from sale ");

        rs2=st2.getResultSet();
        rs2.last();
        int n;
         n= Integer.parseInt(rs2.getString("invno"));
         n++;
         jTextField5.setText(""+n);
    
        }catch(Exception e){
            System.out.println(e);
        }

    JOptionPane op=new JOptionPane();
   String id= op.showInputDialog(this, "Enter Customer ID ", "Retail Invoice",op.INFORMATION_MESSAGE);
   if(id.equals(""))
   {
       op.showInputDialog(this, "Enter Customer ID ", "Retail Invoice",op.INFORMATION_MESSAGE);
   }
 else
   {
       Connection conn1=null;
       Statement st1=null;
       ResultSet rs1=null;
       try
       {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           conn1=DriverManager.getConnection("jdbc:odbc:mat");
           st1=conn1.createStatement();
           String q="SELECT * FROM cust_db where c_id='"+id+"'";
           st1.execute(q);

           rs1=st1.getResultSet();
           if(rs1.next())
           {
             
               jComboBox1.setRequestFocusEnabled(true);
               jTextField10.setText(id);
               jTextField4.setEditable(false);
               jTextField10.setEditable(false);
               jTextField11.setEditable(false);
               jTextField12.setEditable(false);
               jTextField3.setEditable(false);
               jTextField6.setEditable(false);
               jTextField7.setEditable(false);
               jButton4.setEnabled(false);
               jButton3.setEnabled(false);
               jTextField11.setText(rs1.getString("f_name"));
               jTextField12.setText(rs1.getString("l_name"));
               
             }
 else
           {
               op.showMessageDialog(this, " Customer ID does not exist ", "Retail Invoice",op.INFORMATION_MESSAGE);
               dispose();
 }
 
 conn1.close();

       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }

    jTextField10.setFocusable(true);
    jButton5.setEnabled(false);
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
////////////////////////////////////////////////////////////////////////////////////////////
private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jTextField3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:
  
 jButton5.setEnabled(true);
 Connection conn=null;
 PreparedStatement st1=null;

    try
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        conn=DriverManager.getConnection("jdbc:odbc:mat");
        String ino =jTextField5.getText();
        String idt = jTextField4.getText();
        String id =jTextField10.getText();
        String fname = jTextField11.getText();
        String lname = jTextField12.getText();
        String gtotal=""+gtot;
        String balance=jTextField6.getText();
                st1 = conn.prepareStatement("insert into sale values(?,?,?,?,?,?)");
                st1.setString(1, ino);
                st1.setString(2,idt);
                st1.setString(3, id);
                st1.setString(4, fname+" "+lname);
                st1.setString(5, gtotal);
                st1.setString(6,balance);

                int t = st1.executeUpdate();
      }
        catch (Exception ex) {
                System.out.println(ex);
            }
   
}//GEN-LAST:event_jButton4ActionPerformed
////////////////////////////////////////////////////////////////////////////////////////////

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    // TODO add your handling code here:
    jComboBox1.setVisible(false);
    jLabel2.setVisible(false);
    jLabel3.setVisible(false);
    jTextField2.setVisible(false);
    jButton1.setVisible(false);
    jButton2.setVisible(false);
    jButton3.setVisible(false);
    jButton4.setVisible(false);
    jTable1.setAutoscrolls(false);
    PrinterJob pj=PrinterJob.getPrinterJob();

        pj.setJobName(" Print Component");
        pj.setPrintable(new Printable() {
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
           if(pageIndex>0){
            return Printable.NO_SUCH_PAGE;
           }

            Graphics2D g2=(Graphics2D)graphics;
            g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            jPanel1.paint(g2);
            return Printable.PAGE_EXISTS;
            }
        });

        if(pj.printDialog()==false){
        return;
        }
    try{
    pj.print();

    }catch(PrinterException e){
        System.out.println(e);
    }
}//GEN-LAST:event_jButton5ActionPerformed
/////////////////////////////////////////////////////////////////////////////////////////////////

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
      if(jTextField1.getText().equals("")||jTextField5.getText().equals("")||jTextField8.equals(""))
    {
       JOptionPane op=new JOptionPane();
       op.showMessageDialog(this,"Some fields are empty");
    }
      else
      {
 
     JOptionPane op=new JOptionPane();
     String a=  op.showInputDialog(this,"Plz enter amount to be paid(Rs.)", "Payment",op.INFORMATION_MESSAGE);
     jTextField9.setText(a);

     float bal=gtot-Float.parseFloat(a);
     jTextField6.setText(""+bal);
     jButton4.setEnabled(true);
}//GEN-LAST:event_jButton3ActionPerformed
    }
////////////////////////////////////////////////////////////////////////////////////////////////
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
