package jpabook2.jpashop2.controller;

import jpabook2.jpashop2.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class BookForm {

    private Long id;

    @NotEmpty(message = "이름은 필수 입니다.")
    private String name;

    private int price;
    private int stockQuantity;

    private String author;
    private String isbn;
}
