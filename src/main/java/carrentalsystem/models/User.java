package carrentalsystem.models;

public class User {
    String name;
    String drivingLicence;

    public User(String name, String drivingLicence) {
        this.name = name;
        this.drivingLicence = drivingLicence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(String drivingLicence) {
        this.drivingLicence = drivingLicence;
    }
}
