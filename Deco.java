public class Deco implements CupcakeInterface{
   private CupcakeInterface cupcakeInterface;
   Deco (CupcakeInterface source){
       this.cupcakeInterface = source;
   }

    @Override
    public String getName() {
       return cupcakeInterface.getName();
    }

    @Override
    public Double getPrize() {
        return cupcakeInterface.getPrize();
    }

    @Override
    public CupcakeInterface setNameAndPrize(String name, Double prize) {
        cupcakeInterface.setNameAndPrize(name, prize);
        return this;
    }

}
