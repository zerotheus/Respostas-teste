public class Faturamento {

    public static void main(String[] args) {

    }

    public void analisaFaturamento(Double[] faturamento) {
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double totalFaturado = faturamento[0];
        int diasFaturados = 0;
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] == 0) {
                continue;
            }
            diasFaturados++;
            totalFaturado += faturamento[i];
            if (menorFaturamento > faturamento[i]) {
                menorFaturamento = faturamento[i];
            }
            if (maiorFaturamento < faturamento[i]) {
                maiorFaturamento = faturamento[i];
            }
        }
        double media = totalFaturado / diasFaturados;
        int diasComFaturamentoMaiorQueAMedia = 0;
        for (int i = 0; i < faturamento.length; i++) {
            if (media < faturamento[i]) {
                diasComFaturamentoMaiorQueAMedia++;
            }
        }

    }

}
