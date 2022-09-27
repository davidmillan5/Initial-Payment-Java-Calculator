package InitialValueCalculator;

public abstract class Properties {

    private int id;
    private String projectName;
    private String location;
    private Double price;
    private Double initialpayment;
    private int months;
    private Double monthlyPayments;
    private Double downPaymentPercentage;
    private Double initialValue;
    private Double advancePayment;
    private String builder;

    private Double initialPaymentPercentage;

    public Properties() {
    }

    public Properties(int id, String projectName, String location, Double price, int months, String builder) {
        this.id = id;
        this.projectName = projectName;
        this.location = location;
        this.price = price;
        this.months = months;
        this.builder = builder;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getInitialpayment() {
        return initialpayment;
    }

    public void setInitialpayment(Double initialpayment) {
        this.initialpayment = initialpayment;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public Double getMonthlyPayments() {
        return monthlyPayments;
    }

    public void setMonthlyPayments(Double monthlyPayments) {
        this.monthlyPayments = monthlyPayments;
    }

    public Double getDownPaymentPercentage() {
        return downPaymentPercentage;
    }

    public void setDownPaymentPercentage(Double downPaymentPercentage) {
        this.downPaymentPercentage = downPaymentPercentage;
    }

    public Double getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(Double initialValue) {
        this.initialValue = initialValue;
    }

    public Double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(Double advancePayment) {
        this.advancePayment = advancePayment;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public Double getInitialPaymentPercentage() {
        return initialPaymentPercentage;
    }

    public void setInitialPaymentPercentage(Double initialPaymentPercentage) {
        this.initialPaymentPercentage = initialPaymentPercentage;
    }

    public Double getInitialPayments(Double initialPaymentPercentage, Double price){
        Double initialPaymentValue = price * initialPaymentPercentage;
        return initialPaymentValue;
    }

    public Double getMonthlyPayment(Double initialPaymentValue, int months, Double price){
        Double initialPayment = getInitialPayments(initialPaymentValue, price);
        Double monthlyPayments = initialPayment/months;
        return monthlyPayments;
    }

    public Double getCreditAmount(Double price, Double initialPaymentValue){
        Double creditValue = price - initialPaymentValue;
        return creditValue;
    }

}
