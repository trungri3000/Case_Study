package Models;

public abstract  class Services{
    public String servicesName;
    public String rentType;
    public double rentPay;
    public double rentPeople;
    public double rentArae;

    public double getRentArae() {
        return rentArae;
    }

    public void setRentArae(double rentArae) {
        this.rentArae = rentArae;
    }

    public Services(String servicesName, String rentType, double rentPay, double rentPeople, double rentArae) {
        this.servicesName = servicesName;
        this.rentType = rentType;
        this.rentPay = rentPay;
        this.rentPeople = rentPeople;
        this.rentArae = rentArae;
    }

    public Services() {

    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getRentType() {
        return rentType;
    }
    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public double getRentPay() {
        return rentPay;
    }

    public void setRentPay(double rentPay) {
        this.rentPay = rentPay;
    }

    public double getRentPeople() {
        return rentPeople;
    }

    public void setRentPeople(double rentPeople) {
        this.rentPeople = rentPeople;
    }
    public void showInfor(){
        getRentPay();
        getRentPeople();
        getRentType();
        getServicesName();
        getRentArae();
    }
}
