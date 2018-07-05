package computer;

public class main {

    public static void main(String[] args) {
        Computer c = new Computer();
        System.out.println(c.getModel() + " " + c.getRamAmount());

        c.setModel("someComp");
        c.setRamAmount(5);
        System.out.println(c.getModel() + " " + c.getRamAmount());

        c.setModel("someNewComp");
        c.setRamAmount(-1);
        System.out.println(c.getModel() + " " + c.getRamAmount());

        Computer comp = new Computer("2 param", 25);
        System.out.println(comp.getModel() + " " + comp.getRamAmount());

        Computer comp2 = new Computer("modelOnly");
        System.out.println(comp2.getModel() + " " + comp2.getRamAmount());

        Computer comp3 = new Computer(100);
        System.out.println(comp3.getModel() + " " + comp3.getRamAmount());

        System.out.println("=---------------------=");
        ComputerUtils.printAll(c, comp, comp2, comp3);
        ComputerUtils.printAll();

        Computer searchComp = ComputerUtils.findComp(100, c, comp, comp2, comp3);
        System.out.println(searchComp.getModel());
    }
}


