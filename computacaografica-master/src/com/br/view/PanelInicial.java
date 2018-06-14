package com.br.view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.br.view.filtros.TelaFiltros;
import com.br.view.operadores.TelaOperadores;


public class PanelInicial extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelInicial() {
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
		botaoPaginaInicial.setHorizontalAlignment(SwingConstants.LEFT);
		botaoPaginaInicial.setIcon(new ImageIcon(PanelInicial.class.getResource("/com/icon/home.png")));
		botaoPaginaInicial.setBounds(0, 102, 194, 39);
		botaoPaginaInicial.setForeground(Color.BLACK);
		botaoPaginaInicial.setBackground(Color.GRAY);
		botaoPaginaInicial.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		panelOpcaoLateral.add(botaoPaginaInicial);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(PanelInicial.class.getResource("/com/br/images/logo.jpg")));
		lblImg.setBounds(0, 0, 194, 104);
		panelOpcaoLateral.add(lblImg);
		
		// FIM PANEL LATERAL
		
		// INICIO PANEL OPCAO INTERNA
		
		JPanel panelOpcaoInterno = new JPanel();
		panelOpcaoInterno.setBackground(Color.WHITE);
		panelOpcaoInterno.setBounds(194, 102, 830, 618);
		add(panelOpcaoInterno);
		panelOpcaoInterno.setLayout(null);
		
		JButton botaoOperacoes = new JButton("Operadores");
		botaoOperacoes.setToolTipText("");
		botaoOperacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaOperadores telaOperadores = new TelaOperadores();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaOperadores);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoOperacoes.setForeground(Color.WHITE);
		botaoOperacoes.setBackground(new Color(0, 102, 255));
		botaoOperacoes.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoOperacoes.setBounds(15, 11, 385, 180);
		panelOpcaoInterno.add(botaoOperacoes);
		
		JButton botaoFiltros = new JButton("Filtros");
		botaoFiltros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaFiltros telaFiltros = new TelaFiltros();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaFiltros);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoFiltros.setForeground(Color.WHITE);
		botaoFiltros.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		botaoFiltros.setBackground(new Color(0, 102, 255));
		botaoFiltros.setBounds(415, 11, 385, 180);
		panelOpcaoInterno.add(botaoFiltros);
		
		
		// FIM PANEL OPCAO INTERNA
		
		//INICIO PANEL SUPERIOR
		
		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(SystemColor.windowBorder);
		panelSuperior.setBounds(194, 0, 830, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);
		
		JLabel labelMenuPrincipal = new JLabel("Projeto de Processamento de Imagens");
		labelMenuPrincipal.setForeground(Color.WHITE);
		labelMenuPrincipal.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 24));
		labelMenuPrincipal.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelMenuPrincipal);
		
		// FIM PANEL SUPERIOR

	}
}
