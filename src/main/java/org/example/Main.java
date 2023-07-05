package org.example;

import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args) {
       Integer edad=34;
       universidad  objetoUniversisdad=new universidad();
       Usuario objetoUsuario= new Usuario(25, "miguel","123",4,"ra@gmail.com");

        System.out.printf(objetoUniversisdad.nombres);
        System.out.println(objetoUsuario);
    }
}