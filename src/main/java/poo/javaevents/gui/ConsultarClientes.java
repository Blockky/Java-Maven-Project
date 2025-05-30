package poo.javaevents.gui;

import java.util.List;
import javax.swing.DefaultListModel;

import poo.javaevents.model.Cliente;
import poo.javaevents.util.UtilUsuarios;

/** @author Pablo García Hernández */
public class ConsultarClientes extends javax.swing.JFrame {
    private List<Cliente> clientes;
    
    // Utilidades
    UtilUsuarios utilUser = new UtilUsuarios();

    /**
     * Creates new form BuscadorEventos
     */
    public ConsultarClientes() {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Java Events - Clientes registrados");
        List <Cliente> lista = utilUser.consultarClientes();
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Cliente cc : lista) {
            modelo.addElement(cc.getNombre() + " | " + cc.getCorreo());
        }
        jList1.setModel(modelo);
        clientes = lista;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jVolverInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jVolverInicio.setText("Volver a inicio");
        jVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverInicioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Consultar clientes registrados");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jVolverInicio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)))
                .addGap(18, 59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jVolverInicio)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverInicioActionPerformed
        // Volver a la página de inicio
        new AdminView();
        this.setVisible(false);
    }//GEN-LAST:event_jVolverInicioActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // Si se pulsa dos veces a un elemento de la lista, se muestran sus detalles
        if (evt.getClickCount() == 2) {
            int index = jList1.locationToIndex(evt.getPoint());
            if (index >= 0 && index < clientes.size()) {
                    Cliente seleccionado = clientes.get(index);
                    new VerCliente(seleccionado);
                    this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jVolverInicio;
    // End of variables declaration//GEN-END:variables
}
