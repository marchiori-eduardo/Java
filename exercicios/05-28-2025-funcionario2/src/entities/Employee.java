package entities;

public class Employee {
    public String name;
    public double salarioBruto;
    public double imposto;
    public double percetage;


    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public double aumentoSalario() {
        return salarioBruto * (percetage / 100);
    }

    public double salarioAjustado() {
        return salarioLiquido() + aumentoSalario();
    }

    public String toString() {
        return "Dados atualizados: "
                + name
                + ", "
                + "$ "
                + String.format("%.2f", salarioAjustado());
    }
}
