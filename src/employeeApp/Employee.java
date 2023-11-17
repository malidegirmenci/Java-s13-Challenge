package employeeApp;

import java.util.Arrays;

public class Employee {
    private String id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(String id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }

    public void addHealthPlan(int index, String name){
        if(getHealthPlans().length > index){
            if(healthPlans[index] == null){
                healthPlans[index] = name;
            }else {
                System.out.println(index+"th "+"of array is already full");
            }

        }else{
            System.out.println("Index over limit of array");
        }
    }
}
