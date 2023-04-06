public class CoffeeShops {
private String Name;
public String GetName(){
    return Name;
}
public void SetName(String Name){
    this.Name = Name;
}
private String Address;
    public String GetAddress(){
        return Address;
    }
    public void SetAddress(String Address){
        this.Address = Address;
    }
    public CoffeeShops(String Name, String Address){
        this.Name = Name;
        this.Address = Address;
    }
}
