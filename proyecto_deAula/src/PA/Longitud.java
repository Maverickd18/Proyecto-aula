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
public class Longitud extends javax.swing.JPanel {
private double convertirLongitud(String unidadEntrada, String unidadSalida, double longitud) {
    double resultado;

    if (unidadEntrada.equals(unidadSalida)) {
        resultado = longitud; 
    } else {
        resultado = switch (unidadEntrada) {
            case "Metros" -> switch (unidadSalida) {
                case "Centímetros" -> longitud * 100;
                case "Kilómetros" -> longitud / 1000;
                case "Yardas" -> longitud * 1.09361;
                case "Pie" -> longitud * 3.281;
                case "Pulgadas" -> longitud * 39.3701;
                case "Millas" -> longitud * 0.000621371;
                                            
                    
               
                default -> 0.0; 
            };
            case "Centímetros" -> switch (unidadSalida) {
                case "Metros" -> longitud / 100;
                case "Kilómetros" -> longitud / 100000;
                case "Yardas" -> longitud * 0.0109361;
                case "Pie" -> longitud * 0.0328084;
                case "Pulgadas" -> longitud * 0.393701;
                case "Millas" -> longitud * 0.0000062137;
                    
                    default -> 0.0;
              };
            case "Kilómetros" -> switch (unidadSalida) {
                case "Metros" -> longitud * 1000;
                case "Centímetros" -> longitud * 100000;
                case "Yardas" -> longitud * 1093.61;
                case "Pie" -> longitud * 3280.84;
                case "Pulgadas" -> longitud * 39370.1;
                case "Millas" -> longitud * 0.621371;
                  
                 
               
                default -> 0.0; 
                    
             };
            case "Yardas" -> switch (unidadSalida) {
                case "Metros" -> longitud / 1.09361;
                case "Centímetros" -> longitud / 0.0109361;
                case "Kilómetros" -> longitud / 1093.61;
                case "Pie" -> longitud * 3;
                case "Pulgadas" -> longitud * 36;
                case "Millas" -> longitud / 1760;
                          
                default -> 0.0; 
            };      
                case "Pie" -> switch (unidadSalida) {
                case "Metros" -> longitud / 3.28084;
               case "Centímetros" -> longitud / 0.0328084;
                case "Kilómetros" -> longitud / 3280.84;
                case "Yardas" -> longitud / 3;
                case "Pulgadas" -> longitud * 12; 
                case "Millas" -> longitud / 5280;
                 default -> 0.0; 
                };
                 case "Pulgadas" -> switch (unidadSalida) {
                  case "Metros" -> longitud / 39.3701;
                   case "Centímetros" -> longitud / 0.393701;
                   case "Kilómetros" -> longitud / 39370.1;
                  case "Yardas" -> longitud / 36;  
                     case "Pie" -> longitud / 12;  
                    case "Millas" -> longitud / 63360; 
                         default -> 0.0; 
                   };
                        case "Millas" -> switch (unidadSalida) {
                      case "Metros" -> longitud / 0.000621371;
                    case "Centímetros" -> longitud / 0.0000062137;
                     case "Kilómetros" -> longitud / 0.621371;
                     case "Yardas" -> longitud * 1760; 
                      case "Pie" -> longitud * 5280;  
                    case "Pulgadas" -> longitud * 63360;  
                      default -> 0.0; 
};
     
               
                default -> 0.0; 
            };
         
    }

    return resultado;
}
    public Longitud() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        llamaLongitud = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        R1 = new javax.swing.JTextField();
        comboB1 = new javax.swing.JComboBox<>();
        comboB2 = new javax.swing.JComboBox<>();
        RR1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        llamaLongitud.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        R1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        comboB1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metros", "Centímetros", "Kilómetros", "Yardas", "Pie", "Pulgadas", "Millas" }));
        comboB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboB1ActionPerformed(evt);
            }
        });

        comboB2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centímetros", "Metros", "Kilómetros", "Yardas", "Pie", "Pulgadas", "Millas" }));
        comboB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboB2ActionPerformed(evt);
            }
        });

        RR1.setBackground(new java.awt.Color(255, 255, 255));
        RR1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("=");

        boton.setBackground(new java.awt.Color(102, 255, 102));
        boton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton.setText("OK");
        boton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(R1)
                    .addComponent(comboB1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboB2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RR1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RR1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboB1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboB2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MAGNITUD: LONGITUD");

        javax.swing.GroupLayout llamaLongitudLayout = new javax.swing.GroupLayout(llamaLongitud);
        llamaLongitud.setLayout(llamaLongitudLayout);
        llamaLongitudLayout.setHorizontalGroup(
            llamaLongitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(llamaLongitudLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, llamaLongitudLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        llamaLongitudLayout.setVerticalGroup(
            llamaLongitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(llamaLongitudLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llamaLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(llamaLongitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R1ActionPerformed

    private void comboB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboB1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_comboB1ActionPerformed

    private void comboB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboB2ActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
// Obtén la unidad de entrada seleccionada
String unidadEntrada = (String) comboB1.getSelectedItem();

String inputText = R1.getText().trim();
if (inputText.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Ingresa un valor válido.", "VALOR VACÍO", JOptionPane.ERROR_MESSAGE);
} else {
    double longitud = Double.parseDouble(inputText);

 
    String unidadSalida = (String) comboB2.getSelectedItem();

    if (unidadEntrada.equals(unidadSalida)) {
        JOptionPane.showMessageDialog(null, "Elige una unidad diferente.", "UNIDAD IGUAL", JOptionPane.ERROR_MESSAGE);
    } else {
      
        double resultado = convertirLongitud(unidadEntrada, unidadSalida, longitud);

        String resultadoFormateado = esNumeroEntero(resultado) ? String.format("%,.0f", resultado) : String.format("%,.3f", resultado);

        
        RR1.setText("" + resultadoFormateado);
    }
}
    }

private boolean esNumeroEntero(double numero) {
    return numero % 1 == 0;



    }//GEN-LAST:event_botonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField R1;
    private javax.swing.JLabel RR1;
    private javax.swing.JButton boton;
    private javax.swing.JComboBox<String> comboB1;
    private javax.swing.JComboBox<String> comboB2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel llamaLongitud;
    // End of variables declaration//GEN-END:variables
}
