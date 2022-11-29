class hdfc implements iaccount {
        double deposit;
        double withdrawal;


        public double getbalance()

        {
            return deposit - withdrawal;
        }

        public void deposit(double amount)
        {
            deposit =deposit+ amount;
        }

        public void withdraw(double amount){
            withdrawal=withdrawal+amount;
        }

    }

