class sbi implements iaccount
    {
        double balance;

        public double getbalance()
        {
            return balance;
        }

        public void deposit(double amount)
        {
            balance =balance+ amount;
        }

        public void withdraw(double amount)
        {
            balance =balance- amount;
        }
    }

