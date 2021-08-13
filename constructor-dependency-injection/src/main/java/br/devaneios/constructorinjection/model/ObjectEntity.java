package br.devaneios.constructorinjection.model;

import lombok.*;

@Getter
@Setter
public class ObjectEntity {

    @Setter(AccessLevel.NONE)
    private int id;

    private String name;

    public ObjectEntity(){
        this.id = IdGenerator.getIncrementedId();
    }

    public ObjectEntity(String name) {
        this.name = name;
    }

}
