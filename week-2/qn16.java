import java.util.*;
import java.lang.*;;

class Bank {
    float getROI() {
        return 0;
    }
}

class SBI extends Bank {
    float getROI() {
        return 8.4f;
    }
}

class ICICI extends Bank {
    float getROI() {
        return 7.3f;
    }
}

class AXIS extends Bank {
    float getROI() {
        return 9.7f;
    }
}

public class qn16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the bank (SBI, ICICI, AXIS): ");
        String bankName = input.nextLine().toUpperCase();

        Bank bank;
        switch (bankName) {
            case "SBI":
                bank = new SBI();
                break;
            case "ICICI":
                bank = new ICICI();
                break;
            case "AXIS":
                bank = new AXIS();
                break;
            default:
                System.out.println("Invalid bank name!");
                return;
        }

        System.out.println(bankName + ", " + bank.getROI() + "%");
    }
}
