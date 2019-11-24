/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.view;

import dao.ClientesDestData;
import javax.swing.JOptionPane;
import model.ClientesDest;

/**
 *
 * @author Dell
 */
public class jifClienteDestinatario extends javax.swing.JInternalFrame {

    private ClientesDest obj;
    private ClientesDestData DAO;
    /**
     * Creates new form jifManifesto
     */
    public jifClienteDestinatario() {
        initComponents();
        estadoInicialCampos();
        obj = new ClientesDest();
        try {
            DAO = new ClientesDestData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
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

        jlId = new javax.swing.JLabel();
        jlNomeCliente = new javax.swing.JLabel();
        jtNomeCliente = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jlEndereco = new javax.swing.JLabel();
        jtEndereco = new javax.swing.JTextField();
        jlUF = new javax.swing.JLabel();
        jtUF = new javax.swing.JTextField();
        jlCidade = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jlCPF = new javax.swing.JLabel();
        jtCPF = new javax.swing.JTextField();
        jlCNPJ = new javax.swing.JLabel();
        jtCNPJ = new javax.swing.JTextField();
        jlTelefone = new javax.swing.JLabel();
        jtTelefone = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Clientes Destinatário");

        jlId.setText("Código");

        jlNomeCliente.setText("Nome Cliente");

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jlEndereco.setText("Endereço");

        jlUF.setText("UF");

        jlCidade.setText("Cidade");

        jlCPF.setText("CPF");

        jlCNPJ.setText("CNPJ");

        jlTelefone.setText("Telefone");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomeCliente)
                            .addComponent(jlEndereco)
                            .addComponent(jlCidade)
                            .addComponent(jlTelefone)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlCPF)
                                .addComponent(jlCNPJ))
                            .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jtCNPJ, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtCidade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jlUF)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNovo)
                                .addGap(15, 15, 15)
                                .addComponent(jbBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbCancelar)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeCliente)
                    .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlEndereco))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCNPJ)
                    .addComponent(jtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCPF))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbCancelar)
                    .addComponent(jbBuscar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            obj = DAO.buscar(Integer.parseInt(jtId.getText()));
            atualizarCampos();
            
            jtId.setEnabled(false);
            jtCNPJ.setEnabled(true);
            jtCPF.setEnabled(true);
            jtCidade.setEnabled(true);
            jtEndereco.setEnabled(true);
            jtNomeCliente.setEnabled(true);
            jtTelefone.setEnabled(true);
            jtUF.setEnabled(true);

            jbBuscar.setEnabled(false);
            jbNovo.setEnabled(false);
            jbCancelar.setEnabled(true);
            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
            jbSalvar.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Buscar: " + e.getMessage(), "Buscar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        jtId.setText("0");

        jtId.setEnabled(false);
        jtCNPJ.setEnabled(true);
        jtCPF.setEnabled(true);
        jtCidade.setEnabled(true);
        jtEndereco.setEnabled(true);
        jtNomeCliente.setEnabled(true);
        jtTelefone.setEnabled(true);
        jtUF.setEnabled(true);

        jbCancelar.setEnabled(true);
        jbSalvar.setEnabled(true);
        jbBuscar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbNovo.setEnabled(false);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        estadoInicialCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        try {
            if (validarCampos()) {
                preencherObjeto();
                if (DAO.editar(obj)) {
                    JOptionPane.showMessageDialog(this, "Editado com Sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao Editar");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Editar: " + e.getMessage(), "Editar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        try {
            if (DAO.deletar(Integer.parseInt(jtId.getText()))) {
                JOptionPane.showMessageDialog(this, "Excluído com Sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Excluir");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Excluir: " + e.getMessage(), "Excluir", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if (validarCampos()) {
                preencherObjeto();
                if (DAO.inserir(obj)) {
                    JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao Salvar");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao Salvar: " + e.getMessage(), "Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlCNPJ;
    private javax.swing.JLabel jlCPF;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNomeCliente;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlUF;
    private javax.swing.JTextField jtCNPJ;
    private javax.swing.JTextField jtCPF;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNomeCliente;
    private javax.swing.JTextField jtTelefone;
    private javax.swing.JTextField jtUF;
    // End of variables declaration//GEN-END:variables
    
    private void estadoInicialCampos() {
        limparCampos();
        
        jtId.setEnabled(true);
        jtCNPJ.setEnabled(false);
        jtCPF.setEnabled(false);
        jtCidade.setEnabled(false);
        jtEndereco.setEnabled(false);
        jtNomeCliente.setEnabled(false);
        jtTelefone.setEnabled(false);
        jtUF.setEnabled(false);
        
        jbBuscar.setEnabled(true);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(false);
    }

    private void limparCampos() {
        jtCNPJ.setText("");
        jtCPF.setText("");
        jtCidade.setText("");
        jtEndereco.setText("");
        jtId.setText("");
        jtNomeCliente.setText("");
        jtTelefone.setText("");
        jtUF.setText("");
    }

    private void preencherObjeto() {
        obj.setCnpjCliente(jtCNPJ.getText());
        obj.setCpfCliente(jtCPF.getText());
        obj.setCidade(jtCidade.getText());
        obj.setEndereco(jtEndereco.getText());
        obj.setId(Integer.parseInt(jtId.getText()));
        obj.setNome(jtNomeCliente.getText());
        obj.setTelefone(jtTelefone.getText());
        obj.setUf(jtUF.getText());
    }

    private void atualizarCampos() {
        jtCNPJ.setText(obj.getCnpjCliente());
        jtCPF.setText(obj.getCpfCliente());
        jtCidade.setText(obj.getCidade());
        jtEndereco.setText(obj.getEndereco());
        jtId.setText(obj.getId()+"");
        jtNomeCliente.setText(obj.getNome());
        jtTelefone.setText(obj.getTelefone());
        jtUF.setText(obj.getUf());
    }

    private boolean validarCampos() {
        if (jtCNPJ.getText().equals("") && jtCPF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo CNPJ ou CPF não podem ser ambos vazios");
            jtCNPJ.requestFocus();
            return false;
        }
        if (jtCidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo não pode ser vazio");
            jtCidade.requestFocus();
            return false;
        }
        if (jtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo não pode ser vazio");
            jtEndereco.requestFocus();
            return false;
        }
        if (jtId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo não pode ser vazio");
            jtId.requestFocus();
            return false;
        }
        if (jtNomeCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo não pode ser vazio");
            jtNomeCliente.requestFocus();
            return false;
        }
        if (jtTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo não pode ser vazio");
            jtTelefone.requestFocus();
            return false;
        }
        if (jtUF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo não pode ser vazio");
            jtUF.requestFocus();
            return false;
        }
        return true;
    }
}
