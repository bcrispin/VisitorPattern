package com.brennan.cs566.models.element;

import com.brennan.cs566.models.visitor.Visitor;
import lombok.ToString;

public interface Element {
    public void accept(Visitor visitor);
}
