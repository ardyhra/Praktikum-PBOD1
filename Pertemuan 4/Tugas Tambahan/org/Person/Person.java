package org.Person;

public class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        setName(name);
        setAge(age);
        setAddress(address);
    }

    private void setName(String n){
        if(!n.isEmpty()) 
            name = n;
        else 
            System.out.println("Nama tidak boleh kosong");
    }
    public String getName(){ 
        return name;}
    public int getAge() { 
        return age; 
    }
    private void setAge(int a) { 
        if (a >= 0) 
            age = a;
        else 
            System.out.println("Umur tidak valid");
    }
    public String getAddress() { 
        return address;  
    }
    private void setAddress(String adr) {
        address = adr;

    }

    public void getDetails() {
        System.out.printf("Nama : %s, Umur : %d, Alamat : %s\n",getName(),getAge(),getAddress());
    }    

}
