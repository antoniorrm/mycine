package br.ufc.vv.mycine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String nome;

    public Filme() {
    }

    //Todo: Remover isso
    public Filme(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    //Todo: Remover isso
    public int getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }
}
