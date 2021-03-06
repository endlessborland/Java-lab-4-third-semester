/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java4lab;
import javax.swing.JOptionPane;

/**
 *
 * @author Денис
 */

public class MainWindow extends javax.swing.JFrame {

    private String cInput = "";
    
    private final double[] constarray = {23, 1.3, 18, -6, 20, 1256};
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        task1Panel = new javax.swing.JPanel();
        task1RunButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        task1TextArea = new javax.swing.JTextArea();
        task2Panel = new javax.swing.JPanel();
        inputTextField = new javax.swing.JTextField();
        task2RunButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        task2TextArea = new javax.swing.JTextArea();
        task3Panel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        task3ButtonRun = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        task3TextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        task1Button = new javax.swing.JButton();
        task2Button = new javax.swing.JButton();
        task3Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setLayout(new java.awt.CardLayout());

        task1RunButton.setText("Run");
        task1RunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                task1RunButtonActionPerformed(evt);
            }
        });

        task1TextArea.setColumns(20);
        task1TextArea.setRows(5);
        jScrollPane1.setViewportView(task1TextArea);

        javax.swing.GroupLayout task1PanelLayout = new javax.swing.GroupLayout(task1Panel);
        task1Panel.setLayout(task1PanelLayout);
        task1PanelLayout.setHorizontalGroup(
            task1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(task1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(task1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(task1PanelLayout.createSequentialGroup()
                        .addComponent(task1RunButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        task1PanelLayout.setVerticalGroup(
            task1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(task1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(task1RunButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(task1Panel, "card2");

        inputTextField.setText("23 1.3 -18 -6 20 1256");
        inputTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputTextFieldKeyReleased(evt);
            }
        });

        task2RunButton.setText("Run");
        task2RunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                task2RunButtonActionPerformed(evt);
            }
        });

        task2TextArea.setColumns(20);
        task2TextArea.setRows(5);
        jScrollPane2.setViewportView(task2TextArea);

        javax.swing.GroupLayout task2PanelLayout = new javax.swing.GroupLayout(task2Panel);
        task2Panel.setLayout(task2PanelLayout);
        task2PanelLayout.setHorizontalGroup(
            task2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, task2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(task2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(inputTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, task2PanelLayout.createSequentialGroup()
                        .addComponent(task2RunButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        task2PanelLayout.setVerticalGroup(
            task2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(task2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(task2RunButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(task2Panel, "card3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Значения ячеек", 23, 1.3, 18, -6, 20, 1256}
            },
            new String [] {
                "Индексы ячеек", "0", "1", "2", "3", "4", "5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        task3ButtonRun.setText("Run");
        task3ButtonRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                task3ButtonRunActionPerformed(evt);
            }
        });

        task3TextArea.setColumns(20);
        task3TextArea.setRows(5);
        jScrollPane4.setViewportView(task3TextArea);

        jLabel1.setText("Sorted Array");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Значение ячеек", null, null, null, null, null, null}
            },
            new String [] {
                "Индексы ячеек", "0", "1", "2", "3", "4", "5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable2);

        javax.swing.GroupLayout task3PanelLayout = new javax.swing.GroupLayout(task3Panel);
        task3Panel.setLayout(task3PanelLayout);
        task3PanelLayout.setHorizontalGroup(
            task3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(task3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(task3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(task3PanelLayout.createSequentialGroup()
                        .addGroup(task3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(task3ButtonRun)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        task3PanelLayout.setVerticalGroup(
            task3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(task3PanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(task3ButtonRun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(task3Panel, "card4");

        task1Button.setText("Задание A");
        task1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                task1ButtonActionPerformed(evt);
            }
        });

        task2Button.setText("Задание B");
        task2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                task2ButtonActionPerformed(evt);
            }
        });

        task3Button.setText("Задание C");
        task3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                task3ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(task1Button)
                .addGap(88, 88, 88)
                .addComponent(task2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(task3Button)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(task1Button)
                    .addComponent(task2Button)
                    .addComponent(task3Button))
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void task1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_task1ButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(task1Panel);
        mainPanel.repaint(); mainPanel.revalidate();
    }//GEN-LAST:event_task1ButtonActionPerformed

    private void task2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_task2ButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(task2Panel);
        mainPanel.repaint(); mainPanel.revalidate();
    }//GEN-LAST:event_task2ButtonActionPerformed

    private void task3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_task3ButtonActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.add(task3Panel);
        mainPanel.repaint(); mainPanel.revalidate();
    }//GEN-LAST:event_task3ButtonActionPerformed

    private void task1RunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_task1RunButtonActionPerformed
        // TODO add your handling code here:
        SMethods tmp = new SMethods(constarray);
        String temp = "Исходный массив\n";
        for (int i = 0; i < constarray.length; i++)
        {
            temp += constarray[i] + "\t";
        }
        temp += "\nСумма всех четных элементов равна\n" + tmp.GetSum();
        task1TextArea.setText(temp);
    }//GEN-LAST:event_task1RunButtonActionPerformed

    private void inputTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTextFieldKeyReleased
        // TODO add your handling code here:
        String input = inputTextField.getText();
        int inchar = evt.getKeyCode();
        // deleting everything except permitted symbols
        if (checkForAll(inchar) == false)
        {
            inputTextField.setText(cInput);
            return;
        }
        // SPACE rules: space cannot be first, there can't be 2 spaces near
        if (((lastSymbol(input) == ' ') || (input.length() == 1)) && inchar == ' ')
        {
            inputTextField.setText(cInput);
            return;
        }
        // MINUS rules: only after space of in the beggining
        if (!(lastSymbol(input) == ' ' || input.length() == 1) && (inchar == '-' || inchar == 109))
        {
            inputTextField.setText(cInput);
            return;
        }
        cInput = inputTextField.getText();
    }//GEN-LAST:event_inputTextFieldKeyReleased

    private void task2RunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_task2RunButtonActionPerformed
        // TODO add your handling code here:
        String input = inputTextField.getText();
        int inputLength = input.length();
        if ((inputLength == 0) || (inputLength == 1 && input.contains("-")))
        {
            JOptionPane.showMessageDialog(null, "Необходимо ввести данные в верхнее текстовое поле!");
            return;
        }
        if (input.charAt(inputLength - 1) == '-')
            deleteLast(input);
        if (input.charAt(inputLength - 1) == ' ')
            deleteLast(input);
        String[] temp;
        temp = input.split(" ");
        // List<Double> list = new ArrayList<>();
        double[] array = new double[temp.length];
        for (int i = 0; i < temp.length; i++)
            array[i] = Double.parseDouble(temp[i]);
        SMethods tmp = new SMethods(array);
        String tmp2 = "Исходный массив\n";
        for (int i = 0; i < array.length; i++)
        {
            tmp2 += array[i] + "\t";
        }
        tmp2 += "\nСумма всех четных элементов равна\n" + tmp.GetSum();
        task2TextArea.setText(tmp2);
    }//GEN-LAST:event_task2RunButtonActionPerformed

    private void task3ButtonRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_task3ButtonRunActionPerformed
        // row 0
        // starts with 1
        double[] array = new double[6];
        String temp = "Исходный массив\n";

        for (int i = 1, j = 0; i < this.jTable1.getColumnCount(); i++, j++)
        {
            array[j] = Double.parseDouble(this.jTable1.getValueAt(0, i).toString());
            temp += this.jTable1.getValueAt(0, i).toString() + "\t";
        }
        temp += "\n";
        SMethods tmp = new SMethods(array);
        for (int i = 1, j = 0; i < this.jTable1.getColumnCount(); i++, j++)
        {
            temp += array[j] + "\t";
            this.jTable2.setValueAt(array[j], 0, i);
        }
        temp += "\nСумма всех четных элементов равна\n" + tmp.GetSum();
        this.task3TextArea.setText(temp);
    }//GEN-LAST:event_task3ButtonRunActionPerformed
    
    private char lastSymbol(String str)
    {
        if (str.length() > 1)
            return str.charAt(str.length() - 2);
        else
            return 'a'; // returning trash. that's ok though.
    }
    
    private void deleteLast(String str)
    {
        if (str != null && str.length() > 0) 
            str = str.substring(0, str.length() - 1);
        inputTextField.setText(str);
    }
    
    private boolean checkForAll(int a)
    {
        // checking for space, backspace, enter and "-"
        if (a == 32 || a == 8 || a == 10 || a == 45 || a == 109)
            return true;
        // checking for numbers from 0 to 9
        if (a >= 48 && a <=57)
            return true;
        // checking for numbers from 0 to 9 on numpad
        if (a >= 96 && a <= 105)
            return true;
        return false;
    }
    
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton task1Button;
    private javax.swing.JPanel task1Panel;
    private javax.swing.JButton task1RunButton;
    private javax.swing.JTextArea task1TextArea;
    private javax.swing.JButton task2Button;
    private javax.swing.JPanel task2Panel;
    private javax.swing.JButton task2RunButton;
    private javax.swing.JTextArea task2TextArea;
    private javax.swing.JButton task3Button;
    private javax.swing.JButton task3ButtonRun;
    private javax.swing.JPanel task3Panel;
    private javax.swing.JTextArea task3TextArea;
    // End of variables declaration//GEN-END:variables
}

