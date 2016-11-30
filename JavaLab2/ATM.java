class ATM {

    String currency;
    int[] denominations;
    int[] quantity;
   

    public ATM (String curr , int[] denom){
        currency = curr;
        denominations = denom;
        quantity = new int[denominations.length];
      
    }

    public int getQty(int denom){
        for (int i = 0; i < denominations.length; i = i + 1){
            if (denom == denominations[i]){
                return quantity[i];
            }
        }
    return 0;
    }

    public String getCurrency(){
        return currency;
    }

    public int getTotal(){
        int total = 0;
        for (int i = 0; i < denominations.length; i = i + 1){
            total = total + denominations[i] * quantity[i];
        }
        return total;
    }

    public void load(int qty, int denom){
        for (int i = 0; i < denominations.length; i = i + 1){
            if (denom == denominations[i]){
                quantity[i] = quantity[i] + qty;
            }
        }
    }

    public void dispense(int qty, int denom){
        for (int i = 0; i < denominations.length; i = i + 1){
            if (denom == denominations[i]){
                if (quantity[i] > qty){
                    quantity[i] = quantity[i] - qty;
                }
            }
        }
    }

    public String toString(){
        String string = "";
        return string;

    }
}


// Denominations    [5]      [10]    [20]    [50]
// Note quantity    [10]     [3]     [3]     [6]


