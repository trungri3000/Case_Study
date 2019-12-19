package Models;

public class Villa extends Services{
    private double floor;
    private double poolArea;

    public Villa(String servicesName, String rentType, double rentPay, double rentPeople, double rentArae, double floor, double poolArea) {
        super(servicesName, rentType, rentPay, rentPeople, rentArae);
        this.floor = floor;
        this.poolArea = poolArea;
    }

    public Villa(double floor, double poolArea) {
        this.floor = floor;
        this.poolArea = poolArea;
    }

    public double getFloor() {
        return floor;
    }

    public void setFloor(double floor) {
        this.floor = floor;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public Villa() {
    }

    @Override
    public void showInfor() {
        getFloor();
        getPoolArea();
        super.showInfor();
    }
}
