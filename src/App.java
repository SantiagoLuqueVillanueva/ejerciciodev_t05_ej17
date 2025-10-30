public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número entero positivo: "));

        do {
            if (num < 0) {
                System.out.println("Debes introducir un número positivo");
                System.out.println("Intentalo de nuevo.");
                num = Integer.parseInt(System.console().readLine("Introduzca un número entero positivo: "));
            }
        } while (num < 0);
        
        int sol = 0;
        
        for (int i = num; i < num + 100; i++) {
            sol += i;
        }

        System.out.printf("La suma de los 100 números siguientes a %d es %d.", num, sol);
    }
}
