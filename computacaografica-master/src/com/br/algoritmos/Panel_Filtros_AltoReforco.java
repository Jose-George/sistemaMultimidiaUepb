package com.br.algoritmos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Panel_Filtros_AltoReforco extends JPanel {

	public BufferedImage imagemAltoReforco;
	
	/**
	 * Create the panel.
	 */
	public Panel_Filtros_AltoReforco() {
		
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(new Rectangle(0, 0, 250, 250));

	}
	
	public void colocaImagemNoPainel(int alturaDaImagem1, int larguraDaImagem1, int matrizDaImagem1[][],double coeficienteA){
		try {
			geraImagem(alturaDaImagem1, larguraDaImagem1, matrizDaImagem1,coeficienteA);
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar abrir a imagem.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void geraImagem(int alturaDaImagem1, int larguraDaImagem1, int matrizDaImagem1[][],double coeficienteA) throws Exception{
		
        int altura = alturaDaImagem1;
        int largura = larguraDaImagem1;
        
        int matrizImagem[][] = new int[altura][largura];       
        imagemAltoReforco = new BufferedImage(altura, largura, BufferedImage.TYPE_INT_RGB);
        
        
        for(int i = 1; i<altura-1; i++){
        	for(int j=1;j<largura-1;j++){
        		

        		int mask1 = matrizDaImagem1[i - 1][j - 1] * -1;
                int mask2 = matrizDaImagem1[i - 1][j] * -1;
                int mask3 = matrizDaImagem1[i - 1][j + 1] * -1;
                int mask4 = matrizDaImagem1[i][j - 1] * -1;
                int mask5 = (int) (matrizDaImagem1[i][j] * (9 * coeficienteA - 1));
                int mask6 = matrizDaImagem1[i][j + 1] * -1;
                int mask7 = matrizDaImagem1[i + 1][j - 1] * -1;
                int mask8 = matrizDaImagem1[i + 1][j] * -1;
                int mask9 = matrizDaImagem1[i + 1][j + 1] * -1;

                int altoReforco = mask1 + mask2 + mask3 + mask4 + mask5 + mask6 + mask7 + mask8 + mask9;
        		matrizImagem[i][j] = altoReforco;
        		
        		//verificacao do valor do pixel caso o mesmo ultrapasse o valor de 255 (valor maximo)
        		if(matrizImagem[i][j] > 255){
        			matrizImagem[i][j] = 255;
        		}
        		
        		//verificacao do valor do pixel caso o mesmo ultrapasse o valor de 0 (valor minimo)
        		if(matrizImagem[i][j] < 0){
        			matrizImagem[i][j] = 0;
        		}
        		
        		imagemAltoReforco.setRGB(j, i, corPixel(matrizImagem[i][j]));
        		repaint();
        	}
        } 
    }
	
	static int corPixel(int corRGB){
		Color cor = new Color(corRGB, corRGB, corRGB);
		return cor.getRGB();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(imagemAltoReforco, 0, 0, null);
	}

}
