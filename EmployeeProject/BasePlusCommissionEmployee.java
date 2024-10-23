package EmployeeProject;
public class BasePlusCommissionEmployee extends Commission_Employee {

    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double earnings()
    {
return base + super.earnings();
    }
    
    @Override
    public void Displayalldetails()
    {
      super.Displayalldetails();
      Displayearnings();
    }
    
     @Override
    public void Displayearnings()
    {
              System.out.println("Earnings = " + earnings());

    }
    
    
}
