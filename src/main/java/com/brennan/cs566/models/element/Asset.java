package com.brennan.cs566.models.element;

import com.brennan.cs566.models.visitor.Visitor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Asset implements Element{
    private int value;
    private String type;


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
