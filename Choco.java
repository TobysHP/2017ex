public class Choco implements CupcakeInterface {
    Double prix = 3.0;
    String name = "Cupcake chocolat";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrize() {
        return prix;
    }

    @Override
    public CupcakeInterface setNameAndPrize(String name, Double prize) {
        this.prix += prize;
        this.name += name;
        return this;
    }

}
