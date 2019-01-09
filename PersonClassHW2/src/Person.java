//PT -- javadocs missing. -2

abstract class Person {
    protected int age;
    protected String phoneNumber;
    protected String name;

    //PT -- why have this if it's not used? -1
    Person() {}
    Person(String name_, String phoneNumber_, int age_)
    {
        age = age_;
        phoneNumber = phoneNumber_;
        name = name_;
    }
    abstract void display();
    public String getName() {return name;}
    public String getPhoneNumber() {return phoneNumber;}
    public int getAge() {return age;}
    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
