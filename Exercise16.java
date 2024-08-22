package homework;

public class Exercise16 {
    public static void main(String[] args) {
        double gastoJaneiro = 15000;
        double gastoFevereiro = 23000;
        double gastoMarço = 17000;

        double despesaTotal = gastoJaneiro + gastoFevereiro + gastoMarço;

        double mediaMensal = despesaTotal / 3;

        System.out.println("Despesa total no primeiro trimestre: R$ " + despesaTotal);
        System.out.println("Média mensal de gastos: R$ " + mediaMensal);
    }
}
