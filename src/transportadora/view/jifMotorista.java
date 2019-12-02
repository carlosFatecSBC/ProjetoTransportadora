/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora.view;

import dao.MotoristaData;
import javax.swing.JOptionPane;
import model.Motorista;
/**
 *
 * @author Dell
 */
public class jifMotorista extends javax.swing.JInternalFrame {

    private Motorista obj;
    private MotoristaData DAO;
    /**
     * Creates new form jifManifesto
     */
    public jifMotorista() {
        initComponents();
        estadoInicialCampos();
        obj = new Motorista();
        try {
            DAO = new MotoristaData();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jlId = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jlTelefone = new javax.swing.JLabel();
        jtTelefone = new javax.swing.JTextField();
        jrbMasculino = new javax.swing.JRadioButton();
        jrbFeminino = new javax.swing.JRadioButton();
        jlSexo = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Motoristas");

        jlId.setText("Código");

        jlNome.setText("Nome");

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

        jlTelefone.setText("Telefone");

        buttonGroup1.add(jrbMasculino);
        jrbMasculino.setText("Masculino");

        buttonGroup1.add(jrbFeminino);
        jrbFeminino.setText("Feminino");

        jlSexo.setText("Sexo");

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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbMasculino))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome)
                                    .addComponent(jlId))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbCancelar)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSexo)
                    .addComponent(jrbFeminino)
                    .addComponent(jrbMasculino))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbCancelar)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        
        jtId.setText("0");

        jtId.setEnabled(false);
        jtNome.setEnabled(true);
        jtTelefone.setEnabled(true);
        jrbMasculino.setEnabled(true);
        jrbFeminino.setEnabled(true);

        jbBuscar.setEnabled(false);
        jbNovo.setEnabled(false);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(true);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            obj = DAO.buscar(Integer.parseInt(jtId.getText()));
            atualizarCampos();
            
            jtId.setEnabled(false);
            jtNome.setEnabled(true);
            jtTelefone.setEnabled(true);
            jrbMasculino.setEnabled(true);
            jrbFeminino.setEnabled(true);

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JRadioButton jrbFeminino;
    private javax.swing.JRadioButton jrbMasculino;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
    
    private void estadoInicialCampos() {
        limparCampos();
        
        buttonGroup1.setSelected(jrbMasculino.getModel(), true);
        
        jtId.setEnabled(true);
        jtNome.setEnabled(false);
        jtTelefone.setEnabled(false);
        jrbMasculino.setEnabled(false);
        jrbFeminino.setEnabled(false);
        
        jbBuscar.setEnabled(true);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(false);
    }

    private void limparCampos() {
        jtId.setText("");
        jtNome.setText("");
        jtTelefone.setText("");
        buttonGroup1.setSelected(jrbMasculino.getModel(), true);

    }

    private void preencherObjeto() {
        obj.setId(Integer.parseInt(jtId.getText()));
        obj.setNome(jtNome.getText());
        obj.setTelefone(jtTelefone.getText());
        if (jrbMasculino.isSelected()) {
            obj.setSexo("M");
        } else if (jrbFeminino.isSelected()) {
            obj.setSexo("F");
        }
    }

    private void atualizarCampos() {
        jtId.setText(obj.getId()+"");
        jtNome.setText(obj.getNome());
        jtTelefone.setText(obj.getTelefone());
        if (obj.getSexo().equals("M")) {
            buttonGroup1.setSelected(jrbMasculino.getModel(), true);
        } else if (obj.getSexo().equals("M")) {
            buttonGroup1.setSelected(jrbFeminino.getModel(), true);
        }
    }

    private boolean validarCampos() {
        if (jtId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo não pode ser vazio");
            jtId.requestFocus();
            return false;
        }
        if (jtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo não pode ser vazio");
            jtNome.requestFocus();
            return false;
        }
        if (jtTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo não pode ser vazio");
            jtTelefone.requestFocus();
            return false;
        }
        if (!buttonGroup1.getSelection().isSelected()) {
            return false;
        }
        return true;
    }
}


