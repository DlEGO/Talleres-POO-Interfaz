
public class UIClock extends javax.swing.JFrame {

    public UIClock() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        horas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Reloj = new javax.swing.JButton();
        Hora = new javax.swing.JTextField();
        Minuto = new javax.swing.JTextField();
        Segundo = new javax.swing.JTextField();
        HoraButton = new javax.swing.JButton();
        IncHora = new javax.swing.JTextField();
        MinutoButton = new javax.swing.JButton();
        IncMinuto = new javax.swing.JTextField();
        SegundoButton = new javax.swing.JButton();
        IncSegundo = new javax.swing.JTextField();
        Hora2Button = new javax.swing.JButton();
        DecHora = new javax.swing.JTextField();
        Minuto2Button = new javax.swing.JButton();
        DecMinuto = new javax.swing.JTextField();
        Segundo2Button = new javax.swing.JButton();
        DecSegundo = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        horas.setFont(new java.awt.Font("HP Simplified Hans", 1, 48)); // NOI18N
        horas.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(horas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 310, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HORAS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 70));

        Reloj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reloj.setText("Reloj");
        Reloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelojActionPerformed(evt);
            }
        });
        jPanel2.add(Reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));
        jPanel2.add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 40, 20));
        jPanel2.add(Minuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 50, 20));
        jPanel2.add(Segundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 50, -1));

        HoraButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HoraButton.setText("Incr. Hora");
        HoraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraButtonActionPerformed(evt);
            }
        });
        jPanel2.add(HoraButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 110, 30));
        jPanel2.add(IncHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 50, 30));

        MinutoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MinutoButton.setText("Incr. Minuto");
        MinutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinutoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(MinutoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 130, 30));
        jPanel2.add(IncMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 50, 30));

        SegundoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SegundoButton.setText("Incr.Segundo");
        SegundoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegundoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SegundoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, 30));
        jPanel2.add(IncSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 50, 30));

        Hora2Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hora2Button.setText("Dec. Hora");
        Hora2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hora2ButtonActionPerformed(evt);
            }
        });
        jPanel2.add(Hora2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 130, 30));
        jPanel2.add(DecHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 50, 30));

        Minuto2Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Minuto2Button.setText("Dec.Minuto");
        Minuto2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Minuto2ButtonActionPerformed(evt);
            }
        });
        jPanel2.add(Minuto2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 130, 30));
        jPanel2.add(DecMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 50, 30));

        Segundo2Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Segundo2Button.setText("Dec. Segundo");
        Segundo2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Segundo2ButtonActionPerformed(evt);
            }
        });
        jPanel2.add(Segundo2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 140, 30));
        jPanel2.add(DecSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 50, 30));

        Reset.setBackground(new java.awt.Color(255, 51, 51));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset.setText("RESET");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel2.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Minuto");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Segundo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        Clock clock;

    private void RelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelojActionPerformed
        
        int hora;
        int minuto;
        int segundo;
        
         String s = Hora.getText();
         if(s.equals("")){  
            hora = 0; 
         }else{
            hora = Integer.parseInt(s);
         }
        s = Minuto.getText();
         if(s.equals("")){
             minuto = 0;
         }else{
             minuto=Integer.parseInt(s);
         } 
        s = Segundo.getText();
         if(s.equals("")){
             segundo = 0;
         }else{
             segundo=Integer.parseInt(s); 
         } 
         
         clock = new Clock(hora,minuto,segundo);
         
         horas.setText(clock.toString());
         
         Hora.setText("");
         Minuto.setText("");
         Segundo.setText("");
         
    }//GEN-LAST:event_RelojActionPerformed
                                       
    private void MinutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinutoButtonActionPerformed
        String s = IncMinuto.getText();
        
        int minuto;
        
        if(s.equals("")){  
            minuto = 0; 
         }else{
            minuto = Integer.parseInt(s);
         }
        
        clock.increaseMinute(minuto);
        
        horas.setText(clock.toString());
        
        IncMinuto.setText("");
    }//GEN-LAST:event_MinutoButtonActionPerformed

    private void SegundoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegundoButtonActionPerformed
        String s = IncSegundo.getText();
        
        int segundo;
        
        if(s.equals("")){  
            segundo = 0; 
        }else{
            segundo = Integer.parseInt(s);
         }
        
        clock.increaseSecond(segundo);
        
        horas.setText(clock.toString());
        
        IncSegundo.setText("");
    }//GEN-LAST:event_SegundoButtonActionPerformed

    private void Hora2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hora2ButtonActionPerformed
       String s = DecHora.getText();
        
        int hora;
        
        if(s.equals("")){  
            hora = 0; 
        }else{
            hora = Integer.parseInt(s);
         }
        
        clock.decreaseHour(hora);
        
        horas.setText(clock.toString());
        
        DecHora.setText("");
    }//GEN-LAST:event_Hora2ButtonActionPerformed

    private void Minuto2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Minuto2ButtonActionPerformed
        String s = DecMinuto.getText();
        
        int minuto;
        
        if(s.equals("")){  
            minuto = 0; 
        }else{
            minuto = Integer.parseInt(s);
         }
        
        clock.decreaseMinute(minuto);
        
        horas.setText(clock.toString());
        
        DecMinuto.setText("");
    }//GEN-LAST:event_Minuto2ButtonActionPerformed

    private void Segundo2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Segundo2ButtonActionPerformed
        String s = DecSegundo.getText();
        
        int segundo;
        
        if(s.equals("")){  
            segundo = 0; 
        }else{
            segundo = Integer.parseInt(s);
         }
        
        clock.decreaseSecond(segundo);
        
        horas.setText(clock.toString());
        
        DecSegundo.setText("");
    }//GEN-LAST:event_Segundo2ButtonActionPerformed

    private void HoraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraButtonActionPerformed
        String s = IncHora.getText();
        
        int hora;
        
        if(s.equals("")){  
            hora = 0; 
         }else{
            hora = Integer.parseInt(s);
         }
        
        clock.increaseHour(hora);
        
        horas.setText(clock.toString());
        
        IncHora.setText("");
    }//GEN-LAST:event_HoraButtonActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        clock.restartTime();
        horas.setText(clock.toString());
    }//GEN-LAST:event_ResetActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIClock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DecHora;
    private javax.swing.JTextField DecMinuto;
    private javax.swing.JTextField DecSegundo;
    private javax.swing.JTextField Hora;
    private javax.swing.JButton Hora2Button;
    private javax.swing.JButton HoraButton;
    private javax.swing.JTextField IncHora;
    private javax.swing.JTextField IncMinuto;
    private javax.swing.JTextField IncSegundo;
    private javax.swing.JTextField Minuto;
    private javax.swing.JButton Minuto2Button;
    private javax.swing.JButton MinutoButton;
    private javax.swing.JButton Reloj;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField Segundo;
    private javax.swing.JButton Segundo2Button;
    private javax.swing.JButton SegundoButton;
    private javax.swing.JLabel horas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
