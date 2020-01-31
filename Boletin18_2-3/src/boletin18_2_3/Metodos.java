package boletin18_2_3;

import java.util.Scanner;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Metodos {
int[] notas = new int[30];
 String[] nomes = new String[30];
public void crearArrayRandom(){
for (int i = 0; i<notas.length; i++){
    notas[i]=(int)(Math.random()*(10+1));
}
}

public void amosarArrayNotas(){
for (int i = 0 ; i<notas.length; i++){
System.out.println(notas[i]);    
}
}

public void contarAprobadosSuspensos(){
int aprobados = 0,suspensos=0;
for (int i=0;i<notas.length;i++){
if (notas[i]>=5){
aprobados++;    
}
else
suspensos++;    
}
System.out.println("Numero de aprobados: "+aprobados+
        "\nNumero de suspensos: "+suspensos);    
}

public float calcularNotaMedia(){
float total=0;
for (int i=0;i<notas.length;i++){
total = total+notas[i];    
}
return total/notas.length;    
}

public void amosarNotaAlta(){
int notaMax=0;
for (int i=0;i<notas.length;i++){
if(i==0){
notaMax=notas[i];
}
if(notas[i]>notaMax){
notaMax=notas[i];
}        
}
System.out.println("A nota máis alta é: "+notaMax);
}
    public void crearArrayNomes() {
        int acumulador = 1;
        for (int i = 0; i < nomes.length; i++) {
            int numero = (int) (Math.random() * 8 + 1);
            switch (numero) {
                case 1:
                    nomes[i] = "Manuel" + acumulador;
                    acumulador++;
                    break;
                case 2:
                    nomes[i] = "Pepito" + acumulador;
                    acumulador++;
                    break;
                case 3:
                    nomes[i] = "Juan" + acumulador;
                    acumulador++;
                    break;
                case 4:
                    nomes[i] = "Javier" + acumulador;
                    acumulador++;
                    break;
                case 5:
                    nomes[i] = "Pedro" + acumulador;
                    acumulador++;
                    break;
                case 6:
                    nomes[i] = "Sara" + acumulador;
                    acumulador++;
                    break;
                case 7:
                    nomes[i] = "Laura" + acumulador;
                    acumulador++;
                    break;
                case 8:
                    nomes[i] = "Ana" + acumulador;
                    acumulador++;
                    break;
            }
        }
    }

    public void amosarArrayNomes() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

public void visualizarNotaAlumno(){
Scanner sc = new Scanner(System.in);
int aux=0;
String nomeIntroducido;
System.out.println("Introduce o nome");
nomeIntroducido= sc.nextLine();
for(int i=0;i<nomes.length;i++){
if(nomeIntroducido.equals(nomes[i])){
aux=i;
break;
}
}
System.out.println(notas[aux]);
}

public void visualizarAlumnosAprobados(){
    System.out.println("Aprobados:");
for(int i=0;i<notas.length;i++){
   if(notas[i]>=5){
       System.out.println(nomes[i]);    
   }    
       
}    
}
 
public void amosarArrays(){
for (int i = 0 ; i<notas.length; i++){
System.out.println("Nota: "+notas[i]+"  Nome: "+nomes[i]);
}    
}

public void ordencrecenteArrays(){
int aux;
String auxNome;
for (int i=0;i<notas.length-1;i++){
    for(int j=i+1;j<nomes.length;j++){
    if(notas[i]>notas[j]){
    aux = notas[i];
    notas[i]=notas[j];
    notas[j]=aux;
    auxNome = nomes[i];
    nomes[i]=nomes[j];
    nomes[j]=auxNome;
    }
    }    
}
}

public void hacerMenu(){
Scanner sc = new Scanner(System.in);
    System.out.println("1-  • Visualizar a nota dun alumno determinado\n" +
                       "2-  • Visualizar unha lista co nome dos alumnos aprobados.\n" +
                       "3-  • Visualizar unha lista ordenada por orden crecente de notas\n"+
                       "4-  • Saír  ");
int num = sc.nextInt();
switch (num){
    case 1:
        visualizarNotaAlumno();
        break;
    case 2:    
        visualizarAlumnosAprobados();
        break;
    case 3:
        ordencrecenteArrays();
        break;
    case 0:
        
    
}    
}








}

