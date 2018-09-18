/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POLIMORFISMO.Ejemplo02;

/*Escribe una clase Película que herede de la clase Multimedia anterior. 
La clase Película tiene, además de los atributos heredados, un actor 
principal y una actriz principal. Se permite 
que uno de los dos sea nulo, 
pero no los dos. La clase debe tener dos métodos para obtener los 
nuevos atributos y debe sobreescribir el método toString() para reflejar la 
nueva información*/

/**
 *
 * @author diurno
 */
public class Pelicula extends Multimedia{
    
    
    private String actorPrincipal;
    private String actrizPrincipal;
    
    /*CONSTRUCTORES*/
    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        if(actorPrincipal == null){
            if(actrizPrincipal == null){
                System.out.println("No hay actores");
            } else {
                this.actrizPrincipal = actrizPrincipal;
            }
        } else {
            this.actrizPrincipal = actrizPrincipal;
        }
        
    }
    
    /*SETTER Y GETTER*/
    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }
    
    /*METODOS*/
    @Override
    public String toString(){
        String msg = ("Titulo: " + this.titulo + 
            "\nAutor: " + this.autor +
            "\nFormato: " + this.formato + 
            "\nDuracion: " + this.duracion + 
            "\nActor Principal: " + this.actorPrincipal +
            "\nActriz Principal: " + this.actrizPrincipal);
    return msg;
    }
    
}
