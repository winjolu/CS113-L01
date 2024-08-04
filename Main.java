// Create a Main class
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(); // Instantiate the bank
        BankGUI gui = new BankGUI(); // Instantiate the GUI
        gui.processCommands(bank); // Start processing commands with the GUI
    }
}