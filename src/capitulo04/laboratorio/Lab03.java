package capitulo04.laboratorio;

import java.util.Calendar;

public class Lab03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		
		for(int anoCopa = 1930; anoCopa <= anoAtual; anoCopa +=4) {
			
			if(anoCopa == 1942 || anoCopa == 1946) {
				continue;
			} else {
				System.out.println("Copa do mundo de " + anoCopa);
			}
			
		} 
	}
	
}
