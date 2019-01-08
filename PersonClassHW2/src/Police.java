public class Police extends Person implements Employee{
    private String role;
    private int ID = 123457;
    Police() { role = "not yet set"; }      //default constructor
    Police(String name_, String phoneNumber_, int age_)
    {
        name = name_;
        phoneNumber = phoneNumber_;
        age = age_;
    }

    public String getRole() {return role;}
    public void setRole(String role_) { role = role_;}
    public void display()         //displays this person's info
    {
         System.out.println(this.getName() + ", age " + this.getAge() +", works in the police force as a " + this.getRole());
    }
    public int getPay() { return 40000; }
    public int getID() {return ID; }

}
