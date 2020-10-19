package br.ufes.o.semprincipio;

public class Funcionario {
    
    public double calcularSalario(String cargo) {
        if (cargo == "programador") {
            return calcularSalarioProgramador();
        } else if (cargo == "analista") {
            return calcularSalarioAnalista();
        } else {
            return 0;
        }
    }
    
    private double calcularSalarioProgramador() {
        return 2000;
    }
    
    private double calcularSalarioAnalista() {
        return 3000;
    }

}
