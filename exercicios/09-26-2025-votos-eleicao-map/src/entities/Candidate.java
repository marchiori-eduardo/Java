package entities;

import java.util.Objects;

public class Candidate {
    private String name;
    private Integer numberVotes;

    public Candidate(String name, Integer numberVotes) {
        this.name = name;
        this.numberVotes = numberVotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberVotes() {
        return numberVotes;
    }

    public void setNumberVotes(Integer numberVotes) {
        this.numberVotes = numberVotes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name) && Objects.equals(numberVotes, candidate.numberVotes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberVotes);
    }
}
