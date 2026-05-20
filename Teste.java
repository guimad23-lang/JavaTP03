package TP03;

public class Teste{
	public static void main(String[] args){
		Hora teste = new Hora(14, 53, 45);
		System.out.println(teste.getHor());
		System.out.println(teste.getMin());
		System.out.println(teste.getSeg());
		teste.setHor(19);
		teste.setMin(45);
		teste.setSeg(13);
		System.out.println(teste.getHora1());
		teste.setHor();
		teste.setMin();
		teste.setSeg();
		System.out.println(teste.getHora2());
		Hora teste2 = new Hora();
		System.out.println(teste2.getSegundos());
	}
}