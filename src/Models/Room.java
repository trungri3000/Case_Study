package Models;

public class Room extends Services{
    public Room(String servicesName, String rentType, double rentPay, double rentPeople, double rentArae) {
        super(servicesName, rentType, rentPay, rentPeople, rentArae);
    }

    public Room() {
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

    @Override
    public void showInfor() {
        super.showInfor();
    }
}
