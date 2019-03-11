package lv.Homework4;

public class StockClass {
    public double updatePrice;
    private String company;
    private double currentValue;
    private double max;
    private double min;


    public StockClass(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        this.min = currentValue;
        this.max = currentValue;
    }


    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public String getCompany() {
        return company;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void updatePrice(double newValue) {
        this.currentValue = newValue;

        if (newValue > getMax()) {
            this.max = newValue;
        } else if (newValue < getMin()) {
            this.min = newValue;
        }
    }

    public void printInformation() {
        System.out.println("current value = " +currentValue);
        System.out.println("max = "+ getMax());
        System.out.println("min = "+ getMin());
    }

}
