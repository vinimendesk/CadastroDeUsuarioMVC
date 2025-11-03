package controller

import model.Model
import model.User
import service.UserService

class Controller {

    private val model = Model
    private val userService = UserService()

    // Função adicionar usuários.
    fun addUser(user: User) {
        userService.addUser(user)
    }

    // Função visualizar usuários.
    fun viewUsers(): List<User> {
        return model.viewUsers()
    }

}