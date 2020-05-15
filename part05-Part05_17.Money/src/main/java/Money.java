
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        if (this.cents + addition.cents > 1) {
            int newEuros = (this.euros + addition.euros) + 1;
            int newCents = (this.cents + addition.cents) - 100;
            return new Money(newEuros, newCents);
        } else {
            return new Money(this.euros + addition.euros, this.cents + addition.cents);
        }
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else{
            return false;
        }
    }
    
    public Money minus(Money addition) {
        if (this.euros < addition.euros) {
            return new Money(0, 0);
        }
        if (this.cents - addition.cents < 0) {
            int newEuros = (this.euros - addition.euros) - 1;
            int newCents = Math.abs((this.cents + 100) - addition.cents);
            return new Money(newEuros, newCents);
        } else {
            return new Money(this.euros - addition.euros, this.cents - addition.cents);
        }
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
