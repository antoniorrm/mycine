package br.ufc.vv.mycine.model;

import javax.persistence.*;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Cinema cinema;

    public Sala() {
    }

    //TODO: Remover isso
    public Sala(int id){
        this.id = id;
    }

    //TODO: Remover isso
    public int getId() {
        return id;
    }

}
