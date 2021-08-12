package br.devaneios.constructorinjection.model;

public class IdGenerator {

    private static int id = 0;

    public static int getIncrementedId(){
        return ++IdGenerator.id;
    }

}
