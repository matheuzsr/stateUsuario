package com.stateusuario.status;

import com.stateusuario.User;

public class DisableUser extends StateUser {
  public DisableUser(User user) {
    super(user);
  }

  public void activeUser(User modifierUser) {
    if (!modifierUser.isAdministrator()) {
      throw new RuntimeException("Para ativar o usuário é necessário um usuário administrador!");
    }

    this.user.setStatus(new ActiveUser(this.user));
    System.out.println("Usuário ativo com sucesso!");
  }

  public void cancelUser(User modifierUser) {
    if (!modifierUser.isAdministrator()) {
      throw new RuntimeException("Para cancelar o usuário é necessário um usuário administrador!");
    }

    this.user.setStatus(new CanceledUser(this.user));

    System.out.println("Usuário cancelado com sucesso!");
  }
}
