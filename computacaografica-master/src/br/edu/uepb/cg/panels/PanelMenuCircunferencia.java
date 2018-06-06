package br.edu.uepb.cg.panels;

import br.edu.uepb.cg.App;
import br.edu.uepb.cg.enums.CircunferenciaEnum;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 * Representa o menu para manipulação da circunferência
 *
 * @author Douglas Rafael
 */
public class PanelMenuCircunferencia extends javax.swing.JPanel {

    private static PanelMenuCircunferencia instance;

    private float raioX;
    private float raioY;
    private Color color;
    private CircunferenciaEnum tipoAlgoritimo;

    /**
     * Construtor
     */
    private PanelMenuCircunferencia() {
        initComponents();
        valorRaioY.setVisible(false);
    }
    
    public static synchronized PanelMenuCircunferencia getInstance() {
        if (instance == null) {
            instance = new PanelMenuCircunferencia();
        }
        return instance;
    }

    public float getRaioX() {
        return raioX;
    }

    public void setRaioX(float raioX) {
        this.raioX = raioX;
    }

    public float getRaioY() {
        return raioY;
    }

    public void setRaioY(float raioY) {
        this.raioY = raioY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CircunferenciaEnum getTipoAlgoritimo() {
        return tipoAlgoritimo;
    }

    public void setTipoAlgoritimo(CircunferenciaEnum tipoAlgoritimo) {
        this.tipoAlgoritimo = tipoAlgoritimo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAlgoritmos = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        rbPontoMedio = new javax.swing.JRadioButton();
        rbTrigonometrica = new javax.swing.JRadioButton();
        rbEquacaoExplicita = new javax.swing.JRadioButton();
        rbElipse = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        valorRaioX = new javax.swing.JSpinner();
        valorRaioY = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        panelCor = new javax.swing.JPanel();
        btResolve = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(240, 32767));
        setMinimumSize(new java.awt.Dimension(240, 0));
        setPreferredSize(new java.awt.Dimension(240, 779));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Algoritmos da Circunferência"));

        buttonGroupAlgoritmos.add(rbPontoMedio);
        rbPontoMedio.setSelected(true);
        rbPontoMedio.setText("Ponto Médio");
        rbPontoMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecetedAlgoritmo(evt);
            }
        });

        buttonGroupAlgoritmos.add(rbTrigonometrica);
        rbTrigonometrica.setText("Trigonométrica");
        rbTrigonometrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecetedAlgoritmo(evt);
            }
        });

        buttonGroupAlgoritmos.add(rbEquacaoExplicita);
        rbEquacaoExplicita.setText("Equação Explícita");
        rbEquacaoExplicita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecetedAlgoritmo(evt);
            }
        });

        buttonGroupAlgoritmos.add(rbElipse);
        rbElipse.setText("Elipse");
        rbElipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecetedAlgoritmo(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbTrigonometrica)
                    .addComponent(rbPontoMedio)
                    .addComponent(rbEquacaoExplicita)
                    .addComponent(rbElipse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbPontoMedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbEquacaoExplicita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbTrigonometrica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE)
                .addComponent(rbElipse)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor do Raio"));

        jLabel2.setText("Raio:");

        valorRaioX.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valorRaioX.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 0.1f));
        valorRaioX.setMaximumSize(new java.awt.Dimension(30, 25));
        valorRaioX.setMinimumSize(new java.awt.Dimension(30, 25));
        valorRaioX.setPreferredSize(new java.awt.Dimension(30, 25));

        valorRaioY.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valorRaioY.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 0.1f));
        valorRaioY.setMaximumSize(new java.awt.Dimension(30, 25));
        valorRaioY.setMinimumSize(new java.awt.Dimension(30, 25));
        valorRaioY.setPreferredSize(new java.awt.Dimension(30, 25));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valorRaioX, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valorRaioY, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorRaioX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(valorRaioY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cor da Circunferência"));

        panelCor.setBackground(java.awt.Color.blue);
        panelCor.setToolTipText("Click para selecionar uma nova cor");
        panelCor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openColorChooser(evt);
            }
        });

        javax.swing.GroupLayout panelCorLayout = new javax.swing.GroupLayout(panelCor);
        panelCor.setLayout(panelCorLayout);
        panelCorLayout.setHorizontalGroup(
            panelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelCorLayout.setVerticalGroup(
            panelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btResolve.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btResolve.setText("Desenhar Circunferência");
        btResolve.setPreferredSize(new java.awt.Dimension(61, 30));
        btResolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desenhaCirc(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btResolve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btResolve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void openColorChooser(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openColorChooser
        Color newColor = JColorChooser.showDialog(PanelMenuCircunferencia.this,
                "Selecione uma nova cor...",
                panelCor.getBackground());

        if (newColor != null) {
            panelCor.setBackground(newColor);
        }
    }//GEN-LAST:event_openColorChooser

    private void desenhaCirc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desenhaCirc
        // Seta a cor selecionada no jPanel 
        setColor(panelCor.getBackground());

        // Seta o raio
        setRaioX((float) valorRaioX.getValue());

        // Seta o tipo de algoritmo selecionado
        if (rbPontoMedio.isSelected()) {
            setTipoAlgoritimo(CircunferenciaEnum.PONTO_MEDIO);
        } else if (rbEquacaoExplicita.isSelected()) {
            setTipoAlgoritimo(CircunferenciaEnum.EQUACAO_EXPLICITA);
        } else if (rbTrigonometrica.isSelected()) {
            setTipoAlgoritimo(CircunferenciaEnum.TRIGONOMETRIA);
        } else if (rbElipse.isSelected()) {
            setRaioY((float) valorRaioY.getValue());
            setTipoAlgoritimo(CircunferenciaEnum.ELIPSE);
        }
        App.runResult(this);
    }//GEN-LAST:event_desenhaCirc

    /**
     * Habilita ou desabilita componetes de acordo como algoritmo selecionado.
     * 
     * @param evt 
     */
    private void selecetedAlgoritmo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecetedAlgoritmo
        if (rbTrigonometrica.isSelected() || rbEquacaoExplicita.isSelected() || rbPontoMedio.isSelected()) {
            valorRaioY.setVisible(false);
        } else {
            valorRaioY.setVisible(true);
        }
    }//GEN-LAST:event_selecetedAlgoritmo


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btResolve;
    private javax.swing.ButtonGroup buttonGroupAlgoritmos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panelCor;
    private javax.swing.JRadioButton rbElipse;
    private javax.swing.JRadioButton rbEquacaoExplicita;
    private javax.swing.JRadioButton rbPontoMedio;
    private javax.swing.JRadioButton rbTrigonometrica;
    private javax.swing.JSpinner valorRaioX;
    private javax.swing.JSpinner valorRaioY;
    // End of variables declaration//GEN-END:variables
}
