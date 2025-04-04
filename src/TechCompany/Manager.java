package TechCompany;

public class Manager extends Employee {
    boolean isPrez;
    Manager(String name,String title, boolean isPrez){
        super(name, title);
        this.isPrez = isPrez;
    }
    public void work() {
        if(!isPrez){
            System.out.println(getName() + " is working as a " + getTitle());
        } else{
            System.out.println(getName() + " doesn't need to work");
        }
    }
    public String toString(){
        return getName() + " Is a great manager";
    }
}
