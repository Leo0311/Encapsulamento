package atividade1;

import javax.swing.JOptionPane;

public class Executa {

	public static void main(String[] args) {
		Atividade1 at = new Atividade1();
		
		at.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a sua Idade:")));
		
		
		at.setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Informe um peso :")));
		
		
		at.setpesoDois(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um peso maior :")));
		
		
		at.setLetra(JOptionPane.showInputDialog(null, "Informe  uma letra:").charAt(0));
		
		
		at.setCasado(false	);
		
		
		at.setnumeroGrande(Long.parseLong(JOptionPane.showInputDialog(null,"Informe um número grande ")));
		
		

		at.setNumeroCurto(Short.parseShort(JOptionPane.showInputDialog(null,"Informe um numero curto ")));
		
		

        at.setnumero(Byte.parseByte(JOptionPane.showInputDialog(null,"Informe um número ")));
		
        JOptionPane.showMessageDialog(null,at.getIdade()+"\n"+ at.getPeso()+"\n"+at.getpesoDois()+"\n"+at.getLetra()
		+"\n"+at.isCasado()+"\n"+at.getnumeroGrande()+"\n"+at.getNumeroCurto()+"\n"+at.getnumero());
	}
}
