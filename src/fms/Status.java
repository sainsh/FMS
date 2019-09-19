package fms;

public enum Status {
    DockedAway("Docked Away"), OnVoyage("On Voyage"), DockedAtHome("Docked At Home");

    Status(String status) {
        this.status = status;
    }

    private final String status;

    public String getStatus(){
        return status;
    }
}
