/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author kalindjoshi
 */
public class Person {
    int pid;
    String name;
    String address;

    public Person(int pid, String name, String address) {
        this.pid = pid;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "pid=" + pid + ", name=" + name + ", address=" + address + '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
