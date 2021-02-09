package fit.core;

public class IrpfCalculator {

	public static Double calculateBaseSalary(double totalSalary) {
    double baseSalary = totalSalary-(totalSalary*0.11);
    // 330
		return baseSalary;
	}

	public static Double calculateExemption() {
    double exemption = 1903.98;

		return exemption;
	}

	public static Double calculateDiscount(double baseSalary) {
    double isention = IrpfCalculator.calculateExemption();
    double discountValue = baseSalary-isention;
    // 766.02
		return discountValue;
	}

	public static Double calculateTaxLayer(double baseSalary) {
    double tax = 0.0;
    double isention = IrpfCalculator.calculateExemption();
    double base = baseSalary-isention;

    if(base>4664.68){ tax = 0.275; }
    if(base<4664.68){ tax = 0.225; }
    if(base<3751.05){ tax = 0.150; }
    if(base<2826.65){ tax = 0.075; }
    // if(base<1903.98){ tax = 0; }

    // 0.075
		return tax;
	}

	public static Double calculateIrpf(double totalSalary) {
    double base = calculateBaseSalary(totalSalary);
    double descont = IrpfCalculator.calculateDiscount(base);
    double tax = IrpfCalculator.calculateTaxLayer(base);

    double calcIrpf = descont * tax;
    
		return calcIrpf;
	}
  
}
