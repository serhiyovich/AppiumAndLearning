package proselyte;

import java.util.Comparator;

public class Developer implements Comparable<Developer>,Comparator<Developer> {
    private String name;
    private int salary;

    public Developer(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Developer developer) {
        return this.name.compareTo(developer.name);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compare(Developer developer1, Developer developer2) {
        return developer1.salary-developer2.salary;
    }
}
