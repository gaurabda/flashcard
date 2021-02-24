package com.dirghayumainali.flashcard.v1.entity;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Card extends BaseEntity<Long>{
    /*
    Including both question and answer in hashcode generation
    eg: Q. What is h2O?
        A. Water | Steam | Ice | Snow
     */
    @NotBlank
    @Column(name="name")
    @EqualsAndHashCode.Include
    private String question;

    @NotBlank
    @Column(name="name")
    @EqualsAndHashCode.Include
    private String answer;

    public Card(Long id, @NotBlank String question, @NotBlank String answer) {
        super(id);
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String toString(){
        return "{ " +
                "id = "+this.getId()+
                ", question = "+this.getQuestion()+
                ", answer = "+this.getAnswer()+
                "}";
    }


}
