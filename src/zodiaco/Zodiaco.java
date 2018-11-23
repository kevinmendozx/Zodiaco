/*
1) Escribir el codigo para un juego donde se genere una fecha al azar
y el usuario debe adivinar a que signo del zodiaco pertenece
*/


package zodiaco;

import java.util.Random;
import java.util.Scanner;

public class Zodiaco {
    private static Integer dia, mes, mesDia, respuesta;
    private static String nombre, fechaCompleta;
    private static Random rnd;
    private static Scanner sca;
    
    public static void bienvenida (){
        System.out.println("Bienvenido al juego del Zodiaco");
        System.out.println("");
        System.out.println("Reglas:");
        System.out.println("Se mostrará una fecha al azar y se debe adivinar a que signo del zodiaco pertenece");
        System.out.println("");
    }
    
    public static void ingresoNombre (){
        sca=new Scanner (System.in);
        System.out.println("Por favor ingresse su nombre");
        nombre=sca.nextLine();
        System.out.println("");
    }
    
    public static Integer aleatorio (Integer valor){ //Funcion que devuelve un valor aleatorio
        Integer aleatorio;
        rnd=new Random();
        aleatorio=rnd.nextInt(valor)+1;
        return aleatorio;
    }
    
    public static void fechaAleatoria (){
        System.out.println(nombre+", se generera una fecha aleatoria");
        String mesEnLetras="";
        mes=aleatorio(12);
        if (mes==2){
            mesEnLetras="Febrero";
            dia=aleatorio (28);
        } else {
            if (mes==4||mes==6||mes==9||mes==11){
                dia=aleatorio(30);
                switch(mes){
                    case 4:
                        mesEnLetras="Abril";
                        break;
                    case 6:
                        mesEnLetras="Junio";
                        break;
                    case 9:
                        mesEnLetras="Setiembre";
                        break;
                    case 11:
                        mesEnLetras="Noviembre";
                        break;
                }
            } else {
                dia=aleatorio(31);
                switch(mes){
                    case 1:
                        mesEnLetras="Enero";
                        break;
                    case 3:
                        mesEnLetras="Marzo";
                        break;
                    case 5:
                        mesEnLetras="Mayo";
                        break;
                    case 7:
                        mesEnLetras="Julio";
                        break;
                    case 8:
                        mesEnLetras="Agosto";
                        break;
                    case 10:
                        mesEnLetras="Octubre";
                        break;
                    case 12:
                        mesEnLetras="Diciembre";
                        break;
                }
            }
        }
        mesDia=Integer.parseInt(String.valueOf(mes)+String.valueOf(dia));
        fechaCompleta=String.valueOf(dia)+" de "+mesEnLetras;
        System.out.println("");
        System.out.println(fechaCompleta);
//        System.out.println("mes "+mes);
//        System.out.println("dia "+dia);
//        System.out.println(mesDia);
    }
    
    public static void juego (){
        sca=new Scanner(System.in);
        System.out.println("");
        System.out.println("A que signo del Zodiaco pertenece la fecha "+fechaCompleta);
        System.out.println("1.- Acuario");
        System.out.println("2.- Piscis");
        System.out.println("3.-Aries");
        System.out.println("4.-Tauro");
        System.out.println("5.-Géminis");
        System.out.println("6.-Cancer");
        System.out.println("7.-Leo");
        System.out.println("8.-Virgo");
        System.out.println("9.-Libra");
        System.out.println("10.-Escorpio");
        System.out.println("11.-Sagitario");
        System.out.println("12.-Capricorneo");
        do {
            System.out.println("A que signo pertenece la fecha: "+fechaCompleta);
            respuesta=sca.nextInt();
        } while (verificacion(respuesta)==false);
        System.out.println("");
        System.out.println("");
        System.out.println("FELICITACIONES "+ nombre);
        System.out.println("GANASTE!!!!!!!!!!!!!!!!!");
    }
    
    public static Boolean verificacion (Integer valor){
        Boolean aprobado=false;
        switch(valor){
            case 1:
                if(mesDia>119&&mesDia<219){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 2:
                if(mesDia>218&&mesDia<321){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 3:
                if(mesDia>320&&mesDia<420){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 4:
                if(mesDia>419&&mesDia<521){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 5:
                if(mesDia>520&&mesDia<621){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 6:
                if(mesDia>620&&mesDia<723){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 7:
                if(mesDia>722&&mesDia<823){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 8:
                if(mesDia>822&&mesDia<923){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 9:
                if(mesDia>922&&mesDia<1023){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 10:
                if(mesDia>1022&&mesDia<1122){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 11:
                if(mesDia>1121&&mesDia<1222){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            case 12:
                if(mesDia>1221&&mesDia<=1231||mesDia>=101&&mesDia<120){
                    aprobado=true;
                } else {
                    System.out.println("Respuesta equivocada");
                }
                break;
            default:
                System.out.println("La respuesta debe estar entre 1 y 12");
                break;
                
        }
        return aprobado;
    }
    
    public static void main(String[] args) {
        bienvenida ();
        ingresoNombre ();
        fechaAleatoria ();
        juego();
    }
    
}
