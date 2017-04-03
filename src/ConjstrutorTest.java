import java.util.Random;

/**
 * Created by Administrator on 2017/4/3.
 */
public class ConjstrutorTest {
    public static void main(String[] args) {
        //fill the stuff array with three employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        //打印所有雇员信息
        for (Employee e : staff)
            System.out.println("name= " + e.getName(), "id = " + e.getId(), "salary= " + e.getSalary());
    }

    class Employee {
        private static int nextid;

        private int id;
        private String name = "";
        private double salary;

        //初始化块
        static {
            Random generator = new Random();
            //设置netxid 一个0-9999随即数值
            nextid = generator.nextInt(10000);
        }

        //对象初始化块
        {
            id = nextid;
            nextid++;
        }

        //三个已经加载的员工
        public Employee(String n, double s) {
            name = n;
            salary = s;
        }

        public Employee(double s) {
            //引用Employee
            this("Employee #" + nextid, s);
        }

        public Employee() {
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public int getId() {
            return id;
        }
    }

