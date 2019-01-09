//PT -- missing javadoc. -2

public class Kid extends Person{
    private String favCandy;

    Kid() { favCandy = "not set";}

    public String getFavCandy() { return favCandy; }
    public void setFavCandy(String candy) {favCandy = candy; }
    //PT -- instead override toString, and return a string. Leave the UI to a UI class
    public void display()
    {
        System.out.println(this.getName() + ", age " + this.getAge()+" Fav candy: " + getFavCandy());
    }

}
