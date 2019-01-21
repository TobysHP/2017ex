public class Vanille implements CupcakeInterface {
    Double prix = 3.5;
    String name = "Cupcake vanille";

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
