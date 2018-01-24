package com.brennan.cs566.models.visitor;

import com.brennan.cs566.models.element.*;
import com.brennan.cs566.models.element.BuildingSystem;

public class PrintAllVisitor implements Visitor{
    @Override
    public void visit(Element visitable) {

    }

    @Override
    public void visit(Asset asset) {
        System.out.println(String.format("Asset:%s with value:%d", asset.getType(), asset.getValue()));
    }

    @Override
    public void visit(Building building) {
        System.out.println(String.format("Building: ", building.getName() ));
    }

    @Override
    public void visit(Employee employee) {
        System.out.println(String.format("Employee: %s Title: %s Salary: %s", employee.getName(), employee.getTitle(), employee.getSalary()));
    }

    @Override
    public void visit(Floor floor) {
        System.out.println("Floor: " + floor.getLevel());
    }

    @Override
    public void visit(Room room) {
        System.out.println("Room: " + room.getRoomNumber() + " Description: " + room.getDescription());
    }

    @Override
    public void visit(BuildingSystem buildingSystem) {
        System.out.println("System: " + buildingSystem.getName());
    }
}
