public class CreatorChoco extends Cupcake{

    @Override
    public CupcakeInterface creatCupcake(){
        return new Choco();
    }
}
