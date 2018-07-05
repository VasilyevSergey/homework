package computer;

public class Computer {
    private String model;
    private int ramAmount;

    public Computer(String model, int ramAmount){
        this.model = model;
        this.ramAmount = ramAmount;
        System.out.println("Создается новый компьютер");
    }

    public Computer(String model){
        this(model, 5);
    }

    public Computer(int ramAmount){
        this("default", ramAmount);
    }

    public Computer(){
        this("default", 5);
    }

    public void setRamAmount(int ramAmount) {
        if(ramAmount > 0) {
            this.ramAmount = ramAmount;
        }else{
            this.ramAmount = 0;
        }
    }

    public void setModel(String model) {
        if((model.length() >= 1)&&(model.length() <= 10)){
            this.model = model;
        }
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public String getModel() {
        return model;
    }
}
