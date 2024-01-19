package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {


    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return getValue();
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o; //Cast to make it an object type (PositionType)
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // Getters and Setters:


    @Override
    public String describe() {
        return null;
    }

}
