class Main {
  public static void main(String[] args) {
      BankApp bankApp = new BankApp();
      BankGUI gui = new BankGUI();
      gui.processCommands(bankApp.bank);
  }
}