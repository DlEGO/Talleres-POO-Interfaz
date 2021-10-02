
public class UIComplejos extends javax.swing.JFrame {
    
   
   
    public UIComplejos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Real1 = new javax.swing.JTextField();
        Real2 = new javax.swing.JTextField();
        Imaginario2 = new javax.swing.JTextField();
        Imaginario1 = new javax.swing.JTextField();
        Resultados = new javax.swing.JButton();
        suma = new javax.swing.JLabel();
        resta = new javax.swing.JLabel();
        multiplicacion = new javax.swing.JLabel();
        division = new javax.swing.JLabel();
        conjuncion = new javax.swing.JLabel();
        norma1 = new javax.swing.JLabel();
        norma2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Complejo 1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Complejo 2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Real");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Real");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Imaginario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Imaginario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));
        jPanel1.add(Real1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 60, -1));
        jPanel1.add(Real2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 60, -1));
        jPanel1.add(Imaginario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 60, -1));
        jPanel1.add(Imaginario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 60, -1));

        Resultados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Resultados.setText("RESULTADOS");
        Resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadosActionPerformed(evt);
            }
        });
        jPanel1.add(Resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 130, -1));

        suma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        suma.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 490, 20));

        resta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 460, 20));

        multiplicacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 470, 20));

        division.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        division.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 490, 20));

        conjuncion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        conjuncion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(conjuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 480, 20));

        norma1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        norma1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(norma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 500, 20));

        norma2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        norma2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(norma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 490, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadosActionPerformed
        
        Complejo complejo1;
        Complejo complejo2;
        
        String s = Real1.getText();
        double real_1=Double.parseDouble(s);  
        
         s = Real2.getText();
        double real_2=Double.parseDouble(s);    
        
         s = Imaginario1.getText();
         double imaginario_1=Double.parseDouble(s);  
        
        s = Imaginario2.getText();
        double imaginario_2=Double.parseDouble(s); 
      
        complejo1 = new Complejo(real_1,imaginario_1);
        complejo2 = new Complejo(real_2,imaginario_2);
        
        
        suma.setText("SUMA:  "+Complejo.mostrarSuma(complejo1,complejo2));
        resta.setText("RESTA: "+Complejo.mostrarResta(complejo1,complejo2));
        multiplicacion.setText("MULTIPLICACION: "+Complejo.mostrarMultiplicacion(complejo1,complejo2));
        division.setText("DIVISION: "+Complejo.mostrarDivision(complejo1,complejo2));
        conjuncion.setText("CONJUNCION: "+Complejo.mostrarConjucion(complejo1,complejo2));
        norma1.setText("Normatividad Complejo 1: "+Complejo.normaComplejos(complejo1));
        norma2.setText("Normatividad Complejo 2: "+Complejo.normaComplejos(complejo2));
        
        
        
    }//GEN-LAST:event_ResultadosActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIComplejos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Imaginario1;
    private javax.swing.JTextField Imaginario2;
    private javax.swing.JTextField Real1;
    private javax.swing.JTextField Real2;
    private javax.swing.JButton Resultados;
    private javax.swing.JLabel conjuncion;
    private javax.swing.JLabel division;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel multiplicacion;
    private javax.swing.JLabel norma1;
    private javax.swing.JLabel norma2;
    private javax.swing.JLabel resta;
    private javax.swing.JLabel suma;
    // End of variables declaration//GEN-END:variables
}
