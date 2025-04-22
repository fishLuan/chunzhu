public class duixiang {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("小明");
        ming.setAge(12);
        System.out.println(ming.getAge());
    }
}

class Person {
    private String name;
    private int Age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int Age){
        this.Age=Age;
    }
    public int getAge(){
        return Age;
    }

}
