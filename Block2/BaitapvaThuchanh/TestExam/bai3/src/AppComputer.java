import java.io.IOException;
import java.util.Arrays;

public class AppComputer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Computer computer1 = new Computer(1,"sad","asdsa","sdfdf",123,true);
        Computer computer2 = new Computer(2,"sad","asdsa","sdfdf",123,true);
        Computer computer3 = new Computer(3,"sad","asdsa","sdfdf",123,true);
        Computer computer4 = new Computer(4,"sad","asdsa","sdfdf",123,true);
        Computer computer5 = new Computer(5,"sad","asdsa","sdfdf",123,true);

//        computer1.addComputerToFile("database.txt",computer1);
//        System.out.println(computer1.getDataFromFile("database.txt"));

        computer1.addComputerToArray(computer1);
        computer1.addComputerToArray(computer2);
        computer1.addComputerToArray(computer3);
        computer1.addComputerToArray(computer4);
        computer1.addComputerToArray(computer5);

        computer1.addComputersToFile("database.txt", computer1.computers);
        for (Computer computer : computer1.getAllComputerFromFile("database.txt")){
            System.out.println(computer.toString());
        }
    }
}
