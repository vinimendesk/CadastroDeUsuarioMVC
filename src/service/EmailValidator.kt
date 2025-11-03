package service

class EmailValidator {

    fun validatorEmail(email: String): Boolean {

        println("-----------------------------------------")
        println(" ")
        println("[SOA/EmailValidator] Chamada ao serviço de validação de email para: $email")
        println(" ")
        println("-----------------------------------------")

        return email.contains("@") && email.endsWith(".com")
    }

}