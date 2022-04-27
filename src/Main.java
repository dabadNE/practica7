import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "";
		String apellidos="";
		String nacimiento="";
		String dni="";
		String estudios="";
		String telefono = "";
		
		Scanner sc = new Scanner (System.in);
		Scanner sn = new Scanner (System.in);
		
		
		System.out.println("introduzca su nombre: ");
		nombre = sc.nextLine();
		System.out.println("introduzca sus apellidos: ");
		apellidos = sc.nextLine();
		System.out.println("introduzca su nacimiento: ");
		nacimiento = sc.nextLine();
		System.out.println("introduzca su dni: ");
		dni = sc.nextLine();
		System.out.println("introduzca sus estudios: ");
		estudios = sc.nextLine();
		System.out.println("introduzca su telefono: ");
		telefono = sc.nextLine();
	}

}
