package com.brennan.cs566;

import com.brennan.cs566.models.element.*;
import com.brennan.cs566.models.element.BuildingSystem;
import com.brennan.cs566.models.visitor.FindByNameVisitor;
import com.brennan.cs566.models.visitor.PrintAllVisitor;
import com.brennan.cs566.models.visitor.ValueCounterVisitor;

public class Main {

    public static void main(String[] args) {
        Building office = generateSampleBuilding();
        PrintAllVisitor printAllVisitor = new PrintAllVisitor();
        ValueCounterVisitor valueCounterVisitor = new ValueCounterVisitor();
        FindByNameVisitor findByNameVisitor = new FindByNameVisitor("Bob");

        office.accept(printAllVisitor);
        office.accept(valueCounterVisitor);
        office.accept(findByNameVisitor);

        System.out.println("Total value: " + valueCounterVisitor.getValue());

        findByNameVisitor.printFoundElements();

    }

    private static Building generateSampleBuilding() {
        Employee e1 = Employee.builder()
                .name("Bob")
                .title("SWE")
                .salary(50000)
                .asset(
                        Asset.builder()
                                .type("Computer")
                                .value(1000).build()
                ).build();

        Employee e2 = Employee.builder()
                .name("Jane")
                .title("Manager")
                .salary(150000)
                .asset(
                        Asset.builder()
                                .type("Computer")
                                .value(1000).build()
                ).build();

        Employee e3 = Employee.builder()
                .name("Steve")
                .title("PM")
                .salary(60000)
                .asset(
                        Asset.builder()
                                .type("Computer")
                                .value(1000).build()
                ).build();

        Asset a1 = Asset.builder()
                .type("tv")
                .value(1000)
                .build();

        Asset a2 = Asset.builder()
                .type("fridge")
                .value(1000)
                .build();

        Asset a3 = Asset.builder()
                .type("table")
                .value(1000)
                .build();

        BuildingSystem s1 = BuildingSystem.builder()
                .name("HVAC")
                .build();

        Room r1 = Room.builder()
                .asset(a1)
                .asset(a2)
                .description("an office")
                .roomNumber(102)
                .employee(e1)
                .employee(e2).
                        build();

        Room r2 = Room.builder()
                .asset(a3)
                .roomNumber(101)
                .employee(e3)
                .description("a really nice office")
                .build();

        Room r3 = Room.builder()
                .roomNumber(100)
                .description("an empty office")
                .build();

        Floor f1 = Floor.builder()
                .level(0)
                .room(r1)
                .room(r2)
                .buildingSystem(s1).build();

        Floor f2 = Floor.builder()
                .room(r3)
                .build();

        Building theOffice = Building.builder()
                .name("My office")
                .floor(f1)
                .floor(f2)
                .build();

        return theOffice;
    }
}
