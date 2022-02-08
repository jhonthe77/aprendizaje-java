package aprendisaje_avamzado;

public class Serilalizar_objetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista_empleados lm = new Lista_empleados();
	}

}

class empleado {
	String departamento;
	private static int ideSigiente = 1;
	private int id;
	double sueldo =  20000;// (int) (Math.random() * 1000000);
	private String nombre;

	public empleado(String nombre, String dpt) {
		this.nombre = nombre;
		id = ideSigiente;
		ideSigiente++;
		departamento = dpt;
	}

	



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = ideSigiente;
	}

	public double getSueldo() {
		return sueldo;
	}

	private void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}

class Lista_empleados {

	public Lista_empleados() {

		empleado[] empleados = new empleado[5];

		empleados[0] = new empleado("Jhon", "Recursos humano");
		empleados[1] = new empleado("Milena", " producion ");
		empleados[2] = new empleado("Ana", "Administrativo");
		empleados[3] = new empleado("Kerly", "contabilida");
		empleados[4] = new jefe("jk", "Gerencia");
		

		for (empleado e : empleados) {

			System.out.println(
					"le nombre es: " + e.getNombre() + ":"+" el id es: " + e.getId() + " el sueldo es: " + e.getSueldo() +" el depatamento es "+ e.getDepartamento());

		}
	}

}

class jefe extends empleado {
	
	public jefe (String n, String dp) {
	super(n,dp);
	
		super.sueldo += sueldo * 10 / 100;
	}
}