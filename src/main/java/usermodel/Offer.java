package usermodel;

import java.util.Objects;

public class Offer {


    public String clientFirstName;
    public String clientLastName;
    public String clientPhoneNumber;
    private String nrOfRooms;
    private String Utilities;
    private String Address;
    private String price;
    private String Description;
    private String OwnerName;
    public String Date;


    public Offer(){

    }

    public Offer(String nrOfRooms,String Utilities,String Address,String price,String Description,String OwnerName,String clientFirstName,String clientLastName,String clientPhoneNumber,String Date){


        this.nrOfRooms =  nrOfRooms;
        this.Utilities = Utilities;
        this.Address = Address;
        this.price = price;
        this.Description = Description;
        this.OwnerName = OwnerName;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.Date = Date;



    }

    public String getNrOfRooms() {
        return nrOfRooms;
    }

    public void setNrOfRooms(String nrOfRooms) {
        this.nrOfRooms = nrOfRooms;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setUtilities(String utilities) {
        Utilities = utilities;
    }

    public String getUtilities() {
        return Utilities;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientName) {
        this.clientFirstName = clientName;
    }

    public String getClientLastName() {
        return clientFirstName;
    }

    public void setClientLastName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getDate() {return Date;}

    public void setDate(String Date){this.Date=Date;}

    @Override
    public int hashCode() {
        int result = nrOfRooms.hashCode();
        result = 31 * result + OwnerName.hashCode();
        result = 31 * result + Description.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + Utilities.hashCode();
        result = 31 * result + Address.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + clientFirstName.hashCode();
        result = 31 * result + clientLastName.hashCode();
        result = 31 * result + clientPhoneNumber.hashCode();
        result= 31 * result + Date.hashCode();


        return result;
    }


    @Override
    public String toString() {
        return "Apartment{" +
                "nrOfRooms='" + nrOfRooms + '\'' +
                ", Utilities='" + Utilities + '\'' +
                ", Address='" + Address + '\'' +
                ", price='" + price + '\'' +
                ", Description='" + Description + '\'' +
                ", OwnerName='" + OwnerName + '\'' +
                ",clientFirstName='" + clientFirstName + '\'' +
                ",clientLastName='" + clientLastName + '\'' +
                ",clientPhoneNumber='" + clientPhoneNumber + '\'' +
                ",Date='"+ Date + '\'' +
                '}';
    }
}
