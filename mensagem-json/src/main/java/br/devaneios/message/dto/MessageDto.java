package br.devaneios.message.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageDto {

    private String text;

    @Override
    public String toString(){
        return "{" +
                "\"" + "text" + "\":\"" + text + "\"" +
                "}";
    }
}
