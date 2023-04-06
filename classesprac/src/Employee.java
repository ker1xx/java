public class Employee {
private String Name;
    public String GetName(){
        return Name;
    }
    public void SetName(String Name){
        this.Name = Name;
    }
    private String Surname;
    public String GetSurname(){
        return Surname;
    }
    public void SetSurname(String Surname){
        this.Surname = Surname;
    }
    private String Lastname;
    public String GetLastname(){
        return Lastname;
    }
    public void SetLastname(String Lastname){
        this.Lastname = Lastname;
    }
    private int Salary;
    public int GetSalary(){
        return Salary;
    }
    public void SetSalary(int Salary){
        this.Salary = Salary;
    }
    private String JobTitle;
    public String GetJobtitle(){
        return JobTitle;
    }
    public void SetJobTitle(String JobTitle){
        this.JobTitle = JobTitle;
    }
    public Employee(String Name, String Surname, String LastName, int Salary, String JobTitle){
        this.Name = Name;
        this.Surname = Surname;
        this.Lastname = LastName;
        this.Salary = Salary;
        this.JobTitle = JobTitle;
    }
}
