package swing;

import java.io.IOException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import palpites.Palpite;

public class Janela extends javax.swing.JFrame implements Palpite {

    public Janela() {
        initComponents();
        iniciarJogo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        btnPalpite = new javax.swing.JButton();
        sairJogo = new javax.swing.JButton();
        reiniciarJogo = new javax.swing.JButton();
        input = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JOGO DO PALPITE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(350, 90));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(658, 412));

        jLabel1.setBackground(new java.awt.Color(102, 51, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("==========================================================");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(102, 51, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("==========================================================");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setBackground(new java.awt.Color(102, 51, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JOGO DO PALPITE");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel.setBackground(new java.awt.Color(102, 51, 255));
        jLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("DIGITE SEU PALPITE");

        btnPalpite.setBackground(new java.awt.Color(102, 51, 255));
        btnPalpite.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPalpite.setForeground(new java.awt.Color(255, 255, 255));
        btnPalpite.setText("PALPITAR");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });

        sairJogo.setBackground(new java.awt.Color(102, 51, 255));
        sairJogo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sairJogo.setForeground(new java.awt.Color(255, 255, 255));
        sairJogo.setText("Sair");
        sairJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairJogoActionPerformed(evt);
            }
        });

        reiniciarJogo.setBackground(new java.awt.Color(102, 51, 255));
        reiniciarJogo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        reiniciarJogo.setForeground(new java.awt.Color(255, 255, 255));
        reiniciarJogo.setText("Reiniciar");
        reiniciarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarJogoActionPerformed(evt);
            }
        });

        input.setBackground(new java.awt.Color(255, 255, 102));
        input.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        input.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(reiniciarJogo)
                                .addGap(18, 18, 18)
                                .addComponent(sairJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                            .addComponent(btnPalpite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(btnPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sairJogo)
                    .addComponent(reiniciarJogo))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(186, Short.MAX_VALUE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );

        jLabel1.getAccessibleContext().setAccessibleName("========================================================================================");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        try{
            resultado();
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Erro! Favor digitar um numero!");
        }
        
    }//GEN-LAST:event_btnPalpiteActionPerformed

    private void reiniciarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarJogoActionPerformed
        iniciarJogo();
    }//GEN-LAST:event_reiniciarJogoActionPerformed

    private void sairJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairJogoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairJogoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reiniciarJogo;
    private javax.swing.JButton sairJogo;
    // End of variables declaration//GEN-END:variables

    private int tentativas;
    private int numeroGerado;
    
    public JButton getBtnPalpite() {
        return btnPalpite;
    }

    public void setBtnPalpite(JButton btnPalpite) {
        this.btnPalpite = btnPalpite;
    }

    public JTextField getInput() {
        return input;
    }

    public void setInput(JTextField input) {
        this.input = input;
    }

    @Override
    public void iniciarJogo() {
        input.setText("");
        tentativas = 1;
        gerarNumero();
    }

    @Override
    public int gerarNumero() {
       
        Random r = new Random();
        numeroGerado = r.nextInt(101);
        
        return numeroGerado;
    }

    @Override
    public void resultado() {
        if (avaliarIgualdade()) {
            JOptionPane.showMessageDialog(null, "Parabéns!! Você Ganhou!! O número sorteado foi: " + numeroGerado + ". Você tentou "+ tentativas+ " vezes!", 
                    "Resultado", JOptionPane.INFORMATION_MESSAGE);                
        }else{
            if (converterEmInteiro(input) < numeroGerado) {
                JOptionPane.showMessageDialog(null, "Voce Errou!! O número sorteado é maior do que o digitado!",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Voce Errou!! O número sorteado é menor do que o digitado!",
                        "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }
        }      
    }

    @Override
    public boolean avaliarIgualdade(){
 
        if (converterEmInteiro(input) != numeroGerado) {
            tentativas++;
            return false;
        } 
        return true;

    }
    
    private int converterEmInteiro(JTextField jtf){
        int n = Integer.parseInt(jtf.getText());
        return n;
    }
}