package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class EventCategory {

    @Id
    @GeneratedValue
    private int id;

    @Size(min=3, message="Name must be at least 3 charaCTERS LONG")
    private String name;

    public EventCategory(@Size(min=3, message="Name must be at least 3 charaCTERS LONG") String name) {
        this.name = name;
    }

    public EventCategory() {
    }


    public String getName() {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
