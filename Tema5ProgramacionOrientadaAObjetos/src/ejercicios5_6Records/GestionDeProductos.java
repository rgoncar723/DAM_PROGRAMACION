package ejercicios5_6Records;

public class GestionDeProductos {
	public void show() {
		Producto teclado = new Producto(1,"Teclado",78.97);
		Producto raton = new Producto(2,"raton",48.50);
		Producto pantalla = new Producto(4,"pantalla",178.35);
		Producto USB = new Producto(-9,"pantalla",78.90);// ID invalido
		Producto RAM = new Producto(12,"",78.90);//Nombre en blanco
		Producto discoDuro = new Producto(12,"Disco duro",0);//Precio igual a 0
		
		System.out.println(teclado);
		System.out.println(raton);
		System.out.println(pantalla);
		System.out.println(USB);
		System.out.println(RAM);
		System.out.println(discoDuro);
		
		Producto tecladoD = teclado.aplicarDescuento(60);//60%
		Producto ratonD = raton.aplicarDescuento(120);//120% Descuento invalido
		
		System.out.println(tecladoD);
		System.out.println(ratonD);
	}

	public static void main(String[] args) {
		new GestionDeProductos().show();

	}

}
