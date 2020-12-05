package Singleton;

public class Sample_Singleton_class{
    private static Sample_Singleton_class single_instance = null;
    private Sample_Singleton_class(){

    }

    public static Sample_Singleton_class  getInstance(){
        //lazy intitializaton
        if(single_instance == null){
            single_instance = new Sample_Singleton_class();
        }
        return single_instance;
    }
}