package jpabook2.jpashop2.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
@Getter
@Setter
public class Book extends Item{

    private String author;
    private String isbn;

    //== 변경 메서드 ==//
    public void change(String name, int price, int stockQuantity) {
        this.setName(name);
        this.setPrice(price);
        this.setStockQuantity(stockQuantity);
    }
}
