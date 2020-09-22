
public class Autor {
	private String nombre;
	private String apellido;
	private int ano_nacimiento;
	
	public Autor(String nombre,String apellido, int a) {
		this.nombre=nombre;
		this.apellido=apellido;
		ano_nacimiento=a;				
		
	}
	
	public String getnombre() {return apellido+" "+nombre; }
}
