public abstract class Cupcake {
    /*protected Double prix = 0.0;
    protected String name = "";*/
    CupcakeInterface leCupcake;
    public void creation(){
        leCupcake = creatCupcake();
        //prix = leCupcake.getPrize();
        //name = leCupcake.getName();
    }
    public void addDeco(boolean choix){
        Deco deco;
        if(choix)
            deco = new CoucheChoco(leCupcake);
        else
            deco= new CoucheFruit(leCupcake);
        leCupcake = deco;
        System.out.println(leCupcake.getPrize());
    }
    public String toString(){
        return leCupcake.getName() + ": " + String.valueOf(leCupcake.getPrize());
    }

    public abstract CupcakeInterface creatCupcake();
}
