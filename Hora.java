package TP03;

import java.util.Scanner;

public class Hora{
    
	private int hora;
	private int min;
	private int seg;
	private boolean v;
	private int aux = 0;
	public String erro = "Valor inválido. Tente novamente.";

	public Hora(){
		Scanner leitor = new Scanner(System.in); 
		v = true;
		aux = 0;
		do{ 
			System.out.println("Digite a hora (entre 0 e 23): ");
			if (leitor.hasNextInt()) {
				aux = leitor.nextInt();
				if (aux > 0 && aux < 24){
					hora = aux;
					v = false;
				}
				else{
					System.out.println(erro);
				}	
			}
			else {
				System.out.println(erro);
				leitor.next();
			} 
		} while (v);
		v = true;
		do{ 
			System.out.println("Agora digite os minutos (entre 0 e 59): ");
			if (leitor.hasNextInt()) {
				aux = leitor.nextInt();
				if (aux > 0 && aux < 60){
					min = aux;
					v = false;
				}
				else{
					System.out.println(erro);
				}	
			}
			else {
				System.out.println(erro);
				leitor.next();
			} 
		} while (v);
		v = true;
		do{ 
			System.out.println("Finalmente, digite os segundos (entre 0 e 59): ");
			if (leitor.hasNextInt()) {
				aux = leitor.nextInt();
				if (aux > 0 && aux < 60){
					seg = aux;
					v = false;
				}
				else{
					System.out.println(erro);
				}	
			}
			else {
				System.out.println(erro);
				leitor.next();
			} 
		} while (v);
		System.out.println("Hora definida com sucesso.");
	}
	public Hora(int h, int m, int s){
		hora = h;
		min = m;
		seg = s;
	}
	public void setHor(int h){
		hora = h;
	}
	public void setMin(int m){
		min = m;
	}
	public void setSeg(int s){
		seg = s;
	}
	public void setHor(){
		Scanner leitor = new Scanner(System.in); 
		v = true;
		aux = 0;
		do{ 
			System.out.println("Digite a hora (entre 0 e 23): ");
			if (leitor.hasNextInt()) {
				aux = leitor.nextInt();
				if (aux > 0 && aux < 24){
					hora = aux;
					v = false;
				}
				else{
					System.out.println(erro);
				}	
			}
			else {
				System.out.println(erro);
				leitor.next();
			} 
		} while (v);
		System.out.println("Hora atualizada com sucesso.");
	}
	public void setMin(){
		Scanner leitor = new Scanner(System.in); 
		v = true;
		aux = 0;
		do{ 
			System.out.println("Digite os minutos (entre 0 e 59): ");
			if (leitor.hasNextInt()) {
				aux = leitor.nextInt();
				if (aux > 0 && aux < 60){
					min = aux;
					v = false;
				}
				else{
					System.out.println(erro);
				}	
			}
			else {
				System.out.println(erro);
				leitor.next();
			} 
		} while (v);
		System.out.println("Hora atualizada com sucesso.");
	}
	public void setSeg(){
		Scanner leitor = new Scanner(System.in); 
		v = true;
		aux = 0;
		do{ 
			System.out.println("Digite os segundos (entre 0 e 59): ");
			if (leitor.hasNextInt()) {
				aux = leitor.nextInt();
				if (aux > 0 && aux < 60){
					seg = aux;
					v = false;
				}
				else{
					System.out.println(erro);
				}	
			}
			else {
				System.out.println(erro);
				leitor.next();
			} 
		} while (v);
		System.out.println("Hora atualizada com sucesso.");
	}
	public int getHor(){
		return hora;
	}
	public int getMin(){
		return min;
	}
	public int getSeg(){
		return seg;
	}
	public String getHora1(){
		String horaformatada = (hora + ":" + min + ":" + seg);
		return horaformatada;
	}
	public String getHora2(){
		String horaformatada;
		if (hora > 11) horaformatada = ((hora-12) + ":" + min + ":" + seg + " PM");
		else horaformatada = (hora + ":" + min + ":" + seg + " AM");
		return horaformatada;
	}
	public int getSegundos(){
		int segundos = (hora*3600)+(min*60)+(seg);
		return segundos;
	}
}