public class Coffee {
private String Name;
    public String GetName(){
        return Name;
    }
    public void SetName(String Name){
        this.Name = Name;
    }
    private float Size;
    public float GetSize(){
        return Size;
    }
    public void SetSize(float Size){
        this.Size = Size;
    }
    public Coffee(String Name, Float Size){
        this.Name = Name;
        this.Size = Size;
    }
}
