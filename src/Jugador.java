import javax.swing.*;

public class Jugador {
    public final int MIN_PUNTOS_PARA_DOBLAR = 10;
    public final int MAX_PUNTOS_PARA_DOBLAR = 15;
    public final int MAX_CANTIDAD_CARTAS = 12;
    public final int APUESTO_MIN = 100;
    public final int APUESTO_MAX = 2000;
    public double balanceJugador = 3000;
    public double apuestoJugador = 0;
    public String nombre;
    public boolean isCrupier;
    public int[] IndCartasQueTiene = new int[MAX_CANTIDAD_CARTAS];
    public int cantidadCartasQueTiene = 0;

    public Jugador(String nombre, boolean isCrupier) {
        this.nombre = nombre;
        this.isCrupier = isCrupier;
    }

    public boolean addApuesto(double apuestoQuierePonel, ImageIcon iconFicha) {
        if (apuestoQuierePonel <= 0) {
            JOptionPane.showMessageDialog(null, "apuestoQuierePonel no puede ser menor o igual que 0");
            return false;
        }
        if (apuestoQuierePonel > balanceJugador) {
            JOptionPane.showMessageDialog(null, "No suficiente dinero en tu balance");
            return false;
        }
        if ((apuestoJugador + apuestoQuierePonel) > APUESTO_MAX) {
            JOptionPane.showMessageDialog(null, "Apuesto maximo es " + APUESTO_MAX);
            return false;
        }
        Interfaz.addApuestoVisual(apuestoQuierePonel, iconFicha);
        balanceJugador -= apuestoQuierePonel;
        apuestoJugador += apuestoQuierePonel;
        System.out.println("APUESTO_JUGADOR: " + apuestoJugador + ". BALANCE_JUGADOR: " + balanceJugador);
        return true;
    }

    public String getNombreDeCarta(int numeroDeCartaJugador) {
        if (numeroDeCartaJugador < 0 || numeroDeCartaJugador > cantidadCartasQueTiene || cantidadCartasQueTiene == 0) {
            JOptionPane.showMessageDialog(null, "El jugador " + nombre + " tient " + cantidadCartasQueTiene + " cartas");
            return "no existe";
        } else {
            return CartasBlackJack52.NOMBRES_CARTAS[CartasBlackJack52.CARTAS[0][IndCartasQueTiene[numeroDeCartaJugador - 1]]] +
                    CartasBlackJack52.PALOS_CARTAS[CartasBlackJack52.CARTAS[1][IndCartasQueTiene[numeroDeCartaJugador - 1]]];
        }
    }

    public int getValorDeCarta(int numeroDeCartaJugador) {
        if (numeroDeCartaJugador < 0 || numeroDeCartaJugador > cantidadCartasQueTiene || cantidadCartasQueTiene == 0) {
            JOptionPane.showMessageDialog(null, "El jugador " + nombre + " tient " + cantidadCartasQueTiene + " cartas");
            return 0;
        } else {
            return CartasBlackJack52.VALORES_CARTAS[CartasBlackJack52.CARTAS[0][IndCartasQueTiene[numeroDeCartaJugador - 1]]];
        }
    }

    public int sumaPuntos() {
        int puntos = 0;
        for (int i = 1; i <= cantidadCartasQueTiene; i++) {
            int valorCarta = getValorDeCarta(i);
            if (valorCarta == 11 && (puntos + valorCarta) > 21) {
                puntos++;
            } else puntos += valorCarta;
        }
        return puntos;
    }


}
