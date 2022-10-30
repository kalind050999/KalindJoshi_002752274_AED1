/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Parser.Parser;
import java.time.LocalDate;
import java.util.ArrayList;
import model.City;
import model.Com;
import model.Doc;
import model.DocDir;
import model.EncounterHis;
import model.HeadClass;
import model.Hosp;
import model.HospDir;
import model.House;
import model.PatDir;
import model.Person;
import model.PersonDir;

/**
 *
 * @author kalindjoshi
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    City city;
    String[] comList;
    PatDir patientDir;
    Hosp newHosp;
    HospDir hospDir;
    EncounterHis encounterDir;
    PersonDir pd;
    DocDir docDir;
    HeadClass system;
    
    public MainJFrame() {
        initComponents();
        hospDir = new HospDir();
        patientDir = new PatDir();
        encounterDir = new EncounterHis();
        pd = new PersonDir();
        docDir = new DocDir();
        system = new HeadClass();
        
        
        String dob = "05-Sept-1999";
        Parser parser = new Parser();
        LocalDate date = parser.convertToDate(dob);
        Person per1 = pd.createPerson(1234563332, "Vaibhav", date, "Allston");//doc
        Person per2 = pd.createPerson(1236573421, "Aman", date, "Allston"); //pat
        Person per3 = pd.createPerson(134578653, "Aadish", date, "Allston"); //pat
        
        Person per4 = pd.createPerson(12323543, "Devanshi", date, "Roslindale");  //pat
        Person per5 = pd.createPerson(237563334, "Keval", date, "Roslindale"); //doc
        Person per6 = pd.createPerson(453432311, "Devansh", date, "Roslindale"); //doc
        Person per7 = pd.createPerson(561234326, "Adit", date, "Roslindale"); //Not Doc nor Pat
        
        
        patientDir.createPat(per2);
        patientDir.createPat(per3);
        patientDir.createPat(per4);
        
        city = new City("Boston");
        system.getCityList().add(city);
        Com com_allston = city.newCommunity("Allston");
        Com com_roslindale = city.newCommunity("Roslindale");
        
        House house1 = com_allston.createHouse(1,"67, Adamson Street", "Allston","Boston");
        house1.addPersonToHouse(per3);
        house1.addPersonToHouse(per2);
        House house2 = com_allston.createHouse(2,"34, Adamson Street", "Allston","Boston");
        house2.addPersonToHouse(per1);
       
        House house3 = com_roslindale.createHouse(45,"53A, Sinclair Road", "Roslindale","Boston");
        house3.addPersonToHouse(per4);
        house3.addPersonToHouse(per5);
        House house4 = com_roslindale.createHouse(56,"18, Sinclair Road", "Roslindale","Boston");
        house4.addPersonToHouse(per6);
        house4.addPersonToHouse(per7);
               
        newHosp = com_allston.createHospital(1,  "Allston General","Allston", "Boston");
        hospDir.addHosp(newHosp);
        Doc doc = new Doc(per1);
        newHosp.addDoctorToHospital(doc);
        newHosp = com_roslindale.createHospital(2,  "Roslindale General","Roslindale", "Boston");
        Doc doc1 = new Doc(per6);
        Doc doc2 = new Doc(per5);
        newHosp.addDoctorToHospital(doc1);
        newHosp.addDoctorToHospital(doc2);
        hospDir.addHosp(newHosp);
        
        docDir = new DocDir();
        docDir.addDoc(doc);
        docDir.addDoc(doc1);
        docDir.addDoc(doc2);
        
        ArrayList<Com> commList = new ArrayList<Com>();
        commList = city.getComList();
        int size = commList.size();
        comList = new String[size+1];
        commList = city.getComList();
        comList[0]=" ";
        
        for(int i=0; i<commList.size(); i++){
            comList[i+1]= commList.get(i).getComName();
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        PatientLogBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        DocLogBtn = new javax.swing.JButton();
        HosBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 600));
        jPanel2.setSize(new java.awt.Dimension(200, 600));

        PatientLogBtn.setText("Patient Login");
        PatientLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientLogBtnActionPerformed(evt);
            }
        });

        jButton2.setText("System Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Community Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        DocLogBtn.setText("Doctor Login");
        DocLogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocLogBtnActionPerformed(evt);
            }
        });

        HosBtn.setText("Hospital Admin ");
        HosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(DocLogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PatientLogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(HosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(PatientLogBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DocLogBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HosBtn)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 600));
        jPanel3.setSize(new java.awt.Dimension(400, 600));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientLogBtnActionPerformed
        // TODO add your handling code here:
        PatPanel2 pPanel2 = new PatPanel2(comList, patientDir, newHosp, city, hospDir, docDir);
        jSplitPane1.setRightComponent(pPanel2);
    }//GEN-LAST:event_PatientLogBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DocLogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocLogBtnActionPerformed
        // TODO add your handling code here:
        DocPanel docPanel = new DocPanel(patientDir, docDir);
        jSplitPane1.setRightComponent(docPanel);
    }//GEN-LAST:event_DocLogBtnActionPerformed

    private void HosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HosBtnActionPerformed
        // TODO add your handling code here:
        HospPanel hospPanel = new HospPanel(docDir, system, comList, patientDir, newHosp, city, hospDir, pd);
        jSplitPane1.setRightComponent(hospPanel);
        
    }//GEN-LAST:event_HosBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DocLogBtn;
    private javax.swing.JButton HosBtn;
    private javax.swing.JButton PatientLogBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
