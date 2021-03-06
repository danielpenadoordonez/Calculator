
package capaGrafica;

import java.text.DecimalFormat;
import capaLogica.Calculadora;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmCalculadora extends javax.swing.JFrame {

    DecimalFormat formatoNum = new DecimalFormat("#,##0.##");
    Calculadora calculator = Calculadora.getInstance();
    
    public FrmCalculadora() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Calculator.PNG")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnPunto = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnSuma = new javax.swing.JButton();
        jBtnResta = new javax.swing.JButton();
        jBtnMultiplicacion = new javax.swing.JButton();
        jBtnDivision = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnRaizCuadrada = new javax.swing.JButton();
        jBtnPotencia = new javax.swing.JButton();
        jBtnIgual = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaResultados = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMnuProgramador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jBtn2.setBackground(new java.awt.Color(0, 0, 0));
        jBtn2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn2.setForeground(new java.awt.Color(255, 255, 255));
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setBackground(new java.awt.Color(0, 0, 0));
        jBtn3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn3.setForeground(new java.awt.Color(255, 255, 255));
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn1.setBackground(new java.awt.Color(0, 0, 0));
        jBtn1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn1.setForeground(new java.awt.Color(255, 255, 255));
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn0.setBackground(new java.awt.Color(0, 0, 0));
        jBtn0.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn0.setForeground(new java.awt.Color(255, 255, 255));
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnPunto.setBackground(new java.awt.Color(0, 0, 0));
        jBtnPunto.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jBtnPunto.setForeground(new java.awt.Color(255, 255, 255));
        jBtnPunto.setText(".");
        jBtnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPuntoActionPerformed(evt);
            }
        });

        jBtn4.setBackground(new java.awt.Color(0, 0, 0));
        jBtn4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn4.setForeground(new java.awt.Color(255, 255, 255));
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setBackground(new java.awt.Color(0, 0, 0));
        jBtn5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn5.setForeground(new java.awt.Color(255, 255, 255));
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setBackground(new java.awt.Color(0, 0, 0));
        jBtn6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn6.setForeground(new java.awt.Color(255, 255, 255));
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn7.setBackground(new java.awt.Color(0, 0, 0));
        jBtn7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn7.setForeground(new java.awt.Color(255, 255, 255));
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setBackground(new java.awt.Color(0, 0, 0));
        jBtn8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn8.setForeground(new java.awt.Color(255, 255, 255));
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setBackground(new java.awt.Color(0, 0, 0));
        jBtn9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtn9.setForeground(new java.awt.Color(255, 255, 255));
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnSuma.setBackground(new java.awt.Color(255, 0, 0));
        jBtnSuma.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jBtnSuma.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSuma.setText("+");
        jBtnSuma.setToolTipText("SUMA");
        jBtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSumaActionPerformed(evt);
            }
        });

        jBtnResta.setBackground(new java.awt.Color(255, 0, 0));
        jBtnResta.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jBtnResta.setForeground(new java.awt.Color(255, 255, 255));
        jBtnResta.setText("-");
        jBtnResta.setToolTipText("RESTA");
        jBtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRestaActionPerformed(evt);
            }
        });

        jBtnMultiplicacion.setBackground(new java.awt.Color(255, 0, 0));
        jBtnMultiplicacion.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtnMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMultiplicacion.setText("x");
        jBtnMultiplicacion.setToolTipText("MULTIPLICACION");
        jBtnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiplicacionActionPerformed(evt);
            }
        });

        jBtnDivision.setBackground(new java.awt.Color(255, 0, 0));
        jBtnDivision.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtnDivision.setForeground(new java.awt.Color(255, 255, 255));
        jBtnDivision.setText("/");
        jBtnDivision.setToolTipText("DIVISION");
        jBtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivisionActionPerformed(evt);
            }
        });

        jBtnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        jBtnEliminar.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEliminar.setText("DEL");
        jBtnEliminar.setToolTipText("DELETE");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnRaizCuadrada.setBackground(new java.awt.Color(255, 0, 0));
        jBtnRaizCuadrada.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtnRaizCuadrada.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRaizCuadrada.setText("???");
        jBtnRaizCuadrada.setToolTipText("RAIZ CUADRADA");
        jBtnRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRaizCuadradaActionPerformed(evt);
            }
        });

        jBtnPotencia.setBackground(new java.awt.Color(255, 0, 0));
        jBtnPotencia.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtnPotencia.setForeground(new java.awt.Color(255, 255, 255));
        jBtnPotencia.setText("X2 ");
        jBtnPotencia.setToolTipText("POTENCIA AL CUADRADO");
        jBtnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPotenciaActionPerformed(evt);
            }
        });

        jBtnIgual.setBackground(new java.awt.Color(255, 0, 0));
        jBtnIgual.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jBtnIgual.setForeground(new java.awt.Color(255, 255, 255));
        jBtnIgual.setText("=");
        jBtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIgualActionPerformed(evt);
            }
        });

        jTxaResultados.setEditable(false);
        jTxaResultados.setColumns(20);
        jTxaResultados.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jTxaResultados.setRows(5);
        jScrollPane1.setViewportView(jTxaResultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jBtnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jBtnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnEliminar)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMultiplicacion))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jBtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setBackground(new java.awt.Color(0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(255, 0, 0));
        jMenu1.setText("Opciones");

        jMnuProgramador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMnuProgramador.setBackground(new java.awt.Color(0, 0, 0));
        jMnuProgramador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jMnuProgramador.setForeground(new java.awt.Color(255, 0, 0));
        jMnuProgramador.setText("Programador");
        jMnuProgramador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnuProgramadorActionPerformed(evt);
            }
        });
        jMenu1.add(jMnuProgramador);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
       jTxaResultados.append("1");
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTxaResultados.setText("");
    }//GEN-LAST:event_formWindowOpened

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        jTxaResultados.append("2");
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        jTxaResultados.append("3");
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        jTxaResultados.append("4");
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        jTxaResultados.append("5");
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        jTxaResultados.append("6");
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
       jTxaResultados.append("7");
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        jTxaResultados.append("8");
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        jTxaResultados.append("9");
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        jTxaResultados.append("0");
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPuntoActionPerformed
        jTxaResultados.append(".");
    }//GEN-LAST:event_jBtnPuntoActionPerformed

    private void jBtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSumaActionPerformed
       String numero = jTxaResultados.getText();
       boolean hasOperator = false; 
       int contNegativos = 0;
       for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if(caracter == '+' || caracter == '-' || caracter == 'x' || caracter == '/'){
                hasOperator = true; 
            }
            if(caracter == '-'){
                if(numero.charAt(0) == '-'){
                    hasOperator = false;
                    contNegativos++;
                }
            }
       }
       if(contNegativos >= 2){
           hasOperator = true;
       }
       if(hasOperator){
           jBtnIgual.doClick();
       }
       jTxaResultados.append("+");
       
    }//GEN-LAST:event_jBtnSumaActionPerformed

    private void jBtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRestaActionPerformed
       String numero = jTxaResultados.getText();
       boolean hasOperator = false;
       int contNegativos = 0;
       for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if(caracter == '+' || caracter == '-' || caracter == 'x' || caracter == '/'){
                hasOperator = true;
            }
            if(caracter == '-'){
                if(numero.charAt(0) == '-'){
                    hasOperator = false;
                    contNegativos++; 
                }
            }
            if(numero.charAt(numero.length()-1) == 'x' || numero.charAt(numero.length()-1) == '/'){
            jTxaResultados.append("-");
            return;
           }
        }
       if(contNegativos >= 2){
           hasOperator = true;
       }
       if(hasOperator){
           jBtnIgual.doClick();
       }
       jTxaResultados.append("-");
    }//GEN-LAST:event_jBtnRestaActionPerformed

    private void jBtnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiplicacionActionPerformed
        String numero = jTxaResultados.getText();
        boolean hasOperator = false; 
        int contNegativos = 0;
        for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if(caracter == '+' || caracter == '-' || caracter == 'x' || caracter == '/'){
                hasOperator = true;
            }
            if(caracter == '-'){
                if(numero.charAt(0) == '-'){
                    hasOperator = false;
                    contNegativos++;
                }
            }
        }
        if(contNegativos >= 2){
           hasOperator = true;
        }
        if(hasOperator){
           jBtnIgual.doClick();
        }
        jTxaResultados.append("x");
    }//GEN-LAST:event_jBtnMultiplicacionActionPerformed

    private void jBtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivisionActionPerformed
       String numero = jTxaResultados.getText();
       boolean hasOperator = false; 
       int contNegativos = 0;
       for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if(caracter == '+' || caracter == '-' || caracter == 'x' || caracter == '/'){
                hasOperator = true;
            }
            if(caracter == '-'){
                if(numero.charAt(0) == '-'){
                    hasOperator = false;
                    contNegativos++;
                }
            }
       }
       if(contNegativos >= 2){
           hasOperator = true;
       }
       if(hasOperator){
           jBtnIgual.doClick();
       }
        jTxaResultados.append("/");
    }//GEN-LAST:event_jBtnDivisionActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        jTxaResultados.setText("");
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPotenciaActionPerformed
        double num = Double.parseDouble(jTxaResultados.getText().replaceAll(",", ""));
        jTxaResultados.setText(formatoNum.format(calculator.potencia(num)));
    }//GEN-LAST:event_jBtnPotenciaActionPerformed

    private void jBtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIgualActionPerformed
        String operacion = jTxaResultados.getText().replaceAll(",", "");
        double num1, num2;
        char operador = 0, caracter;
        int indiceOperador = 0;
        for (int i = 0; i < operacion.length(); i++) {
            caracter = operacion.charAt(i);
            if(caracter == '+' || caracter == '-' || caracter == 'x' || caracter == '/'){
                operador = caracter;
                indiceOperador = i;
            }
        }
        num2 = Double.parseDouble(operacion.substring(indiceOperador + 1, operacion.length()));
        try{
          num1 = Double.parseDouble(operacion.substring(0, indiceOperador));
        }
        catch(NumberFormatException n){
            num1 = Double.parseDouble(operacion.substring(0, indiceOperador-1));
            num2 = Double.parseDouble(operacion.substring(indiceOperador, operacion.length()));
            operador = operacion.charAt(indiceOperador-1);
        }
//        num2 = Double.parseDouble(operacion.substring(indiceOperador + 1, operacion.length()));
        switch(operador){
            case '+':
               jTxaResultados.setText(formatoNum.format(calculator.suma(num1, num2)));
               break;
            case '-':
                jTxaResultados.setText(formatoNum.format(calculator.resta(num1, num2)));
                break;
            case 'x':
                jTxaResultados.setText(formatoNum.format(calculator.multiplicacion(num1, num2)));
                break;
            case '/':
                if(num2 == 0){
                    JOptionPane.showMessageDialog(this, "No se puede dividir entre 0", "Error Matematico", JOptionPane.ERROR_MESSAGE);
                    jTxaResultados.setText("");
                    return;
                }
                jTxaResultados.setText(formatoNum.format(calculator.division(num1, num2)));
                break;
        }
    }//GEN-LAST:event_jBtnIgualActionPerformed

    private void jBtnRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRaizCuadradaActionPerformed
        double num = Double.parseDouble(jTxaResultados.getText().replaceAll(",", ""));   
        jTxaResultados.setText(formatoNum.format(calculator.raizCuadrada(num)));
    }//GEN-LAST:event_jBtnRaizCuadradaActionPerformed

    private void jMnuProgramadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnuProgramadorActionPerformed
        FrmProgramador frm = new FrmProgramador();
        frm.setVisible(true);
        frm.setLocationRelativeTo(this);
    }//GEN-LAST:event_jMnuProgramadorActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnDivision;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnIgual;
    private javax.swing.JButton jBtnMultiplicacion;
    private javax.swing.JButton jBtnPotencia;
    private javax.swing.JButton jBtnPunto;
    private javax.swing.JButton jBtnRaizCuadrada;
    private javax.swing.JButton jBtnResta;
    private javax.swing.JButton jBtnSuma;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnuProgramador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxaResultados;
    // End of variables declaration//GEN-END:variables
}
