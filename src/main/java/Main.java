package org.example;


import org.example.UsuarioDAO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        private static Object usuario;

        static void main() {
            UsuarioDAO usuarios = new UsuarioDAO();
            usuarios.salvarUsuario("italo ximenes melo","comecu692@gmail.com","furautero","6969");

            IO.println("processo finalizado");
        }
    }

