package model

// Data class do usuário
data class User(
    val name: String,
    val email: String,
    val senha: String,
    val age: Int
)

object Model {

    // Armazena os dados dos usuários.
    private val userList = mutableListOf<User>()

    // Adicionar usuário.
    fun addUser(user: User) {
        userList.add(user)
    }

    // Visualizar todos os usuários.
    fun viewUsers(): List<User> {
        return userList.toList()
    }

}
