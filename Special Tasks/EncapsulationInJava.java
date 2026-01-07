class InnerEncapsulationInJava {
    public String name ;
    private int age;

    void setname(String n,int a){
        if ((n.length() >= 3 ) && (a > 18)){
        this.name = n;
        this.age = a;
        }
    }
    String getname(){
        return name;
    }
    int getAge(){
        return age;
    }
    
}

public class EncapsulationInJava{
    public static void main(String[] args) {
        InnerEncapsulationInJava ine = new InnerEncapsulationInJava();
        ine.setname("Hariharan", 55);
        System.out.println(ine.getname());
        System.out.println(ine.getAge());
    }
}