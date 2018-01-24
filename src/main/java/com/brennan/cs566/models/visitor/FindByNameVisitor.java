package com.brennan.cs566.models.visitor;

import com.brennan.cs566.models.element.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class FindByNameVisitor implements Visitor {

    @Getter
    private List<Element> foundElements;

    private String searchString;

    public FindByNameVisitor(String searchString) {
        this.foundElements = new ArrayList<>();
        this.searchString = searchString;
    }

    @Override
    public void visit(Element visitable) {

    }

    @Override
    public void visit(Asset asset) {
        if (asset.getType().equals(searchString)) {
            foundElements.add(asset);
        }
    }

    @Override
    public void visit(Building building) {
        if (building.getName().equals(searchString)) {
            foundElements.add(building);
        }
    }

    @Override
    public void visit(Employee employee) {
        if (employee.getName().equals(searchString)) {
            foundElements.add(employee);
        }
    }

    @Override
    public void visit(Floor floor) {

    }

    @Override
    public void visit(Room room) {
        if (room.getDescription().contains(searchString))
    }

    @Override
    public void visit(BuildingSystem buildingSystem) {

    }
}
