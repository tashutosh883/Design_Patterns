package Factory;

public class KnifeFactory {
    
    public Knife createKnife(String type){
        
        Knife knife =null;
        if(type.equals("steak")){
            knife = new SteakKnife();
        }
        else if(type.equals("chefs")){
            knife = new ChefsKnife();

        }
        else{

        }
        return knife;
    }

}
