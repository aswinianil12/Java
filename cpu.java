class cpu{
    double price;
    cpu(double price){
        this.price = price;
    }
public void printinfo(){
    System.out.println("CPU Price: " + price);
}
class processor{
    int core;
    String manufacture;
    processor(int core,String manufacture){
        this.core=core;
        this.manufacture=manufacture;
}
public void printinfo(){
    System.out.println("Processor Cores: " + core + " Manufacture: " + manufacture);
}
}
public static class ram{
    int memory;
    String manufacture;
    ram(int memory,String manufacture){
        this.memory = memory;
        this.manufacture = manufacture;
    }
public void printinfo(){
    System.out.println("RAM Memory: " + memory + " Manufacture: " + manufacture);
}
}
public static void main(String[] args) {
    cpu cpu1=new cpu(300);
    cpu.processor processor1=cpu1.new processor(4,"intel");
    cpu.ram ram1=new cpu.ram(8,"corsarir");
    cpu1.printinfo();
    processor1.printinfo();
    ram1.printinfo()
}
}
