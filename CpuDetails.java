class CPU {
    double Price = 15000.0;

    class Processor {
        int cores = 10;
        String manufacturer = "Intel";
    }

    static  class Ram {
        int memory = 16;
        String manufacturer = "Kingston";
    }
}

public class CpuDetails {
    public static void main(String[] args) {
        CPU c = new CPU();
        CPU.Processor p = c.new Processor();
        CPU.Ram r = new CPU.Ram(); 

        System.out.println("CPU class");
        System.out.println("........");
        System.out.println("CPU price = " + c.Price);

        System.out.println("\nProcessor inner class");
        System.out.println(".......................");
        System.out.println("No of cores = " + p.cores);
        System.out.println("Manufacturer = " + p.manufacturer);

        System.out.println("\nRAM static class");
        System.out.println(".......................");
        System.out.println("Memory = " + r.memory + "GB");
        System.out.println("Manufacturer = " + r.manufacturer);
    }
}
