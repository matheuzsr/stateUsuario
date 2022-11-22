package com.stateusuario.state;

import com.stateusuario.User;

public abstract class StateUser {
  protected User user;

  public StateUser(User user) {
    this.user = user;
  }

  public void activeUser(User modifierUser) {
    throw new RuntimeException("Você não pode realizar a ativação do usuário");
  }

  public void cancelUser(User modifierUser) {
    throw new RuntimeException("Você não pode realizar o cancelamento do usuário");
  }
}
