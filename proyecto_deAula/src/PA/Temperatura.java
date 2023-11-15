/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PA;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Temperatura extends javax.swing.JPanel {
 private double convertirTemperatura(String unidadEntrada, String unidadSalida, double temperatura) {
    double resultado;

    if (unidadEntrada.equals(unidadSalida)) {
        resultado = temperatura; // Misma unidad de entrada y salida, no es necesario convertir.
    } else {
        resultado = switch (unidadEntrada) {
    
          case "Kelvin" -> switch (unidadSalida) {
          case "Celsius" -> temperatura -273.15;
          case "Fahrenheit" ->  temperatura - 273.15 * 9/5 + 32;
          
 // Agrega otros casos para las demás unidades de salida
                default -> 0.0; // Valor predeterminado en caso de una unidad de salida no válida
                 };
               case "Celsius" -> switch (unidadSalida) {
          case "Kelvin" -> temperatura + 273.15;
          case "Fahrenheit" ->  temperatura * 9/5 + 32 ;
         
               
                    
                    default -> 0.0;
              };
                   case "Fahrenheit" -> switch (unidadSalida) {
          case "Kelvin" -> (temperatura - 32) * 5/9 + 273.15;
          case "Celsius" -> (temperatura - 32) * 5/9 ;
          
              default ->0.0;
        };
                            
         default ->0.0;
         
         };
             
    
          }
      return resultado;         
         }
    public Temperatura() {
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

        llamaMasa = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        R2 = new javax.swing.JTextField();
        comboB3 = new javax.swing.JComboBox<>();
        comboB4 = new javax.swing.JComboBox<>();
        RR2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        llamaMasa.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        R2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2ActionPerformed(evt);
            }
        });

        comboB3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboB3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Celsius", "Fahrenheit" }));
        comboB3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboB3ActionPerformed(evt);
            }
        });

        comboB4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboB4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Kelvin", "Fahrenheit" }));
        comboB4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboB4ActionPerformed(evt);
            }
        });

        RR2.setBackground(new java.awt.Color(255, 255, 255));
        RR2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("=");

        boton1.setBackground(new java.awt.Color(102, 255, 102));
        boton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton1.setText("OK");
        boton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R2)
                    .addComponent(comboB3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboB4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RR2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RR2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboB3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboB4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("MAGNITUD: TEMPERATURA");

        javax.swing.GroupLayout llamaMasaLayout = new javax.swing.GroupLayout(llamaMasa);
        llamaMasa.setLayout(llamaMasaLayout);
        llamaMasaLayout.setHorizontalGroup(
            llamaMasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, llamaMasaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(llamaMasaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        llamaMasaLayout.setVerticalGroup(
            llamaMasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(llamaMasaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llamaMasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llamaMasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void R2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R2ActionPerformed

    private void comboB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboB3ActionPerformed

    private void comboB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboB4ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed

        // Obtén la unidad de entrada seleccionada
        String unidadEntrada = (String) comboB3.getSelectedItem();
        String inputText = R2.getText().trim(); // Obtén el texto del JTextField y elimina espacios en blanco

        if (inputText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa un valor válido.", "VALOR VACÍO", JOptionPane.ERROR_MESSAGE);
        } else {
            double masa = Double.parseDouble(inputText);

            String unidadSalida = (String) comboB4.getSelectedItem();

            if (unidadEntrada.equals(unidadSalida)) {
                JOptionPane.showMessageDialog(null, "Elige una unidad diferente.", "UNIDAD IGUAL", JOptionPane.ERROR_MESSAGE);
            } else {
                double resultado = convertirTemperatura(unidadEntrada, unidadSalida, masa);

                String resultadoFormateado = esNumeroEntero(resultado) ? String.format("%,.0f", resultado) : String.format("%,.3f", resultado);

                RR2.setText("" + resultadoFormateado);
            }
        }
        }
        // Método para verificar si un número es entero
        private boolean esNumeroEntero(double numero) {
            return numero % 1 == 0;

    }//GEN-LAST:event_boton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField R2;
    private javax.swing.JLabel RR2;
    private javax.swing.JButton boton1;
    private javax.swing.JComboBox<String> comboB3;
    private javax.swing.JComboBox<String> comboB4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel llamaMasa;
    // End of variables declaration//GEN-END:variables
}
