import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculadoraPDNSPInterface extends javax.swing.JFrame {

    private VolumeDaMicrobacia volumeDaMicrobacia;

    public CalculadoraPDNSPInterface() {
        initComponents();
        volumeDaMicrobacia = new VolumeDaMicrobacia(); // Instância da classe VolumeDaMicrobacia

        // Adiciona KeyListeners para validar entrada como números
        jTextField4.addKeyListener(new KeyAdapterNumbersOnly());
        jTextField2.addKeyListener(new KeyAdapterNumbersOnly());
        jTextField3.addKeyListener(new KeyAdapterNumbersOnly());
    }

    private class KeyAdapterNumbersOnly implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                e.consume();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // Não é necessário implementar neste caso
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // Não é necessário implementar neste caso
        }
    }

    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setBackground(new java.awt.Color(245, 245, 245));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false); // Impede que a janela seja redimensionada
        setLocationRelativeTo(null); // Centraliza a janela na tela
        setSize(602, 430); // Define o tamanho da janela

        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(21, 90, 193));
        jButton1.setForeground(new java.awt.Color(245, 245, 245));
        jButton1.setText("CALCULAR");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 220, 100, 20);

        jTextField2.setBackground(new java.awt.Color(245, 245, 245));
        jTextField2.setText("LADO2");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(240, 150, 100, 20);

        jTextField3.setBackground(new java.awt.Color(245, 245, 245));
        jTextField3.setText("INCLINAÇÃO");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(380, 150, 100, 20);

        jTextField4.setBackground(new java.awt.Color(245, 245, 245));
        jTextField4.setText("LADO1");
        jTextField4.setToolTipText("");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(100, 150, 100, 20);

        jTextField5.setBackground(new java.awt.Color(13, 71, 207));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(245, 245, 245));
        jTextField5.setText("0000");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(290, 260, 170, 40);

        jLabel1.setBackground(new java.awt.Color(245, 245, 245));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("0d47cf100butaum.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 598, 400);

    }                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double lado1 = Double.parseDouble(jTextField4.getText());
        double lado2 = Double.parseDouble(jTextField2.getText());
        int angulo = Integer.parseInt(jTextField3.getText());
    
        volumeDaMicrobacia.calculoDoVolumeDaMicrobacia(lado1, lado2, angulo);
    
        String resultadoFormatado = String.format("%.2f", volumeDaMicrobacia.precipitacaoTotal);
        jTextField5.setText(resultadoFormatado + " Litros");
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraPDNSPInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new CalculadoraPDNSPInterface().setVisible(true);
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;                   
}
