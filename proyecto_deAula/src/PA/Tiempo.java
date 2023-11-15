/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PA;

import javax.swing.JOptionPane;
  
   
public class Tiempo extends javax.swing.JPanel {

     private double convertirTiempo(String unidadEntrada, String unidadSalida, double tiempo) {
    double resultado;

    if (unidadEntrada.equals(unidadSalida)) {
        resultado = tiempo; // Misma unidad de entrada y salida, no es necesario convertir.
    } else {
         resultado = switch (unidadEntrada) {


case "Siglos" -> switch (unidadSalida) {
          case "Decadas" -> tiempo*10;
          case "Años" -> tiempo*100 ;
          case "Meses" -> tiempo*1200 ;
          case "Semanas" -> tiempo*5214.29 ;
          case "Dias" -> tiempo*36500 ;
          case "Horas" -> tiempo*876000 ;
          case "Minutos" -> tiempo*52560000 ;
          case "Segundos" -> tiempo*3153600000L ;
          case "Milisegundos" -> tiempo*3.154e+12;
        
 // Agrega otros casos para las demás unidades de salida
                default -> 0.0; // Valor predeterminado en caso de una unidad de salida no válida
                 };
               
          case "Decadas" -> switch (unidadSalida) {
          case "Siglos" -> tiempo/ 10;
          case "Años" -> tiempo* 10 ;
          case "Meses" -> tiempo* 120 ;
          case "Semanas" -> tiempo* 521.429 ;
          case "Dias" -> tiempo* 3650 ;
          case "Horas" -> tiempo* 87600 ;
          case "Minutos" -> tiempo* 525600 ;
          case "Segundos" -> tiempo* 31536000L ;
          case "Milisegundos" -> tiempo* 31536000000L ;
         
               
                    
                    default -> 0.0;
              };
                  case "Años" -> switch (unidadSalida) {
          case "Siglos" ->tiempo / 100 ;
          case "Decadas" ->tiempo / 10  ;
          case "Meses" -> tiempo * 12 ;
          case "Semanas" ->tiempo * 52.143  ;
          case "Dias" -> tiempo* 365 ;
          case "Horas" -> tiempo* 8760 ;
          case "Minutos" -> tiempo* 525600 ;
          case "Segundos" -> tiempo* 31536000L ;
          case "Milisegundos" -> tiempo* 31536000000L ;
          
 
   
                    default -> 0.0;
                        
              };
                 case "Meses" -> switch (unidadSalida) {
          case "Siglos" ->tiempo / 1200 ;
          case "Decadas" ->tiempo / 120  ;
          case "Años" -> tiempo / 12 ;
          case "Semanas" ->tiempo * 4.34524  ;
          case "Dias" -> tiempo* 30.4167 ;
          case "Horas" -> tiempo* 730.001 ;
          case "Minutos" -> tiempo * 43800.1 ;
          case "Segundos" -> tiempo* 2628000 ;
          case "Milisegundos" -> tiempo* 2628000000L ;
              
                     default -> 0.0;
              };
                       case "Semanas" -> switch (unidadSalida) {
          case "Siglos" ->tiempo / 5214.29 ;
          case "Decadas" ->tiempo/ 521.429 ;
          case "Años" -> tiempo/ 52.143    ;
          case "Meses" ->tiempo/ 4.34524   ;
          case "Dias" -> tiempo* 7 ;
          case "Horas" -> tiempo*168 ;
          case "Minutos" -> tiempo * 10080  ;
          case "Segundos" -> tiempo* 604800 ;
          case "Milisegundos" -> tiempo * 604800000L;
              
              
                    default ->0.0;
        };
                       case "Dias" -> switch (unidadSalida) {
          case "Siglos" ->tiempo / 36500 ;
          case "Decadas" ->tiempo / 3650;
          case "Años" -> tiempo /365   ;
          case "Meses" ->tiempo/ 30.4167   ;
          case "Semanas" -> tiempo/ 7 ;
          case "Horas" -> tiempo* 24 ;
          case "Minutos" -> tiempo  * 1440 ;
          case "Segundos" -> tiempo * 86400;
          case "Milisegundos" -> tiempo* 86400000L ; 
                        
                    default ->0.0;
       
        };
                           case "Horas" -> switch (unidadSalida) {
          case "Siglos" ->tiempo/ 876000  ;
          case "Decadas" ->tiempo/87600 ;
          case "Años" -> tiempo/8760   ;
          case "Meses" ->tiempo/ 730.001   ;
          case "Semanas" -> tiempo/ 168 ;
          case "Dias" -> tiempo/ 24 ;
          case "Minutos" -> tiempo *60  ;
          case "Segundos" -> tiempo*3600 ;
          case "Milisegundos" -> tiempo * 3600000L ; 
                    default ->0.0;
        };
                  case"Minutos" -> switch (unidadSalida) {
          case "Siglos" ->tiempo / 52560000  ;
          case "Decadas" ->tiempo/525600 ;
          case "Años" -> tiempo/525600   ;
          case "Meses" ->tiempo/43800.1   ;
          case "Semanas" -> tiempo/10080 ;
          case "Dias" -> tiempo/1440 ;
          case "Horas" -> tiempo/60   ;
          case "Segundos" -> tiempo*60 ;
          case "Milisegundos" -> tiempo*60000L  ;              
                               
                           default ->0.0; 
    };
                    case"Segundos" -> switch (unidadSalida) {
          case "Siglos" ->tiempo / 3153600000L  ;
          case "Decadas" ->tiempo/ 31536000L ;
          case "Años" -> tiempo/ 31536000L   ;
          case "Meses" ->tiempo  / 2628000  ;
          case "Semanas" -> tiempo / 604800 ;
          case "Dias" -> tiempo / 86400;
          case "Horas" -> tiempo  /3600 ;
          case "Minutos" -> tiempo /60;
          case "Milisegundos" -> tiempo*1000  ; 
                      
                  default ->0.0;
        };
                case"Milisegundos" -> switch (unidadSalida) {
          case "Siglos" ->tiempo/ 3153600000000L   ;
          case "Decadas" ->tiempo/ 31536000000L ;
          case "Años" -> tiempo / 31536000000L  ;
          case "Meses" ->tiempo   / 2628000000L ;
          case "Semanas" -> tiempo  / 604800000L;
          case "Dias" -> tiempo/ 86400000L ;
          case "Horas" -> tiempo  / 3600000L ;
          case "Minutos" -> tiempo  / 60000L;
          case "Segundos" -> tiempo / 1000 ; 
                      
                        default ->0.0;
        };
                         
                    
          
         
         
                            default ->0.0;
         
         };
    }
      return resultado;     
}
    
    public Tiempo() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        R1 = new javax.swing.JTextField();
        comboB1 = new javax.swing.JComboBox<>();
        comboB2 = new javax.swing.JComboBox<>();
        RR1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        boton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MAGNITUD: TIEMPO");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        R1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        comboB1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Siglos", "Decadas", "Años", "Meses", "Semanas", "Dias", "Horas", "Minutos", "Segundos", "Milisegundos" }));
        comboB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboB1ActionPerformed(evt);
            }
        });

        comboB2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Decadas", "Siglos", "Años", "Meses", "Semanas", "Dias", "Horas", "Minutos", "Segundos", "Milisegundos" }));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        String inputText = R1.getText().trim(); // Obtén el texto del JTextField y elimina espacios en blanco

        if (inputText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa un valor válido.", "VALOR VACÍO", JOptionPane.ERROR_MESSAGE);
        } else {
            double longitud = Double.parseDouble(inputText);

            // Obtén la unidad de salida seleccionada
            String unidadSalida = (String) comboB2.getSelectedItem();

            if (unidadEntrada.equals(unidadSalida)) {
                JOptionPane.showMessageDialog(null, "Elige una unidad diferente.", "UNIDAD IGUAL", JOptionPane.ERROR_MESSAGE);
            } else {
                // Realizar la conversión de longitud según las unidades seleccionadas
                double resultado = convertirTiempo(unidadEntrada, unidadSalida, longitud);

                String resultadoFormateado = esNumeroEntero(resultado) ? String.format("%,.0f", resultado) : String.format("%,.3f", resultado);

                // Muestra el resultado en un JLabel o en otro componente de tu ventana.
                RR1.setText("" + resultadoFormateado);
            }
        }
        }
        // Método para verificar si un número es entero
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
