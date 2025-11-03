package service

import model.Model
import model.User

class UserService {

    private val emailValidator = EmailValidator()

    private val dataModel = Model

    fun addUser(user: User): User {
        if (emailValidator.validatorEmail(user.email)) {
            dataModel.addUser(user)
            println("-----------------------------------------")
            println(" ")
            println("Usuário ${user.name} adicionado com sucesso!")
            println(" ")
            println("-----------------------------------------")
        } else {
            println("-----------------------------------------")
            println(" ")
            println("E-mail Inválido")
            println(" ")
            println("-----------------------------------------")

        }
        return user
    }

}