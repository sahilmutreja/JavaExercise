package generics;

import java.util.ArrayList;

/**
 * Author: Sahil Mutreja
 * Date: April 17, 2018
 * Generics with Bounded types
 */
public class SimpleGenericClass{
    public static void main(String[] args) {
        CustomHashMap<Integer,String> map = new CustomHashMap<>(1,"one");
        System.out.println("Map: " + map);
        BoundTypeExample<Integer> btInt = new BoundTypeExample<>(10);
        System.out.println("Value of BoundTypeExample<>(10): " + btInt.getId());
        BoundTypeExample<Double> btDouble = new BoundTypeExample<>(10.5);
        System.out.println("Value of BoundTypeExample<>(10.5): " + btDouble.getId());

        btInt.printValues("A",10,new ArrayList(){{
            this.add(10);
            this.add(20);
            this.add(30);
        }});
        /*Blow code will give compiler error as BoundTypeExample class is initialized with
        value "Sahil" which does not extend Number datatype*/
//        System.out.println("Value of BoundTypeExample<>(10.5): " + new BoundTypeExample<>("sahil").getId());

        EmpUtility<CompanyA> empA = new EmpUtility<>(new CompanyA(100,"A"));
        EmpUtility<CompanyB> empB = new EmpUtility<>(new CompanyB(100,"B" ));
        EmpUtility<CompanyB> empC = new EmpUtility<>(new CompanyB(200,"B" ));
        empA.printEmployee();
        empB.printEmployee();
        empC.printEmployee();
        System.out.println("Is salary same A & B? "+empA.isSalaryEqual(empB));
        System.out.println("Is salary same A & C? "+empA.isSalaryEqual(empC));



    }

}

/**
 * Basic Generics Class with 2 type parameters
 * @param <K>
 * @param <V>
 */
class CustomHashMap<K,V> {

    K key;
    V value;

    public CustomHashMap(K objK, V objV) {
        this.key = objK;
        this.value = objV;
    }

    @Override
    public String toString() {
        return "CustomHashMap{" + key +"=" + value +'}';
    }
}

/**
 * Bounded Type Generics class where T can be Number type itslef or any type that extends Number datatype
 * like Integer, Float etc.
 * @param <T>
 */
class BoundTypeExample<T extends Number>{
    T id;

    public BoundTypeExample(T Id) {
        this.id = Id;
    }

    public T getId() {
        return id;
    }

    <A,B,C> void printValues(A v1,B v2,C v3){
        System.out.println(String.format("v1: %s, v2: %s, v3: %s",v1,v2,v3));
    }

}

class EmpUtility<T extends Employee>{

    T emp;

    public EmpUtility(T emp) {
        this.emp = emp;
    }

    void printEmployee(){
        System.out.println(emp);
    }
    public int getSalary(){
        return emp.getSalary();
    }

    public boolean isSalaryEqual(EmpUtility<?> otherEmp){

        if(emp.getSalary() == otherEmp.getSalary()){
            return true;
        }
        return false;
    }


}

class Employee{
    int salary;
    String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
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

class CompanyA extends Employee{
    public CompanyA(int salary, String name) {
        super(salary, name);
    }
}

class CompanyB extends Employee{
    public CompanyB(int salary, String name) {
        super(salary, name);
    }
}
