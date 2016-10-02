
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
Input: 

atgaagtcagctattttaaccggtttgcttttcgtc 
atgagtaaaggagaagaacttttcactggagtcgtt 
gaaaacatggagaacgatgaaaatattgtgtatggt 
ggttgggctttgcggatcatgtttctacatctgtac 
cctggggagaacctatgctatagaaagatgtggtgc 
cccagagagatccagaccgccgtgagactgttactc 
gagaagagaaagctgtttatccgttccatgggtgaa 
atggagtttactttgaggcaagaggctttagttaat 

 */
/**
 *
 * @author jessa
 */
public class Anslab1_201337859 extends javax.swing.JFrame {

    /**
     * Creates new form Anslab1_201337859
     */
    Scanner scan = new Scanner(System.in);

    public Anslab1_201337859() {
        initComponents();
        this.setTitle("Main Menu");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        translate_button = new javax.swing.JButton();
        freq_button = new javax.swing.JButton();
        trend_button = new javax.swing.JButton();
        import_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output_area = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        input_area = new javax.swing.JTextArea();
        clear_btn = new javax.swing.JButton();
        expfasta_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DNA Sequence Processing and Analysis");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        translate_button.setText("Translate to Protein Sequences");
        translate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translate_buttonActionPerformed(evt);
            }
        });

        freq_button.setText("Frequency and Percentage Table");
        freq_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                freq_buttonActionPerformed(evt);
            }
        });

        trend_button.setText("Trend of Nucleotide Occurences");
        trend_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trend_buttonActionPerformed(evt);
            }
        });

        import_button.setText("Import Fasta File");

        output_area.setColumns(20);
        output_area.setRows(5);
        jScrollPane1.setViewportView(output_area);

        input_area.setColumns(20);
        input_area.setRows(5);
        input_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                input_areaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(input_area);

        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        expfasta_btn.setText("Export Output as Fasta");

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(translate_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(freq_button, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trend_button, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(import_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expfasta_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn)
                    .addComponent(expfasta_btn))
                .addGap(15, 15, 15)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(translate_button)
                    .addComponent(trend_button))
                .addGap(10, 10, 10)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(import_button)
                    .addComponent(freq_button))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void freq_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_freq_buttonActionPerformed
       
        
        Freq_Perc freq_class = new Freq_Perc();
        freq_class.Calculate_Freq_Perc(input_area.getText());
        
        freq_class.show();

    }//GEN-LAST:event_freq_buttonActionPerformed

    private void translate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translate_buttonActionPerformed
        output_area.setText("");
        for (String line : input_area.getText().split("\\n")) {
            //concat per line with three 
            if (line.length() % 3 != 0) {
                System.out.println("Invalid Input");
                output_area.setText("Invalid Input");
            } else {
                String protein = translate(line);
                output_area.append(protein);
                output_area.append("\n");
            }
        }

    }//GEN-LAST:event_translate_buttonActionPerformed

    private String translate(String sequence) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sequence.length() - 2; i += 3) {

            String codon = sequence.substring(i, i + 3);
            codon = codon.toUpperCase();

            switch (codon) {
                case "TTT":
                case "TTC":
                    sb.append("F");
                    break;
                case "TTA":
                case "TTG":
                case "CTT":
                case "CTC":
                case "CTA":
                case "CTG":
                    sb.append("L");
                    break;
                case "ATT":
                case "ATC":
                case "ATA":
                    sb.append("I");
                    break;
                case "ATG":
                    sb.append("M");
                    break;
                case "GTT":
                case "GTC":
                case "GTA":
                case "GTG":
                    sb.append("V");
                    break;
                case "TCT":
                case "TCC":
                case "TCA":
                case "TCG":
                case "AGT":
                case "AGC":
                    sb.append("S");
                    break;
                case "CCT":
                case "CCC":
                case "CCA":
                case "CCG":
                    sb.append("P");
                    break;
                case "ACT":
                case "ACC":
                case "ACA":
                case "ACG":
                    sb.append("T");
                    break;
                case "GCT":
                case "GCC":
                case "GCA":
                case "GCG":
                    sb.append("A");
                    break;
                case "TAT":
                case "TAC":
                    sb.append("Y");
                    break;
                case "CAT":
                case "CAC":
                    sb.append("H");
                    break;
                case "CAA":
                case "CAG":
                    sb.append("Q");
                    break;
                case "AAT":
                case "AAC":
                    sb.append("N");
                    break;
                case "AAA":
                case "AAG":
                    sb.append("K");
                    break;
                case "GAT":
                case "GAC":
                    sb.append("D");
                    break;
                case "GAA":
                case "GAG":
                    sb.append("E");
                    break;
                case "TGT":
                case "TGC":
                    sb.append("C");
                    break;
                case "TGG":
                    sb.append("W");
                    break;
                case "CGT":
                case "CGC":
                case "CGA":
                case "CGG":
                case "AGA":
                case "AGG":
                    sb.append("R");
                    break;
                case "GGT":
                case "GGC":
                case "GGA":
                case "GGG":
                    sb.append("G");
                    break;
                case "TAA":
                case "TGA":
                case "TAG":
                    sb.append("-STOP-");
                    break;

                default:

            }
        }
        return sb.toString();
    }

    private void input_areaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_input_areaMouseClicked
     
    }//GEN-LAST:event_input_areaMouseClicked

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        output_area.setText("[input]");
        input_area.setText("[output]");
    }//GEN-LAST:event_clear_btnActionPerformed

    private void trend_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trend_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trend_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Anslab1_201337859.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anslab1_201337859.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anslab1_201337859.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anslab1_201337859.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anslab1_201337859().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton expfasta_btn;
    private javax.swing.JButton freq_button;
    private javax.swing.JButton import_button;
    private javax.swing.JTextArea input_area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel main_panel;
    private javax.swing.JTextArea output_area;
    private javax.swing.JButton translate_button;
    private javax.swing.JButton trend_button;
    // End of variables declaration//GEN-END:variables
}

