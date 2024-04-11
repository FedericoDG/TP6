package views;

import entities.Category;
import entities.Product;
import java.util.TreeSet;

public class Menu extends javax.swing.JFrame {

    TreeSet<Product> products = new TreeSet<>();

    public Menu() {
        initComponents();
        fillProduct();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuProductManagement = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuByCategory = new javax.swing.JMenuItem();
        menuByDescription = new javax.swing.JMenuItem();
        menuByPrice = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 500));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        menuProductManagement.setText("Gestión de Productos");
        menuProductManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductManagementActionPerformed(evt);
            }
        });
        jMenu1.add(menuProductManagement);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        menuByCategory.setText("Por Rubro");
        menuByCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuByCategoryActionPerformed(evt);
            }
        });
        jMenu2.add(menuByCategory);

        menuByDescription.setText("Por Descripción");
        menuByDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuByDescriptionActionPerformed(evt);
            }
        });
        jMenu2.add(menuByDescription);

        menuByPrice.setText("Por Precio");
        menuByPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuByPriceActionPerformed(evt);
            }
        });
        jMenu2.add(menuByPrice);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuProductManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductManagementActionPerformed
        desktop.removeAll();
        desktop.repaint();
        ViewProduct view = new ViewProduct(products);
        view.moveToFront();
        view.setVisible(true);
        desktop.add(view);

    }//GEN-LAST:event_menuProductManagementActionPerformed

    private void menuByDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuByDescriptionActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        FilterByDescription view = new FilterByDescription(products);
        view.moveToFront();
        view.setVisible(true);
        desktop.add(view);
    }//GEN-LAST:event_menuByDescriptionActionPerformed

    private void menuByCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuByCategoryActionPerformed
        desktop.removeAll();
        desktop.repaint();
        FilterByCategory view = new FilterByCategory(products);
        view.moveToFront();
        view.setVisible(true);
        desktop.add(view);
    }//GEN-LAST:event_menuByCategoryActionPerformed

    private void menuByPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuByPriceActionPerformed
        // TODO add your handling code here:
        desktop.removeAll();
        desktop.repaint();
        FilterByPrice view = new FilterByPrice(products);
        view.moveToFront();
        view.setVisible(true);
        desktop.add(view);
    }//GEN-LAST:event_menuByPriceActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuByCategory;
    private javax.swing.JMenuItem menuByDescription;
    private javax.swing.JMenuItem menuByPrice;
    private javax.swing.JMenuItem menuProductManagement;
    // End of variables declaration//GEN-END:variables

    private void fillProduct() {
        Product product1 = new Product(1, "Polenta", 560, 10, new Category(1, "Comida"));
        Product product2 = new Product(2, "Milangas", 1500, 12, new Category(1, "Comida"));
        Product product3 = new Product(3, "Ayudin", 2500, 60, new Category(2, "Limpieza"));
        Product product4 = new Product(4, "Adolfo Dominguez", 1500, 5, new Category(3, "Perfumeria"));

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

    }
}
