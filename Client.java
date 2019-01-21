import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    private static Cupcake cupcake;
    public static void main(String[] args){
        configure();
    }

    private static void configure() {
        //Scanner scanner = new Scanner(System.in);
        //if(scanner.nextInt() == 1){
            cupcake = new CreatorChoco();
            cupcake.creation();
            cupcake.addDeco(true);
            cupcake.addDeco(false);
            /*Boolean stop = false;
            while (!stop){
                try {
                    Integer select = scanner.nextInt();
                    switch (scanner.nextInt()){
                        case 0:
                            stop = true;
                            break;
                        case 1:
                            cupcake.addDeco(true);
                            break;
                        case 2:
                            cupcake.addDeco(false);
                            break;

                    }
                }
                catch (InputMismatchException e){
                    System.out.println(e);
                }

            }*/
            System.out.println(cupcake.toString());
       // }
        /*if(scanner.nextInt() == 2){
            cupcake = new CreatorVanille();
            cupcake.creation();
            System.out.println(cupcake.toString());
        }
*/

    }
}
