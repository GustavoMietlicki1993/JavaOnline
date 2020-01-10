public class ControleFluxo5 {
    public static void main(String[] args) {
        //Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
        //Desde que o valor minimo de cada parcela seja igual ou mair que 1000.
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            ;
            System.out.println("Parcela: " + parcela + "\n Valor da parcela: R$" + valorParcela);
        }
        ;
    }
}
