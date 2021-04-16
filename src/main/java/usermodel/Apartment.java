package usermodel;

import java.util.Objects;

public class Apartment {

    private String nrOfRooms;
    private String Utilities;
    private String Address;
    private String price;
    private String Description;
    private String OwnerName;


   public Apartment(){

   }

   public Apartment(String nrOfRooms,String Utilities,String Address,String price,String Description,String OwnerName){


        this.nrOfRooms =  nrOfRooms;
        this.Utilities = Utilities;
        this.Address = Address;
        this.price = price;
        this.Description = Description;
        this.OwnerName = OwnerName;

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


    @Override
    public int hashCode() {
        int result = nrOfRooms.hashCode();
        result = 31 * result + OwnerName.hashCode();
        result = 31 * result + Description.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + Utilities.hashCode();
        result = 31 * result + Address.hashCode();
        result = 31 * result + price.hashCode();

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
                '}';
    }
}
