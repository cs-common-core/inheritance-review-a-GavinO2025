package TechCompany;

public class Developer extends Employee{
    public int level;

    public Developer(String name, String title, int level){
        super(name, title);
        this.level = level;
        
    }

    public void work() {
        System.out.println(getName() + " is working as a level " + level + " " + getTitle());
    }
}
