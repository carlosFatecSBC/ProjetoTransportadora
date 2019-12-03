
package transportadora.view;

import dao.ManifestoData;
import dao.VeiculoData;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import model.Manifesto;
import javax.swing.JOptionPane;
import model.Veiculo;

public class jifManifesto extends javax.swing.JInternalFrame {
    Manifesto obj;
    ManifestoData DAO;
    ArrayList<Veiculo> veiculos;
    VeiculoData DAO_Veiculo;
    DefaultListModel veiculosList = new DefaultListModel();

    public jifManifesto() {
        initComponents();
        estadoInicialCampos();
        obj = new Manifesto();
        try {
            DAO = new ManifestoData();
            carregarVeiculos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
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
        jtId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistVeiculos = new javax.swing.JList<>();
        jbRemoverVeiculo = new javax.swing.JButton();
        jcbVeiculos = new javax.swing.JComboBox<>();
        jbAdicionarVeiculo = new javax.swing.JButton();

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

        jlPlacaVeiculo.setText("Veiculos");

        jbBuscar.setText("Buscar");
        jbBuscar.setEnabled(false);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jlistVeiculos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jlistVeiculos);

        jbRemoverVeiculo.setText("Remover");
        jbRemoverVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverVeiculoActionPerformed(evt);
            }
        });

        jbAdicionarVeiculo.setText("Adicionar");
        jbAdicionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbEditar)
                            .addComponent(jbNovo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbBuscar)
                                .addGap(7, 7, 7)
                                .addComponent(jbCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbSalvar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlFilialDestino)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jlPlacaVeiculo))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtFilialDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtFilialOrigem))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcbVeiculos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbRemoverVeiculo)
                                    .addComponent(jbAdicionarVeiculo))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescricao)
                    .addComponent(jtFilialOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFilialDestino)
                    .addComponent(jtFilialDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPlacaVeiculo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbAdicionarVeiculo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCancelar)
                            .addComponent(jbBuscar)
                            .addComponent(jbNovo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEditar)
                            .addComponent(jbExcluir)
                            .addComponent(jbSalvar)))
                    .addComponent(jbRemoverVeiculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            obj = DAO.buscar(Integer.parseInt(jtId.getText()));
            if (obj.getId() == 0) {
                JOptionPane.showMessageDialog(this, "Não encontrado");
                return;
            }
            obj.setVeiculos(DAO.buscarVeiculos(obj.getId()));
            atualizarCampos();
            
            jtId.setEnabled(false);
            jtFilialDestino.setEnabled(true);
            jtFilialOrigem.setEnabled(true);
            jlistVeiculos.setEnabled(true);

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
                    if(obj.getId() > 0) {
                        if (DAO.editar(obj)) {
                            JOptionPane.showMessageDialog(this, "Editado com Sucesso!");
                            jbCancelarActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "Erro ao Salvar");
                        }
                    } else {
                        DAO.inserir(obj);
                        if (obj.getId() != 0) {
                            atualizarCampos();
                            JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                            jbCancelarActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "Erro ao Salvar");
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbRemoverVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverVeiculoActionPerformed
        int index = jlistVeiculos.getSelectedIndex();
        if (index == -1) return;
        try {
            Veiculo v = obj.getVeiculos().get(index);
            if (obj.getId() != 0) {
                DAO.removerVeiculo(obj.getId(), v.getId());
            }
            obj.removeVeiculo(index);
            veiculosList.remove(index);
            jlistVeiculos.setModel(veiculosList);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Erro ao remover", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbRemoverVeiculoActionPerformed

    private void jbAdicionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarVeiculoActionPerformed
        int index = jcbVeiculos.getSelectedIndex();
        System.out.println(index);
        if (index == -1) { return; }
        try {
            Veiculo v = veiculos.get(index);
            if (obj.getId() != 0) {
                DAO.adicionarVeiculo(obj.getId(), v.getId());
            }
            veiculosList.addElement(v.getNumeroPlaca());
            jlistVeiculos.setModel(veiculosList);
            obj.addVeiculo(v);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Erro ao adicionar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAdicionarVeiculoActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        jtId.setEnabled(false);
        jtFilialOrigem.setEnabled(true);
        jtFilialDestino.setEnabled(true);
        jlistVeiculos.setEnabled(true);
        jcbVeiculos.setEnabled(true);
        jbAdicionarVeiculo.setEnabled(true);
        jbRemoverVeiculo.setEnabled(true);
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
                if (preencherObjeto()) 
                    if (obj.getId() > 0) {
                        DAO.editar(obj);
                    } else {
                        DAO.inserir(obj);
                        if (obj.getId() != 0) {
                            atualizarCampos();
                            JOptionPane.showMessageDialog(this, "Salvo com Sucesso!");
                            jbCancelarActionPerformed(evt);
                        } else {
                            JOptionPane.showMessageDialog(this, "Erro ao Salvar");
                        }
                    }
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro:" + e.getMessage(), "Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_jbSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdicionarVeiculo;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbRemoverVeiculo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbVeiculos;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlFilialDestino;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlPlacaVeiculo;
    private javax.swing.JList<String> jlistVeiculos;
    private javax.swing.JTextField jtFilialDestino;
    private javax.swing.JTextField jtFilialOrigem;
    private javax.swing.JTextField jtId;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jtId.setText("0");
        jtFilialOrigem.setText("");
        jtFilialDestino.setText("");
        veiculosList.clear();
    }
    
    public void atualizarCampos() {
        jtId.setText(obj.getId()+"");
        jtFilialOrigem.setText(obj.getFilialOrigem());
        jtFilialDestino.setText(obj.getFilialDestino());
        jlistVeiculos.setEnabled(true);
        jcbVeiculos.setEnabled(true);
        jbAdicionarVeiculo.setEnabled(true);
        jbRemoverVeiculo.setEnabled(true);
        ArrayList<Veiculo> vs = obj.getVeiculos();
        for (int i = 0; i < vs.size(); i++) {
            veiculosList.addElement(vs.get(i).getNumeroPlaca());
        }
        jlistVeiculos.setModel(veiculosList);
    }
    
    private void estadoInicialCampos() {
        limparCampos();

        jtId.setEnabled(true);
        jtFilialOrigem.setEnabled(false);
        jtFilialDestino.setEnabled(false);
        jlistVeiculos.setEnabled(false);
        jcbVeiculos.setEnabled(false);
        jbAdicionarVeiculo.setEnabled(false);
        jbRemoverVeiculo.setEnabled(false);
        
        jbBuscar.setEnabled(true);
        jbNovo.setEnabled(true);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSalvar.setEnabled(false);
    }

    private boolean preencherObjeto() {
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
        return true;
    }
    
    private void carregarVeiculos() {
        try {
            DAO_Veiculo = new VeiculoData();
            veiculos = DAO_Veiculo.buscarTudo();
            DefaultComboBoxModel veiculoModel = new DefaultComboBoxModel<String>();
            for (int i = 0; i < veiculos.size(); i++) {
                veiculoModel.addElement(veiculos.get(i).getNumeroPlaca());
            }
            jcbVeiculos.setModel(veiculoModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

}
