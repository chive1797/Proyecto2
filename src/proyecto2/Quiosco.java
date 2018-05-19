/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Estructuras.LQueue;
import Estructuras.Ficha;
import javax.swing.JOptionPane;


public class Quiosco extends javax.swing.JFrame {

    //Variables de Quiosco
    LQueue ColaPerecederoDiscapacitados;
    LQueue AuxPerecederoDis;
    LQueue ColaPerecederoViejos;
    LQueue AuxPerecederoVie;
    LQueue ColaPerecederoEmbarazada;
    LQueue AuxPerecederoEmba;
    LQueue ColaPerecederoRegular;
    LQueue AuxPerecederoReg;
    
    LQueue ColaNoPerecederoEmbarazada;
    LQueue AuxNoPerecederoEmba;
    LQueue ColaNoPerecederoDiscapacitados;
    LQueue AuxNoPerecederoDis;
    LQueue ColaNoPerecederoRegular;
    LQueue AuxNoPerecederoReg;
    LQueue ColaNoPerecederoViejos;
    LQueue AuxNoPerecederoVie;
    
    LQueue ColaPerecedero;
    LQueue ColaNoPerecedero;
    
    LQueue auxNOPER;
    LQueue auxPER;
    
    int ContadorNoPere=0;
    int ContadorPere=0;
    int ContadorViejitosNoPere=0;
    int ContadorViejitosPere=0;
    int ContadorViejitosGeneral=0;
    int ContadorEmbarazadaNoPere=0;
    int ContadorEmbarazadaPere=0;
    int ContadorEmbarazadaGeneral=0;
    int ContadorRegularNoPere=0;        
    int ContadorRegularPere=0;
    int ContadorRegularGeneral=0;
    int ContadorDiscapacitadoNoPere=0;
    int ContadorDiscapacitadoPere=0;
    int ContadorDiscapacitadoGeneral=0;
    
    
    Ficha NuevaFicha;
    public Quiosco() {
        initComponents();
        //Creamos las colas anteriores
        ColaPerecederoDiscapacitados = new LQueue();
        AuxPerecederoDis= new LQueue();
        
        ColaPerecederoViejos = new LQueue();
        AuxPerecederoVie= new LQueue();
        ColaPerecederoEmbarazada = new LQueue();
        AuxPerecederoEmba= new LQueue();
        ColaPerecederoRegular = new LQueue();
        AuxPerecederoReg = new LQueue();
       
       
        ColaNoPerecederoEmbarazada = new LQueue();
        AuxNoPerecederoEmba= new LQueue();
        ColaNoPerecederoDiscapacitados = new LQueue();
        AuxNoPerecederoDis= new LQueue();
        ColaNoPerecederoRegular = new LQueue();
        AuxNoPerecederoReg= new LQueue();
        ColaNoPerecederoViejos = new LQueue();
        AuxNoPerecederoVie= new LQueue();
        
        ColaPerecedero = new LQueue();
        ColaNoPerecedero= new LQueue();
        auxNOPER = new LQueue();
        auxPER = new LQueue();
        
        
                
    }

    public void GetVentanillaAUX(LQueue listaNoPerecedero, LQueue listaPerecedero){
        auxNOPER= listaNoPerecedero;
        auxPER=listaPerecedero;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbTituloVentana = new javax.swing.JLabel();
        TagClase = new javax.swing.JLabel();
        TagPrioridad = new javax.swing.JLabel();
        TagNumFicha = new javax.swing.JLabel();
        TagSeleccion = new javax.swing.JLabel();
        TagTipoCliente = new javax.swing.JLabel();
        BtnPerecedero = new javax.swing.JButton();
        BtnNoPerecedero = new javax.swing.JButton();
        BtnEmbarazada = new javax.swing.JButton();
        BtnDisca = new javax.swing.JButton();
        BtnViejitos = new javax.swing.JButton();
        BtnRegular = new javax.swing.JButton();
        TagTipo = new javax.swing.JLabel();
        TagNivelPrioridad = new javax.swing.JLabel();
        TagNum = new javax.swing.JLabel();
        TagSelecName = new javax.swing.JLabel();
        TagSelecCorreo = new javax.swing.JLabel();
        SetName = new javax.swing.JTextField();
        SetCelular = new javax.swing.JTextField();
        BtnFicha = new javax.swing.JButton();
        EnviarMsj = new javax.swing.JButton();
        GetEntrega = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        TagSelecName1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(1, 1));
        setMinimumSize(new java.awt.Dimension(550, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(550, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbTituloVentana.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        LbTituloVentana.setText("Quiosco de Autoservicio");
        getContentPane().add(LbTituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 20));

        TagClase.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(TagClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 130, 30));

        TagPrioridad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(TagPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 140, 30));

        TagNumFicha.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(TagNumFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 50, 30));

        TagSeleccion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TagSeleccion.setText("Tipo de paquete:");
        getContentPane().add(TagSeleccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        TagTipoCliente.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TagTipoCliente.setText("Nivel de Prioridad:");
        getContentPane().add(TagTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        BtnPerecedero.setText("Perecedero");
        BtnPerecedero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPerecederoMouseClicked(evt);
            }
        });
        BtnPerecedero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPerecederoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPerecedero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 130, 50));

        BtnNoPerecedero.setText("No perecedero");
        BtnNoPerecedero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnNoPerecederoMouseClicked(evt);
            }
        });
        BtnNoPerecedero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNoPerecederoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNoPerecedero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 50));

        BtnEmbarazada.setText("Embarazada");
        BtnEmbarazada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEmbarazadaMouseClicked(evt);
            }
        });
        getContentPane().add(BtnEmbarazada, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 140, 40));

        BtnDisca.setText("Discapacitados");
        BtnDisca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDiscaMouseClicked(evt);
            }
        });
        BtnDisca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDiscaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDisca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 140, 40));

        BtnViejitos.setText("Adulto Mayor");
        BtnViejitos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnViejitosMouseClicked(evt);
            }
        });
        getContentPane().add(BtnViejitos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 130, 40));

        BtnRegular.setText("Regular");
        BtnRegular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegularMouseClicked(evt);
            }
        });
        getContentPane().add(BtnRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 130, 40));

        TagTipo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TagTipo.setText("Paquete:");
        getContentPane().add(TagTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        TagNivelPrioridad.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TagNivelPrioridad.setText("Prioridad:");
        getContentPane().add(TagNivelPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        TagNum.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TagNum.setText("Número:");
        getContentPane().add(TagNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        TagSelecName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TagSelecName.setText("Correo:");
        getContentPane().add(TagSelecName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        TagSelecCorreo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TagSelecCorreo.setText("Numero de celular:");
        getContentPane().add(TagSelecCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 140, 30));

        SetName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetNameActionPerformed(evt);
            }
        });
        getContentPane().add(SetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, 30));
        getContentPane().add(SetCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 160, 30));

        BtnFicha.setText("Obtener Ficha");
        BtnFicha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnFichaMouseClicked(evt);
            }
        });
        BtnFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFichaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 170, 50));

        EnviarMsj.setText("Enviar Mensaje de texto");
        EnviarMsj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnviarMsjMouseClicked(evt);
            }
        });
        getContentPane().add(EnviarMsj, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, 50));

        GetEntrega.setText("Entrega");
        GetEntrega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GetEntregaMouseClicked(evt);
            }
        });
        GetEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetEntregaActionPerformed(evt);
            }
        });
        getContentPane().add(GetEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 150, 50));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 150, 30));

        TagSelecName1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TagSelecName1.setText("Nombre:");
        getContentPane().add(TagSelecName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPerecederoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPerecederoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnPerecederoActionPerformed

    private void SetNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetNameActionPerformed

    private void BtnPerecederoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPerecederoMouseClicked

      String Perecedero;
      Perecedero = "Perecedero";
      TagClase.setText(Perecedero);
    }//GEN-LAST:event_BtnPerecederoMouseClicked

    private void BtnNoPerecederoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNoPerecederoMouseClicked

      String NoPerecedero;
      NoPerecedero = "No perecedero";
      TagClase.setText(NoPerecedero);
    }//GEN-LAST:event_BtnNoPerecederoMouseClicked

    private void BtnEmbarazadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEmbarazadaMouseClicked
      String Embarazada;
      Embarazada = "Embarazada";
      TagPrioridad.setText(Embarazada);
      
     
    int Numero;
    String Ficha;
    ContadorEmbarazadaGeneral+=1;
    if ("Perecedero".equals(TagClase.getText())){
        ContadorEmbarazadaPere+=1;
        ContadorPere+=1;
        if("Embarazada".equals(TagPrioridad.getText())){
            Numero = ColaPerecederoEmbarazada.size();
            Numero+=1;
            Ficha=Numero+"";
            
            TagNumFicha.setText(Ficha);   
        }
       
    }
    if ("No perecedero".equals(TagClase.getText())){
        ContadorNoPere+=1;
        ContadorEmbarazadaNoPere+=1;
        if("Embarazada".equals(TagPrioridad.getText())){
            Numero = ColaNoPerecederoEmbarazada.size();
            Numero+=1;
            Ficha=Numero+"";
            
            TagNumFicha.setText(Ficha);
            
        }
        
    }
   
    }//GEN-LAST:event_BtnEmbarazadaMouseClicked

    private void BtnDiscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDiscaMouseClicked
      String Discapacitados;
      Discapacitados = "Discapacitado";
      TagPrioridad.setText(Discapacitados);

      
    int Numero;
    String Ficha;
    ContadorDiscapacitadoGeneral+=1;
    if ("Perecedero".equals(TagClase.getText())){
      ContadorPere+=1;
      ContadorDiscapacitadoPere+=1;
      
       if ("Discapacitado".equals(TagPrioridad.getText())){
            Numero = ColaPerecederoDiscapacitados.size();
            Numero+=1;
            Ficha=Numero+"";
            
            TagNumFicha.setText(Ficha);
        }
      
        } 
    if ("No perecedero".equals(TagClase.getText())){
        ContadorNoPere+=1;
        ContadorDiscapacitadoNoPere+=1;
       if ("Discapacitado".equals(TagPrioridad.getText())){
            Numero = ColaNoPerecederoDiscapacitados.size();
            Numero+=1;
            Ficha=Numero+"";
            TagNumFicha.setText(Ficha);
        }
  
        } 
  
    }//GEN-LAST:event_BtnDiscaMouseClicked

    private void BtnViejitosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnViejitosMouseClicked
      String TercerEdad;
      TercerEdad = "Adulto Mayor";
      TagPrioridad.setText(TercerEdad);
      
     
      int Numero;
      String Ficha;
      ContadorViejitosGeneral+=1;
      if ("Perecedero".equals(TagClase.getText())){
         ContadorPere+=1;
         ContadorViejitosPere+=1;
         if("Adulto Mayor".equals(TagPrioridad.getText())){
            Numero = ColaPerecederoViejos.size();
            Numero+=1;
            Ficha=Numero+"";
            
            TagNumFicha.setText(Ficha);
        }
         
      }
      if ("No perecedero".equals(TagClase.getText())){
          ContadorNoPere+=1;
          ContadorViejitosNoPere+=1;
      
         if("Adulto Mayor".equals(TagPrioridad.getText())){
            Numero = ColaNoPerecederoViejos.size();
            Numero+=1;
            Ficha=Numero+"";
            
            TagNumFicha.setText(Ficha);
        }
     
      }

    }//GEN-LAST:event_BtnViejitosMouseClicked

    private void BtnRegularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegularMouseClicked
      String Regular;
      Regular = "Regular";
      TagPrioridad.setText(Regular);
 
      int Numero;
      String Ficha;
      ContadorRegularGeneral+=1;
      if ("Perecedero".equals(TagClase.getText())){
          ContadorPere+=1;
          ContadorRegularPere+=1;
          if("Regular".equals(TagPrioridad.getText())){
            Numero = ColaPerecederoRegular.size();
            Numero+=1;
            Ficha=Numero+"";
            TagNumFicha.setText(Ficha);
          }
          
      }
      if ("No perecedero".equals(TagClase.getText())){
          ContadorNoPere+=1;
          ContadorRegularNoPere+=1;
          if("Regular".equals(TagPrioridad.getText())){
            Numero = ColaNoPerecederoRegular.size();
            Numero+=1;
            Ficha=Numero+"";
            TagNumFicha.setText(Ficha);
          }
      }
    
    
    }//GEN-LAST:event_BtnRegularMouseClicked

    private void BtnFichaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFichaMouseClicked
    //Introducimos los valores que se encuentran en los tags
    String FichaTag = TagClase.getText()+", " + TagPrioridad.getText()+ ", "+ TagNumFicha.getText() ; 
    String Tipo = TagClase.getText();
    String Priori= TagPrioridad.getText();
    String Num = TagNumFicha.getText();
  
 
    if (Tipo == "" ||Priori == "" || Num==""){
        JOptionPane.showMessageDialog(null, "Tiene que llenar todos los espacios");
        return;
    }

    if ("Perecedero".equals(TagClase.getText())){
        if("Embarazada".equals(TagPrioridad.getText())){
            Ficha NuevaFichaE = new Ficha(Tipo, Priori, Num);
            NuevaFichaE.getCodigo();
            ColaPerecederoEmbarazada.enqueue(NuevaFichaE);
            AuxPerecederoEmba.enqueue(NuevaFichaE);
        }
       
        else if ("Discapacitado".equals(TagPrioridad.getText())){
            Ficha NuevaFichaD = new Ficha(Tipo, Priori, Num);
            NuevaFichaD.getCodigo();
            ColaPerecederoDiscapacitados.enqueue(NuevaFichaD);
            AuxPerecederoDis.enqueue(NuevaFichaD);
        }
        
        else if("Adulto Mayor".equals(TagPrioridad.getText())){
            Ficha NuevaFichaV = new Ficha(Tipo, Priori, Num);
            NuevaFichaV.getCodigo();
            ColaPerecederoViejos.enqueue(NuevaFichaV);
            AuxPerecederoVie.enqueue(NuevaFichaV);
        }
        else{
            Ficha NuevaFichaR = new Ficha(Tipo, Priori, Num);
            NuevaFichaR.getCodigo();
            ColaPerecederoRegular.enqueue(NuevaFichaR);
            AuxPerecederoReg.enqueue(NuevaFichaR);
        }
        
    }
    if ("No perecedero".equals(TagClase.getText())){
        
        if("Embarazada".equals(TagPrioridad.getText())){
            Ficha NuevaFichaE = new Ficha(Tipo, Priori, Num);
            NuevaFichaE.getCodigo();
            ColaNoPerecederoEmbarazada.enqueue(NuevaFichaE);
            AuxNoPerecederoEmba.enqueue(NuevaFichaE);
    }
        else if("Discapacitado".equals(TagPrioridad.getText())){
            Ficha NuevaFichaD = new Ficha(Tipo, Priori, Num);
            NuevaFichaD.getCodigo();
            ColaNoPerecederoDiscapacitados.enqueue(NuevaFichaD);
            AuxNoPerecederoDis.enqueue(NuevaFichaD);
    }
        else if("Adulto Mayor".equals(TagPrioridad.getText())){
            Ficha NuevaFichaV = new Ficha(Tipo, Priori, Num);
            NuevaFichaV.getCodigo();
            ColaNoPerecederoViejos.enqueue(NuevaFichaV);
            AuxNoPerecederoVie.enqueue(NuevaFichaV);
    }
        else{
            Ficha NuevaFichaR = new Ficha(Tipo, Priori, Num);
            NuevaFichaR.getCodigo();
            ColaNoPerecederoRegular.enqueue(NuevaFichaR);
            AuxNoPerecederoReg.enqueue(NuevaFichaR);
    }
    }
    TagClase.setText("");
    TagPrioridad.setText("");
    TagNumFicha.setText("");
    
    }//GEN-LAST:event_BtnFichaMouseClicked

    private void EnviarMsjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarMsjMouseClicked

    }//GEN-LAST:event_EnviarMsjMouseClicked

    private void GetEntregaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetEntregaMouseClicked
        Entrega checkin = new Entrega();
        checkin.setVisible(true);
        
        

        
        if(ColaPerecederoDiscapacitados.size()>0){
            while(AuxPerecederoDis.isEmpty()!=true){
                Ficha Discapa = (Ficha) AuxPerecederoDis.first();
                ColaPerecedero.enqueue(Discapa);
                AuxPerecederoDis.dequeue();
           }
        }
        if(ColaPerecederoViejos.size()>0){
            while(AuxPerecederoVie.isEmpty()!=true){
                Ficha Viejos = (Ficha) AuxPerecederoVie.first();
                ColaPerecedero.enqueue(Viejos);
                AuxPerecederoVie.dequeue();
            }
        }
        if(ColaPerecederoEmbarazada.size()>0){
            while(AuxPerecederoEmba.isEmpty()!=true){
                Ficha Viejos = (Ficha) AuxPerecederoEmba.first();
                ColaPerecedero.enqueue(Viejos);
                AuxPerecederoEmba.dequeue();
            }
        }
        if(ColaPerecederoRegular.size()>0){
            while(AuxPerecederoReg.isEmpty()!=true){
                Ficha Viejos = (Ficha) AuxPerecederoReg.first();
                ColaPerecedero.enqueue(Viejos);
                AuxPerecederoReg.dequeue();
            }
        }
        if(ColaNoPerecederoDiscapacitados.size()>0){
            while(AuxNoPerecederoDis.isEmpty()!=true){
                Ficha Discapa = (Ficha) AuxNoPerecederoDis.first();
                ColaNoPerecedero.enqueue(Discapa);
                AuxNoPerecederoDis.dequeue();
           }
        }
        if(ColaNoPerecederoViejos.size()>0){
            while(AuxNoPerecederoVie.isEmpty()!=true){
                Ficha Viejos = (Ficha) AuxNoPerecederoVie.first();
                ColaNoPerecedero.enqueue(Viejos);
                AuxNoPerecederoVie.dequeue();
            }
        }
        if(ColaNoPerecederoEmbarazada.size()>0){
            while(AuxNoPerecederoEmba.isEmpty()!=true){
                Ficha Viejos = (Ficha) AuxNoPerecederoEmba.first();
                ColaNoPerecedero.enqueue(Viejos);
                AuxNoPerecederoEmba.dequeue();
            }
        }
        if(ColaNoPerecederoRegular.size()>0){
            while(AuxNoPerecederoReg.isEmpty()!=true){
                Ficha Viejos = (Ficha) AuxNoPerecederoReg.first();
                ColaNoPerecedero.enqueue(Viejos);
                AuxNoPerecederoReg.dequeue();
            }
        }
       
        //Se envian las colas a las siguientes ventanas
        checkin.GetFichas(ColaNoPerecedero,ColaPerecedero);
        checkin.GetVentanillaas(auxNOPER, auxPER);
        checkin.copiasContadores(ContadorNoPere, ContadorPere, ContadorViejitosNoPere, ContadorViejitosPere, ContadorViejitosGeneral, ContadorEmbarazadaNoPere, ContadorEmbarazadaPere, ContadorEmbarazadaGeneral, ContadorRegularNoPere, ContadorRegularPere, ContadorRegularGeneral, ContadorDiscapacitadoNoPere, ContadorDiscapacitadoPere, ContadorDiscapacitadoGeneral);
        
        this.setVisible(false);
        
        
        
        
                

    }//GEN-LAST:event_GetEntregaMouseClicked

    private void GetEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetEntregaActionPerformed

    private void BtnFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFichaActionPerformed

    private void BtnNoPerecederoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNoPerecederoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNoPerecederoActionPerformed

    private void BtnDiscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDiscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDiscaActionPerformed


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
            java.util.logging.Logger.getLogger(Quiosco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiosco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiosco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiosco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiosco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDisca;
    private javax.swing.JButton BtnEmbarazada;
    private javax.swing.JButton BtnFicha;
    private javax.swing.JButton BtnNoPerecedero;
    private javax.swing.JButton BtnPerecedero;
    private javax.swing.JButton BtnRegular;
    private javax.swing.JButton BtnViejitos;
    private javax.swing.JButton EnviarMsj;
    private javax.swing.JButton GetEntrega;
    private javax.swing.JLabel LbTituloVentana;
    private javax.swing.JTextField SetCelular;
    private javax.swing.JTextField SetName;
    private javax.swing.JLabel TagClase;
    private javax.swing.JLabel TagNivelPrioridad;
    private javax.swing.JLabel TagNum;
    private javax.swing.JLabel TagNumFicha;
    private javax.swing.JLabel TagPrioridad;
    private javax.swing.JLabel TagSelecCorreo;
    private javax.swing.JLabel TagSelecName;
    private javax.swing.JLabel TagSelecName1;
    private javax.swing.JLabel TagSeleccion;
    private javax.swing.JLabel TagTipo;
    private javax.swing.JLabel TagTipoCliente;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
