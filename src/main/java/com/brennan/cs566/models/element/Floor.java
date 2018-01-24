package com.brennan.cs566.models.element;

import com.brennan.cs566.models.visitor.Visitor;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Floor implements Element {

    private int level;

    @Singular
    private List<Room> rooms;
    @Singular
    private List<BuildingSystem> buildingSystems;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Room room : rooms) {
            room.accept(visitor);
        }
        for (BuildingSystem sys : buildingSystems) {
            sys.accept(visitor);
        }
    }
}
