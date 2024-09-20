package group1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class mainCode extends javax.swing.JFrame {

    double[] None = {0};
    double[] appitizerPrice = {0, 120.5, 110.10, 150.5, 210.14, 312, 200.5, 165.70, 155.5, 190.64, 215.48};
    double[] maindishPrice = {0, 156.5, 213.3, 122.3, 225.6, 110.40, 134.85, 105.6, 120.45, 115.20, 100.45};
    double[] drinksPrice = {0, 55.50, 60.25, 50.52, 57.33, 50.50, 40.00, 45.25, 75.50, 70.50, 60.75};
    double[] sidedishPrice = {0, 112.5, 123.3, 132.3, 110.40, 115.20, 113.40, 120.23, 135.72, 145.30, 125.20};
    double[] dessertPrice = {0, 145.25, 125.00, 110.80, 120.25, 115.50, 105.75, 110.50, 145.75, 130.25, 120.90};

    String NoneDis[] = {null};
    String appitezerDes[] = {null, "<html>The dip typically made with a base of sour cream and flavored with minced onion, "
        + "and usually served with potato chips as chips and dip. It is also served with snack crackers and crudités.</html>",
        "<html>Big cubes of feta, juicy tomatoes, olives, herbs, bell peppers, and cucumber tumble together in this stunning summer salad.</html>",
        "<html>This cream of mushroom soup recipe is rich, creamy, and deeply savory. Veggies like mushrooms, cauliflower, celery, "
        + "and leeks create its rich flavor and creamy texture, so this is both vegan and gluten-free.</html>",
        "<html>A breath of the sea which the roe of sturgeon fish served with its own accompaniments that delivers a decadently rich and creamy flavor.</html>",
        "<html>Smoked fish served along with brown bread and lemon segments, The zesty lemon cuts through the creamy mascarpone base to create a perfectly balanced dish.</html>",
        "<html>Large escargots sautéed with sweetbread and black trumpet mushrooms, lightly creamed marsala brown sauce.</html>",
        "<html>Atlantic prawns in our tabasco spiked, marie-rose sauce, with smoked paprika and avocado salsa.</html>",
        "<html>Fresh mini Bagels with sundried tomatoes, lettuce and goats cheese.</html>",
        "<html>Bacon Wrapped Shrimp served with Guacamole and Tequila Beurre Blanc.</html>",
        "<html>This dish, whose name literally means “Return to Life,”. Extra large shrimp served with cocktail sauce and lemon.</html>"};

    String maindishDes[] = {null, "<html>Take garlicky shrimp, unsweetened coconut, and shishito peppers to the grill. Squeeze a lime over the top just before eating.</html>",
        "<html>This isn't your typical chicken Caesar. Here, you'll smother the chicken in garlicky dressing, then roast until burnished and juicy. Golden croutons soak up the"
        + " roast chicken juices before they're tossed with crunchy lettuce.</html>",
        "<html>Chicken breasts don't have to be boring. Gather friends around the grill for this extra-flavorful meal, enhanced with grilled pineapple. Marinate the chicken in "
        + "advance and you have one of those perfectly summery, easy dinners that's sure to impress.</html>",
        "<html>This just might be the best grilled chicken you've ever made. Serve with coconut rice or sticky rice and the spicy pineapple dipping sauce.</html>",
        "<html>Instant ramen noodles are perfect here as they’re quick and simple to cook and quite forgiving—they don’t turn mushy easily and can be made hours ahead of time.</html>",
        "<html>Looking for main course ideas for a vegan dinner party? This jerk tofu from Epi contributor Chrissy Tracey has it all: deeply flavorful marinated tofu, "
        + "luscious grilled plantains, and a fresh mango salsa to brighten the dish.</html>",
        "<html>In this recipe, summer produce gets stuffed with spiced ground lamb and cooked in an oniony tomato sauce. Top it off with crispy garlic, herbs, and yogurt.</html>",
        "<html>These wings are perfect backyard summer fare, with tons of bright, tangy flavor.</html>",
        "<html>This whole fish is a Lunar New Year tradition—it's customary to point the head toward your most distinguished guest.</html>",
        "<html>This savory pie calls for roasting tomatoes to concentrate their flavor, then layering them with two kinds of cheese atop a garlic-butter crust for a result as dramatic as it is delicious.</html>"};

    String sidedishDes[] = {null, "<html>Bump up the vitamin A and fiber when you swap tortilla chips for sweet potatoes in this healthy recipe.</html>",
        "<html>This healthy recipe combines two bar food favorites--fried zucchini and curly fries--into one tempting package. "
        + "Serve these baked zucchini fries with a simple dipping sauce made with ranch dressing and marinara sauce</html>",
        "<html>We use flour-thickened milk combined with a modest amount of tangy sharp Cheddar to make a creamy cheese sauce for our healthy spin on the classic potatoes au gratin recipe. "
        + "They're topped with additional cheese and some breadcrumbs, then baked until golden brown and bubbling.</html>",
        "<html>You may not have considered onions as candidates for the spiralizer, but you should. They create beautiful ribbons that make this recipe reminiscent of fried shoestring onions. "
        + "And because this onion ring-inspired recipe is baked rather than fried, they're really easy to make.</html>",
        "<html>This vegan creamed spinach is as good as the real thing. It's creamy and flavorful with rich umami from the mushroom powder and nutritional yeast.</html>",
        "<html>Not one, not two, but three cheeses make these low-carb cheesy zucchini tots live up to their name. Bake them in the oven or fry them in your air fryer for a crisp exterior and a gooey, "
        + "melted center. Serve with ketchup, marinara, ranch or your favorite dipping sauce.</html>",
        "<html>Get crispy, crunchy fries with much less oil than deep frying requires with these air-fried spuds. For the best texture, keep each fry as evenly sized as possible."
        + " Try a mandoline to make quick work of equal fries if your knife work could use some help.</html>",
        "<html>Oven-roasted fingerling potatoes can be a special holiday side dish, but they're quick enough to enjoy on a weeknight too.</html>",
        "<html>Mable Clarke, the creator of this baked mac and cheese recipe, is a cook and activist from South Carolina who serves this dish at a monthly fish fry she started to save her church.</html>",
        "<html>Cheddar cheese, scallions and bacon flavor these \"twice baked\" sweet potatoes. Cooking the sweet potatoes in the microwave first helps keep this easy loaded sweet potato recipe quick.</html>"};

    String dessertDes[] = {null, "<html>Classic cheesecake with a graham cracker crust and high sides is creamy, silky, and smooth. It’s thick, it’s velvety, and there’s no denying its decadence.</html>",
        "<html>Classic red hued chocolate buttermilk cake topped with vanilla cream cheese frosting.</html>",
        "<html>Pears and cream cheese lie beneath a clear see green layer.</html>",
        "<html>Carrot and candied pecan cake with lime frosting.</html>",
        "<html>Flakey pastry crust hand rolled in packed with fresh apples.</html>",
        "<html>Take a walk on the dark side of the moon with this double strawberry and cheesecake treat.</html>",
        "<html>The classic gooey, chunky chocolate brownie topped with powdered sugar.</html>",
        "<html>Soft and chewy and filled with chocolate and walnuts.</html>",
        "<html>Smooth, sweet and lip-puckering with perfect combination of sweet & sour in a sweetened flaky dough pastry.</html>",
        "<html>Made with oranges, peaches, banana, strawberries and other fruit with table cream, and condensed milk.</html>"};

    public mainCode() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spnItem = new javax.swing.JSpinner();
        cmbCategory = new javax.swing.JComboBox<>();
        cmbDish = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        lblDescription = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        btnOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTotalAmount = new javax.swing.JLabel();
        radSenior = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSCDiscount = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblFinalAmount = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/group1/0000000000000000001.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(4000, 4000));
        setPreferredSize(new java.awt.Dimension(780, 780));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotal.setText("0");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 64, 27));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Total Price:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, -1));

        spnItem.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        spnItem.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnItem.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnItemStateChanged(evt);
            }
        });
        getContentPane().add(spnItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 60, 40));

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Appetizer", "Main Dish", "Side Dish", "Drinks", "Dessert" }));
        cmbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoryItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 350, 41));

        cmbDish.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDishItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbDish, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 350, 41));

        btnSubmit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnSubmit.setText("CHECK OUT");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 113, 45));

        lblDescription.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        getContentPane().add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 478, 105));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Order Details:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 94, 25));

        tblList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Dish", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblList.getTableHeader().setReorderingAllowed(false);
        tblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblList);
        if (tblList.getColumnModel().getColumnCount() > 0) {
            tblList.getColumnModel().getColumn(0).setResizable(false);
            tblList.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblList.getColumnModel().getColumn(1).setResizable(false);
            tblList.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblList.getColumnModel().getColumn(2).setResizable(false);
            tblList.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblList.getColumnModel().getColumn(3).setResizable(false);
            tblList.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 590, 173));

        btnOrder.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnOrder.setText("ADD ORDER");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, 35));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Total Amount:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 90, 20));

        lblTotalAmount.setText("0");
        getContentPane().add(lblTotalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, 80, 30));

        radSenior.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        radSenior.setText("Senior Citizen");
        radSenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSeniorActionPerformed(evt);
            }
        });
        getContentPane().add(radSenior, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia Pro Black", 1, 24)); // NOI18N
        jLabel4.setText("CORGORAY RESTAURANT");
        jLabel4.setToolTipText("");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Select Category:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 96, 26));

        jLabel6.setFont(jLabel5.getFont());
        jLabel6.setText("Select Item:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 70, 25));

        jLabel7.setFont(jLabel5.getFont());
        jLabel7.setText("Description:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 94, 25));

        lblSCDiscount.setText("0");
        getContentPane().add(lblSCDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 640, 90, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Discount:   -");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 640, 70, 30));

        lblFinalAmount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFinalAmount.setText("0");
        getContentPane().add(lblFinalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 670, 70, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Amount:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 50, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Select if you're Senior Citizen:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/group1/0000000000000000001.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 780, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoryItemStateChanged
        if (cmbCategory.getSelectedItem().equals("None")) {

        } else if (cmbCategory.getSelectedItem().equals("Appetizer")) {
            cmbDish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{null, "Chips and dip", "Salad", "Soups", "Caviare",
                "Smoked salmon", "Escargots", "Relishes", "Canape", "Hors d’ oeuvres", "Shellfish cocktail"}));

        } else if (cmbCategory.getSelectedItem().equals("Main Dish")) {
            cmbDish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{null, "Grilled Coconut Shrimp", "Caesar Salad Roast Chicken",
                "Marinated Chicken Breasts With Grilled Pineapple Relish", "Thai Muslim–Style Grilled Chicken",
                "Garlicky Instant Ramen Noodle Salad", "Grilled Jerk Tofu and Plantains With Mango Salsa",
                "Stuffed Eggplants and Zucchini in a Rich Tomato Sauce", "Spicy Tamarind-Glazed Grilled Chicken Wings",
                "Steamed Fish With Ginger and Scallions", "Tomato and Roasted Garlic Pie"}));

        } else if (cmbCategory.getSelectedItem().equals("Side Dish")) {
            cmbDish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{null, "Loaded Sweet Potato Nacho Fries",
                "Baked Parmesan Zucchini Curly Fries", "Au Gratin Potatoes", "Spiralized Onions", "Vegan Creamed Spinach",
                "Cheesy Zucchini Tots", "Crispy Air-Fryer French Fries", "Roasted Fingerling Potatoes", "Mable's Mac 'n' Cheese", "Loaded Sweet Potatoes"}));

        } else if (cmbCategory.getSelectedItem().equals("Drinks")) {
            cmbDish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{null, "Coca-Cola", "Sprite",
                "Coke Zero", "Pepsi", "Green Tea", "Water", "Iced Tea", "Cocktails", "Coffee", "Hot Chocolate"}));

        } else if (cmbCategory.getSelectedItem().equals("Dessert")) {
            cmbDish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{null, "Cheesecake", "Cupcakes", "Jell-O", "Carrot Cake", "Apple Pie",
                "Ice Cream", "Brownies", "Chocolate Chip Cookies", "Lemon Tart", "Fruit Salad"}));
        }
    }//GEN-LAST:event_cmbCategoryItemStateChanged

    private void cmbDishItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDishItemStateChanged
        if (cmbCategory.getSelectedItem().equals("NONE")) {
            lblTotal.setText(None[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");
            lblDescription.setText(NoneDis[cmbDish.getSelectedIndex()] + "");

        } else if (cmbCategory.getSelectedItem().equals("Appetizer")) {
            lblTotal.setText(appitizerPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");
            lblDescription.setText(appitezerDes[cmbDish.getSelectedIndex()] + "");

        } else if (cmbCategory.getSelectedItem().equals("Main Dish")) {
            lblTotal.setText(maindishPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");
            lblDescription.setText(maindishDes[cmbDish.getSelectedIndex()] + "");

        } else if (cmbCategory.getSelectedItem().equals("Side Dish")) {
            lblTotal.setText(sidedishPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");
            lblDescription.setText(sidedishDes[cmbDish.getSelectedIndex()] + "");

        } else if (cmbCategory.getSelectedItem().equals("Drinks")) {
            lblTotal.setText(drinksPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");

        } else if (cmbCategory.getSelectedItem().equals("Dessert")) {
            lblTotal.setText(dessertPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");
            lblDescription.setText(dessertDes[cmbDish.getSelectedIndex()] + "");
        }
    }//GEN-LAST:event_cmbDishItemStateChanged

    private void spnItemStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnItemStateChanged
        if (cmbCategory.getSelectedItem().equals("NONE")) {
            lblTotal.setText(None[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");

        } else if (cmbCategory.getSelectedItem().equals("Appetizer")) {
            lblTotal.setText(appitizerPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");

        } else if (cmbCategory.getSelectedItem().equals("Main Dish")) {
            lblTotal.setText(maindishPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");

        } else if (cmbCategory.getSelectedItem().equals("Side Dish")) {
            lblTotal.setText(sidedishPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");

        } else if (cmbCategory.getSelectedItem().equals("Drinks")) {
            lblTotal.setText(drinksPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");

        } else if (cmbCategory.getSelectedItem().equals("Dessert")) {
            lblTotal.setText(dessertPrice[cmbDish.getSelectedIndex()] * (int) spnItem.getValue() + "");
        }
    }//GEN-LAST:event_spnItemStateChanged

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        double total = Double.parseDouble(lblFinalAmount.getText());

        this.toBack();
        secondaryCode frame2 = new secondaryCode();
        frame2.setVisible(true);
        frame2.toFront();
        frame2.showTotalPrice(total);

        resetTable();
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        String Category = cmbCategory.getSelectedItem().toString();
        String Dish = cmbDish.getSelectedItem().toString();
        double total = Double.parseDouble(lblTotal.getText());
        int Quantity = (int) spnItem.getValue();
        if (Quantity == 0) {
            JOptionPane.showMessageDialog(null, "Please Select Quantity");
        } else {
            JOptionPane.showMessageDialog(null, "Order Received!");
        }

        DefaultTableModel model = (DefaultTableModel) tblList.getModel();
        model.addRow(new Object[]{Category, Dish, Quantity, total});

        int bill = tblList.getRowCount();
        double calculatedBill = 0;

        for (int i = 0; i < bill; i++) {
            double val = Double.valueOf(tblList.getValueAt(i, 3).toString());
            calculatedBill += val;
        }
        lblTotalAmount.setText(Double.toString(calculatedBill));
        lblFinalAmount.setText(Double.toString(calculatedBill));
        clearFields();
    }//GEN-LAST:event_btnOrderActionPerformed

    private void tblListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListMouseClicked
        int selectedRow = tblList.getSelectedRow();

        String category = tblList.getValueAt(selectedRow, 0).toString();
        for (int i = 0; i < cmbCategory.getItemCount(); i++) {
            if (cmbCategory.getItemAt(i).toString().equalsIgnoreCase(category)) {
                cmbCategory.setSelectedIndex(i);
    }//GEN-LAST:event_tblListMouseClicked
    }
        String dish = tblList.getValueAt(selectedRow, 1).toString();
        for (int i = 0; i < cmbDish.getItemCount(); i++) {
            if (cmbDish.getItemAt(i).toString().equalsIgnoreCase(dish)) {
                cmbDish.setSelectedIndex(i);
            }
        }
    }
    
    private void radSeniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSeniorActionPerformed
        if (radSenior.isSelected()) {
            double total = Double.parseDouble(lblTotalAmount.getText());
            lblTotalAmount.setText(total + "");

            //discount
            double less = total * .2;
            lblSCDiscount.setText(less + "");

            double discountedAmount = total - less;
            lblFinalAmount.setText(discountedAmount + "");
        } else {
            double total = Double.parseDouble(lblFinalAmount.getText());
            double discount = Double.parseDouble(lblSCDiscount.getText());

            double amountNoDiscount = total + discount;

            lblFinalAmount.setText(amountNoDiscount + "");
            lblSCDiscount.setText("0");
        }
    }//GEN-LAST:event_radSeniorActionPerformed
     
    private void clearFields() {
        cmbCategory.setSelectedIndex(0);
        cmbDish.setSelectedIndex(0);
        spnItem.setValue(0);
        lblTotal.setText("0");
        lblDescription.setText(" ");
    }

    private void resetTable() {
        cmbCategory.setSelectedIndex(0);
        cmbDish.setSelectedIndex(0);
        spnItem.setValue(0);
        lblTotal.setText("0");
        lblDescription.setText(" ");
        radSenior.setSelected(false);
        DefaultTableModel model = (DefaultTableModel) tblList.getModel();
        model.setRowCount(0);

        lblSCDiscount.setText("0");
        lblFinalAmount.setText("0");
        lblTotalAmount.setText("0");
    }
    
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
            java.util.logging.Logger.getLogger(secondaryCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secondaryCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secondaryCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secondaryCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbDish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFinalAmount;
    private javax.swing.JLabel lblSCDiscount;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JRadioButton radSenior;
    private javax.swing.JSpinner spnItem;
    private javax.swing.JTable tblList;
    // End of variables declaration//GEN-END:variables
}
