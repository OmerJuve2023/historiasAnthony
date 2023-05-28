package controller;

import models.Cliente;

import javax.swing.*;

/*public class ClientController {

    private Cliente[] clientes = new Cliente[50];
    private int cont = 0;

    public void setMenu() {
        String rpta = (String) JOptionPane.showInputDialog(null,
                "Ingresar una de las opciones:",
                "",
                JOptionPane.PLAIN_MESSAGE,
                null,
                menu,
                menu[0]);
        options(rpta);
    }

    private void options(String rpta) {
        if (rpta.equals(menu[0])) registrarDatos();
        else if (rpta.equals(menu[1])) mostrarDatos();
        else salida();
    }

    private void mostrarDatos() {
        openerInsertion();
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i].getCodigo());
        }
        setMenu();
    }

    public int salir() {
        return JOptionPane.showConfirmDialog(null,
                "ESTA SEGURO QUE DESEA SALIR",
                "",
                JOptionPane.YES_NO_OPTION);
    }

    private void salida() {
        int aux = salir();
        if (aux == 0) System.exit(0);
        else setMenu();

    }

    private void openerInsertion() {
        for (int i = 1; i < clientes.length; i++) {
            Cliente objetoActual = clientes[i];
            int j = i - 1;
            while (j >= 0 && clientes[j].getCodigo() > objetoActual.getCodigo()) {
                clientes[j + 1] = clientes[j];
                j--;
            }
            clientes[j + 1] = objetoActual;
        }
    }

    private void registrarDatos() {
        String code = JOptionPane.showInputDialog("", "ingresar Código");
        *//*validateCodigo(code);*//*
        String nombre = JOptionPane.showInputDialog("", "ingresar Nombre");
        String apellidoPaterno = JOptionPane.showInputDialog("", "ingresar Apellido Paterno");
        String apellidoMaterno = JOptionPane.showInputDialog("", "ingresar Apellido Materno");
        String ciudad = JOptionPane.showInputDialog("", "ingresar Ciudad");
        clientes[cont] = new Cliente(Integer.parseInt(code), apellidoPaterno, apellidoMaterno, nombre, ciudad);
        cont++;
        setMenu();
    }

    private void validateCodigo(String code) {
        for (int i = 0; i < clientes.length; i++) {
            if (code.equals(String.valueOf(clientes[i].getCodigo()))) {
                JOptionPane.showMessageDialog(null, "Este código ya existe");
                registrarDatos();
                break;
            }
        }
    }

    String[] menu = new String[]{
            "INGRESAR",
            "MOSTRAR",
            "SALIR"
    };
}*/
public class ClientController {
    private Cliente[] clientes;
    private int contador;

    public ClientController() {
        clientes = new Cliente[50];
        contador = 0;
    }

    public void registrarCliente(Cliente cliente) {
        if (existeCodigo(cliente.getCodigo())) {
            System.out.println("El código de cliente ya existe. No se pudo registrar.");
            return;
        }

        clientes[contador] = cliente;
        contador++;
    }

    public void mostrarClientes() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Código: " + clientes[i].getCodigo());
            System.out.println("Apellido Paterno: " + clientes[i].getApellidoPaterno());
            System.out.println("Apellido Materno: " + clientes[i].getApellidoMaterno());
            System.out.println("Nombre: " + clientes[i].getNombre());
            System.out.println("Ciudad: " + clientes[i].getCiudad());
            System.out.println("---------------------------------------");
        }
    }

    private boolean existeCodigo(int codigo) {
        for (int i = 0; i < contador; i++) {
            if (clientes[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ClientController registro = new ClientController();

        Cliente cliente1 = new Cliente(1, "López", "Gómez", "Juan", "Lima");
        Cliente cliente2 = new Cliente(2, "García", "Pérez", "María", "Arequipa");
        Cliente cliente3 = new Cliente(3, "Pérez", "Rodríguez", "Pedro", "Trujillo");

        registro.registrarCliente(cliente1);
        registro.registrarCliente(cliente2);
        registro.registrarCliente(cliente3);

        registro.mostrarClientes();
    }
}




