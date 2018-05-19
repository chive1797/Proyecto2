/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

import Estructuras.Ficha;
import Estructuras.LQueue;
import Estructuras.LinkedList;
import Estructuras.Ventanillas;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rolo
 */
public class Entrega extends javax.swing.JFrame {
    LQueue CopiaNOPER;
    LQueue CopiaPer;
    DefaultListModel listboxNoPer = new DefaultListModel();
    DefaultListModel listboxPer = new DefaultListModel();
    LQueue CopiaFichasNOPER;
    LQueue CopiaFichasPer;
    LQueue AuxPer;
    LQueue AuxNoPer;
    LQueue AdmPer;
    LQueue AdmNoPer;
    LQueue ColaPreHip;
    LinkedList AuxVentanillasNoPere;
    LinkedList AuxVentanillasPere;
    int ContadorNoPerece;
    int ContadorPerecede;
    int ContadorAdultoMayorNoPerece;
    int ContadorAdultoMayorPerecede;
    int ContadorAdultoMayorGener;
    int ContadorEmbarazadaNoPerece;
    int ContadorEmbarazadaPerecede;
    int ContadorEmbarazadaGener;
    int ContadorRegularNoPerece;        
    int ContadorRegularPerecede;
    int ContadorRegularGener;
    int ContadorDiscapacitadoNoPerece;
    int ContadorDiscapacitadoPerecede;
    int ContadorDiscapacitadoGener;

    
    public Entrega() {
        initComponents();
        CopiaNOPER = new LQueue();
        CopiaPer = new LQueue();
        ListaNOPERE.setModel(listboxNoPer);
        ListaPERE.setModel(listboxPer);
        CopiaFichasNOPER = new LQueue();
        CopiaFichasPer= new LQueue();
        AuxPer = new LQueue();
        AuxNoPer = new LQueue();
        AdmPer = new LQueue();
        AdmNoPer = new LQueue();
        AuxVentanillasNoPere= new LinkedList();
        AuxVentanillasPere = new LinkedList();  
        ColaPreHip = new LQueue();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param listaNoPer
     * @param listaPer
     */
    public void GetVentanillaas(LQueue listaNoPer, LQueue listaPer){
        CopiaNOPER= listaNoPer;
        CopiaPer=listaPer;
        
        while(CopiaNOPER.isEmpty()==false){
            Ventanillas nueva = (Ventanillas) CopiaNOPER.first();
            listboxNoPer.addElement(nueva.verName());
            AuxVentanillasNoPere.append(nueva);
            AdmNoPer.enqueue(nueva);
            CopiaNOPER.dequeue();   
        }
        while(CopiaPer.isEmpty()==false){
            Ventanillas nueva1 = (Ventanillas) CopiaPer.first();
            listboxPer.addElement(nueva1.verName());
            AuxVentanillasPere.append(nueva1);
            AdmPer.enqueue(nueva1);
            CopiaPer.dequeue();
        }
        
        
        
    }
    public void copiasContadores(int ContadorNoPerecedero,
    int ContadorPerecedero, 
    int ContadorAdultoMayorNoPerecedero, 
    int ContadorAdultoMayorPerecedero,
    int ContadorAdultoMayorGeneral,
    int ContadorEmbarazadaNoPerecedero,
    int ContadorEmbarazadaPerecedero,
    int ContadorEmbarazadaGeneral,
    int ContadorRegularNoPerecedero,        
    int ContadorRegularPerecedero,
    int ContadorRegularGeneral,
    int ContadorDiscapacitadoNoPerecedero,
    int ContadorDiscapacitadoPerecedero,
    int ContadorDiscapacitadoGeneral){
        
    ContadorNoPerece= ContadorNoPerecedero;
    ContadorPerecede= ContadorPerecedero;
    ContadorAdultoMayorNoPerece=ContadorAdultoMayorNoPerecedero;
    ContadorAdultoMayorPerecede=ContadorAdultoMayorPerecedero;
    ContadorAdultoMayorGener=ContadorAdultoMayorGeneral;
    ContadorEmbarazadaNoPerece=ContadorEmbarazadaNoPerecedero;
    ContadorEmbarazadaPerecede=ContadorEmbarazadaPerecedero;
    ContadorEmbarazadaGener=ContadorEmbarazadaGeneral;
    ContadorRegularNoPerece=ContadorRegularNoPerecedero;        
    ContadorRegularPerecede=ContadorRegularPerecedero;
    ContadorRegularGener=ContadorRegularGeneral;
    ContadorDiscapacitadoNoPerece=ContadorDiscapacitadoNoPerecedero;
    ContadorDiscapacitadoPerecede=ContadorDiscapacitadoPerecedero;
    ContadorDiscapacitadoGener=ContadorDiscapacitadoGeneral;
        
    }
    public void GetFichas(LQueue FichasNoPer, LQueue FichasPer){
        CopiaFichasNOPER = FichasNoPer;
        CopiaFichasPer = FichasPer;
        while (CopiaFichasNOPER.isEmpty()==false){
            Ficha noper = (Ficha) CopiaFichasNOPER.first();
            AuxNoPer.enqueue(noper);
            
            CopiaFichasNOPER.dequeue();
        }
        while (CopiaFichasPer.isEmpty()==false){
            Ficha per = (Ficha) CopiaFichasPer.first();
            AuxPer.enqueue(per);
            
            CopiaFichasPer.dequeue();
            
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListadeVentanillasNoPer = new javax.swing.JScrollPane();
        ListaNOPERE = new javax.swing.JList<>();
        ListadeVentanillasPer = new javax.swing.JScrollPane();
        ListaPERE = new javax.swing.JList<>();
        VerVentanillasNoPere = new javax.swing.JButton();
        VentanaName = new javax.swing.JLabel();
        Estado = new javax.swing.JLabel();
        AtendiendoTag = new javax.swing.JLabel();
        EstadoV = new javax.swing.JLabel();
        AtenderNOPERE = new javax.swing.JButton();
        Ficha = new javax.swing.JLabel();
        NEXT = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        VentanasNoPer = new javax.swing.JLabel();
        VentanasPer = new javax.swing.JLabel();
        VerVentanillasPere = new javax.swing.JButton();
        VentanaName2 = new javax.swing.JLabel();
        EstadoLb = new javax.swing.JLabel();
        AtendiendoLb = new javax.swing.JLabel();
        EstadoV2 = new javax.swing.JLabel();
        Ficha2 = new javax.swing.JLabel();
        AtenderPere = new javax.swing.JButton();
        NextPere = new javax.swing.JButton();
        ClosePere = new javax.swing.JButton();
        GoSeguridad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListadeVentanillasNoPer.setViewportView(ListaNOPERE);

        getContentPane().add(ListadeVentanillasNoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 140));

        ListadeVentanillasPer.setViewportView(ListaPERE);

        getContentPane().add(ListadeVentanillasPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, -1));

        VerVentanillasNoPere.setText("Ver Ventanillas");
        VerVentanillasNoPere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerVentanillasNoPereMouseClicked(evt);
            }
        });
        getContentPane().add(VerVentanillasNoPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        VentanaName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VentanaName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(VentanaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 120, 20));

        Estado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Estado.setText("Estado");
        getContentPane().add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 40, 20));

        AtendiendoTag.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AtendiendoTag.setText("Atendiendo: ");
        getContentPane().add(AtendiendoTag, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 80, 20));

        EstadoV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EstadoV.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(EstadoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 90, 20));

        AtenderNOPERE.setText("Atender");
        AtenderNOPERE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtenderNOPEREMouseClicked(evt);
            }
        });
        getContentPane().add(AtenderNOPERE, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 80, -1));

        Ficha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(Ficha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 140, 30));

        NEXT.setText("Siguiente");
        NEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NEXTMouseClicked(evt);
            }
        });
        getContentPane().add(NEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 80, -1));

        Cerrar.setText("Cerrar");
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        getContentPane().add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 80, -1));

        VentanasNoPer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VentanasNoPer.setText("Ventanas No Perecederos");
        VentanasNoPer.setToolTipText("");
        getContentPane().add(VentanasNoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 160, 30));

        VentanasPer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VentanasPer.setText("Ventanas Perecederos");
        getContentPane().add(VentanasPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 204, 150, 30));

        VerVentanillasPere.setText("Ver Ventanillas");
        VerVentanillasPere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerVentanillasPereMouseClicked(evt);
            }
        });
        getContentPane().add(VerVentanillasPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 110, -1));

        VentanaName2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        VentanaName2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(VentanaName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 110, 20));

        EstadoLb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EstadoLb.setText("Estado:");
        getContentPane().add(EstadoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        AtendiendoLb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AtendiendoLb.setText("Atendiendo:");
        getContentPane().add(AtendiendoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        EstadoV2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EstadoV2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(EstadoV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 274, 90, 20));

        Ficha2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Ficha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 130, 30));

        AtenderPere.setText("Atender");
        AtenderPere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AtenderPereMouseClicked(evt);
            }
        });
        getContentPane().add(AtenderPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 80, -1));

        NextPere.setText("Siguiente");
        NextPere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextPereMouseClicked(evt);
            }
        });
        getContentPane().add(NextPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 80, -1));

        ClosePere.setText("Cerrar");
        ClosePere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosePereMouseClicked(evt);
            }
        });
        getContentPane().add(ClosePere, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 80, -1));

        GoSeguridad.setText("Seguridad");
        GoSeguridad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoSeguridadMouseClicked(evt);
            }
        });
        GoSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoSeguridadActionPerformed(evt);
            }
        });
        getContentPane().add(GoSeguridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerVentanillasNoPereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerVentanillasNoPereMouseClicked
        int SelecNoPer =ListaNOPERE.getSelectedIndex();
        AuxVentanillasNoPere.goToPos(SelecNoPer);
        Ventanillas Ventana = (Ventanillas) AuxVentanillasNoPere.getElement();
        
        VentanaName.setText(Ventana.verName());
        //Ventana.SetEstado("Abierto");
        EstadoV.setText(Ventana.verEstado());
        String x=Ventana.GetAtendiendo();
        System.out.println(Ventana.verVentanas());
        System.out.println(x);
        Ficha.setText(x);
        
        
    }//GEN-LAST:event_VerVentanillasNoPereMouseClicked

    private void AtenderNOPEREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtenderNOPEREMouseClicked
        
        int SelecNoPer =ListaNOPERE.getSelectedIndex();
        AuxVentanillasNoPere.goToPos(SelecNoPer);
        Ventanillas Ventana = (Ventanillas) AuxVentanillasNoPere.getElement();
        System.out.println(Ventana.verName());
        
        
        if(AuxNoPer.isEmpty()==false){
            Ventana.SetEstado("Abierta");
            EstadoV.setText("Abierta");
            Ficha Atendiendo = (Ficha) AuxNoPer.first();
            String ficha = Atendiendo.view();
            ColaPreHip.enqueue(Atendiendo);
            Ficha.setText(ficha);
            Ventana.SetAtendiendo(ficha);
            Ventana.ClientesPlus();
            AuxNoPer.dequeue();
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay cola");
            EstadoV.setText("Cerrada");
            return;
        }
        
    }//GEN-LAST:event_AtenderNOPEREMouseClicked

    private void NEXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NEXTMouseClicked
        if("Cerrada".equals(EstadoV.getText())){
            JOptionPane.showMessageDialog(null, "La ventana esta cerrada"); 
            return;
        }
        else if(AuxNoPer.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "La Cola esta vacia"); 
            return;
        }
        else{
            int SelecNoPer =ListaNOPERE.getSelectedIndex();
            AuxVentanillasNoPere.goToPos(SelecNoPer);
            Ventanillas Ventana = (Ventanillas) AuxVentanillasNoPere.getElement();
            Ventana.ClientesPlus();
            Ficha Atendiendo = (Ficha) AuxNoPer.first();
            ColaPreHip.enqueue(Atendiendo);
            String ficha = Atendiendo.view();
            Ficha.setText(ficha);
            Ventana.SetAtendiendo(ficha);
            AuxNoPer.dequeue();
        }
        
    }//GEN-LAST:event_NEXTMouseClicked

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        EstadoV.setText("Cerrada");
        int SelecNoPer =ListaNOPERE.getSelectedIndex();
        AuxVentanillasNoPere.goToPos(SelecNoPer);
        Ventanillas Ventana = (Ventanillas) AuxVentanillasNoPere.getElement();
        Ventana.SetEstado("Cerrado");
        Ventana.SetCerrar("Cerrada");
        Ficha.setText("");
        
    }//GEN-LAST:event_CerrarMouseClicked

    private void GoSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoSeguridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoSeguridadActionPerformed

    private void AtenderPereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AtenderPereMouseClicked
       int SelecPer =ListaPERE.getSelectedIndex();
        AuxVentanillasPere.goToPos(SelecPer);
        Ventanillas Ventana = (Ventanillas) AuxVentanillasPere.getElement();
        Ventana.ClientesPlus();
        System.out.println(Ventana.verName());
        
        
        if(AuxPer.isEmpty()==false){
            Ventana.SetEstado("Abierta");
            EstadoV2.setText("Abierta");
            Ficha Atendiendo = (Ficha) AuxPer.first();
            ColaPreHip.enqueue(Atendiendo);
            String ficha = Atendiendo.view();
            Ficha2.setText(ficha);
            Ventana.SetAtendiendo(ficha);
            AuxPer.dequeue();
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay cola");
            EstadoV2.setText("Cerrada");
            return;
        } 
    }//GEN-LAST:event_AtenderPereMouseClicked

    private void NextPereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextPereMouseClicked
    if("Cerrada".equals(EstadoV2.getText())){
            JOptionPane.showMessageDialog(null, "La ventana esta cerrada"); 
            return;
        }
        else if(AuxPer.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "La Cola esta vacia"); 
            return;
        }
        else{
            int SelecEje =ListaPERE.getSelectedIndex();
            AuxVentanillasPere.goToPos(SelecEje);
            Ventanillas Ventana = (Ventanillas) AuxVentanillasPere.getElement();
            Ventana.ClientesPlus();
            Ficha Atendiendo = (Ficha) AuxPer.first();
            ColaPreHip.enqueue(Atendiendo);
            String ficha = Atendiendo.view();
            Ficha2.setText(ficha);
            Ventana.SetAtendiendo(ficha);
            AuxPer.dequeue();
        }
    
    }//GEN-LAST:event_NextPereMouseClicked

    private void ClosePereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosePereMouseClicked
        EstadoV2.setText("Cerrada");
        int SelecEje =ListaPERE.getSelectedIndex();
        AuxVentanillasPere.goToPos(SelecEje);
        Ventanillas Ventana = (Ventanillas) AuxVentanillasPere.getElement();
        Ventana.SetEstado("Cerrado");
        Ventana.SetCerrar("Cerrada");
        Ficha2.setText("");
    }//GEN-LAST:event_ClosePereMouseClicked

    private void VerVentanillasPereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerVentanillasPereMouseClicked
        
        int SelecEje =ListaPERE.getSelectedIndex();
        AuxVentanillasPere.goToPos(SelecEje);
        Ventanillas Ventana = (Ventanillas) AuxVentanillasPere.getElement();
        
        String c = Ventana.ShowClientes()+"";
        
        
        VentanaName2.setText(Ventana.verName());
        //Ventana.SetEstado("Abierto");
        EstadoV2.setText(Ventana.verEstado());
        String x=Ventana.GetAtendiendo();
        System.out.println(Ventana.verVentanas());
        System.out.println(x);
        Ficha2.setText(x);
    }//GEN-LAST:event_VerVentanillasPereMouseClicked

    private void GoSeguridadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoSeguridadMouseClicked
        
        Seguridad segu = new Seguridad();
        segu.GetCola(ColaPreHip);
        segu.setVisible(true);
        segu.GetFichas1(AdmNoPer, AdmPer);
        segu.copiasContadores2(ContadorNoPerece, ContadorPerecede, ContadorAdultoMayorNoPerece, ContadorAdultoMayorPerecede, ContadorAdultoMayorGener, 
                ContadorEmbarazadaNoPerece, ContadorEmbarazadaPerecede, ContadorEmbarazadaGener, ContadorRegularNoPerece, 
                ContadorRegularPerecede, ContadorRegularGener, ContadorDiscapacitadoNoPerece, ContadorDiscapacitadoPerecede, ContadorDiscapacitadoGener);
        
        System.out.println(ContadorNoPerece +" "+ContadorPerecede+" "+ ContadorAdultoMayorNoPerece+" "+ContadorAdultoMayorPerecede+" "+
                ContadorAdultoMayorGener+" "+ContadorEmbarazadaNoPerece+" "+ ContadorEmbarazadaPerecede+" "+
                ContadorEmbarazadaGener+" "+ContadorRegularNoPerece+" "+ContadorRegularPerecede+" "+
                ContadorRegularGener+" "+ContadorDiscapacitadoNoPerece+" "+ContadorDiscapacitadoPerecede+" "+ ContadorDiscapacitadoGener);
    }//GEN-LAST:event_GoSeguridadMouseClicked
        
        
            

   
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
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtenderNOPERE;
    private javax.swing.JButton AtenderPere;
    private javax.swing.JLabel AtendiendoLb;
    private javax.swing.JLabel AtendiendoTag;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton ClosePere;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel EstadoLb;
    private javax.swing.JLabel EstadoV;
    private javax.swing.JLabel EstadoV2;
    private javax.swing.JLabel Ficha;
    private javax.swing.JLabel Ficha2;
    private javax.swing.JButton GoSeguridad;
    private javax.swing.JList<String> ListaNOPERE;
    private javax.swing.JList<String> ListaPERE;
    private javax.swing.JScrollPane ListadeVentanillasNoPer;
    private javax.swing.JScrollPane ListadeVentanillasPer;
    private javax.swing.JButton NEXT;
    private javax.swing.JButton NextPere;
    private javax.swing.JLabel VentanaName;
    private javax.swing.JLabel VentanaName2;
    private javax.swing.JLabel VentanasNoPer;
    private javax.swing.JLabel VentanasPer;
    private javax.swing.JButton VerVentanillasNoPere;
    private javax.swing.JButton VerVentanillasPere;
    // End of variables declaration//GEN-END:variables
}
