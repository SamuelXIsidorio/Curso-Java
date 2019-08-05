package capitulo02;

public class TiposDadosEx04 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// WRAPPERS - EMPACOTAM O TIPO PRIMITIVO EM UM OBJETO
		Byte b = 10;
		Short s = 10;
		Integer idade = 15;
		Long l;
		Float f;
		Double d;
		
		String nomeAluno = "Geroncio Silva";
		System.out.println(nomeAluno.length());
		String idadeTxt = idade.toString();
		System.out.println(idadeTxt.length());
		
	}
}
