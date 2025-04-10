class employee{

    private int id;
     private String name;
     private float salary;
     private String designation;

     public int getid() {
        return id;
     }
     public void setid(int id) {
        this.id=id;
     }

     public String getName() {
        return name;
     }

     public void setName(String name) {
        this.name=name;
     }

     public float getSalary() {
        return salary;
     }

     public void setSalary(float salary) {
        this.salary=salary;
     }

     public String getDesignation() {
        return designation;
     }

     public void setDesignation(String designation) {
        this.designation=designation;
     }

}
public class Main1 {
   public static void main(String[] args) {
        Employee employee=new Employee();

        employee.setid(1);
        employee.setName("java");
        employee.setSalary(5000.97f);
        employee.setDesignation("MCA");

        System.out.println("employee Details");
        System.out.println("employee ID"+employee.getid());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getDesignation());
    }
    
}
