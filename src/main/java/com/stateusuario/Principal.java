/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.stateusuario;

/**
 *
 * @author matheus-ufes
 */
public class Principal {

    public static void main(String[] args) {
        AdministratorUser adminUser = new AdministratorUser("ti");

        User secretary = new Secretary();
        secretary.activeUser(adminUser);
        secretary.cancelUser(adminUser);

        secretary.activeUser(adminUser);
    }
}
