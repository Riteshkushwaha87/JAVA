abstract class Bank {
    abstract void InterestRate();

    void disp() {
        System.out.println("Interest rate of the specific banks");
    }
}

class SBI extends Bank {
    void InterestRate() {
        System.out.println("SBI Bank - 8%");
    }
}

class HDFC extends Bank {
    void InterestRate() {
        System.out.println("HDFC Bank - 10%");
    }
}

class CBI extends Bank {
    void InterestRate() {
        System.out.println("CBI Bank - 8%");
    }
}

class Main {
    public static void main(String[] args) {
        HDFC h = new HDFC();
        h.disp();
        h.InterestRate();
        SBI s = new SBI();
        s.disp();
        s.InterestRate();
        CBI c = new CBI();
        c.disp();
        c.InterestRate();
    }
}
