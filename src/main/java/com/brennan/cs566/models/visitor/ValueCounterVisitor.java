package com.brennan.cs566.models.visitor;

import com.brennan.cs566.models.element.*;
import lombok.Getter;

public class ValueCounterVisitor implements Visitor {

    @Getter
    private int value;

    public ValueCounterVisitor() {
        value = 0;
    }

    @Override
    public void visit(Element visitable) {

    }

    @Override
    public void visit(Asset asset) {
        value += asset.getValue();
    }

    @Override
    public void visit(Building building) {

    }

    @Override
    public void visit(Employee employee) {
        value += employee.getSalary();
    }

    @Override
    public void visit(Floor floor) {

    }

    @Override
    public void visit(Room room) {

    }

    @Override
    public void visit(BuildingSystem buildingSystem) {

    }
}
