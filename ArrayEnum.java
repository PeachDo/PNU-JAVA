import java.lang.constant.Constable;
import java.util.Locale;
import java.util.Scanner;

enum Command {
    ADD, LIST, SUM, AVG, STD, QUIT, DEFAULT;
}

public class ArrayEnum {
    public static void main(String[] args){
        //...
        int[] values;
        values = new int[100];
        int index = 0;
        final Scanner scanner = new Scanner(System.in);

        while(true){
            final Command command = getCommand(scanner);
            if (command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch (command){
                case ADD:
                    final int newValue = geValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case AVG:
                    System.out.printf("%.2f%n", getAvg(values, index));
                    break;
                case SUM:
                    System.out.print(getSum(values, index));
                    break;
                case STD:
                    System.out.println("STD");
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;
                //...
            }
        }
        scanner.close();
    }

    private static int getSum(int[] values, int index) {
        int sum = 0;
        for (int i = 0; i <= index; i++){
            sum = values[i]+sum;
        }
        return sum;
    }

    private static double getAvg(int[] values, int index) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i <= index; i++){
            sum = values[i]+sum;
        }
        avg = sum/index;
        return avg;
    }

    private static void printList(int[] values, int index) {
        for (int i = 0; i<index; i++){
            System.out.print(values[i]+" ");
        }
    }

    private static int geValue(Scanner scanner) {
       String addNum = scanner.next();
       String nums = addNum.replaceAll("[^0-9]", "");
       int num = Integer.parseInt(nums);
       return num;
    }

    private static Command getCommand(Scanner scanner) {
        String cmd = scanner.next();
        String command = cmd.replace("[0-9]"," ");
        Command cmds = null;
        //cmds = Command.valueOf(command.toUpperCase());
        try{
            cmds = Command.valueOf(command.toUpperCase());
        }
        catch (IllegalArgumentException e) {

            cmds = Command.DEFAULT;
        }
        return cmds;
    }

    //...
}
