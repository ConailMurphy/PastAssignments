class ATMTester {

    public static void main(String[] args) {
        int[] euroDenoms = {5, 10, 20, 50};
        ATM atm1 = new ATM("euro", euroDenoms);
        int[] kronurDenoms = {1000, 5000, 500, 2000, 10000}; 
        ATM atm2 = new ATM("Icelandic kronur", kronurDenoms);

        atm1.load(1, 5);
        atm1.load(3, 20);
        atm1.load(2, 50);
        System.out.println(atm1.getQty(20));
        System.out.println(atm1);
        atm1.dispense(1, 50);
        System.out.println(atm1.getTotal() + " " + atm1.getCurrency());

    }
}