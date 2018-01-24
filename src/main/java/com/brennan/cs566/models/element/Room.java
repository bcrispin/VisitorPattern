package com.brennan.cs566.models.element;

import com.brennan.cs566.models.visitor.Visitor;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Room implements Element {

    @Singular
    private List<Asset> assets;
    @Singular
    private List<Employee> employees;
    @Singular
    private List<BuildingSystem> buildingSystems;

    private String description;
    private int roomNumber;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Asset asset : assets) {
            asset.accept(visitor);
        }
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
        for (BuildingSystem sys : buildingSystems) {
            sys.accept(visitor);
        }
    }
}
