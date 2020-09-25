package presentationPatterns;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateProductForm {
    private JTextField nameField;
    private JTextField descriptionField;
    private JTextField priceField;
    private JButton addButton;
    public JPanel mainPanel;
    private JPanel inventoryPanel;
    private JLabel nameLabel;
    private JTable itemsTable;
    private DefaultTableModel tableModel;

    public CreateProductForm() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = nameField.getText();
                String description = descriptionField.getText();
                String price = priceField.getText();
                if (name.equals("") || description.equals("") || price.equals("")){
                    JOptionPane.showMessageDialog(mainPanel, "Please fill in all the fields");
                }
                else {
                    initTableModel();
                    InventoryService service = new InventoryService();
                    try {
                        service.addProduct(name, description, price);
                        tableModel.addRow(new Object[]{name, description, price});
                    } catch (Exception e){
                        JOptionPane.showMessageDialog(mainPanel,
                                "Can't add product: \n" + e.getClass().toString() + ":" + e.getMessage());
                    }
                }
            }
        });
    }

    private void initTableModel() {
        if (tableModel == null) {
            tableModel = new DefaultTableModel();
            tableModel.addColumn("Name");
            tableModel.addColumn("Description");
            tableModel.addColumn("Price");
            itemsTable.setModel(tableModel);
        }
    }
}
