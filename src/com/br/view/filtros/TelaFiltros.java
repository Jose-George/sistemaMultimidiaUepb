package com.br.view.filtros;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.br.view.PanelInicial;
import com.br.view.TelaInicial;
import com.br.view.operadores.TelaOperadores;


public class TelaFiltros extends JPanel {

	private static final long serialVersionUID = 1L;

	BufferedImage imagemOriginal;

	public TelaFiltros(){
		setSize(1024, 720);
		setLayout(null);
		setVisible(true);

		// Painel lateral
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
		botaoPaginaInicial.setIcon(new ImageIcon(PanelInicial.class
				.getResource("/com/icon/home.png")));
		botaoPaginaInicial.setBounds(0, 102, 194, 39);
		botaoPaginaInicial.setForeground(Color.BLACK);
		botaoPaginaInicial.setBackground(SystemColor.scrollbar);
		botaoPaginaInicial.setFont(new Font("Segoe UI Semilight", Font.PLAIN,
				18));
		panelOpcaoLateral.add(botaoPaginaInicial);

		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(TelaInicial.class.getResource("/com/br/images/logo.jpg")));
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
		
		JButton botaoMenuFiltros = new JButton("Filtros");
		botaoMenuFiltros.setHorizontalAlignment(SwingConstants.LEFT);
		botaoMenuFiltros.setForeground(Color.BLACK);
		botaoMenuFiltros.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		botaoMenuFiltros.setBackground(SystemColor.scrollbar);
		botaoMenuFiltros.setBounds(10, 180, 184, 39);
		panelOpcaoLateral.add(botaoMenuFiltros);
		

		// INICIO PANEL SUPERIOR

		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(SystemColor.windowBorder);
		panelSuperior.setBounds(194, 0, 830, 102);
		add(panelSuperior);
		panelSuperior.setLayout(null);

		// Corpo do sistema
		JLabel labelFiltros = new JLabel("Filtros");
		labelFiltros.setForeground(Color.WHITE);
		labelFiltros.setFont(new Font("Segoe UI Semilight",
				Font.PLAIN, 24));
		labelFiltros.setBounds(10, 24, 730, 55);
		panelSuperior.add(labelFiltros);
		
		
		JButton botaoSobel = new JButton("Sobel");
		botaoSobel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaFiltroSobel sobel = new TelaFiltroSobel();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(sobel);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoSobel.setForeground(SystemColor.text);
		botaoSobel.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoSobel.setBackground(new Color(0, 102, 255));
		botaoSobel.setBounds(470, 137, 200, 82);
		add(botaoSobel);
		
		JButton botaoAltoReforco = new JButton("Alto Reforço");
		botaoAltoReforco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaFiltroAltoReforco altoR = new TelaFiltroAltoReforco();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(altoR);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
			}
		});
		botaoAltoReforco.setForeground(SystemColor.text);
		botaoAltoReforco.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoAltoReforco.setBackground(new Color(0, 102, 255));
		botaoAltoReforco.setBounds(728, 137, 200, 82);
		add(botaoAltoReforco);
		
		JButton botaoPrewitt = new JButton("Prewitt");
		botaoPrewitt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoDeMouse) {
				
				TelaFiltroPrewitt telaFiltroPrewitt = new TelaFiltroPrewitt();
				TelaInicial.contentPane.removeAll();
				TelaInicial.contentPane.add(telaFiltroPrewitt);
				TelaInicial.contentPane.validate();
				TelaInicial.contentPane.repaint();
				
			}
		});
		botaoPrewitt.setForeground(SystemColor.text);
		botaoPrewitt.setFont(new Font("Segoe UI Light", Font.BOLD, 18));
		botaoPrewitt.setBackground(new Color(0, 102, 255));
		botaoPrewitt.setBounds(224, 137, 200, 82);
		add(botaoPrewitt);
		

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage((Image) imagemOriginal, 0, 0, null);
	}
}
