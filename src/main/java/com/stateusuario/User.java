/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stateusuario;

import com.stateusuario.status.DisableUser;
import com.stateusuario.status.StateUser;

/**
 *
 * @author matheus-ufes
 */
public class User {

    protected String name;
    protected String password;
    protected String typeUser;

    protected StateUser state;

    public User(String typeUser) {
        this.state = new DisableUser(this);

        this.typeUser = typeUser;
    }

    public User(StateUser state) {
        this.state = state;
    }

    public void setStatus(StateUser state) {
        this.state = state;
    }

    public StateUser getStatus() {
        return this.state;
    }

    public void activeUser(User modifierUser) {
        this.state.activeUser(modifierUser);
    }

    public void cancelUser(User modifierUser) {
        this.state.cancelUser(modifierUser);
    }

    public boolean isAdministrator() {
        return this.typeUser.equals("administrador");
    }

}
