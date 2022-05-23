package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee empl1 = new Employee(100, "Zaur", "Tregulov", 1000);
        Employee empl2 = new Employee(1010, "Ivan", "Petrov", 1088);
        Employee empl3 = new Employee(110, "Ivan", "Sidorov", 788);
        Employee empl4 = new Employee(150, "Oleg", "Kozlov", 1970);
        list.add(empl1);
        list.add(empl2);
        list.add(empl3);
        list.add(empl4);
        System.out.println(list);
//        Collections.sort(list, new IdComparator());
        Collections.sort(list, new NameComparator());
        Collections.sort(list, new SalaryComparator());
        System.out.println(list);
    }

}

class Employee implements Comparable<Employee>
{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
//        if(this.id == anotherEmp.id) {
//            return 0;
//        }
//        else if(this.id < anotherEmp.id) {
//            return -1;
//        }
//        else {
//            return 1;
//        }
//        return this.id - anotherEmp.id;
//        return  this.name.compareTo(anotherEmp.name);
        int res = this.name.compareTo(anotherEmp.name);
        if(res == 0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}

class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee empl1, Employee empl2) {
        return empl1.id - empl2.id;
    }

}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee empl1, Employee empl2) {
        return empl1.name.compareTo(empl2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee empl1, Employee empl2) {
        return empl1.salary-empl2.salary;
    }
}
