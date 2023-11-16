package employeeApp;

public class Company {
    private String id;
    private String name;
    private double giro;
    private String[] developerNames;

    private double checkGiro(double value){
        return value < 0 ? 0 : value;
    }
    public Company(String id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = checkGiro(giro);
        this.developerNames = developerNames;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGiro() {
        return giro;
    }

    public void setGiro(Double giro) {
        this.giro = checkGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
    public void addEmployee(int index, String name){

    }
}
