import java.util.Scanner;
public class Ejerci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner mi_escaner = new Scanner(System.in);

System.out.print("Ingrese un Numero:");
int n1=mi_escaner.nextInt();
System.out.println(n1);
System.out.println("Ingrese otro Numero:");
int n2=mi_escaner.nextInt();
System.out.println(n2);
System.out.println("Ingrese 1 para sumar, 2 para restar 3 para multiplicar 4 para dividir:");
/*int suma=1;
int resta=2;
int multiplicar =3;
int dividir=4;*/
int operacion =mi_escaner.nextInt();
if (operacion==1){
	System.out.println("La Suma es "+ (n1+n2) );
	
}else if (operacion==2){
	System.out.println("La Resta es "+ (n1-n2) );
}else if (operacion==3){
	System.out.println("La Multiplicacion es "+ (n1*n2) );
}else if (operacion==4){
	System.out.println("La Division es "+ (n1/n2) );
}

	}

}
