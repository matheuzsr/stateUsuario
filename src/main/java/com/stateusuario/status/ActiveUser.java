package com.stateusuario.status;

import com.stateusuario.User;

public class ActiveUser extends StateUser {
  public ActiveUser(User user) {
    super(user);
  }

  public void cancelUser(User modifierUser) {
    if (!modifierUser.isAdministrator()) {
      throw new RuntimeException("Para cancelar o usuário é necessário um usuário administrador!");
    }

    this.user.setStatus(new CanceledUser(this.user));

    System.out.println("Usuário cancelado com sucesso!");
  }
}
