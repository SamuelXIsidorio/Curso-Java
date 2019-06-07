package capitulo14;

public class ExecutandoDiversosLambda {
	public static void main(String[] args) {
		ExemploFuncional01 ex01 = () -> System.out.println("Hello World!");
		ex01.imprimir();
		
		ExemploFuncional02 ex02 = x -> System.out.println(x);
		ex02.imprimir("Testando...");
		
		ExemploFuncional03 ex03 = (x, y) -> System.out.println("Nome: " + x + " - Idade: " + y);
		ex03.imprimir("Diego Sousa", 30);
		
		ex03 = (x,y)-> {
			
		};
		
	}
}
