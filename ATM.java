
import java.io.*;
class Account{
    double balance,amount;
    long accountNumber;
    String accountHolder;

    public void getdata() throws IOException{
        try{
            DataInputStream dis = new DataInputStream(System.in);
            System.out.print("Enter Account holder name: ");
            accountHolder = dis.readLine();
            System.out.print("Enter Account number: ");
            accountNumber = Long.parseLong(dis.readLine());  
            System.out.print("Enter Balance: ");
            balance = Double.parseDouble(dis.readLine());
        }catch(IOException e){
            System.out.print(e);
        }
      
    }

    public void deposit() throws IOException{
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter amount to deposit: ");
        amount = Double.parseDouble(dis.readLine());
        if(amount>0){
            balance += amount;
            System.out.print(amount+"rs deposited successfully");
        }else{
            System.out.print("Invalid amount");
        }
    }

    public void withdraw() throws IOException{
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter amount to withdraw: ");
        amount = Double.parseDouble(dis.readLine());
        if(amount<=balance){
            balance -= amount;
            System.out.print(amount+"rs withdrawn");
        }else{
            System.out.print("Invalid balance");
        }
    }

    public void dispBalance(){
        System.out.print("Balance: "+balance+"rs");
    }
}

class ATM{
    public static void main(String args[]) throws IOException{
        Account a1 = new Account();
        a1.getdata();
        int choice;
do{
        
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            DataInputStream dis = new DataInputStream(System.in);
            choice = Integer.parseInt(dis.readLine());
            switch (choice) {
                case 1:
                    a1.deposit();
                    break;
                case 2:
                    a1.withdraw();
                    break;
                case 3:
                    a1.dispBalance();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 4);
    }
}