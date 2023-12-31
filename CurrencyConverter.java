

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Currency_Converter;


public class CurrencyConverter extends javax.swing.JFrame {
double US_Dollar = 1.31;
double Nigerian_Naira = 476.57;
double Brazilian_Real = 5.47;
double Canadian_Dollar = 1.71;
double Kenyan_Shilling = 132.53;
double Indonesian_Rupiah = 19554.94;
double Indian_Rupee = 95.21;
double Philippine_Pisco = 71.17;
double Pakistani_Rupee = 162.74;

String[] currencyUnits = {
"Units",
"US Dollar",
"Nigerian Naira",
"Brazilian Real",
"Canadian Dollar",
"Kenyan Shilling",
"Indonesian Rupiah",
"Indian Rupee",
"Philippine Pisco",
"Paskistani Rupee"
};
    /**
     * Creates new form CurrencyConverter
     */
    public CurrencyConverter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        secondCurrencyUnit = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Currency Converter");

        firstCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        secondCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("From currency Of");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("To currency Of");

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Convert Currency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("units");

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("units");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(290, 290, 290))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(firstCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(secondCountry, 0, 272, Short.MAX_VALUE)
                                .addComponent(t2))
                            .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton2)
                        .addGap(94, 94, 94)
                        .addComponent(jButton3)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(secondCountry))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(t2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText("");
        t2.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
     {//GEN-FIRST:event_jButton1ActionPerformed

    //    if(firstCountry.getSelectedIndex()==0 || secondCountry.getSelectedIndex()==0 || t1.getText().equals(""))
    //    {
    //     JOptionPane.showMessageDialog(null,"You Must Select both Countries and must input the amount.","ErrorMessage",
    //     JOptionPane.INFORMATION_MESSAGE
    //     );
    //     return;
    //   }
       
        double amountToChange=Double.parseDouble(t1.getText());
        double amountChanged=0.0;
        double amountInPounds=0.0;
        
      switch(firstCountry.getSelectedItem().toString())
        {
        case "USA": amountInPounds = amountToChange/US_Dollar;break;
	case "Nigeria":amountInPounds = amountToChange/Nigerian_Naira;break;
	case "Brazil":amountInPounds = amountToChange/Brazilian_Real;break;
	case "Canada":amountInPounds = amountToChange/Canadian_Dollar;break;
	case "Kenyan":amountInPounds = amountToChange/Kenyan_Shilling;break;
	case "Indonesia":amountInPounds = amountToChange/Indonesian_Rupiah;break;
	case "India":amountInPounds = amountToChange/Indian_Rupee;break;
	case "Philippine":amountInPounds = amountToChange/Philippine_Pisco;break;
	case "Pakistan":amountInPounds = amountToChange/Pakistani_Rupee;break;
	default:amountInPounds = 0.0;
        }

        //amount is Changed in pounds
        
        switch(secondCountry.getSelectedItem().toString())
        {
        case "USA":amountChanged = amountInPounds * US_Dollar;break;
	case "Nigeria":amountChanged = amountInPounds * Nigerian_Naira;break;
	case "Brazil":amountChanged = amountInPounds * Brazilian_Real;break;
	case "Canada":amountChanged = amountInPounds * Canadian_Dollar;break;
	case "Kenyan":amountChanged = amountInPounds * Kenyan_Shilling;break;
	case "Indonesia":amountChanged = amountInPounds * Indonesian_Rupiah;break;
	case "India":amountChanged = amountInPounds * Indian_Rupee;break;
	case "Philippine":amountChanged = amountInPounds * Philippine_Pisco;break;
	case "Pakistan":amountChanged = amountInPounds * Pakistani_Rupee;break;
	default:amountChanged = amountInPounds * 0.0;
        }
        
        String value = String.format("%.2f",amountChanged);
         
        t2.setText(value);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
        
    }//GEN-LAST:event_firstCountryActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
        firstCurrencyUnit.setText(currencyUnits[firstCountry.getSelectedIndex()]);
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
        secondCurrencyUnit.setText(currencyUnits[secondCountry.getSelectedIndex()]);
    }//GEN-LAST:event_secondCountryItemStateChanged

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
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
    public double getUS_Dollar() {
        return US_Dollar;
    }

    public void setUS_Dollar(double uS_Dollar) {
        US_Dollar = uS_Dollar;
    }

    public double getNigerian_Naira() {
        return Nigerian_Naira;
    }

    public void setNigerian_Naira(double nigerian_Naira) {
        Nigerian_Naira = nigerian_Naira;
    }

    public double getBrazilian_Real() {
        return Brazilian_Real;
    }

    public void setBrazilian_Real(double brazilian_Real) {
        Brazilian_Real = brazilian_Real;
    }

    public double getCanadian_Dollar() {
        return Canadian_Dollar;
    }

    public void setCanadian_Dollar(double canadian_Dollar) {
        Canadian_Dollar = canadian_Dollar;
    }

    public double getKenyan_Shilling() {
        return Kenyan_Shilling;
    }

    public void setKenyan_Shilling(double kenyan_Shilling) {
        Kenyan_Shilling = kenyan_Shilling;
    }

    public double getIndonesian_Rupiah() {
        return Indonesian_Rupiah;
    }

    public void setIndonesian_Rupiah(double indonesian_Rupiah) {
        Indonesian_Rupiah = indonesian_Rupiah;
    }

    public double getIndian_Rupee() {
        return Indian_Rupee;
    }

    public void setIndian_Rupee(double indian_Rupee) {
        Indian_Rupee = indian_Rupee;
    }

    public double getPhilippine_Pisco() {
        return Philippine_Pisco;
    }

    public void setPhilippine_Pisco(double philippine_Pisco) {
        Philippine_Pisco = philippine_Pisco;
    }

    public double getPakistani_Rupee() {
        return Pakistani_Rupee;
    }

    public void setPakistani_Rupee(double pakistani_Rupee) {
        Pakistani_Rupee = pakistani_Rupee;
    }

    public String[] getCurrencyUnits() {
        return currencyUnits;
    }

    public void setCurrencyUnits(String[] currencyUnits) {
        this.currencyUnits = currencyUnits;
    }

    public javax.swing.JComboBox<String> getFirstCountry() {
        return firstCountry;
    }

    public void setFirstCountry(javax.swing.JComboBox<String> firstCountry) {
        this.firstCountry = firstCountry;
    }

    public javax.swing.JLabel getFirstCurrencyUnit() {
        return firstCurrencyUnit;
    }

    public void setFirstCurrencyUnit(javax.swing.JLabel firstCurrencyUnit) {
        this.firstCurrencyUnit = firstCurrencyUnit;
    }

    public javax.swing.JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(javax.swing.JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public javax.swing.JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(javax.swing.JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public javax.swing.JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(javax.swing.JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JComboBox<String> getSecondCountry() {
        return secondCountry;
    }

    public void setSecondCountry(javax.swing.JComboBox<String> secondCountry) {
        this.secondCountry = secondCountry;
    }

    public javax.swing.JLabel getSecondCurrencyUnit() {
        return secondCurrencyUnit;
    }

    public void setSecondCurrencyUnit(javax.swing.JLabel secondCurrencyUnit) {
        this.secondCurrencyUnit = secondCurrencyUnit;
    }

    public javax.swing.JTextField getT1() {
        return t1;
    }

    public void setT1(javax.swing.JTextField t1) {
        this.t1 = t1;
    }

    public javax.swing.JTextField getT2() {
        return t2;
    }

    public void setT2(javax.swing.JTextField t2) {
        this.t2 = t2;
    }
}
