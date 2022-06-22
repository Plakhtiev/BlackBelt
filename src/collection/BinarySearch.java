package collection;

import comparation.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);
        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1);

        List<Employee> employeeList = new ArrayList<>();
        Employee empl1 = new Employee(100, "Zaur", "Tregulov", 1000);
        Employee empl2 = new Employee(1010, "Ivan", "Petrov", 1088);
        Employee empl3 = new Employee(110, "Ivan", "Sidorov", 788);
        Employee empl4 = new Employee(150, "Oleg", "Kozlov", 1970);
        employeeList.add(empl1);
        employeeList.add(empl2);
        employeeList.add(empl3);
        employeeList.add(empl4);

        Collections.sort(employeeList);
        int index2 = Collections.binarySearch(employeeList, new Employee(100, "Zaur", "Tregulov", 1000));
        System.out.println(employeeList.get(index2));
    }
}
