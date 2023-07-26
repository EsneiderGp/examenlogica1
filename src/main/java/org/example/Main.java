package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /*
        //DECLARANDO VARIABLES

        String nombreCliente;
        String apellidoCliente;
        String edadCliente;
        int numeroUsosTarjeta;
       double montoComprasAseo;
       double montoComprasComida;
       double montoOtrasCompras;
       int puntajeUsuario;


        //Inicializar las variables

        System.out.println("*****TUYA*****");

        System.out.print("Querido usuario digita tu nombre: ");
        nombreCliente=teclado.nextLine();

        System.out.print("Querido usuario digita tu apellido: ");
        apellidoCliente=teclado.nextLine();

        System.out.print("Querido usuario digita tu edad: ");
        edadCliente=teclado.nextLine();

        System.out.print("Querido usuario digita la cantidad de veces que usaste la tarjeta: ");
        numeroUsosTarjeta=teclado.nextInt();

        System.out.print("Querido usuario digita el monto de compras de objetos de aseo: ");
        montoComprasAseo=teclado.nextDouble();

        System.out.print("Querido usuario digita el monto de productos alimenticios: ");
        montoComprasComida=teclado.nextDouble();

        System.out.print("Querido usuario digita el monto de otros productos: ");
        montoOtrasCompras=teclado.nextDouble();

        System.out.print("Querido usuario digite su puntaje: ");
        puntajeUsuario=teclado.nextInt();

        //PROCESO

        double totalcuenta=montoComprasAseo+montoComprasComida+montoOtrasCompras;

        if (puntajeUsuario==1){
            double valorDescuento=totalcuenta*0.25;
            double totalDescuento=totalcuenta-valorDescuento;
            System.out.println(" Usuario "+nombreCliente+" apellido "+ apellidoCliente+" edad cliente "+edadCliente+" usos de la tarjeta "+numeroUsosTarjeta+" y su total seria "+totalDescuento);

        } else if (puntajeUsuario==2) {
            double valorDescuento=totalcuenta*0.2;
            double totalDescuento=totalcuenta-valorDescuento;
            System.out.println(" Usuario "+nombreCliente+" apellido "+ apellidoCliente+" edad cliente "+edadCliente+" usos de la tarjeta "+numeroUsosTarjeta+" y su total seria "+totalDescuento);
        } else if (puntajeUsuario==3) {
            double valorDescuento=totalcuenta*0.15;
            double totalDescuento=totalcuenta-valorDescuento;
            System.out.println(" Usuario "+nombreCliente+" apellido "+ apellidoCliente+" edad cliente "+edadCliente+" usos de la tarjeta "+numeroUsosTarjeta+" y su total seria "+totalDescuento);
            
        } else if (puntajeUsuario==4) {
            double valorDescuento=totalcuenta*0.1;
            double totalDescuento=totalcuenta-valorDescuento;
            System.out.println(" Usuario "+nombreCliente+" apellido "+ apellidoCliente+" edad cliente "+edadCliente+" usos de la tarjeta "+numeroUsosTarjeta+" y su total seria "+totalDescuento);

        } else if (puntajeUsuario==6|| puntajeUsuario==7|| puntajeUsuario==8|| puntajeUsuario==9){
            System.out.println("usted tiene plata");

        } else {

        }
*/
        //DECLARANDO VARIABLES

        String cedulaUsurio;
        String nombreComprador;
        String apellidosComprador;
        int edadComprador;
        String ciudadComprador;
        int numeroBoletasComprador;
        int costoboletas=450000;
        int totalValor;

        //Inicializar las variables

        System.out.println("****BOLETERIA HECTOR Y TITO****");

        System.out.print("Querido usuario digita tu cedula: ");
        cedulaUsurio=teclado.nextLine();

        System.out.print("Querido usuario digita tu nombre: ");
        nombreComprador=teclado.nextLine();

        System.out.print("Querido usuario digita tu apellido: ");
        apellidosComprador=teclado.nextLine();

        System.out.print("Querido usuario digita tu edad: ");
        edadComprador=teclado.nextInt();

        System.out.print("Querido usuario digita tu ciudad de residencia: ");
        ciudadComprador=teclado.next();

        System.out.print("Querido usuario digita la cantidad de boletas que quiere comprar: ");
        numeroBoletasComprador=teclado.nextInt();

        // proceso

        if (edadComprador<18){
            System.out.println(" usted no puede comprar por ser menor de edad ");
        } else if (numeroBoletasComprador>4) {
            System.out.println(" Usted no puede comprar mas de cuatro boletas ");

        }else {
            totalValor=costoboletas*numeroBoletasComprador;
            System.out.println("señor usurio "+ nombreComprador +" "+apellidosComprador+" identificado con cedula "+ cedulaUsurio+ " con edad "+ edadComprador+" lugar de residencia "+ ciudadComprador+"su total es "+ totalValor);
        }


    }
}