public class ExercicioControleDeFluxo2 {
    public static void main(String[] args) {
        //Crie um Switch que dado um valor de 1 a 7
        //Considerando 1 Domingo imprima se é dia util ou final de semana.
        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util.");
                break;
            default:
                System.out.println("Resposta invalida.");
        }
        ;
    }

    ;
}