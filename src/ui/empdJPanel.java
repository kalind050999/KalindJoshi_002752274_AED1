/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import model.emprec;
import model.emprechis;

/**
 *
 * @author kalindjoshi
 */
public class empdJPanel extends javax.swing.JPanel {
    emprechis his;
    /**
     * Creates new form empdJPanel
     */
    public empdJPanel() {
        initComponents();
    }
    public empdJPanel(emprechis his) {
        initComponents();
        this.his = his;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField14 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchDrop = new javax.swing.JComboBox<>();
        searchTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField14.setText("jTextField12");

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search an Employee");

        searchDrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID", "Gender", "Email" }));
        searchDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDropActionPerformed(evt);
            }
        });

        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 13)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 16)); // NOI18N
        jLabel3.setText("Search Results");

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Gender", "Age", "Joining ", "Level", "Info", "Title", "Mobile", "Email"
            }
        ));
        jScrollPane2.setViewportView(searchTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(searchDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchDrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(877, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDropActionPerformed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        HashMap<String,Integer> IndexKey = new HashMap<String,Integer>();
        IndexKey.put("Name", 0);
        IndexKey.put("ID", 1);
        IndexKey.put("Age", 2);
        IndexKey.put("Gender", 3);
        IndexKey.put("Date", 4);
        IndexKey.put("Level", 5);
        IndexKey.put("Info", 6);
        IndexKey.put("Pos", 7);
        IndexKey.put("Mobile", 8);
        IndexKey.put("Email", 9);
        
        ArrayList<emprec> emlist = his.getHis();
        String fetch = searchDrop.getSelectedItem().toString();
        String fetchTxt = searchTxt.getText().toString();
        Object tired[] = new Object[11];
        String fetchChk = null;
        ArrayList<emprec> getdata = new ArrayList<emprec>();
        
        for (int i=0; i<emlist.size(); i++)
        {
            if(fetch == "Name"){
                fetchChk = String.valueOf(emlist.get(i).getName());
            }
            if(fetch == "ID"){
                fetchChk = String.valueOf(emlist.get(i).getID());
            } 
            if(fetch == "Age"){
                fetchChk = String.valueOf(emlist.get(i).getAge());
            } 
            if(fetch == "Gender"){
                fetchChk = String.valueOf(emlist.get(i).getGender());
            } 
            if(fetch == "Date"){
                fetchChk = String.valueOf(emlist.get(i).getDate());
            } 
            if(fetch == "Level"){
                fetchChk = String.valueOf(emlist.get(i).getLevel());
            } 
            if(fetch == "Info"){
                fetchChk = String.valueOf(emlist.get(i).getInfo());
            } 
            if(fetch == "Pos"){
                fetchChk = String.valueOf(emlist.get(i).getPos());
            } 
            if(fetch == "Mobile"){
                fetchChk = String.valueOf(emlist.get(i).getMobile());
            } 
            if(fetch == "Email"){
                fetchChk = String.valueOf(emlist.get(i).getEmail());
            }
            if (fetchChk.equals(fetchTxt.toString()))
            {
                getdata.add(emlist.get(i));
            }
        }
        for(emprec i: emlist){
            if(fetchChk.equals(fetchTxt)){
                tired[0] = i.getName();
                tired[1] = i.getID();
                tired[2] = i.getAge();
                tired[3] = i.getGender();
                tired[4] = i.getDate();
                tired[5] = i.getLevel();
                tired[6] = i.getInfo();
                tired[7] = i.getPos();
                tired[8] = i.getMobile();
                tired[9] = i.getEmail();
                }  
            }
        populateTable(getdata);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JComboBox<String> searchDrop;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
    
    private void populateTable(ArrayList<emprec> getdata) {
        
        DefaultTableModel mdl = (DefaultTableModel) searchTable.getModel();
        mdl.setRowCount(0);
        
        for(emprec emp : getdata){
            Object[] list = new Object[10];
            //row[0] = emp;
            list[0] = emp;
            list[1] = emp.getID();
            list[2] = emp.getGender();
            list[3] = emp.getAge();
            list[4] = emp.getDate();
            list[5] = emp.getLevel();
            list[6] = emp.getInfo();
            list[7] = emp.getPos();
            list[8] = emp.getMobile();
            list[9] = emp.getEmail();
            
            mdl.addRow(list);
        }
    }

}
