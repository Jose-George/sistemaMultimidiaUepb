package com.br.view.operadores;

import java.awt.Color; 
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.br.view.PanelInicial;
import com.br.view.TelaInicial;
import com.br.view.filtros.TelaFiltros;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaOperadoresAritmeticos extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaOperadoresAritmeticos() {

		setSize(1024, 720);
		setLayout(null);
		setVisible(true);
		
		// INICIO PANEL OPCAO LATERAL
		
		JPanel panelOpcaoLateral = new JPanel();
		panelOpcaoLateral.setBackground(SystemColor.scrollbar);
		panelOpcaoLateral.setBounds(0, 0, 194, 720);
		add(panelOpcaoLateral);
		panelOpcaoLateral.setLayout(null);
		
		JButton botaoPaginaInicial = new JButton("Página Inicial");
		botaoPaginaInicial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				PanelInicial panelInicial = new PanelInicial();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(panelInicial);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoPaginaInicial.setHorizontalAlignment(SwingConstants.LEFT);
		botaoPaginaInicial.setIcon(new ImageIcon(PanelInicial.class.getResource("/com/icon/home.png")));
		botaoPaginaInicial.setBounds(0, 102, 194, 39);
		botaoPaginaInicial.setForeground(Color.BLACK);
		botaoPaginaInicial.setBackground(SystemColor.scrollbar);
		botaoPaginaInicial.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		panelOpcaoLateral.add(botaoPaginaInicial);
		
		JButton botaoOperadoresAritmeticos = new JButton("Aritméticos");
		botaoOperadoresAritmeticos.setHorizontalAlignment(SwingConstants.LEFT);
		botaoOperadoresAritmeticos.setForeground(Color.BLACK);
		botaoOperadoresAritmeticos.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoOperadoresAritmeticos.setBackground(Color.GRAY);
		botaoOperadoresAritmeticos.setBounds(20, 180, 174, 39);
		panelOpcaoLateral.add(botaoOperadoresAritmeticos);
		
		JButton botaoMenuFiltros = new JButton("Filtros");
botaoMenuFiltros.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaFiltros telaFiltro = new TelaFiltros();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaFiltro);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoMenuFiltros.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuFiltros.setForeground(Color.BLACK);
		botaoMenuFiltros.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuFiltros.setBackground(SystemColor.scrollbar);
		botaoMenuFiltros.setBounds(10, 217, 184, 39);
		panelOpcaoLateral.add(botaoMenuFiltros);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(TelaOperadoresAritmeticos.class.getResource("/com/br/images/logo.jpg")));
		lblImg.setBounds(0, 0, 194, 103);
		panelOpcaoLateral.add(lblImg);
		
		JButton botaoOperadores = new JButton("Operadores");
		botaoOperadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadores telaOperadores = new TelaOperadores();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadores);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoOperadores.setHorizontalAlignment(SwingConstants.LEFT);
		botaoOperadores.setForeground(Color.BLACK);
		botaoOperadores.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoOperadores.setBackground(SystemColor.scrollbar);
		botaoOperadores.setBounds(10, 141, 184, 39);
		panelOpcaoLateral.add(botaoOperadores);
		
		// FIM PANEL LATERAL
		
		// INICIO PANEL OPCAO INTERNA
		
		JPanel panelOpcaoInterno = new JPanel();
		panelOpcaoInterno.setBackground(Color.WHITE);
		panelOpcaoInterno.setBounds(194, 102, 830, 618);
		add(panelOpcaoInterno);
		panelOpcaoInterno.setLayout(null);
		
		JButton botaoAdicao = new JButton("Adição");
		botaoAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaOperadorAritmeticoAdicao telaOperadorAritmeticoAdicao = new TelaOperadorAritmeticoAdicao();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadorAritmeticoAdicao);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoAdicao.setForeground(Color.WHITE);
		botaoAdicao.setBackground(new Color(0, 102, 255));
		botaoAdicao.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoAdicao.setBounds(10, 11, 393, 213);
		panelOpcaoInterno.add(botaoAdicao);
		

		// FIM PANEL OPCAO INTERNA
		
		//INICIO PANEL SUPERIOR
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(SystemColor.windowBorder);
		panelSuperior.setBounds(194, 0, 830, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);
		
		JLabel labelOperacoesAritmeticas = new JLabel("Operadores Aritméticos");
		labelOperacoesAritmeticas.setForeground(Color.WHITE);
		labelOperacoesAritmeticas.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 24));
		labelOperacoesAritmeticas.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelOperacoesAritmeticas);
			
	}

}
