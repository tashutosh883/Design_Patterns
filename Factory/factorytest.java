package Factory;

public class factorytest {
    public static void main(String[] args) {
        KnifeFactory knifeFactory = new KnifeFactory();
        KnifeStore knifeStore = new KnifeStore(knifeFactory);
        //
        knifeStore.orderKnife("chefs");
        knifeStore.orderKnife("steak");
    }
    
}
