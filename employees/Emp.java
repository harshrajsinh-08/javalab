package employees;

public class Emp {
    String name,category;
    int empid;
    double bpay , hra,da,npay,pf,grosspay,incometax,allowance;


    public Emp(String name,String category, int empid, double bpay, double hra, double da) {
        this.name = name;
        this.empid = empid;
        this.category = category;
        this.bpay = bpay;
        this.hra = hra;
        this.da = da;
    }

    public void calculateSalary() {
        npay = bpay + hra + da;
        pf = 0.12 * bpay;
        grosspay = npay - pf;
        incometax = 0.10 * grosspay;

        if (category.equals("Manager")) {
            allowance = 0.15 * grosspay;
        } else if (category.equals("Employee")) {
            allowance = 0.10 * grosspay;
        }
    }

    public void displaySalary() {
        System.out.println();
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empid);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + bpay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Net Pay: " + npay);
        System.out.println("Gross Pay: " + grosspay);
        System.out.println("PF: " + pf);
        System.out.println("Allowance: " + allowance);
        System.out.println("Income Tax: " + incometax);
    }
}