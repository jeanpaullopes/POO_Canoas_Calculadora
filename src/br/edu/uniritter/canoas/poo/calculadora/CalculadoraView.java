package br.edu.uniritter.canoas.poo.calculadora;


import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author jean
 */
public class CalculadoraView extends javax.swing.JFrame {
	private boolean temOperacao = false;
	public static String titulo = "calculadora";
	private javax.swing.JFrame tela;
	//private CalculadoraController controller;
	/**
	 * Creates new form CalculadoraView
	 */
	public CalculadoraView() {
		//this.controller = ctrl;
		tela = this;
		initComponents();
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButton0.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				adicionaDigito(((JButton)evt.getSource()).getText() );
			}
		});
		jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JButton btn = (JButton) evt.getSource();

				String txt = btn.getText();
				adicionaDigito(txt );
			}
		});
		jButtonBackSpace.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				apagaDigito();
			}
		});
		jButtonAC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				apagaTudo();
			}
		});


		jButtonIgual.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {
				displayEdit.setText( CalculadoraController.calcula(displayEdit.getText()) );
				temOperacao = false;
				tela.setTitle(CalculadoraView.titulo);


			}
		});

		//this.addOperacao("+");
		//this.addOperacao("-");
		//this.addOperacao("*");
		//this.addOperacao("/");
		//this.addOperacao("^");
		//this.addOperacao("!");
		//this.addOperacao("e");
		//this.addOperacao("pi");
		this.setTitle(CalculadoraView.titulo);

	}
	private void adicionaDigito(String dig) {
		//falta o teste para caso o displayEdit não tenha digitos ainda para colocar 0 antes do ponto
		if (dig.equals(".")) {
			if (displayEdit.getText().contains(".")){
				dig = "";
			}
			if (displayEdit.getText().isEmpty()|| displayEdit.getText().length()== 0){
				dig = "0.";
			}
		}
		displayEdit.setText( displayEdit.getText() + dig);
	}
	private void apagaDigito() {

		if (displayEdit.getText().substring(displayEdit.getText().length()-1).equals(" ")) {
			displayEdit.setText( displayEdit.getText().substring(0, displayEdit.getText().length()-3));
			this.temOperacao = false;
		} else {
			displayEdit.setText( displayEdit.getText().substring(0, displayEdit.getText().length()-1));
		}
	}
	private void apagaTudo() {
		displayEdit.setText( "");
		this.temOperacao = false;
	}

	public void addOperacao(String sinal) {
		JButton btn = new JButton(sinal);
		btn.setPreferredSize(new Dimension(50, 40));
		btn.setMaximumSize(new Dimension(50, 40));

		btn.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				digOperacao(((JButton)evt.getSource()).getText());
			}
		});
		this.jPanelOperacoes.add(btn);
	}

	private void digOperacao(String op ) {
		if (! this.temOperacao) {
			displayEdit.setText( displayEdit.getText() + " "+op+" ");
			this.temOperacao = true;
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

		jPanel2 = new javax.swing.JPanel();
		displayEdit = new javax.swing.JTextField();
		jPanel3 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton0 = new javax.swing.JButton();
		jButtonIgual = new javax.swing.JButton();
		jButtonBackSpace = new javax.swing.JButton();
		jButtonAC = new javax.swing.JButton();
		jButtonPonto = new javax.swing.JButton();
		jPanelOperacoes = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		displayEdit.setEditable(false);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(displayEdit)
		);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
								.addComponent(displayEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
								.addContainerGap())
		);

		jButton1.setText("1");
		jButton1.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton1.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton1.setPreferredSize(new java.awt.Dimension(50, 40));

		jButton2.setText("2");
		jButton2.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton2.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton2.setPreferredSize(new java.awt.Dimension(50, 40));

		jButton3.setText("3");
		jButton3.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton3.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton3.setPreferredSize(new java.awt.Dimension(50, 40));

		jButton4.setText("4");
		jButton4.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton4.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton4.setPreferredSize(new java.awt.Dimension(50, 40));

		jButton5.setText("5");
		jButton5.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton5.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton5.setPreferredSize(new java.awt.Dimension(50, 40));

		jButton6.setText("6");
		jButton6.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton6.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton6.setPreferredSize(new java.awt.Dimension(50, 40));
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("7");
		jButton7.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton7.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton7.setPreferredSize(new java.awt.Dimension(50, 40));

		jButton8.setText("8");
		jButton8.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton8.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton8.setPreferredSize(new java.awt.Dimension(50, 40));

		jButton9.setText("9");
		jButton9.setToolTipText("");
		jButton9.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton9.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton9.setPreferredSize(new java.awt.Dimension(50, 40));

		jButton0.setText("0");
		jButton0.setMaximumSize(new java.awt.Dimension(100, 40));
		jButton0.setMinimumSize(new java.awt.Dimension(50, 29));
		jButton0.setPreferredSize(new java.awt.Dimension(50, 40));

		jButtonIgual.setText("=");

		jButtonBackSpace.setText("<-");

		jButtonAC.setText("AC");

		jButtonPonto.setText(".");

		jPanelOperacoes.setBackground(new java.awt.Color(240, 207, 207));
		jPanelOperacoes.setLayout(new java.awt.GridLayout(5, 2, 5, 5));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButtonBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
																		.addComponent(jButtonIgual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jButton0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jButtonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanelOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(137, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButtonPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButtonBackSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jButtonAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(0, 0, Short.MAX_VALUE))
										.addComponent(jPanelOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap())
		);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap())
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(73, Short.MAX_VALUE))
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jButton6ActionPerformed



	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField displayEdit;
	private javax.swing.JButton jButton0;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JButton jButtonAC;
	private javax.swing.JButton jButtonBackSpace;
	private javax.swing.JButton jButtonIgual;
	private javax.swing.JButton jButtonPonto;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanelOperacoes;
	// End of variables declaration//GEN-END:variables
}
