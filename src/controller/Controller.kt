package controller

import model.Model
import model.User

class Controller {

    private val model = Model

    // Função adicionar usuários.
    fun addUser(user: User) {
        model.addUser(user)
    }

    // Função visualizar usuários.
    fun viewUsers(): List<User> {
        return model.viewUsers()
    }

}