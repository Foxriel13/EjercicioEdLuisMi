package Ejercicio03;

public class Customer {
	public String name;
    public String surname;
    protected int age;
    private boolean single;
    private String country;

    public Customer() {
    }

    public String toString() {
        return "Customer [name=" + name + ", surname=" + surname + ", age=" + age + ", single=" + single + ", country=" + country + "]";
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
