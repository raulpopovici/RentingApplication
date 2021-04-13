package usermodel;

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


}
