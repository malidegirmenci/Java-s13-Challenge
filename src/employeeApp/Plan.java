package employeeApp;

public enum Plan {
    OUTPATIENT_TREATMENT("Outpatient Treatment",30),
    CHEMOTHERAPY("Chemotherapy",100),
    RADIOTHERAPY("Radiotherapy",60),
    INTENSIVE_CARE("Intensive Care", 45),
    DIALYSIS("Dialysis", 70);

    private final String name;
    private final double price;

    Plan(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return  name;
    }

    public double getPrice() {
        return price;
    }
}
