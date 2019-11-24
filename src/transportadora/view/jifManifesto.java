
package transportadora.view;

import dao.ManifestoData;
import model.Manifesto;
import javax.swing.JOptionPane;

public class jifManifesto extends javax.swing.JInternalFrame {
    Manifesto obj;
    ManifestoData DAO;

    public jifManifesto() {
        initComponents();
        estadoInicialCampos();
        obj = new Manifesto();
        try {
            DAO = new ManifestoData();
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlId = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jtFilialOrigem = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jlFilialDestino = new javax.swing.JLabel();
        jtFilialDestino = new javax.swing.JTextField();
        jlPlacaVeiculo = new javax.swing.JLabel();
        jtPlacaVeiculo = new javax.swing.JTextField();
        jtId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Manifestos");

        jlId.setText("Código");

        jlDescricao.setText("Filial Origem");

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jlFilialDestino.setText("Filial Destino");

        jlPlacaVeiculo.setText("Placa Veículo");

        jbBuscar.setText("Buscar");
        jbBuscar.setEnabled(false);
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
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlPlacaVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlFilialDestino)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jlId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtFilialDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscar)
                                .addGap(7, 7, 7)
                                .addComponent(jbCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSalvar)))))
                .addContainerGap(18, Short.MAX_VALUE))
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
                    .addComponent(jlDescricao)
                    .addComponent(jtFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFilialDestino)
                    .addComponent(jtFilialDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPlacaVeiculo))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbCancelar)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
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
            jtFilialDestino.setEnabled(true);
            jtFilialOrigem.setEnabled(true);
            jtPlacaVeiculo.setEnabled(true);

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

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        try {
            if (validarCampos()) {
                if (preencherObjeto()) {
                    if (DAO.deletar(obj.getId())) {
                        JOptionPane.showMessageDialog(this, "Excluído com Sucesso!");
                        jbCancelarActionPerformed(evt);
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Salvar");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        try {
            if (validarCampos()) {
                if (preencherObjeto()) {
                    if (DAO.inserir(obj)) {
                        JOptionPane.showMessageDialog(this, "Editado com Sucesso!");
                        jbCancelarActionPerformed(evt);
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Salvar");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        jtPlacaVeiculo.setEnabled(true);
        jtFilialOrigem.setEnabled(true);
        jtFilialDestino.setEnabled(true);
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(true);
        jbExcluir.setEnabled(true);

    }// GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbCancelarActionPerformed
        estadoInicialCampos();
    }// GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if (validarCampos()) {
                if (preencherObjeto()) {
                    if (DAO.inserir(obj)) {
                        JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                        jbCancelarActionPerformed(evt);
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao Salvar");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_jbSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlFilialDestino;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlPlacaVeiculo;
    private javax.swing.JTextField jtFilialDestino;
    private javax.swing.JTextField jtFilialOrigem;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtPlacaVeiculo;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jtId.setText("");
        jtFilialOrigem.setText("");
        jtFilialDestino.setText("");
        jtPlacaVeiculo.setText("");
    }
    
    public void atualizarCampos() {
        jtId.setText(obj.getId()+"");
        jtFilialOrigem.setText(obj.getFilialOrigem());
        jtFilialDestino.setText(obj.getFilialDestino());
        jtPlacaVeiculo.setText(obj.getPlacaVeiculo());
    }
    
    private void estadoInicialCampos() {
        limparCampos();

        jtId.setEnabled(true);
        jtPlacaVeiculo.setEnabled(false);
        jtFilialOrigem.setEnabled(false);
        jtFilialDestino.setEnabled(false);
        
        jbBuscar.setEnabled(true);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(false);
    }

    private boolean preencherObjeto() {
        obj.setPlacaVeiculo(jtPlacaVeiculo.getText());
        obj.setFilialOrigem(jtFilialOrigem.getText());
        obj.setFilialDestino(jtFilialDestino.getText());
        return true;
    }

    private boolean validarCampos() {
        if (jtFilialOrigem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digitite Filial de Origem");
            jtFilialOrigem.requestFocus();
            return false;
        }
        if (jtFilialOrigem.getText().length() > 50) {
            JOptionPane.showMessageDialog(this, "Digite no máximo 50 caracteres");
            jtFilialOrigem.requestFocus();
            return false;
        }
        if (jtPlacaVeiculo.getText().length() < 8) {
            JOptionPane.showMessageDialog(this, "Digite os 8 dígitos da placa");
            jtPlacaVeiculo.requestFocus();
            return false;
        }
        return true;
    }

}
