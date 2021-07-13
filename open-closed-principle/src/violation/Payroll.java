package violation;

import java.math.BigDecimal;

public class Payroll {
    private BigDecimal balance;

    public void calculate(Object employee) {
        if(employee instanceof FullTimeContract) {
            this.balance = ((FullTimeContract) employee).salary();
        } else if(employee instanceof Internship) {
            this.balance = ((Internship) employee).aid();
        } else if(employee instanceof PartTimeContract) {
            this.balance = ((PartTimeContract) employee).salary();
        }
    }
}
