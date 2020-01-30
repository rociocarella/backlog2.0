/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.ClienteDao;
import modelo.Cliente;

/**
 *
 * @author VAIO
 */
public class Prueba {

    public static void main(String[] args) {
        ClienteDao cliDao = new ClienteDao();
        Cliente cli = new Cliente();

//        login
//        50 cristian pilinparaelcristian
//        4 bet gjgh
//        7 lalal lalal
//        5 visit ggiuyy8y
//        6 polll jggj
//        1 root AAA
//        2 admin 1q1q1 
        System.out.println(cliDao.autenticacion("rocio", " r23"));
//          aqui debes ingresar los datos de cuentas registrados en la BD
//        crear Cliente
//        cliDao.create(new Cliente(1, "admin", "11-0", "sout", "avd 122", "stgo", "admin@duoc.cl", "assss", "AAA"));
//        cliDao.create(new Cliente(2, "root", "22-0", "north", "avd 22", "stgo", "admin@duoc.cl", "assss", "BBB"));
//        cliDao.create(new Cliente(3, "sub", "33-0", "sout", "avd 122", "stgo", "admin@duoc.cl", "assss", "CCC"));
//        cliDao.create(new Cliente(4, "vaio", "11350620-0", "sout", "avd 122", "stgo", "admin@duoc.cl", "assss", "DDD"));
//
//        Eliminar Cliente
//        cliDao.delete(1);
//
//        actualizar Cliente
//        cliDao.update(new Cliente(3, "vaio", "11350620-0", "sout", "avd 122", "stgo", "admin@duoc.cl", "assss", "AAA"));
//
//        leer por ID_CLIENTE Cliente clienteBuscar = cliDao.read(4);
//        System.out.println("Usuario :" + clienteBuscar.getNOMBRE() + "\n" + " Contraseña : " + clienteBuscar.getPASS() + "\n" + " Rut Cliente : " + clienteBuscar.getRUT());
//
//        leer todos los Cliente
//        ArrayList<Cliente> cliente = (ArrayList<Cliente>) cliDao.readAll();
//        for (int i = 0; i < cliente.size(); i++) {
//            System.out.println(cliente.get(i).getID_CLIENTE() + " " + cliente.get(i).getNOMBRE() + " " + cliente.get(i).getPASS());
//        }
        
//            System.out.println("Usuario :" + clienteBuscar.getNOMBRE() + "\n" + " Contraseña : " + clienteBuscar.getPASS() + "\n" + " Rut Cliente : " + clienteBuscar.getRUT());
//            System.out.print(cliente.get(i).getID_CLIENTE());
//            System.out.print(cliente.get(i).getNOMBRE());
//            System.out.print(cliente.get(i).getRUT());
//            System.out.print(cliente.get(i).getAPELLIDO());
//            System.out.print(cliente.get(i).getDIRECCION());
//            System.out.print(cliente.get(i).getCOMUNA());
//            System.out.print(cliente.get(i).getEMAIL());
//            System.out.print(cliente.get(i).getFECHA_NAC());
//            System.out.print(cliente.get(i).getPASS()); 
//

    }

}
