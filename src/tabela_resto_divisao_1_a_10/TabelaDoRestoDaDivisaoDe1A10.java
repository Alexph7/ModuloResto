package tabela_resto_divisao_1_a_10;

/**
 *
 * @author Alexph7
 */
public class TabelaDoRestoDaDivisaoDe1A10 {

        public static void main(String[] args) {

                int[][] result = new int[12][12];

                for (int i = 1; i < result.length; i++) {
                        for (int j = 1; j < result[i].length; j++) {
                                result[i][j] = j % i;
                        }
                }
                System.out.printf("%s%n", "      Tabela Do Resto Da Divisão Por: ");
                System.out.printf("%4d%4d%4d%4d%4d%4d%4d%4d%4d%5d%n%n", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                for (int i = 1; i < result.length; i++) {
                        for (int j = 2; j < result[i].length; j++) {
                                System.out.print("   " + result[j][i]);
                        }
                        System.out.println("");
                }
        }
}
