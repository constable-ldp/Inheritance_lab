package staff;

public abstract class Employee {

private String name;
private String ni;
protected double salary;

public Employee(String name, String ni, double salary){
    this.name = name;
    this.ni = ni;
    this.salary = salary;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary(double increment){
        if (increment < 0){
            try {
                throw new IllegalAccessException("Incorrect value");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return salary += salary * increment;
    }

    public double payBonus(){
        return salary / 100;
    }

    public void giveNewName(String newName){
        if (newName == null){
            try {
                throw new IllegalAccessException("You cannot enter null");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        this.name = newName;
    }
}