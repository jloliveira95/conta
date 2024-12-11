package conta.model;

public class Conta {
    
 // Atributos
private int numero;
private int agencia;
private int tipo;
private String titular;
private float saldo;


//conceito de encapsulamento:
/*4 Tipos de modificadores de acesso.
*Private - wifi da usa casa
*Protected - wifi que precisa de login
*Public - wifi aberto
*Defaut
*/


// Método Especial - Método Construtor
public Conta(int numero,int agencia,int tipo, String titular, float saldo) {
    this.numero = numero;
    
    
    // this => Classe Conta <= neste caso é como se fosse: Conta.número
    this.agencia = agencia;
    this.tipo = tipo;
    this.titular = titular;
    this.saldo = saldo;
}

// Comportamentos/Métodos

// Métodoas de Acesso

// Getters and Setters: set: pegar / set: colocar ou setar
public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}

public int getAgencia() {
    return agencia;
}

public void setAgencia(int agencia) {
    this.agencia = agencia;
}

public float getSaldo() {
    return saldo;
}

public void setSaldo(float saldo) {
    this.saldo = saldo;
}

public String getTitular() {
    return titular;
}

public void setTitular(String titular) {
    this.titular = titular;
}
}
