public class CartasBlackJack52 {

    public static final String[] NOMBRES_CARTAS = new String[]{"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jota", "Reina", "Rey"};
    public static final int[] VALORES_CARTAS = new int[]{11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    public static final String[] PALOS_CARTAS = new String[]{"Corazon.png", "Diamante.png", "Trebol.png", "Pica.png"};
    public static final int[][] CARTAS = new int[2][52];//matriz de indeces de nombres=valores y palos

    public int[] rndIndCartas = new int[52];
    public int MAX_CARTAS_REPARTIDAS = 30;
    public int cantidadCartasRepartidas = 0;

    public CartasBlackJack52() {
        iniciarYbarajar();
    }

    public void darleCartaA(Jugador jugador) {
        jugador.IndCartasQueTiene[jugador.cantidadCartasQueTiene++]=rndIndCartas[cantidadCartasRepartidas++];
    }

    public void iniciarYbarajar() {
        for (int i = 0; i < CARTAS[0].length; i++) {
            CARTAS[0][i] = i % NOMBRES_CARTAS.length; //indexes de Nombres y Valores de cartas
            CARTAS[1][i] = i / NOMBRES_CARTAS.length; //indexes de Palos de cartas
        }
        cantidadCartasRepartidas = 0;
        int random;
        boolean existe;
        rndIndCartas[0] = (int) (Math.random() * rndIndCartas.length);
        for (int i = 0; i < rndIndCartas.length - 1; i++) {
            do {
                existe = false;
                random = (int) (Math.random() * rndIndCartas.length);
                for (int j = 0; j <= i && !existe; j++) {
                    if (rndIndCartas[j] == random) {
                        existe = true;
                    }
                }
            } while (existe);
            rndIndCartas[i + 1] = random;
        }
    }


}
