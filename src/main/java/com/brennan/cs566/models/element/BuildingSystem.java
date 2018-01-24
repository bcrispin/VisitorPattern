package com.brennan.cs566.models.element;

import com.brennan.cs566.models.visitor.Visitor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class BuildingSystem implements Element {

    private String name;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
