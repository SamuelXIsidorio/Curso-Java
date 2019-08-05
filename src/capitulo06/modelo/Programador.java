package capitulo06.modelo;

public class Programador {
	private String cargo;
	private double salario;
	public static int matricula;

	public Programador() {

	}

	public Programador(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return this.cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public static void desenvolverSistema() {
		System.out.println("Desenvolvendo um sistema....");
	}
}
