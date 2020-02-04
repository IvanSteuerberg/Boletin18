package boletin18_2_3;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Boletin18_2_3 {

    public static void main(String[] args) {
Metodos a = new Metodos();
a.crearArrayRandom();
//a.amosarArrayNotas();
a.contarAprobadosSuspensos();
System.out.println("Nota media: "+a.calcularNotaMedia());
a.amosarNotaAlta();

a.crearArrayNomes();
//a.amosarArrayNomes();
a.amosarArrays();
/*
a.visualizarNotaAlumno();
a.visualizarAlumnosAprobados();
a.ordencrecenteArrays();
a.amosarArrays();
a.amosarListaAprobados();
*/
a.hacerMenu();

}
    
}
