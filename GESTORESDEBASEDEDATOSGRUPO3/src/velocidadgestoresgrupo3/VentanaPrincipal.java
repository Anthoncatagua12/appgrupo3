package velocidadgestoresgrupo3;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anthony Moreira
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public VentanaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTid = new javax.swing.JTextField();
        TXTdescripcion = new javax.swing.JTextField();
        TXTcosto = new javax.swing.JTextField();
        TXTprecio = new javax.swing.JTextField();
        BTNconexionSQLite = new javax.swing.JButton();
        BTNconexiontimescaledb = new javax.swing.JButton();
        BTNconexionmariadb = new javax.swing.JButton();
        BTNinsercion_timescale_lmd = new javax.swing.JButton();
        BTNinsercion_SQLite_lmd = new javax.swing.JButton();
        BTNinsercion_maria_lmd = new javax.swing.JButton();
        BTNborrarTimescale = new javax.swing.JButton();
        BTNborrarSQLite = new javax.swing.JButton();
        BTNborrarMaria = new javax.swing.JButton();
        TXTresultado_lmd_SQLite = new javax.swing.JTextField();
        BTNinsercion_SQLite_sp = new javax.swing.JButton();
        TXTresultado_sp_cassandra = new javax.swing.JTextField();
        BTNinsercion_Maria_sp = new javax.swing.JButton();
        TXTresultado_sp_timescale = new javax.swing.JTextField();
        TXTresultado_lmd_timescale = new javax.swing.JTextField();
        BTNinsercion_Timescale_sp = new javax.swing.JButton();
        TXTresultado_lmd_maria = new javax.swing.JTextField();
        TXTresultado_sp_maria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("id:");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 3));

        jLabel2.setText("descripción:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 3));

        jLabel3.setText("costo:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 3));

        jLabel4.setText("precio:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 3));

        TXTid.setText("1");
        TXTid.setToolTipText("");
        TXTid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 3));
        TXTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTidActionPerformed(evt);
            }
        });

        TXTdescripcion.setText("Computadora");
        TXTdescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 3));

        TXTcosto.setText("600");
        TXTcosto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 3));

        TXTprecio.setText("1000");
        TXTprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204), 3));

        BTNconexionSQLite.setText("SQLite");
        BTNconexionSQLite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 2));
        BTNconexionSQLite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNconexionSQLiteActionPerformed(evt);
            }
        });

        BTNconexiontimescaledb.setText("TimescaleDB");
        BTNconexiontimescaledb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 2));
        BTNconexiontimescaledb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNconexiontimescaledbActionPerformed(evt);
            }
        });

        BTNconexionmariadb.setText("MariaDB");
        BTNconexionmariadb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 2));
        BTNconexionmariadb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNconexionmariadbActionPerformed(evt);
            }
        });

        BTNinsercion_timescale_lmd.setText("Inserciones en Timescale con LMD");
        BTNinsercion_timescale_lmd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        BTNinsercion_timescale_lmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsercion_timescale_lmdActionPerformed(evt);
            }
        });

        BTNinsercion_SQLite_lmd.setText("Inserciones en SQLite  con LMD");
        BTNinsercion_SQLite_lmd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        BTNinsercion_SQLite_lmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsercion_SQLite_lmdActionPerformed(evt);
            }
        });

        BTNinsercion_maria_lmd.setText("Inserciones en Maria con LMD");
        BTNinsercion_maria_lmd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        BTNinsercion_maria_lmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsercion_maria_lmdActionPerformed(evt);
            }
        });

        BTNborrarTimescale.setText("Borrando registros Timescale");
        BTNborrarTimescale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        BTNborrarTimescale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNborrarTimescaleActionPerformed(evt);
            }
        });

        BTNborrarSQLite.setText("Borrando registros SQLite");
        BTNborrarSQLite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        BTNborrarSQLite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNborrarSQLiteActionPerformed(evt);
            }
        });

        BTNborrarMaria.setText("Borrando registros  Maria");
        BTNborrarMaria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        BTNborrarMaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNborrarMariaActionPerformed(evt);
            }
        });

        TXTresultado_lmd_SQLite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        TXTresultado_lmd_SQLite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTresultado_lmd_SQLiteActionPerformed(evt);
            }
        });

        BTNinsercion_SQLite_sp.setText("Inserciones en SQLite con SP");
        BTNinsercion_SQLite_sp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        BTNinsercion_SQLite_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsercion_SQLite_spActionPerformed(evt);
            }
        });

        TXTresultado_sp_cassandra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));

        BTNinsercion_Maria_sp.setText("Inserciones en  Maria  con SP");
        BTNinsercion_Maria_sp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        BTNinsercion_Maria_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsercion_Maria_spActionPerformed(evt);
            }
        });

        TXTresultado_sp_timescale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        TXTresultado_sp_timescale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTresultado_sp_timescaleActionPerformed(evt);
            }
        });

        TXTresultado_lmd_timescale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));

        BTNinsercion_Timescale_sp.setText("Inserciones en Timescale con SP");
        BTNinsercion_Timescale_sp.setToolTipText("");
        BTNinsercion_Timescale_sp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        BTNinsercion_Timescale_sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinsercion_Timescale_spActionPerformed(evt);
            }
        });

        TXTresultado_lmd_maria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));

        TXTresultado_sp_maria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2023-05-28 at 7.34.42 PM.jpeg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 2));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2023-05-28 at 8.01.37 PM.jpeg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 2));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhatsApp Image 2023-05-28 at 8.03.18 PM.jpeg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXTcosto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TXTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TXTid)
                    .addComponent(TXTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BTNconexionmariadb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BTNconexiontimescaledb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNconexionSQLite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BTNborrarMaria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNinsercion_maria_lmd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNinsercion_Timescale_sp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNborrarTimescale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNinsercion_timescale_lmd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(BTNinsercion_SQLite_sp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNborrarSQLite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNinsercion_SQLite_lmd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNinsercion_Maria_sp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTresultado_sp_timescale, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(TXTresultado_lmd_maria)
                    .addComponent(TXTresultado_sp_maria)
                    .addComponent(TXTresultado_sp_cassandra)
                    .addComponent(TXTresultado_lmd_timescale)
                    .addComponent(TXTresultado_lmd_SQLite))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TXTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TXTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TXTcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(TXTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TXTresultado_lmd_SQLite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNinsercion_SQLite_lmd))
                        .addGap(18, 18, 18)
                        .addComponent(BTNborrarSQLite))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNinsercion_SQLite_sp)
                    .addComponent(BTNconexionSQLite)
                    .addComponent(TXTresultado_sp_cassandra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNinsercion_timescale_lmd)
                            .addComponent(TXTresultado_lmd_timescale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNborrarTimescale)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTNinsercion_Timescale_sp)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TXTresultado_sp_timescale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNinsercion_maria_lmd)
                            .addComponent(TXTresultado_lmd_maria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNborrarMaria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNinsercion_Maria_sp)
                            .addComponent(TXTresultado_sp_maria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTNconexiontimescaledb))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNconexionmariadb)
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTidActionPerformed

    private void BTNconexiontimescaledbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNconexiontimescaledbActionPerformed
        // TODO add your handling code here:
           ConexionTimescaleDB a=new ConexionTimescaleDB();
          a.conectar();
        
    }//GEN-LAST:event_BTNconexiontimescaledbActionPerformed

    private void BTNinsercion_timescale_lmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsercion_timescale_lmdActionPerformed
    ContadorTiempo a = new ContadorTiempo();
        a.ContadorTiempo();
        ConexionTimescaleDB c=new ConexionTimescaleDB().conectar();
        int contador=0;
        while(true) {
            Calendar tiempo =Calendar.getInstance();
            int hora=tiempo.get(Calendar.HOUR);
            int minuto=tiempo.get(Calendar.MINUTE);
            int segundo=tiempo.get(Calendar.SECOND);
            if (hora==a.horaDespues && minuto==a.minutoDespues && segundo==a.segundoDespues)
            break;
            else
            c.ejecutar("insert into producto values("+Integer.parseInt(TXTid.getText())+",'"+TXTdescripcion.getText()+"',"+Float.parseFloat(TXTcosto.getText())+","+Float.parseFloat(TXTprecio.getText())+");"); //SENTENCIA SQL   EN POSTGRESQL (;) AL FINAL

            /*System.out.println("hora: "+hora+

                " minuto: "+minuto+
                " segundo: "+segundo+"\n");*/
            contador++;
        }
        TXTresultado_lmd_timescale.setText("Se insertaron "+contador+" registros en un minuto");

    }//GEN-LAST:event_BTNinsercion_timescale_lmdActionPerformed

    private void BTNinsercion_SQLite_lmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsercion_SQLite_lmdActionPerformed
        ContadorTiempo a = new ContadorTiempo();
        a.ContadorTiempo();
         ConexionSQLite c=new  ConexionSQLite ().conectar();
        int contador=0;

        while(true) {
            Calendar tiempo =Calendar.getInstance();
            int hora=tiempo.get(Calendar.HOUR);
            int minuto=tiempo.get(Calendar.MINUTE);
            int segundo=tiempo.get(Calendar.SECOND);
            if (hora==a.horaDespues && minuto==a.minutoDespues && segundo==a.segundoDespues)
            break;
            else
            c.ejecutar("insert into producto values("+Integer.parseInt(TXTid.getText())+",'"+TXTdescripcion.getText()+"',"+Float.parseFloat(TXTcosto.getText())+","+Float.parseFloat(TXTprecio.getText())+")"); //SENTENCIA SQL

            /*System.out.println("hora: "+hora+
                " minuto: "+minuto+
                " segundo: "+segundo+"\n");*/
            contador++;
        }
        TXTresultado_lmd_SQLite.setText("Se insertaron "+contador+" registros en un minuto");
    }//GEN-LAST:event_BTNinsercion_SQLite_lmdActionPerformed

    private void BTNinsercion_maria_lmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsercion_maria_lmdActionPerformed
        ContadorTiempo a = new ContadorTiempo();
        a.ContadorTiempo();
        ConexionMariaDB c=new ConexionMariaDB().conectar();
        int contador=0;

        while(true) {
            Calendar tiempo =Calendar.getInstance();
            int hora=tiempo.get(Calendar.HOUR);
            int minuto=tiempo.get(Calendar.MINUTE);
            int segundo=tiempo.get(Calendar.SECOND);
            if (hora==a.horaDespues && minuto==a.minutoDespues && segundo==a.segundoDespues)
            break;
            else
            c.ejecutar("insert into producto values("+Integer.parseInt(TXTid.getText())+",'"+TXTdescripcion.getText()+"',"+Float.parseFloat(TXTcosto.getText())+","+Float.parseFloat(TXTprecio.getText())+")"); //SENTENCIA SQL

            /*System.out.println("hora: "+hora+
                " minuto: "+minuto+
                " segundo: "+segundo+"\n");*/
            contador++;
        }
        TXTresultado_lmd_maria.setText("Se insertaron "+contador+" registros en un minuto");

    }//GEN-LAST:event_BTNinsercion_maria_lmdActionPerformed

    private void BTNborrarTimescaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNborrarTimescaleActionPerformed
        ConexionTimescaleDB c=new ConexionTimescaleDB().conectar();
        c.ejecutar("delete from producto"); //SENTENCIA SQL
        JOptionPane.showMessageDialog(null,"Registros borrados de TimescaleDB");
    }//GEN-LAST:event_BTNborrarTimescaleActionPerformed

    private void BTNborrarSQLiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNborrarSQLiteActionPerformed
        // TODO add your handling code here:
         ConexionSQLite c=new  ConexionSQLite().conectar();
        c.ejecutar("delete from producto"); //SENTENCIA SQL
        JOptionPane.showMessageDialog(null,"Registros borrados de oSQLite");
    }//GEN-LAST:event_BTNborrarSQLiteActionPerformed

    private void BTNborrarMariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNborrarMariaActionPerformed
        // TODO add your handling code here:
        ConexionMariaDB c=new ConexionMariaDB().conectar();
        c.ejecutar("delete from producto"); //SENTENCIA SQL
        JOptionPane.showMessageDialog(null,"Registros borrados de MariaDB");
    }//GEN-LAST:event_BTNborrarMariaActionPerformed

    private void BTNinsercion_SQLite_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsercion_SQLite_spActionPerformed
        try {
            // TODO add your handling code here:
             ConexionSQLite cn=new  ConexionSQLite().conectar();
            ContadorTiempo a = new ContadorTiempo();
            a.ContadorTiempo();
            CallableStatement cst = cn.getConexion().prepareCall("{call PA_INSERTARPRODUCTO (?,?,?,?)}");
            int contador=0;

            cst.setString(1,TXTid.getText());
            cst.setString(2, TXTdescripcion.getText());
            cst.setDouble(3, Double.parseDouble(TXTcosto.getText()));
            cst.setDouble(4, Double.parseDouble(TXTprecio.getText()));

            while(true) {
                Calendar tiempo =Calendar.getInstance();
                int hora=tiempo.get(Calendar.HOUR);
                int minuto=tiempo.get(Calendar.MINUTE);
                int segundo=tiempo.get(Calendar.SECOND);
                if (hora==a.horaDespues && minuto==a.minutoDespues && segundo==a.segundoDespues)
                break;
                else
                cst.execute();
                contador++;
            }

            TXTresultado_sp_cassandra.setText("Se insertaron "+contador+" registros en un minuto");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_BTNinsercion_SQLite_spActionPerformed

    private void BTNinsercion_Maria_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsercion_Maria_spActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ConexionMariaDB cn=new ConexionMariaDB().conectar();
            ContadorTiempo a = new ContadorTiempo();
            a.ContadorTiempo();
            CallableStatement cst = cn.getConexion().prepareCall("{call PA_INSERTARPRODUCTO (?,?,?,?)}");
            int contador=0;

            cst.setString(1,TXTid.getText());
            cst.setString(2, TXTdescripcion.getText());
            cst.setDouble(3, Double.parseDouble(TXTcosto.getText()));
            cst.setDouble(4, Double.parseDouble(TXTprecio.getText()));

            while(true) {
                Calendar tiempo =Calendar.getInstance();
                int hora=tiempo.get(Calendar.HOUR);
                int minuto=tiempo.get(Calendar.MINUTE);
                int segundo=tiempo.get(Calendar.SECOND);
                if (hora==a.horaDespues && minuto==a.minutoDespues && segundo==a.segundoDespues)
                break;
                else
                cst.execute();
                contador++;
            }

            TXTresultado_sp_maria.setText("Se insertaron "+contador+" registros en un minuto");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_BTNinsercion_Maria_spActionPerformed

    private void BTNinsercion_Timescale_spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinsercion_Timescale_spActionPerformed

        try {
            // TODO add your handling code here:
           ConexionTimescaleDB cn=new ConexionTimescaleDB().conectar();
            ContadorTiempo a = new ContadorTiempo();
            a.ContadorTiempo();

            int contador=0;

            //CallableStatement cst = cn.getConexion().prepareCall("{CALL PA_INSERTARPRODUCTO (?,?,?,?)}");

            //CallableStatement cst = cn.getConexion().prepareCall("{SELECT PA_INSERTARPRODUCTO (?,?,?,?)}");

            //OTRA FORMA QUE ESTABA PROBANDO PARA NO USAR SETEO DE PARAMETROS
            /*String cadena="{CALL PA_INSERTARPRODUCTO('"+TXTid.getText()+"',"+
            "'"+TXTdescripcion.getText()+"',"+
            TXTcosto.getText()+","+
            TXTprecio.getText()+
            ")}";

            CallableStatement cst = cn.getConexion().prepareCall(cadena);*/

            CallableStatement cst = cn.getConexion().prepareCall("{call PA_INSERTARPRODUCTO(?,?,?,?)}");
            //PreparedStatement cst2 = cn.getConexion().prepareStatement("Select pa_insertarproducto(?,?,?,?)");
            //CallableStatement cst = cn.getConexion().prepareCall("{call pa_insertarproducto4(cast(? as text),cast(? as text),cast(? as text),cast(? as text))}");

            cst.setString(1,TXTid.getText());
            cst.setString(2, TXTdescripcion.getText());
            cst.setFloat(3, Float.parseFloat(TXTcosto.getText()));
            cst.setFloat(4, Float.parseFloat(TXTprecio.getText()));

            /*cst2.setString(1,TXTid.getText());
            cst2.setString(2, TXTdescripcion.getText());
            cst2.setFloat(3, Float.parseFloat(TXTcosto.getText()));
            cst2.setFloat(4, Float.parseFloat(TXTprecio.getText()));*/

            /*cst.setFloat(3, new Float(4));
            cst.setFloat(4, new Float(5));*/

            /*cst.setDouble(3, 8);
            cst.setDouble(4, 9);*/
            /*cst.setString(3, TXTcosto.getText());
            cst.setString(4, TXTprecio.getText());*/

            while(true) {
                Calendar tiempo =Calendar.getInstance();
                int hora=tiempo.get(Calendar.HOUR);
                int minuto=tiempo.get(Calendar.MINUTE);
                int segundo=tiempo.get(Calendar.SECOND);
                if (hora==a.horaDespues && minuto==a.minutoDespues && segundo==a.segundoDespues)
                break;
                else
                cst.execute();

                //Execute, executequery
                contador++;
            }

            TXTresultado_sp_timescale.setText("Se insertaron "+contador+" registros en un minuto");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_BTNinsercion_Timescale_spActionPerformed

    private void TXTresultado_lmd_SQLiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTresultado_lmd_SQLiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTresultado_lmd_SQLiteActionPerformed

    private void TXTresultado_sp_timescaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTresultado_sp_timescaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTresultado_sp_timescaleActionPerformed

    private void BTNconexionSQLiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNconexionSQLiteActionPerformed
        // TODO add your handling code here:
           ConexionSQLite   a=new ConexionSQLite ();
        a.conectar();
    }//GEN-LAST:event_BTNconexionSQLiteActionPerformed

    private void BTNconexionmariadbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNconexionmariadbActionPerformed
        // TODO add your handling code here:
           ConexionMariaDB a = new ConexionMariaDB();
        a.conectar();
    }//GEN-LAST:event_BTNconexionmariadbActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNborrarMaria;
    private javax.swing.JButton BTNborrarSQLite;
    private javax.swing.JButton BTNborrarTimescale;
    private javax.swing.JButton BTNconexionSQLite;
    private javax.swing.JButton BTNconexionmariadb;
    private javax.swing.JButton BTNconexiontimescaledb;
    private javax.swing.JButton BTNinsercion_Maria_sp;
    private javax.swing.JButton BTNinsercion_SQLite_lmd;
    private javax.swing.JButton BTNinsercion_SQLite_sp;
    private javax.swing.JButton BTNinsercion_Timescale_sp;
    private javax.swing.JButton BTNinsercion_maria_lmd;
    private javax.swing.JButton BTNinsercion_timescale_lmd;
    private javax.swing.JTextField TXTcosto;
    private javax.swing.JTextField TXTdescripcion;
    private javax.swing.JTextField TXTid;
    private javax.swing.JTextField TXTprecio;
    private javax.swing.JTextField TXTresultado_lmd_SQLite;
    private javax.swing.JTextField TXTresultado_lmd_maria;
    private javax.swing.JTextField TXTresultado_lmd_timescale;
    private javax.swing.JTextField TXTresultado_sp_cassandra;
    private javax.swing.JTextField TXTresultado_sp_maria;
    private javax.swing.JTextField TXTresultado_sp_timescale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
