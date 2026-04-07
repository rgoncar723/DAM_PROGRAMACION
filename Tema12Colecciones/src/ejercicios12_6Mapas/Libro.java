package ejercicios12_6Mapas;

import java.util.Objects;

public class Libro {
	private int ISBN;
	private String titulo;
	private String autor;
	//Constructor
	public Libro(int ISBN, String titulo, String autor) {
		this.autor=autor;
		this.ISBN=ISBN;
		this.titulo=titulo;
		
	}
	//Get 
	public int getISBN() { //Get del ISBN
		return ISBN;
	}
	public String getAutor() {
		return autor;
	}
	public String getTitulo() {
		return titulo;
	}
	
	@Override 
	public String toString() {
		return String.format("ISBN: %d\n Titulo: %s\n Autor: %s\n ", ISBN,titulo,autor);
	}
	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN;
	}
	
}
