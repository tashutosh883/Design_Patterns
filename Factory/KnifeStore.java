package Factory;

public class KnifeStore {
    
    private KnifeFactory knifeFactory;

    public KnifeStore(KnifeFactory knifeFactory){
        this.knifeFactory = knifeFactory;

    }
    public Knife orderKnife(String knifeType){

        //offload creation of knife to a factory
        Knife knife = knifeFactory.createKnife(knifeType);

        // do some stuff related to ordering 
        knife.sharpen();
        knife.polish(); 



        return knife;
    }

}
