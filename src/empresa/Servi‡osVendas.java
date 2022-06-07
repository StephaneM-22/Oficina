/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package empresa;

import DAO.Conexao;
import Model.Cliente;
import Model.Produto;
import Model.Serviço;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vini2
 */
public class ServiçosVendas extends javax.swing.JFrame {

    /**
     * Creates new form Serviço
     */
    public ServiçosVendas() {
        initComponents();
        DefaultTableModel modelo =(DefaultTableModel) tproduto.getModel(); 

        modelo.setNumRows(0);
        
        
        
        try {
            Connection conexao = (Connection) Conexao.getConnection();
            String sql = "SELECT * FROM produto;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
             ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome");
            int cod = result.getInt("cod_produto");
            int quant = result.getInt("quant_produto");
            int preço = result.getInt("preço");;
           
            
            
            Produto func = new Produto(cod, nome, preço, quant);
           
            
            produtos.add(func);
           
            
        }
        
       
        int count = produtos.size();
        int i;
        for(i=0;i<count;i++){
            modelo.addRow(new Object[]{produtos.get(i).getCod_produto(),produtos.get(i).getNome(),produtos.get(i).getPreco(),produtos.get(i).getQuantidade()});
        }
         
          
            
        
        

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         DefaultTableModel model =(DefaultTableModel) tserviço.getModel(); 

         model.setNumRows(0);
        
        
        
        try {
            Connection conex = (Connection) Conexao.getConnection();
            String sql = "SELECT * FROM serviÇos;";
            
            java.sql.PreparedStatement statement = conex.prepareStatement(sql);
             ArrayList<Serviço> serviços = new ArrayList<Serviço>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            
            int cod = result.getInt("cod_serviço");
            int preço = result.getInt("preço");
            String tipo = result.getString("tipo");
           
            
            
            Serviço func = new Serviço(cod,preço,tipo);
           
            
            serviços.add(func);
           
            
        }
        
       
        int count = serviços.size();
        int i;
        for(i=0;i<count;i++){
            model.addRow(new Object[]{serviços.get(i).getCodigo(),serviços.get(i).getPreço(),serviços.get(i).getTipo()});
        }
         
          
            
        
        

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel mode =(DefaultTableModel) tabela.getModel(); 
        mode.setNumRows(0);
        
        DefaultTableModel tab =(DefaultTableModel) tabela1.getModel(); 
        tab.setNumRows(0);

        
        try {
            Connection conexao = (Connection) Conexao.getConnection();
            String sql = "SELECT * FROM cliente;";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
             ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        statement.execute();
        ResultSet result = statement.getResultSet();
        
        while(result.next()){
            String nome = result.getString("nome_completo");
            String cpf  = result.getString("cpf");
            String endereco = result.getString("endereco");
            String telefone = result.getString("telefone");
           
            
            
            Cliente func = new Cliente(nome, cpf, endereco, telefone);
           
            
            clientes.add(func);
           
            
        }
        
       
        int count = clientes.size();
        int i;
        for(i=0;i<count;i++){
            mode.addRow(new Object[]{clientes.get(i).getNome(),clientes.get(i).getCpf(),clientes.get(i).getEndereco(),clientes.get(i).getTelefone()});
            tab.addRow(new Object[]{clientes.get(i).getNome(),clientes.get(i).getCpf(),clientes.get(i).getEndereco(),clientes.get(i).getTelefone()});
        }
         

        } catch (SQLException ex) {
            Logger.getLogger(Consultar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        scod = new javax.swing.JTextField();
        stipo = new javax.swing.JTextField();
        spreço = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        quant = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        preço = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tserviço = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tproduto = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t1cliente = new javax.swing.JTextField();
        scpf = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nomi = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serviços");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Preço:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(scod, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 40, -1));
        getContentPane().add(stipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 80, -1));
        getContentPane().add(spreço, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 130, -1));

        jButton1.setText("Realizar Serviço");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Venda de Produtos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 40, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prestação de Serviços");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Codigo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

        cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codActionPerformed(evt);
            }
        });
        getContentPane().add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 42, -1));
        getContentPane().add(quant, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantidade:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Preço:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        preço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preçoActionPerformed(evt);
            }
        });
        getContentPane().add(preço, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 50, -1));

        jButton2.setText("Vender");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, -1, -1));

        tserviço.setBackground(new java.awt.Color(0, 0, 0));
        tserviço.setForeground(new java.awt.Color(255, 255, 255));
        tserviço.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Preço", "Tipo"
            }
        ));
        tserviço.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tserviçoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tserviço);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 279, 110));

        tproduto.setBackground(new java.awt.Color(0, 0, 0));
        tproduto.setForeground(new java.awt.Color(255, 255, 255));
        tproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Preço", "Quantidade"
            }
        ));
        tproduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tprodutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tproduto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 340, 110));

        jScrollPane4.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));

        tabela.setBackground(new java.awt.Color(0, 0, 0));
        tabela.setForeground(new java.awt.Color(255, 255, 255));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "CPF"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabela);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 280, 110));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Serviços");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Clientes");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CPF:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 43, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cliente:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 246, -1, 20));
        getContentPane().add(t1cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 160, -1));
        getContentPane().add(scpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 130, -1));

        tabela1.setBackground(new java.awt.Color(0, 0, 0));
        tabela1.setForeground(new java.awt.Color(255, 255, 255));
        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "CPF"
            }
        ));
        tabela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabela1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 340, 110));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nome");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CPF");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));
        getContentPane().add(nomi, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 170, -1));
        getContentPane().add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 170, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empresa/imagens/Fundo.jpeg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empresa/imagens/Fundo.jpeg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           
       Tela_Funcionario telafunc = new Tela_Funcionario();
       telafunc.setVisible(true);
       
       ServiçosVendas.this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tprodutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tprodutoMouseClicked
       cod.setText(tproduto.getValueAt(tproduto.getSelectedRow(),0).toString());
         preço.setText(tproduto.getValueAt(tproduto.getSelectedRow(),2).toString());
    }//GEN-LAST:event_tprodutoMouseClicked

    private void tserviçoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tserviçoMouseClicked
        scod.setText(tserviço.getValueAt(tserviço.getSelectedRow(),0).toString());
         spreço.setText(tserviço.getValueAt(tserviço.getSelectedRow(),2).toString());
         stipo.setText(tserviço.getValueAt(tserviço.getSelectedRow(),1).toString());
    }//GEN-LAST:event_tserviçoMouseClicked

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        t1cliente.setText(tabela.getValueAt(tabela.getSelectedRow(),0).toString());
         scpf.setText(tabela.getValueAt(tabela.getSelectedRow(),1).toString());
    }//GEN-LAST:event_tabelaMouseClicked

    private void preçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preçoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preçoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
           
           
            Connection conexao = (Connection) Conexao.getConnection();
            String sql = "insert into solicita values (?,?,?);";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1,Integer.parseInt(this.scod.getText()));
            statement.setString(2,this.scpf.getText());
            statement.setString(3,"Foi realizado um serviço de "+this.spreço.getText()+" no valor de R$"+this.stipo.getText());
            
            statement.execute(); 
         
            conexao.close();
       
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        try{
           
           
            Connection conexao = (Connection) Conexao.getConnection();
            String sql = "insert into vendas values (?,?,?);";
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1,Integer.parseInt(this.cod.getText()));
            statement.setString(2,this.cpf.getText());
            statement.setString(3,"Foi realizado uma venda de "+tproduto.getValueAt(tproduto.getSelectedRow(),1).toString()+" no valor de R$"+tproduto.getValueAt(tproduto.getSelectedRow(),2).toString());
            
            statement.execute(); 
         
            conexao.close();
       
        }catch (SQLException ex){
            System.out.println(ex);
        }
        
        try{
             
             Object value = quant.getValue();
            Connection conexao = (Connection) Conexao.getConnection();
            String sql = "UPDATE produto SET quant_produto = ? WHERE cod_produto = ?;";
            
            int cont = (Integer.parseInt(tproduto.getValueAt(tproduto.getSelectedRow(),3).toString()))-(Integer.parseInt(value.toString()));
            
            java.sql.PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setInt(1,cont);
            statement.setInt(2,Integer.parseInt(this.cod.getText()));
            
            
            
            
            statement.execute(); 
         
            conexao.close();
       
        }catch (SQLException ex){
            System.out.println(ex);
        }
         
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codActionPerformed

    private void tabela1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela1MouseClicked
         nomi.setText(tabela1.getValueAt(tabela1.getSelectedRow(),0).toString());
         cpf.setText(tabela1.getValueAt(tabela1.getSelectedRow(),1).toString());
    }//GEN-LAST:event_tabela1MouseClicked

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
            java.util.logging.Logger.getLogger(ServiçosVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiçosVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiçosVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiçosVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiçosVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cod;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField nomi;
    private javax.swing.JTextField preço;
    private javax.swing.JSpinner quant;
    private javax.swing.JTextField scod;
    private javax.swing.JTextField scpf;
    private javax.swing.JTextField spreço;
    private javax.swing.JTextField stipo;
    private javax.swing.JTextField t1cliente;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabela1;
    private javax.swing.JTable tproduto;
    private javax.swing.JTable tserviço;
    // End of variables declaration//GEN-END:variables
}
