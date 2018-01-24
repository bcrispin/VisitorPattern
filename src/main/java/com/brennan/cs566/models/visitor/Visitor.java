package com.brennan.cs566.models.visitor;

import com.brennan.cs566.models.element.*;
import com.brennan.cs566.models.element.BuildingSystem;


public interface Visitor {
    public void visit(Element visitable);
    public void visit(Asset asset);
    public void visit(Building building);
    public void visit(Employee employee);
    public void visit(Floor floor);
    public void visit(Room room);
    public void visit(BuildingSystem buildingSystem);

}
