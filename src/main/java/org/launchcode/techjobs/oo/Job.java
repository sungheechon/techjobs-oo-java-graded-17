package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    private boolean isDefaultConstructor; // use it to check if an object only has ID and no other fields or not.

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job() {
        id = nextId;
        nextId++;
        this.isDefaultConstructor = true;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        this.isDefaultConstructor = false;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public boolean isDefaultConstructor() {
        return isDefaultConstructor;
    }

    public void setDefaultConstructor(boolean defaultConstructor) {
        isDefaultConstructor = defaultConstructor;
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        String msgEmptyField = "Data not available";
        String emptyField = "";
        String displayEmptyData = newline + "OOPS! This job does not seem to exist." + newline;

        if (isDefaultConstructor) {
            return displayEmptyData;
        }

        String display = newline +
                        "ID: " + id + newline +
                        "Name: " + (name != emptyField ? name : msgEmptyField) + newline +
                        "Employer: " + (!employer.getValue().equals(emptyField) ? employer : msgEmptyField) + newline +
                        "Location: " + (!location.getValue().equals(emptyField) ? location : msgEmptyField) + newline +
                        "Position Type: " + (!positionType.getValue().equals(emptyField) ? positionType : msgEmptyField) + newline +
                        "Core Competency: " + (!coreCompetency.getValue().equals(emptyField) ? coreCompetency : msgEmptyField) + newline;
        return display;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
