package Singleton;

public class Singleton_test {

    public static void main(String[] args){
        Sample_Singleton_class s1 = Sample_Singleton_class.getInstance();
        Sample_Singleton_class s2 = Sample_Singleton_class.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        return;
    }
}
