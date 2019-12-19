package Models;

public class House extends Services{
    private double floor;

    public House(String servicesName, String rentType, double rentPay, double rentPeople, double rentArae) {
        super(servicesName, rentType, rentPay, rentPeople, rentArae);
    }

    public House() {
    }

    @Override
    public double getRentArae() {
        return super.getRentArae();
    }

    @Override
    public void setRentArae(double rentArae) {
        super.setRentArae(rentArae);
    }

    @Override
    public String getServicesName() {
        return super.getServicesName();
    }

    @Override
    public void setServicesName(String servicesName) {
        super.setServicesName(servicesName);
    }

    @Override
    public String getRentType() {
        return super.getRentType();
    }

    @Override
    public void setRentType(String rentType) {
        super.setRentType(rentType);
    }

    @Override
    public double getRentPay() {
        return super.getRentPay();
    }

    @Override
    public void setRentPay(double rentPay) {
        super.setRentPay(rentPay);
    }

    @Override
    public double getRentPeople() {
        return super.getRentPeople();
    }

    @Override
    public void setRentPeople(double rentPeople) {
        super.setRentPeople(rentPeople);
    }

    public double getFloor() {
        return floor;
    }

    public void setFloor(double floor) {
        this.floor = floor;
    }

    @Override
    public void showInfor() {
        getFloor();
        super.showInfor();
    }
}
