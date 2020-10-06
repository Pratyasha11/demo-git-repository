package org.oops.modifiers;

public class Vehicle {

    private String id;
    private String type;
    public String registrationState;
    String color;




    public Vehicle(String id, String type, String color) {
        this.id = id;
        this.type = type;
        this.color = color;
    }

    public Vehicle() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegistrationState() {
        return registrationState;
    }

    public void setRegistrationState(String registrationState) {
        if(registrationState == null){
            this.registrationState = "DL";
        }
        else {
            this.registrationState = registrationState;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}