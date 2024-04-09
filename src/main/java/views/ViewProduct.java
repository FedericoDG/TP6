/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import entities.Category;
import entities.Product;
import java.util.HashSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author alamb
 */
public class ViewProduct extends javax.swing.JInternalFrame {

    private TreeSet<Product> products;
    private boolean aux;

    public ViewProduct(TreeSet<Product> products) {
        initComponents();
        this.products = products;
        this.fillCategories();
        this.clearFields();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setText("Código:");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Rubro:");

        jLabel6.setText("Stock:");

        price.setText("jTextField1");

        description.setText("jTextField1");

        code.setText("jTextField1");

        stock.setText("jTextField1");

        searchBtn.setText("Buscar");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Limpiar");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Eliminar");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Salir");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Guardar");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearBtn)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(price)
                                    .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(stock, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                    .addComponent(category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchBtn)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(deleteBtn)
                                .addGap(30, 30, 30)
                                .addComponent(saveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6))
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(deleteBtn)
                    .addComponent(exitBtn)
                    .addComponent(saveBtn))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed

        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        int saveCode;
        String saveDescription = description.getText();
        int savePrice;
        int saveStock;
        Category saveCategory;

        try {
            saveCode = Integer.parseInt(code.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un numero entero. >:C ");
            code.requestFocus();
            code.selectAll();
            return;
        }

        try {
            savePrice = Integer.parseInt(price.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El precio debe ser un numero entero. >:C ");
            price.requestFocus();
            price.selectAll();
            return;

        }

        try {
            saveStock = Integer.parseInt(stock.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El Stock debe ser un numero entero. >:C ");
            stock.requestFocus();
            stock.selectAll();
            return;

        }

        saveCategory = (Category) category.getSelectedItem();

        Product product = new Product(saveCode, saveDescription, savePrice, saveStock, saveCategory);
        if (this.products.add(product)) {
            JOptionPane.showMessageDialog(this, "Producto creado con exito c: ");
            this.clearFields();
            code.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Pasaron cositas... (codigo repetido)");
            code.requestFocus();
            code.selectAll();
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        this.clearFields();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:

        int searchCode;
        try {
            searchCode = Integer.parseInt(code.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un numero entero. >:C ");
            this.clearFields();
            code.requestFocus();
            return;
        }

        for (Product p : this.products) {
            if (p.getCode() == searchCode) {
                description.setText(p.getDescription());
                price.setText(p.getPrice() + "");
                stock.setText(p.getStock() + "");
                category.setSelectedItem(p.getCategory());
                aux = true;
                deleteBtn.setEnabled(aux);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Producto no encontrado");

    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int deleteCode;
        try {
            deleteCode = Integer.parseInt(code.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un numero entero. >:C ");
            this.clearFields();
            code.requestFocus();
            return;
        }

        for (Product p : this.products) {
            if (p.getCode() == deleteCode) {
                products.remove(p);
                JOptionPane.showMessageDialog(this, "Producto eliminado (Cagaste)");
                this.clearFields();
                code.requestFocus();
                aux = false;
                deleteBtn.setEnabled(aux);
                return;
            }
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Category> category;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField code;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField description;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField price;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField stock;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        code.setText("");
        price.setText("");
        stock.setText("");
        description.setText("");
        category.setSelectedIndex(0);
        aux = false;
        deleteBtn.setEnabled(aux);
    }

    private void fillCategories() {
        category.addItem(new Category(1, "Comida"));
        category.addItem(new Category(2, "Limpieza"));
        category.addItem(new Category(3, "Perfumeria"));

    }

}
