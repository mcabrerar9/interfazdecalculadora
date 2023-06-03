
package calculadorapoo;


public class InterfazMar extends javax.swing.JFrame {
CalculadoraEspecial ce = new CalculadoraEspecial("Especial", "Azul", 10, "123qwer", "Mar");
    public InterfazMar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bgresultado = new javax.swing.JPanel();
        resultadotext = new javax.swing.JTextField();
        bgcomponente = new javax.swing.JPanel();
        num1text = new javax.swing.JTextField();
        num2text = new javax.swing.JTextField();
        labeln2 = new javax.swing.JLabel();
        labeln1 = new javax.swing.JLabel();
        cebtn = new javax.swing.JButton();
        sumabtn = new javax.swing.JButton();
        restabtn = new javax.swing.JButton();
        multiplicarbtn = new javax.swing.JButton();
        dividirbtn = new javax.swing.JButton();
        potenciabtn = new javax.swing.JButton();
        raizbtn = new javax.swing.JButton();
        logbtn = new javax.swing.JButton();
        cubicraizbtn = new javax.swing.JButton();
        senbtn = new javax.swing.JButton();
        cosbtn = new javax.swing.JButton();
        tanbtn = new javax.swing.JButton();
        aleatoriobtn = new javax.swing.JButton();
        primobtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgresultado.setBackground(new java.awt.Color(204, 255, 204));
        bgresultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bgresultado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultadotext.setEditable(false);
        resultadotext.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        resultadotext.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bgresultado.add(resultadotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 100));

        bg.add(bgresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 140));

        bgcomponente.setBackground(new java.awt.Color(0, 153, 153));
        bgcomponente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        num1text.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        num1text.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        num2text.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        num2text.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labeln2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labeln2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeln2.setText("Segundo Numero");

        labeln1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labeln1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeln1.setText("Primer Numero");

        cebtn.setBackground(new java.awt.Color(255, 51, 51));
        cebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cebtn.setText("CE");
        cebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cebtnMousePressed(evt);
            }
        });

        sumabtn.setBackground(new java.awt.Color(255, 255, 51));
        sumabtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sumabtn.setText("+");
        sumabtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sumabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sumabtnMousePressed(evt);
            }
        });

        restabtn.setBackground(new java.awt.Color(255, 255, 51));
        restabtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        restabtn.setText("-");
        restabtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restabtnMousePressed(evt);
            }
        });

        multiplicarbtn.setBackground(new java.awt.Color(255, 255, 51));
        multiplicarbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        multiplicarbtn.setText("X");
        multiplicarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplicarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                multiplicarbtnMousePressed(evt);
            }
        });

        dividirbtn.setBackground(new java.awt.Color(255, 255, 51));
        dividirbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dividirbtn.setText("/");
        dividirbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dividirbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dividirbtnMousePressed(evt);
            }
        });

        potenciabtn.setBackground(new java.awt.Color(255, 255, 51));
        potenciabtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        potenciabtn.setText("^");
        potenciabtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        potenciabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                potenciabtnMousePressed(evt);
            }
        });

        raizbtn.setBackground(new java.awt.Color(255, 255, 51));
        raizbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        raizbtn.setText("√");
        raizbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        raizbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                raizbtnMousePressed(evt);
            }
        });

        logbtn.setBackground(new java.awt.Color(255, 255, 51));
        logbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        logbtn.setText("Ln");
        logbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logbtnMousePressed(evt);
            }
        });

        cubicraizbtn.setBackground(new java.awt.Color(255, 255, 51));
        cubicraizbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cubicraizbtn.setText("3√");
        cubicraizbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cubicraizbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cubicraizbtnMousePressed(evt);
            }
        });

        senbtn.setBackground(new java.awt.Color(255, 255, 51));
        senbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        senbtn.setText("Sin");
        senbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        senbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                senbtnMousePressed(evt);
            }
        });

        cosbtn.setBackground(new java.awt.Color(255, 255, 51));
        cosbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cosbtn.setText("Cos");
        cosbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cosbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cosbtnMousePressed(evt);
            }
        });
        cosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosbtnActionPerformed(evt);
            }
        });

        tanbtn.setBackground(new java.awt.Color(255, 255, 51));
        tanbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tanbtn.setText("Tan");
        tanbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tanbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tanbtnMousePressed(evt);
            }
        });

        aleatoriobtn.setBackground(new java.awt.Color(255, 255, 51));
        aleatoriobtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        aleatoriobtn.setText("Num Aleatorio");
        aleatoriobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aleatoriobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aleatoriobtnMousePressed(evt);
            }
        });

        primobtn.setBackground(new java.awt.Color(255, 255, 51));
        primobtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        primobtn.setText("Num Primo");
        primobtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        primobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                primobtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout bgcomponenteLayout = new javax.swing.GroupLayout(bgcomponente);
        bgcomponente.setLayout(bgcomponenteLayout);
        bgcomponenteLayout.setHorizontalGroup(
            bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgcomponenteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgcomponenteLayout.createSequentialGroup()
                        .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgcomponenteLayout.createSequentialGroup()
                                .addComponent(labeln1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41))
                            .addComponent(num1text, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labeln2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num2text, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgcomponenteLayout.createSequentialGroup()
                        .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgcomponenteLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(primobtn)
                                .addGap(18, 18, 18)
                                .addComponent(aleatoriobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(bgcomponenteLayout.createSequentialGroup()
                                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(multiplicarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgcomponenteLayout.createSequentialGroup()
                                        .addComponent(cebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(sumabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(potenciabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgcomponenteLayout.createSequentialGroup()
                                        .addComponent(dividirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cubicraizbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addGroup(bgcomponenteLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(logbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(bgcomponenteLayout.createSequentialGroup()
                                        .addComponent(restabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(raizbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tanbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(cosbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(senbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(118, 118, 118))))
        );
        bgcomponenteLayout.setVerticalGroup(
            bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgcomponenteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labeln1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labeln2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1text, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2text, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raizbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiplicarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dividirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cubicraizbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potenciabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(bgcomponenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aleatoriobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bg.add(bgcomponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 490, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cebtnMousePressed
        num1text.setText("");
        num2text.setText("");
        resultadotext.setText("");
    }//GEN-LAST:event_cebtnMousePressed

    private void sumabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumabtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double num2 = Double.parseDouble(num2text.getText());
        double resultado = ce.sumar(num1, num2);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_sumabtnMousePressed

    private void restabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restabtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double num2 = Double.parseDouble(num2text.getText());
        double resultado = ce.restar(num1, num2);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_restabtnMousePressed

    private void multiplicarbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicarbtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double num2 = Double.parseDouble(num2text.getText());
        double resultado = ce.multiplicar(num1, num2);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_multiplicarbtnMousePressed

    private void dividirbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dividirbtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double num2 = Double.parseDouble(num2text.getText());
        double resultado = ce.dividir(num1, num2);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_dividirbtnMousePressed

    private void potenciabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potenciabtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double num2 = Double.parseDouble(num2text.getText());
        double resultado = ce.calcularPotencia(num1, num2);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_potenciabtnMousePressed

    private void raizbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raizbtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double resultado = ce.raizCuadrada(num1);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_raizbtnMousePressed

    private void logbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logbtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double resultado = ce.calcularLogaritmo(num1);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_logbtnMousePressed

    private void cubicraizbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cubicraizbtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double resultado = ce.calcularRaizCubica(num1);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_cubicraizbtnMousePressed

    private void senbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senbtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double resultado = ce.calcularSeno(num1);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_senbtnMousePressed

    private void cosbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cosbtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double resultado = ce.calcularCoseno(num1);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_cosbtnMousePressed

    private void tanbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tanbtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double resultado = ce.calcularTangente(num1);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_tanbtnMousePressed

    private void aleatoriobtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aleatoriobtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        double resultado = ce.generarNumeroAleatorio((int) num1);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_aleatoriobtnMousePressed

    private void primobtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primobtnMousePressed
        double num1 = Double.parseDouble(num1text.getText());
        boolean resultado = ce.esPrimo((int) num1);
        resultadotext.setText(String.valueOf(resultado));
    }//GEN-LAST:event_primobtnMousePressed

    private void cosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cosbtnActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aleatoriobtn;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgcomponente;
    private javax.swing.JPanel bgresultado;
    private javax.swing.JButton cebtn;
    private javax.swing.JButton cosbtn;
    private javax.swing.JButton cubicraizbtn;
    private javax.swing.JButton dividirbtn;
    private javax.swing.JLabel labeln1;
    private javax.swing.JLabel labeln2;
    private javax.swing.JButton logbtn;
    private javax.swing.JButton multiplicarbtn;
    private javax.swing.JTextField num1text;
    private javax.swing.JTextField num2text;
    private javax.swing.JButton potenciabtn;
    private javax.swing.JButton primobtn;
    private javax.swing.JButton raizbtn;
    private javax.swing.JButton restabtn;
    private javax.swing.JTextField resultadotext;
    private javax.swing.JButton senbtn;
    private javax.swing.JButton sumabtn;
    private javax.swing.JButton tanbtn;
    // End of variables declaration//GEN-END:variables
}
