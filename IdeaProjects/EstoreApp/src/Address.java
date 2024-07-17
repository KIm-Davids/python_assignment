import java.util.ArrayList;

public class Address extends Users{

   ArrayList<Address> customersAddress = new ArrayList<>();

    public Address(Address cityName, Address street, Address houseNumber, Address countryName, Address state) {
        this.customersAddress.add(cityName);
        this.customersAddress.add(street);
        this.customersAddress.add(houseNumber);
        this.customersAddress.add(countryName);
        this.customersAddress.add(state);
    }

    public ArrayList<Address> userAddress(){
        return customersAddress;
    }


}
