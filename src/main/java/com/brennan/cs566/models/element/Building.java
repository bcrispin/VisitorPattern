package com.brennan.cs566.models.element;

import com.brennan.cs566.models.visitor.Visitor;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Building implements Element {

    private String name;
    @Singular
    private List<Floor> floors;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Floor floor : floors) {
            floor.accept(visitor);
        }
    }
}
