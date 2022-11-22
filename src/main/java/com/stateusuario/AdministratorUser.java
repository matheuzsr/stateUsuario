/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stateusuario;

/**
 *
 * @author matheus-ufes
 */
public class AdministratorUser extends User {
    String departamentMangement;
    public AdministratorUser(String departamentMangement) {
        super("administrador");

        this.departamentMangement = departamentMangement;
    }
}
