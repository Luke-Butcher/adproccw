/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipescw;

//import java.awt.event.KeyEvent;
//import java.awt.event.FocusListener;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author conorfarrell
 */
public class UserInterface extends javax.swing.JFrame {
    //initialise all variables used before the interface is interacted with
    protected ArrayList<Object> order = new ArrayList<Object>();
    protected double diameterContent = 0;
    protected double lengthContent = 0;
    protected int gradeContent = 0;
    protected double quantityContent = 0;
    protected Boolean chemResistContent = false;
    protected String colour1Content = "None";
    protected String colour2Content = "None";
    protected Boolean innerInsulationContent = false;
    protected Boolean outerReinforcementContent = false;
    protected Boolean enterPressed = false;
    private DecimalFormat df = new DecimalFormat("###.##");
    /**
     * Creates new form NewJFrame
     */
    public UserInterface() {
        initComponents();
        //Disable action buttons (complete order and add to basket) and window resize
        setLocationRelativeTo(null);

        //DISABLE action buttons and window resize
        setResizable(false);
        completeOrderButton.setEnabled(false);
        addToBasketButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        diameterTextField = new javax.swing.JTextField();
        diameterLabel = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pGradeLabel = new javax.swing.JLabel();
        pGradeComboBox = new javax.swing.JComboBox<>();
        colour2Label = new javax.swing.JLabel();
        insulationComboBox = new javax.swing.JComboBox<>();
        completeOrderButton = new javax.swing.JButton();
        insulationLabel = new javax.swing.JLabel();
        colour2ComboBox = new javax.swing.JComboBox<>();
        reinforcementLabel = new javax.swing.JLabel();
        reinforcementComboBox = new javax.swing.JComboBox<>();
        quantityLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        lengthTextField = new javax.swing.JTextField();
        cancelOrderButton = new javax.swing.JButton();
        resistanceLabel = new javax.swing.JLabel();
        resistanceComboBox = new javax.swing.JComboBox<>();
        colour1ComboBox = new javax.swing.JComboBox<>();
        colour1Label = new javax.swing.JLabel();
        addToBasketButton = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        diameterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diameterTextFieldActionPerformed(evt);
            }
        });

        diameterLabel.setText("Diameter (Inches):");

        lengthLabel.setText("Length (Meters):");

        jLabel3.setText("Pipe Order System");

        pGradeLabel.setText("Plastic grade:");

        pGradeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "2", "3", "4", "5" }));
        pGradeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pGradeComboBoxActionPerformed(evt);
            }
        });

        colour2Label.setText("Colour 2:");

        insulationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        insulationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insulationComboBoxActionPerformed(evt);
            }
        });

        completeOrderButton.setText("Complete Order");
        completeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderButtonActionPerformed(evt);
            }
        });

        insulationLabel.setText("Insulation:");

        colour2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Blue", "Green", "Purple", "Yellow" }));
        colour2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colour2ComboBoxActionPerformed(evt);
            }
        });

        reinforcementLabel.setText("Reinforcement:");

        reinforcementComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        reinforcementComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinforcementComboBoxActionPerformed(evt);
            }
        });

        quantityLabel.setText("Quantity:");

        quantityTextField.setText("1");
        quantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextFieldActionPerformed(evt);
            }
        });

        lengthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthTextFieldActionPerformed(evt);
            }
        });

        cancelOrderButton.setText("Cancel Order");
        cancelOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderButtonActionPerformed(evt);
            }
        });

        resistanceLabel.setText("Chemical Resistance:");

        resistanceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));
        resistanceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resistanceComboBoxActionPerformed(evt);
            }
        });

        colour1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Black", "White" }));
        colour1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colour1ComboBoxActionPerformed(evt);
            }
        });

        colour1Label.setText("Colour 1:");

        addToBasketButton.setText("Add To Basket");
        addToBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBasketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(colour2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pGradeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(reinforcementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(resistanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(diameterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(insulationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(colour1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(colour1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(insulationComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(reinforcementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(colour2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pGradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(resistanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(diameterTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lengthTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(addToBasketButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancelOrderButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diameterLabel)
                    .addComponent(diameterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthLabel)
                    .addComponent(lengthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pGradeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pGradeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colour1Label)
                    .addComponent(colour1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colour2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colour2Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insulationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insulationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reinforcementComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reinforcementLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resistanceLabel)
                    .addComponent(resistanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addToBasketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diameterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diameterTextFieldActionPerformed
        //if interacted with and does not equal and empty string add a tick
        //this shows the user that what they have entered is correct
        //try catch method to check if the input is numbers
        setFocusable(true);
        // diameterTextField.addFocusListener();
        if (diameterTextField.getText().equals("")) {
            diameterLabel.setText("Diameter (inches): ");
        } else {
            diameterLabel.setText("Diameter (inches): ✓");
        }
        try {
            //convert our string to a double
            diameterContent = Double.parseDouble(diameterTextField.getText());
            
            diameterContent = Double.parseDouble(df.format(diameterContent));
            diameterTextField.setText(Double.toString(diameterContent));
            
            lengthTextField.requestFocus();
            //if outside of our scope then display another error message
            if (diameterContent < 0.2 || diameterContent > 6) {
                diameterTextField.setText("");
                diameterLabel.setText("Diameter (Inches): ");
                JOptionPane.showMessageDialog(null,
                        "Orders must be of atleast 0.2' pipe and at most 6'",
                        "Bad Diameter ",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nfe) {
            diameterTextField.setText("");
            diameterLabel.setText("Diameter (Inches): ");
            JOptionPane.showMessageDialog(null,
                    "Numbers only please",
                    "Bad input ",
                    JOptionPane.ERROR_MESSAGE);
        }
        //Complete order and add to basket are not activated or visible unless
        //all the specified statments are true in the enableDisable method below
        AddToBasketButtonOnOff();
    }//GEN-LAST:event_diameterTextFieldActionPerformed

    private void pGradeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pGradeComboBoxActionPerformed
        String tempGradeContent;
        //if the selected item equals "None" the set the varaibles back to their 
        //initial state. Note: the user will be unable to proceed unless they have
        //entered a grade
        if (pGradeComboBox.getSelectedItem().equals("None")) {
            tempGradeContent = "0";
            pGradeLabel.setText("Plastic grade: ");
        } else {
            pGradeLabel.setText("Plastic grade: ✓");
            //get our selected item from our combo box and convert to a string
            tempGradeContent = (String)pGradeComboBox.getSelectedItem();
        }
        //convert our string to a double
        gradeContent = Integer.parseInt(tempGradeContent);
        //Complete order and add to basket are not activated or visible unless
        //all the specified statments are true in the enableDisable method below
        AddToBasketButtonOnOff();
        //colour1ComboBox.requestFocusInWindow();
    }//GEN-LAST:event_pGradeComboBoxActionPerformed
                                           

    private void insulationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insulationComboBoxActionPerformed
        if (insulationComboBox.getSelectedItem() == "No") {
            innerInsulationContent = false;
            insulationLabel.setText("Insulation: ");
        } else if (insulationComboBox.getSelectedItem() == "Yes") {
            innerInsulationContent = true;
            insulationLabel.setText("Insulation: ✓");
        }
        AddToBasketButtonOnOff();
    }//GEN-LAST:event_insulationComboBoxActionPerformed

    private void colour2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colour2ComboBoxActionPerformed
        //if the selected item equals "None" the set the varaibles back to their 
        //initial state.
        if(colour2ComboBox.getSelectedItem() == "None"){
            colour2Content = "None";
            colour2Label.setText("Colour 2: ");
        } else {
            colour2Label.setText("Colour 2: ✓");
        }
        //get our selected item from our combo box and convert to a string
        colour2Content = (String)colour2ComboBox.getSelectedItem();
    }//GEN-LAST:event_colour2ComboBoxActionPerformed
                                              
    private void reinforcementComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinforcementComboBoxActionPerformed
        if (reinforcementComboBox.getSelectedItem() == "No") {
            outerReinforcementContent = false;
            reinforcementLabel.setText("Reinforcement: ");
        } else if (reinforcementComboBox.getSelectedItem() == "Yes") {
            outerReinforcementContent = true;
            reinforcementLabel.setText("Reinforcement: ✓");
        }
        AddToBasketButtonOnOff();
    }//GEN-LAST:event_reinforcementComboBoxActionPerformed

    private void quantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextFieldActionPerformed
        //if the text field is empty the user will not be notified that they information
        //has been saved with the tick
        if(!quantityTextField.getText().equals("")){
            quantityLabel.setText("Quantity: ✓");
        } else {
            quantityLabel.setText("Quantity: ");
        }

        try {
            quantityContent = Integer.parseInt(quantityTextField.getText());
            //validation
            if (quantityContent < 1 || quantityContent > 100) {
                quantityTextField.setText("1");
                quantityContent = 1;
                JOptionPane.showMessageDialog(null,
                        "Orders must be of atleast 1 pipe and at most 100",
                        "Bad Quantity ",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nfe) {
            quantityTextField.setText("1");
            JOptionPane.showMessageDialog(null,
                    "Numbers only please",
                    "Bad input ",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        //Complete order and add to basket are not activated or visible unless
        //all the specified statments are true in the enableDisable method below
        AddToBasketButtonOnOff();
    }//GEN-LAST:event_quantityTextFieldActionPerformed
                                              
    private void lengthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthTextFieldActionPerformed
        if (!lengthTextField.getText().equals("")) {
            lengthLabel.setText("Length (Meters): ✓");
        } else {
            lengthLabel.setText("Length (Meters): ");
        }
        
        try {
            lengthContent = Double.parseDouble(lengthTextField.getText());
            lengthContent = Double.parseDouble(df.format(lengthContent));
            lengthTextField.setText(Double.toString(lengthContent));
            pGradeComboBox.requestFocusInWindow();
            //validation
            if (lengthContent < 0.1 || lengthContent > 6.0) {
                lengthTextField.setText("");
                lengthLabel.setText("Length (Meters): ");
                JOptionPane.showMessageDialog(null,
                        "pipes must be atleast 10cm and no more than 6m in length",
                        "Bad pipe length ",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException nfe) {
            lengthTextField.setText("");
            lengthLabel.setText("Length (Meters): ");
            JOptionPane.showMessageDialog(null,
                    "Numbers only please",
                    "Bad input ",
                    JOptionPane.ERROR_MESSAGE);
        }
        //Complete order and add to basket are not activated or visible unless
        //all the specified statments are true in the enableDisable method below
        AddToBasketButtonOnOff();
    }//GEN-LAST:event_lengthTextFieldActionPerformed

    private void completeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeOrderButtonActionPerformed
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
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //display the invoice pop up if the user clicks complete order.
        //the order ArrayList is passed so that this class is now able to access
        //the object set in this class
        new Invoice(order).setVisible(true);
    }//GEN-LAST:event_completeOrderButtonActionPerformed

    private void cancelOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderButtonActionPerformed
        //exit the window if a user presses cancel
        System.exit(0);
    }//GEN-LAST:event_cancelOrderButtonActionPerformed

    private void resistanceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resistanceComboBoxActionPerformed
        //if the selected item equals "No" the set the varaibles back to their 
        //initial state.
        if(resistanceComboBox.getSelectedItem() == "No"){
            chemResistContent = false;
            resistanceLabel.setText("Chemical Resistance: ");
        } else if (resistanceComboBox.getSelectedItem() == "Yes") {
            chemResistContent = true;
            resistanceLabel.setText("Chemical Resistance: ✓");
        }
        //Complete order and add to basket are not activated or visible unless
        //all the specified statments are true in the enableDisable method below
        AddToBasketButtonOnOff();
    }//GEN-LAST:event_resistanceComboBoxActionPerformed
                                                  

    private void colour1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colour1ComboBoxActionPerformed
        System.out.println(diameterTextField.getText());
        if (colour1ComboBox.getSelectedItem() == "None") {
            colour1Content = "None";
            colour1Label.setText("Colour 1: ");
        } else {
            colour1Label.setText("Colour 1: ✓");
        }
        colour1Content = (String) colour1ComboBox.getSelectedItem();
        
        AddToBasketButtonOnOff();
    }//GEN-LAST:event_colour1ComboBoxActionPerformed

    private void addToBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBasketButtonActionPerformed
        Boolean goodPipe = true;
        Pipe pipeObj;
        if (gradeContent >= 1 && gradeContent <= 3 && colour1Content.equals("None")
                && colour2Content.equals("None") && !innerInsulationContent
                && !outerReinforcementContent) {
            pipeObj = new Type1(diameterContent, lengthContent,
                    gradeContent, chemResistContent);
            //testing
            System.out.println("Type1 added to invoice");

        } else if (gradeContent >= 2 && gradeContent <= 4 && !colour1Content.equals("None")
                && colour2Content.equals("None") && !innerInsulationContent
                && !outerReinforcementContent) {
            pipeObj = new Type2(diameterContent, lengthContent,
                    gradeContent, chemResistContent, colour1Content);
            //testing
            System.out.println("Type2 added to invoice");

        } else if (gradeContent >= 2 && gradeContent <= 5 && !colour1Content.equals("None")
                && !colour2Content.equals("None")
                && !outerReinforcementContent) {
            if (!innerInsulationContent) {
                pipeObj = new Type3(diameterContent, lengthContent,
                        gradeContent, chemResistContent, colour1Content, colour2Content);
                //testing
                System.out.println("Type3 added to invoice");
            } else {
                pipeObj = new Type4(diameterContent, lengthContent,
                        gradeContent, chemResistContent, colour1Content, colour2Content, outerReinforcementContent);
                //testing
                System.out.println("Type4 added to invoice");
            }
        } else if (gradeContent >= 3 && gradeContent <= 5 && !colour1Content.equals("None")
                && !colour2Content.equals("None") && innerInsulationContent
                && outerReinforcementContent) {
            pipeObj = new Type5(diameterContent, lengthContent,
                    gradeContent, chemResistContent, colour1Content, colour2Content, outerReinforcementContent, innerInsulationContent);
            //testing
            System.out.println("Type5 added to invoice");

        } else {
            // the error catching here
            System.out.println("error");
            goodPipe = false;
            pipeObj = new Type5(diameterContent, lengthContent,
                    gradeContent, chemResistContent, colour1Content, colour2Content, outerReinforcementContent, innerInsulationContent);
            typeErrorFinder(pipeObj);

        }
        if (goodPipe) {
            //repeated code
            pipeObj.quantity = quantityContent;
            pipeObj.getPipeType();
            pipeObj.totalCost();
            order.add(pipeObj);
            clearContent();
            completeOrderButton.setEnabled(true);
            AddToBasketButtonOnOff();
        }

    }//GEN-LAST:event_addToBasketButtonActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToBasketButton;
    private javax.swing.JButton cancelOrderButton;
    private javax.swing.JComboBox<String> colour1ComboBox;
    private javax.swing.JLabel colour1Label;
    private javax.swing.JComboBox<String> colour2ComboBox;
    private javax.swing.JLabel colour2Label;
    private javax.swing.JButton completeOrderButton;
    private javax.swing.JLabel diameterLabel;
    private javax.swing.JTextField diameterTextField;
    private javax.swing.JComboBox<String> insulationComboBox;
    private javax.swing.JLabel insulationLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JTextField lengthTextField;
    private javax.swing.JComboBox<String> pGradeComboBox;
    private javax.swing.JLabel pGradeLabel;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JComboBox<String> reinforcementComboBox;
    private javax.swing.JLabel reinforcementLabel;
    private javax.swing.JComboBox<String> resistanceComboBox;
    private javax.swing.JLabel resistanceLabel;
    // End of variables declaration//GEN-END:variables

    public void typeErrorFinder(Pipe pipeObj) {
        if (pipeObj.getGrade() == 4 || pipeObj.getGrade() == 5 && colour1Content.equals("None")
                && colour2Content.equals("None") && !innerInsulationContent
                && !outerReinforcementContent) {
            JOptionPane.showMessageDialog(null,
                    "The options you selected do not come with that grade of plastic please select between grade 1 - 3",
                    "Bad grade ",
                    JOptionPane.WARNING_MESSAGE);
        } else if (pipeObj.getGrade() == 1 && (!colour1Content.equals("None")
                || !colour2Content.equals("None") || innerInsulationContent
                || outerReinforcementContent)) {
            JOptionPane.showMessageDialog(null,
                    "The options you selected do not come with that grade of plastic please select  grade greater than 1",
                    "Bad grade ",
                    JOptionPane.WARNING_MESSAGE);
        } else if (pipeObj.getGrade() == 5 && !colour1Content.equals("None")
                && colour2Content.equals("None") && !innerInsulationContent && !outerReinforcementContent) {
            JOptionPane.showMessageDialog(null,
                    "The options you selected do not come with that grade of plastic please select between grade 2 - 4",
                    "Bad grade ",
                    JOptionPane.WARNING_MESSAGE);
        } else if (pipeObj.getGrade() == 1 || pipeObj.getGrade() == 2 && outerReinforcementContent) {
            JOptionPane.showMessageDialog(null,
                    "The options you selected do not come with that grade of plastic please select between grade 3 - 5",
                    "Bad grade ",
                    JOptionPane.WARNING_MESSAGE);
        } else if (colour1Content.equals("None")) {
            JOptionPane.showMessageDialog(null,
                    "Please select the 1st colour  ",
                    "Bad colour ",
                    JOptionPane.WARNING_MESSAGE);

        } else if (colour1Content.equals(
                "None") && !colour2Content.equals("None")) {
            JOptionPane.showMessageDialog(null,
                    "Please select the 1st colour  ",
                    "Bad colour ",
                    JOptionPane.WARNING_MESSAGE);
        } else if (colour2Content.equals(
                "None") && (innerInsulationContent || outerReinforcementContent)) {
            JOptionPane.showMessageDialog(null,
                    "The options you selected need coloured pipes please select colour 1 and 2 ",
                    "Bad colour ",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!innerInsulationContent && outerReinforcementContent) {
            JOptionPane.showMessageDialog(null,
                    "Outer reinforcements needs inner insulation please select this",
                    "Bad pipe ",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Please restart the application and start again",
                    "Application failure",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AddToBasketButtonOnOff() {
        if (diameterContent != 0 && lengthContent != 0
                && gradeContent != 0 && quantityContent != 0) {
            addToBasketButton.setEnabled(true);
        } else {
            addToBasketButton.setEnabled(false);
        }
    }
    
    //Clear content fucntionality sets all items to their initial states
    //Quantity and chem resist are not reset because they are going to always 
    //be added to or kept the same. Note: this is done to let a user understand
    // their order has been added
    public void clearContent() {
        diameterTextField.setText("");
        diameterLabel.setText("Diameter (Inches): ");
        lengthTextField.setText("");
        lengthLabel.setText("Length (Meters): ");
        pGradeComboBox.setSelectedIndex(0);
        pGradeLabel.setText("Plastic grade: ");
        quantityTextField.setText("1");
        resistanceComboBox.setSelectedIndex(0);
        colour1ComboBox.setSelectedIndex(0);
        colour1Label.setText("Colour 1: ");
        colour1Content = "None";
        colour2ComboBox.setSelectedIndex(0);
        colour2Label.setText("Colour 2: ");
        colour2Content = "None";
        insulationComboBox.setSelectedIndex(0);
        insulationLabel.setText("Insulation: ");
        innerInsulationContent = false;
        reinforcementComboBox.setSelectedIndex(0);
        reinforcementLabel.setText("Reinforcement: ");
        outerReinforcementContent = false;
    }
}