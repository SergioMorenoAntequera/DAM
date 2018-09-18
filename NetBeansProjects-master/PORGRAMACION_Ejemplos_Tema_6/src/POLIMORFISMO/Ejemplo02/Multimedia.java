/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POLIMORFISMO.Ejemplo02;

/*
Crea una clase Multimedia para almacenar informacion de los objetos
de tipo multimedia (peliculas, discos, mp3, mp4...). _Esta clase 
contiene titulo, autor, formato y duración como atributos. El formato puede ser
uno de los siguientes: wav, mp3, midi, avi, mov, mpg, cdAudio y dvd. El valor
de todos los atributos se para por parametro en el momenrto de crear el objeto
. Esta clase tiene ademñas un metodo para devolver cada uno de los atributos y
un metodo toString que devuelve la informacion del objeto por ultimo, u metodo
equals() que recibe un objeto de tipo Multimedia y devuelve true en caso de que
titulo y el autor sean iguales y false en caso contrario
*/

/**
 *
 * @author diurno
 */
public class Multimedia {
    
    protected String titulo;
    protected String autor;
    protected Formato formato;
    protected int duracion;
    
    /*CONSTRUCTOR*/
    public Multimedia(String titulo, String autor, Formato formato, int duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }
    
    /*GETTER Y SETTER*/
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    /*METODOS*/
    @Override
    public String toString(){
        String msg = ("Titulo: " + this.titulo + 
            "\nAutor: " + this.autor +
            "\nFormato: " + this.formato + 
            "\nDuracion: " + this.duracion);
        return msg;
    }
    
    public boolean equals(){
        if (this.autor.equals(this.titulo)){
            return true;
        } else {
            return false;
        }
    }
}
