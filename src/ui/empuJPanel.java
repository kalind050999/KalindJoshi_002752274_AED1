/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.emprec;
import model.emprechis;

/**
 *
 * @author kalindjoshi
 */
public class empuJPanel extends javax.swing.JPanel {
    emprechis his;
    /**
     * Creates new form empuJPanel
     */
    public empuJPanel() {
        initComponents();
    }
    
    public empuJPanel(emprechis his) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchName = new javax.swing.JComboBox<>();
        newName = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        newnameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        upnameTxt = new javax.swing.JTextField();
        upageTxt = new javax.swing.JTextField();
        uptitleTxt = new javax.swing.JTextField();
        upgenderTxt = new javax.swing.JTextField();
        upcellTxt = new javax.swing.JTextField();
        uplevelTxt = new javax.swing.JTextField();
        upjoinTxt = new javax.swing.JTextField();
        upinfoTxt = new javax.swing.JTextField();
        upidTxt = new javax.swing.JTextField();
        upemailTxt = new javax.swing.JTextField();
        photolabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update an Employee ");

        jLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        jLabel2.setText("Search Criteria");

        jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        jLabel3.setText("New detail");

        searchName.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        searchName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID", "Cell Phone", "Email" }));
        searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchNameActionPerformed(evt);
            }
        });

        newName.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        newName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID", "Cell Phone", "Email" }));
        newName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNameActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Updated Details");

        jLabel5.setText("Name");

        jLabel6.setText("ID");

        jLabel7.setText("Join Date");

        jLabel8.setText("Team Info");

        jLabel9.setText("Gender");

        Age.setText("Age");

        jLabel11.setText("Level");

        jLabel12.setText("Photo");

        jLabel13.setText("Email");

        jLabel14.setText("Cell");

        jLabel15.setText("Title");

        upnameTxt.setText("jTextField12");

        upageTxt.setText("jTextField12");

        uptitleTxt.setText("jTextField12");

        upgenderTxt.setText("jTextField12");

        upcellTxt.setText("jTextField12");

        uplevelTxt.setText("jTextField12");

        upjoinTxt.setText("jTextField12");

        upinfoTxt.setText("jTextField12");

        upidTxt.setText("jTextField12");

        upemailTxt.setText("jTextField12");

        photolabel.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(upgenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(upnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(upidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(upageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(upjoinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(uplevelTxt)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(upemailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(upinfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(uptitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(upcellTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(photolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addContainerGap(592, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(upnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(upidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age)
                    .addComponent(upageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(upgenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(upjoinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(uplevelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(upinfoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(uptitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(upcellTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(upemailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(photolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchNameActionPerformed

    private void newNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNameActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
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
        String fetch = searchName.getSelectedItem().toString();
        String fetchTxt = nameTxt.getText().toString();
        String newupdate = newName.getSelectedItem().toString();
        String newupdateTxt = newnameTxt.getText().toString();
        
        Object tired[] = new Object[11];
        String fetchChk = null;
        int l,p;
        int flag = 0;
        l = 0;
        p = IndexKey.get(newupdate);
        
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
                l = i;
                flag++;
            }
            
        }
        
        if (flag == 0)
        {
        JOptionPane.showMessageDialog(this, "No Employee exists");
        
       
        }
        else if (flag >=2)
        {
        JOptionPane.showMessageDialog(this, "More than one entries found");
        }
        else{
            for (emprec i: emlist){
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
                    tired[p] = newupdateTxt;
                    
                }  
            }
            upnameTxt.setText(String.valueOf(tired[0]));
            upidTxt.setText(String.valueOf(tired[1]));
            upageTxt.setText(String.valueOf(tired[2]));
            upgenderTxt.setText(String.valueOf(tired[3]));
            upjoinTxt.setText(String.valueOf(tired[4]));
            uplevelTxt.setText(String.valueOf(tired[5]));
            upinfoTxt.setText(String.valueOf(tired[6]));
            uptitleTxt.setText(String.valueOf(tired[7]));
            upcellTxt.setText(String.valueOf(tired[8]));
            upemailTxt.setText(String.valueOf(tired[9]));
            
            String imgPath = String.valueOf(emlist.get(l).getPhoto());
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpeg", "jpg");
            JFileChooser browseFile = new JFileChooser();
            ImageIcon img = new ImageIcon(imgPath);
            Image image = img.getImage().getScaledInstance(photolabel.getWidth(), photolabel.getHeight(), Image.SCALE_SMOOTH);
            photolabel.setIcon(new ImageIcon(image));
            
        }
       
        
        
        
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox<String> newName;
    private javax.swing.JTextField newnameTxt;
    private javax.swing.JLabel photolabel;
    private javax.swing.JComboBox<String> searchName;
    private javax.swing.JTextField upageTxt;
    private javax.swing.JTextField upcellTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField upemailTxt;
    private javax.swing.JTextField upgenderTxt;
    private javax.swing.JTextField upidTxt;
    private javax.swing.JTextField upinfoTxt;
    private javax.swing.JTextField upjoinTxt;
    private javax.swing.JTextField uplevelTxt;
    private javax.swing.JTextField upnameTxt;
    private javax.swing.JTextField uptitleTxt;
    // End of variables declaration//GEN-END:variables
}
