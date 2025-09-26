package entities;

import java.util.Objects;

public class Aluno {

    private Integer cod;

    public Aluno(Integer cod) {
        this.cod = cod;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(cod, aluno.cod);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }
}
