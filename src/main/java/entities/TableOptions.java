/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alamb
 */
public class TableOptions {

    private static DefaultTableModel model = new DefaultTableModel() {
        public boolean isCellEditable(int row, int col) {
            return false;
        }
    };

    public static void createTableHead(JTable table, DefaultTableModel model) {
        model.addColumn("Code");
        model.addColumn("Description");
        model.addColumn("Category");
        model.addColumn("Price");
        model.addColumn("Stock");

        table.setModel(model);
    }

    public static void clearTable(DefaultTableModel model) {
        int rows = model.getRowCount() - 1;

        for (int i = rows; i >= 0; i--) {
            model.removeRow(i);
        }
    }
}
