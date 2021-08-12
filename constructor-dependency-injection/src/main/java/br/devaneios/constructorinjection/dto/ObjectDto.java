package br.devaneios.constructorinjection.dto;

import br.devaneios.constructorinjection.model.ObjectEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ObjectDto {

    private String name;

    public ObjectDto(ObjectEntity object){
        this.name = object.getName();
    }

    // Método utilizado para testar o incremento do id (pode ser comentado)
    public String toString(ObjectEntity object){
        return "{" +
                "\"" + "id" + "\":\"" + object.getId() + "\"" +
                "\"" + "name" + "\":\"" + this.name + "\"" +
                "}";
    }

}
