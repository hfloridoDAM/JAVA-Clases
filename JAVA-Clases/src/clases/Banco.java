package clases;

public class Banco {

	public static void main(String[] args) {
		//Instancio la clase Cuenta
		Cuenta miCuenta = new Cuenta();
		
		//Le doy valor al atributo nombre mediante us setter
		miCuenta.setNombre("Pepe");
		
		//Imprimo el nombre mediante le getter
		System.out.println(miCuenta.getNombre());
		
		//Le doy valor a la cuenta mediante el setter
		//A la vez el setter le da valor al atributo iban
		miCuenta.setNumCuenta("1234567890");
		
		//Imprimo el atributo numCuenta mediante el getter
		System.out.println("Mi cuenta:" + miCuenta.getNumCuenta());
		
		//Imprimo el atributo iban mediante le getter
		System.out.println("Mi iban:" + miCuenta.getIban());
	}

}
