package collection;


import java.util.Objects;

/**
 * Author: Sahil Mutreja
 * Date: April 15, 2018
 * Sample custom class for user defined objects to be used in collection practice
 */
class Employee implements Comparable{
    @Override
    public boolean equals(Object o) {
        System.out.println("Equals function called");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return emloyeeID == employee.emloyeeID &&
                salary == employee.salary &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int compareTo(Object o) {
        if(this.emloyeeID > ((Employee) o).emloyeeID) return 1;
        if(this.emloyeeID < ((Employee) o).emloyeeID) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emloyeeID=" + emloyeeID +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        int hash = Objects.hash(emloyeeID, salary, name);
        System.out.println("hashCode function called: " + hash);
        return hash;
    }

    int emloyeeID;
    int salary;
    String name;

    public Employee(){}

    /**
     * Employee Constructor
     * @param emloyeeID
     * @param salary
     * @param name
     */
    public Employee(int emloyeeID, int salary, String name) {
        this.emloyeeID = emloyeeID;
        this.salary = salary;
        this.name = name;
    }

    public int getEmloyeeID() {
        return emloyeeID;
    }

    public void setEmloyeeID(int emloyeeID) {
        this.emloyeeID = emloyeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
