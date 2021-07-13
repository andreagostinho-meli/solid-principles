package solution;

import java.math.BigDecimal;

public class Payroll {
    private BigDecimal balance;

    public void calculate(Remunerable employee) {
        this.balance = employee.calculateSalary();
    }
}
