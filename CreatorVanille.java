public class CreatorVanille extends Cupcake{

    @Override
    public CupcakeInterface creatCupcake(){
        return new Vanille();
    }
}
