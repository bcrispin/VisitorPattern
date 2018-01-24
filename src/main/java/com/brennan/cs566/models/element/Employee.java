package com.brennan.cs566.models.element;

import com.brennan.cs566.models.visitor.Visitor;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Employee implements Element {

    private int salary;
    private String name;
    private String title;

    @Singular
    private List<Asset> assets;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Asset asset : assets) {
            asset.accept(visitor);
        }
    }
}
