import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Interfaz {
    public static final String CART_CUBIERTA_PNG = "CartaCubierta.png";
    public static final String FONDO_PNG = "fondo.png";
    public static final String FICHA10_PNG = "10.png";
    public static final String FICHA25_PNG = "25.png";
    public static final String FICHA50_PNG = "50.png";
    public static final String FICHA100_PNG = "100.png";
    public static final String RUTA_IMG = "res/";
    ////
    public static final int HEIGHT_JPANELES_PARA_FICHAS = 420;
    public static int velocidadAnimacion = 3;

    public static Timer timerTuPierdes;
    public static Timer timerTuGanasOSorteo;
    public static Timer timerRepartir;

    public static int coordinateY_JpanelDeFichasJugador = 70;
    public static int distanciaFichsJugador = coordinateY_JpanelDeFichasJugador;
    public static int coordinateY_JpanelDeFichasCrupier = -HEIGHT_JPANELES_PARA_FICHAS;
    public static int distanciaFichasCrupier = coordinateY_JpanelDeFichasCrupier;
    public static double coeficienteDeGanancia = 1;
    public static boolean isTurnoCrupier = false;
    public static boolean isRepartirPrincipal = false;
    public static boolean isMas = false;
    public static boolean isDoblar = false;

    public static JFrame frameBlackJack = new JFrame("Ursol BlackJack");

    public static JPanel jPanelFichasEnApuesto = new JPanel();
    public static JPanel jPanelFichasEnCrupier = new JPanel();

    public static ImageIcon iconFondo = new ImageIcon(RUTA_IMG + FONDO_PNG);
    public static ImageIcon iconFicha10 = new ImageIcon(RUTA_IMG + FICHA10_PNG);
    public static ImageIcon iconFicha25 = new ImageIcon(RUTA_IMG + FICHA25_PNG);
    public static ImageIcon iconFicha50 = new ImageIcon(RUTA_IMG + FICHA50_PNG);
    public static ImageIcon iconFicha100 = new ImageIcon(RUTA_IMG + FICHA100_PNG);
    public static ImageIcon iconCartaCubierta = new ImageIcon(RUTA_IMG + CART_CUBIERTA_PNG);
    public static ImageIcon iconVacia = new ImageIcon();

    public static JButton butApuesto10 = new JButton("");
    public static JButton butApuesto25 = new JButton("");
    public static JButton butApuesto50 = new JButton("");
    public static JButton butApuesto100 = new JButton("");

    public static JButton butMas = new JButton("MAS");
    public static JButton butParar = new JButton("PARAR");
    public static JButton butSacarTodas = new JButton("SACAR TODO");
    public static JButton butSacarUna = new JButton("SACAR UNA");

    public static JButton butRepartir = new JButton("REPARTIR");
    public static JButton butDoblar = new JButton("DOBLAR");

    public static JLabel[] labelsCartasCrupier = new JLabel[Main.crupier.MAX_CANTIDAD_CARTAS];
    public static JLabel[] labelsCartasJugador = new JLabel[Main.jugador1.MAX_CANTIDAD_CARTAS];
    public static ArrayList<JLabel> labelsFichasEnApuesto = new ArrayList<JLabel>();
    public static JLabel cartaFlotanda = new JLabel(iconCartaCubierta);

    public static JLabel labelPuntosJugador = new JLabel();
    public static JLabel labelPuntosCrupier = new JLabel();
    public static JLabel labelApuesto = new JLabel();
    public static JLabel labelBalance = new JLabel();
    public static JLabel labelCartasRepartidas = new JLabel();
    public static JLabel labelInfo = new JLabel();
    public static JLabel labelResultado = new JLabel();

    public static JRadioButton radioVelocidadRapido = new JRadioButton("Rapido");
    public static JRadioButton radioVelocidadMedio = new JRadioButton("Medio");
    public static JRadioButton radioVelocidadLento = new JRadioButton("Lento");
    public static ButtonGroup butGroupVelocidad = new ButtonGroup();


    public static void mostrarInterfas() {

        frameBlackJack.setLayout(null);

        radioVelocidadRapido.setBounds(690, 0, 80, 25);
        radioVelocidadMedio.setBounds(690, 25, 80, 25);
        radioVelocidadLento.setBounds(690, 50, 80, 25);
        butGroupVelocidad.add(radioVelocidadRapido);
        butGroupVelocidad.add(radioVelocidadMedio);
        butGroupVelocidad.add(radioVelocidadLento);
        frameBlackJack.add(radioVelocidadRapido);
        frameBlackJack.add(radioVelocidadMedio);
        frameBlackJack.add(radioVelocidadLento);


        jPanelFichasEnApuesto.setLayout(null);
        jPanelFichasEnApuesto.setBounds(472, coordinateY_JpanelDeFichasJugador, 900, HEIGHT_JPANELES_PARA_FICHAS);
        jPanelFichasEnApuesto.setOpaque(false);

        jPanelFichasEnCrupier.setLayout(null);
        jPanelFichasEnCrupier.setBounds(200, coordinateY_JpanelDeFichasCrupier, 900, HEIGHT_JPANELES_PARA_FICHAS);
        jPanelFichasEnCrupier.setBackground(Color.cyan);
        jPanelFichasEnCrupier.setOpaque(false);

        butApuesto10.setIcon(iconFicha10);
        butApuesto10.setBounds(130, 505, iconFicha10.getIconWidth(), iconFicha10.getIconHeight());
        butApuesto10.setBackground(Color.blue);
        butApuesto10.setOpaque(true);
        butApuesto10.setBorder(new LineBorder(Color.BLACK, 0, true));
        butApuesto10.setFocusPainted(false);
        butApuesto10.setContentAreaFilled(false);

        butApuesto25.setIcon(iconFicha25);
        butApuesto25.setBounds(190, 505, iconFicha25.getIconWidth(), iconFicha25.getIconHeight());
        butApuesto25.setBackground(Color.blue);
        butApuesto25.setOpaque(true);
        butApuesto25.setBorder(new LineBorder(Color.BLACK, 0, true));
        butApuesto25.setFocusPainted(false);
        butApuesto25.setContentAreaFilled(false);

        butApuesto50.setIcon(iconFicha50);
        butApuesto50.setBounds(250, 505, iconFicha50.getIconWidth(), iconFicha50.getIconHeight());
        butApuesto50.setBackground(Color.blue);
        butApuesto50.setOpaque(true);
        butApuesto50.setBorder(new LineBorder(Color.BLACK, 0, true));
        butApuesto50.setFocusPainted(false);
        butApuesto50.setContentAreaFilled(false);

        butApuesto100.setIcon(iconFicha100);
        butApuesto100.setBounds(310, 505, iconFicha100.getIconWidth(), iconFicha100.getIconHeight());
        butApuesto100.setBackground(Color.blue);
        butApuesto100.setOpaque(true);
        butApuesto100.setBorder(new LineBorder(Color.BLACK, 0, true));
        butApuesto100.setFocusPainted(false);
        butApuesto100.setContentAreaFilled(false);

        butSacarTodas.setBounds(95, 565, 152, 25);
        butSacarUna.setBounds(249, 565, 152, 25);

        butRepartir.setBounds(505, 560, 85, 35);
        butRepartir.setFont(new Font("Arial", Font.PLAIN, 10));

        butMas.setBounds(592, 560, 75, 35);
        butMas.setFont(new Font("Arial", Font.PLAIN, 10));

        butParar.setBounds(672, 560, 75, 35);
        butParar.setFont(new Font("Arial", Font.PLAIN, 10));

        butDoblar.setBounds(753, 560, 76, 35);
        butDoblar.setFont(new Font("Arial", Font.PLAIN, 10));

        JLabel labelFondo = new JLabel(iconFondo);
        labelFondo.setBounds(0, 0, iconFondo.getIconWidth(), iconFondo.getIconHeight());

//Cartas Crupier
        for (int i = 0; i < labelsCartasCrupier.length; i++) {
            labelsCartasCrupier[i] = new JLabel();
            labelsCartasCrupier[i].setFont(new Font("Arial", Font.PLAIN, 7));
            labelsCartasCrupier[i].setForeground(Color.white);
            labelsCartasCrupier[i].setBounds(390 + 30 * (i), 105, 50, 73);
        }
//Cartas Jugador
        for (int i = 0; i < labelsCartasJugador.length; i++) {
            labelsCartasJugador[i] = new JLabel();
            labelsCartasJugador[i].setFont(new Font("Arial", Font.PLAIN, 7));
            labelsCartasJugador[i].setForeground(Color.white);
            labelsCartasJugador[i].setBounds(390 + 30 * (i), 355, 50, 73);
        }

        cartaFlotanda.setBounds(799, 120, iconCartaCubierta.getIconWidth(), iconCartaCubierta.getIconHeight());
        cartaFlotanda.setVisible(false);

        labelPuntosJugador.setBounds(360, 400, 120, 25);
        labelPuntosJugador.setFont(new Font("Arial", Font.PLAIN, 20));
        labelPuntosJugador.setOpaque(false);
        labelPuntosJugador.setForeground(Color.white);

        labelPuntosCrupier.setBounds(360, 150, 120, 25);
        labelPuntosCrupier.setFont(new Font("Arial", Font.PLAIN, 20));
        labelPuntosCrupier.setOpaque(false);
        labelPuntosCrupier.setForeground(Color.white);

        labelApuesto.setBounds(460, 495, 120, 25);
        labelApuesto.setFont(new Font("Arial", Font.PLAIN, 20));
        labelApuesto.setOpaque(false);
        labelApuesto.setForeground(Color.yellow);

        labelBalance.setBounds(729, 525, 180, 25);
        labelBalance.setFont(new Font("Arial", Font.PLAIN, 18));
        labelBalance.setOpaque(true);
        labelBalance.setForeground(Color.white);
        labelBalance.setBackground(Color.black);

        labelCartasRepartidas.setBounds(716, 87, 195, 25);
        labelCartasRepartidas.setFont(new Font("Arial", Font.PLAIN, 15));
        labelCartasRepartidas.setOpaque(false);
        labelCartasRepartidas.setForeground(Color.white);

        labelInfo.setBounds(110, 0, 225, 95);
        labelInfo.setFont(new Font("Arial", Font.PLAIN, 14));
        labelInfo.setOpaque(false);
        labelInfo.setForeground(Color.white);
        labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
        labelInfo.setVerticalAlignment(SwingConstants.CENTER);

        labelResultado.setBounds(50, 300, 250, 95);
        labelResultado.setFont(new Font("Arial", Font.PLAIN, 20));
        labelResultado.setOpaque(false);
        labelResultado.setForeground(Color.yellow);
        labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
        labelResultado.setVerticalAlignment(SwingConstants.CENTER);

        elementosDeManejar();
        frameBlackJack.add(cartaFlotanda);

        frameBlackJack.add(jPanelFichasEnApuesto);
        frameBlackJack.add(jPanelFichasEnCrupier);
        frameBlackJack.add(butApuesto10);
        frameBlackJack.add(butApuesto25);
        frameBlackJack.add(butApuesto50);
        frameBlackJack.add(butApuesto100);
        frameBlackJack.add(butSacarTodas);
        frameBlackJack.add(butSacarUna);
        frameBlackJack.add(butRepartir);
        frameBlackJack.add(butMas);
        frameBlackJack.add(butParar);
        frameBlackJack.add(butDoblar);
        frameBlackJack.add(labelPuntosJugador);
        frameBlackJack.add(labelPuntosCrupier);
        frameBlackJack.add(labelApuesto);
        frameBlackJack.add(labelBalance);
        frameBlackJack.add(labelCartasRepartidas);
        frameBlackJack.add(labelInfo);
        frameBlackJack.add(labelResultado);
        for (int i = 0; i < labelsCartasCrupier.length; i++) {
            frameBlackJack.add(labelsCartasCrupier[11 - i]);
        }
        for (int i = 0; i < labelsCartasJugador.length; i++) {
            frameBlackJack.add(labelsCartasJugador[11 - i]);
        }
        frameBlackJack.add(labelFondo);
        frameBlackJack.setVisible(true);
        frameBlackJack.setSize(1000, 635);
        frameBlackJack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameBlackJack.setLocationRelativeTo(null);
    }

    private static void elementosDeManejar() {

        timerRepartir = new Timer(velocidadAnimacion, new ActionListener() {
            int distY = cartaFlotanda.getY();
            int distX = cartaFlotanda.getX();
            int repatrimos = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (cartaFlotanda.getY() > 350 || cartaFlotanda.getX() < 460) {
                    cartaFlotanda.setLocation(799, 120);
                    cartaFlotanda.setVisible(false);
                    distY = cartaFlotanda.getY();
                    distX = cartaFlotanda.getX();

                    repatrimos++;///
                    if (repatrimos % 2 != 0 && !isTurnoCrupier) {
                        darleYMostrarCartaA(Main.jugador1);
                    } else darleYMostrarCartaA(Main.crupier);

                    if (isRepartirPrincipal && repatrimos == 4) {///terminamos despues 4 carta
                        pasosSiHayBlackJack();

                        timerRepartir.stop();
                        repatrimos = 0;
                        isRepartirPrincipal = false;
                    }

                    if ((isMas || isDoblar) && repatrimos == 1) {///terminamos despues 1 carta
                        if (Main.jugador1.sumaPuntos() == 21) {
                            descubrirSegundaCartaCrupier();
                            isTurnoCrupier = true;
                        }
                        if (Main.jugador1.sumaPuntos() > 21) {
                            resultarJuego(0, "Tu pierdes. Lo siento");
                        }
                        if (isDoblar && Main.jugador1.sumaPuntos() < 21) {
                            descubrirSegundaCartaCrupier();
                            isTurnoCrupier = true;
                        }

                        if (!isTurnoCrupier) timerRepartir.stop();
                        repatrimos = 0;
                        isMas = false;
                        isDoblar = false;
                    }

                    if (isTurnoCrupier && Main.crupier.sumaPuntos() > 16) {///terminamos despues crupier.sumaPuntos >16

                        if (Main.crupier.sumaPuntos() > 21) {
                            resultarJuego(2, "Tu ganas.");
                        } else if (Main.crupier.sumaPuntos() > Main.jugador1.sumaPuntos()) {
                            resultarJuego(0, "Tu pierdes. Lo siento");
                        } else if (Main.crupier.sumaPuntos() == Main.jugador1.sumaPuntos()) {
                            resultarJuego(1, "Sorteo.");
                        } else {
                            resultarJuego(2, "Tu ganas.");
                        }

                        timerRepartir.stop();
                        repatrimos = 0;
                        isTurnoCrupier = false;
                    }


                } else {
                    cartaFlotanda.setVisible(true);
                    if (repatrimos % 2 != 0 || isTurnoCrupier) {
                        cartaFlotanda.setLocation(distX -= 18, distY -= 1);
                    } else cartaFlotanda.setLocation(distX -= 18, distY += 11);
                }
            }
        });

        timerTuPierdes = new Timer(velocidadAnimacion, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jPanelFichasEnApuesto.getY() < -jPanelFichasEnApuesto.getHeight() / 2) {
                    timerTuPierdes.stop();
                    distanciaFichsJugador = coordinateY_JpanelDeFichasJugador;
                    prepararMesaParaNuevosPuestos();
                } else {
                    Main.jugador1.balanceJugador += Main.jugador1.apuestoJugador * coeficienteDeGanancia;
                    Main.jugador1.apuestoJugador = 0;
                    jPanelFichasEnApuesto.setLocation(jPanelFichasEnApuesto.getX(), distanciaFichsJugador -= 7);
                }
            }
        });

        timerTuGanasOSorteo = new Timer(velocidadAnimacion, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (jPanelFichasEnCrupier.getY() > frameBlackJack.getHeight() - jPanelFichasEnCrupier.getHeight()) {
                    timerTuGanasOSorteo.stop();
                    distanciaFichasCrupier = coordinateY_JpanelDeFichasCrupier;
                    prepararMesaParaNuevosPuestos();
                } else {
                    Main.jugador1.balanceJugador += Main.jugador1.apuestoJugador * coeficienteDeGanancia;
                    Main.jugador1.apuestoJugador = 0;
                    jPanelFichasEnCrupier.setLocation(jPanelFichasEnCrupier.getX(), distanciaFichasCrupier += 8);
                }

                if (jPanelFichasEnApuesto.getY() > frameBlackJack.getHeight() - jPanelFichasEnApuesto.getHeight() * 1.1) {
                    distanciaFichsJugador = coordinateY_JpanelDeFichasJugador;
                } else jPanelFichasEnApuesto.setLocation(jPanelFichasEnApuesto.getX(), distanciaFichsJugador += 5);

            }
        });

        Timer timerSiempre = new Timer(3, e -> {

            labelApuesto.setText("$" + Main.jugador1.apuestoJugador);
            labelBalance.setText("Balance $" + Main.jugador1.balanceJugador);
            labelPuntosJugador.setText("" + Main.jugador1.sumaPuntos());
            labelPuntosCrupier.setText("" + Main.crupier.sumaPuntos());
            labelCartasRepartidas.setText("Cartas Repartidas: " + Main.barajaDeCartas.cantidadCartasRepartidas);
            labelInfo.setText("<html>" +
                    "Apuesto min: " + Main.jugador1.APUESTO_MIN + "<br> " +
                    "Apuesto max: " + Main.jugador1.APUESTO_MAX + "<br> " +
                    "Podes doblar si puntos: " + Main.jugador1.MIN_PUNTOS_PARA_DOBLAR + "-" + Main.jugador1.MAX_PUNTOS_PARA_DOBLAR + "<br> " +
                    "</html>");

            labelPuntosJugador.setVisible(Main.jugador1.sumaPuntos() != 0);
            labelPuntosCrupier.setVisible(Main.crupier.sumaPuntos() != 0
                    && labelsCartasCrupier[1].getText() != RUTA_IMG + CART_CUBIERTA_PNG);

            butApuesto10.setVisible(Main.jugador1.cantidadCartasQueTiene == 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
            butApuesto25.setVisible(Main.jugador1.cantidadCartasQueTiene == 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
            butApuesto50.setVisible(Main.jugador1.cantidadCartasQueTiene == 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
            butApuesto100.setVisible(Main.jugador1.cantidadCartasQueTiene == 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
            butSacarTodas.setVisible(Main.jugador1.apuestoJugador != 0 && Main.jugador1.cantidadCartasQueTiene == 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
            butSacarUna.setVisible(Main.jugador1.apuestoJugador != 0 && Main.jugador1.cantidadCartasQueTiene == 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
            butRepartir.setVisible(Main.jugador1.cantidadCartasQueTiene == 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
            butMas.setVisible(Main.jugador1.cantidadCartasQueTiene != 0 && Main.jugador1.apuestoJugador != 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
            butParar.setVisible(Main.jugador1.cantidadCartasQueTiene != 0 && Main.jugador1.apuestoJugador != 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
            butDoblar.setVisible(Main.jugador1.cantidadCartasQueTiene == 2
                    && Main.jugador1.sumaPuntos() >= Main.jugador1.MIN_PUNTOS_PARA_DOBLAR
                    && Main.jugador1.sumaPuntos() <= Main.jugador1.MAX_PUNTOS_PARA_DOBLAR
                    && Main.jugador1.apuestoJugador != 0
                    && !isMas
                    && !isTurnoCrupier
                    && !isRepartirPrincipal
                    && !isDoblar);
        });
        timerSiempre.start();

        radioVelocidadRapido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioVelocidadRapido.isSelected()) {
                    cambiarVelocidadDeAnimacionTimer(3);
                }
            }
        });

        radioVelocidadMedio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioVelocidadMedio.isSelected()) {
                    cambiarVelocidadDeAnimacionTimer(50);
                }
            }
        });

        radioVelocidadLento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioVelocidadLento.isSelected()) {
                    cambiarVelocidadDeAnimacionTimer(100);
                }
            }
        });

        butApuesto10.addActionListener(e -> {
            Main.jugador1.addApuesto(10, iconFicha10);
        });
        butApuesto25.addActionListener(e -> {
            Main.jugador1.addApuesto(25, iconFicha25);
        });
        butApuesto50.addActionListener(e -> {
            Main.jugador1.addApuesto(50, iconFicha50);
        });
        butApuesto100.addActionListener(e -> {
            Main.jugador1.addApuesto(100, iconFicha100);
        });

        butSacarTodas.addActionListener(e -> {
            sacarTodosFichasDeMesa();
        });
        butSacarUna.addActionListener(e -> {
            sacarUltimaFichaDeApuesto();
        });

        butRepartir.addActionListener(e -> {
            butRepartir.setVisible(false);
            if (Main.jugador1.apuestoJugador < Main.jugador1.APUESTO_MIN) {
                JOptionPane.showMessageDialog(null, "APUESTO minimo es " + Main.jugador1.APUESTO_MIN);
            } else {
                isRepartirPrincipal = true;
                timerRepartir.start();
            }
        });

        butMas.addActionListener(e -> {
            isMas = true;
            timerRepartir.start();
        });

        butParar.addActionListener(e -> {
            descubrirSegundaCartaCrupier();

            if (Main.crupier.sumaPuntos() == 21) {
                resultarJuego(0, "Tu pierdes. Lo siento");
            } else if (Main.crupier.sumaPuntos() < 17) {
                isTurnoCrupier = true;
                timerRepartir.start();
            }else if (Main.crupier.sumaPuntos() > Main.jugador1.sumaPuntos()) {
                resultarJuego(0, "Tu pierdes. Lo siento");
            }else if (Main.crupier.sumaPuntos() == Main.jugador1.sumaPuntos()) {
                resultarJuego(1, "Sorteo.");
            }else{
                resultarJuego(2, "Tu ganas.");
            }


        });

        butDoblar.addActionListener(e -> {
            if (Main.jugador1.addApuesto(Main.jugador1.apuestoJugador, iconVacia)) {
                clonarFichasEnApuesto(jPanelFichasEnApuesto);
                isDoblar = true;
                timerRepartir.start();
            }
        });
    }

    public static void cambiarVelocidadDeAnimacionTimer(int velocidad) {

        velocidadAnimacion = velocidad;

        if (timerRepartir.isRunning()) {
            timerRepartir.stop();
            timerRepartir.setDelay(velocidadAnimacion);
            timerRepartir.start();
        } else timerRepartir.setDelay(velocidadAnimacion);

        if (timerTuPierdes.isRunning()) {
            timerTuPierdes.stop();
            timerTuPierdes.setDelay(velocidadAnimacion);
            timerTuPierdes.start();
        } else timerTuPierdes.setDelay(velocidadAnimacion);

        if (timerTuGanasOSorteo.isRunning()) {
            timerTuGanasOSorteo.stop();
            timerTuGanasOSorteo.setDelay(velocidadAnimacion);
            timerTuGanasOSorteo.start();
        } else timerTuGanasOSorteo.setDelay(velocidadAnimacion);

    }

    private static void clonarFichasEnApuesto(JPanel panel) {
        int size = labelsFichasEnApuesto.size();
        for (int i = 0; i < size; i++) {
            labelsFichasEnApuesto.add(new JLabel(labelsFichasEnApuesto.get(i).getIcon()));
            int width = labelsFichasEnApuesto.get(i).getIcon().getIconWidth();
            int height = labelsFichasEnApuesto.get(i).getIcon().getIconHeight();
            int y = labelsFichasEnApuesto.get(i).getY() - height - 39;
            int x = labelsFichasEnApuesto.get(i).getX() + width / 2;
            labelsFichasEnApuesto.get(labelsFichasEnApuesto.size() - 1).setBounds(x, y, width, height);
            labelsFichasEnApuesto.get(labelsFichasEnApuesto.size() - 1).setText(labelsFichasEnApuesto.get(i).getText());
            labelsFichasEnApuesto.get(labelsFichasEnApuesto.size() - 1).setFont(labelsFichasEnApuesto.get(i).getFont());
            panel.add(labelsFichasEnApuesto.get(labelsFichasEnApuesto.size() - 1), 0);
            frameBlackJack.repaint();
        }
    }

    private static void sacarTodosFichasDeMesa() {
        Main.jugador1.balanceJugador += Main.jugador1.apuestoJugador * coeficienteDeGanancia;
        Main.jugador1.apuestoJugador = 0;
        System.out.println("Clearing fichas de mesa...");
        System.out.println("APUESTO_JUGADOR: " + Main.jugador1.apuestoJugador + ". BALANCE_JUGADOR: " + Main.jugador1.balanceJugador);
        jPanelFichasEnApuesto.removeAll();
        labelsFichasEnApuesto.clear();
        jPanelFichasEnCrupier.removeAll();
        frameBlackJack.repaint();
    }

    private static void sacarUltimaFichaDeApuesto() {
        int size = labelsFichasEnApuesto.size();
        Main.jugador1.balanceJugador += Double.parseDouble(labelsFichasEnApuesto.get(size - 1).getText());
        Main.jugador1.apuestoJugador -= Double.parseDouble(labelsFichasEnApuesto.get(size - 1).getText());
        System.out.println("Sacar ultimoAddApuesto...");
        System.out.println("APUESTO_JUGADOR: " + Main.jugador1.apuestoJugador + ". BALANCE_JUGADOR: " + Main.jugador1.balanceJugador);
        jPanelFichasEnApuesto.remove(labelsFichasEnApuesto.get(size - 1));
        labelsFichasEnApuesto.remove(size - 1);
        frameBlackJack.repaint();
    }

    public static void addApuestoVisual(double valor, ImageIcon iconFicha) {
        labelsFichasEnApuesto.add(new JLabel(iconFicha));
        int size = labelsFichasEnApuesto.size();
        int y = jPanelFichasEnApuesto.getHeight() - iconFicha.getIconHeight() - (size - 1) % 10 * 5;
        int x = iconFicha.getIconWidth() * ((size - 1) / 10);
        labelsFichasEnApuesto.get(size - 1).setBounds(x, y, iconFicha.getIconWidth(), iconFicha.getIconHeight());
        labelsFichasEnApuesto.get(size - 1).setText(String.valueOf(valor));
        labelsFichasEnApuesto.get(size - 1).setFont(new Font("Arial", Font.PLAIN, 0));
        jPanelFichasEnApuesto.add(labelsFichasEnApuesto.get(size - 1), 0);
        frameBlackJack.repaint();
    }

    private static void resultarJuego(double coefDeGanancia, String mensajeTitulo) {

        coeficienteDeGanancia = coefDeGanancia;

        if (coeficienteDeGanancia < 1) {
            timerTuPierdes.start();
        }
        if (coeficienteDeGanancia > 1) {
            clonarFichasEnApuesto(jPanelFichasEnCrupier);
            timerTuGanasOSorteo.start();
        }
        if (coeficienteDeGanancia == 1) {
            timerTuGanasOSorteo.start();
        }

        descubrirSegundaCartaCrupier();
        mostrarResultMsg(mensajeTitulo);

    }

    private static void descubrirSegundaCartaCrupier() {
        labelsCartasCrupier[1].setIcon(new ImageIcon(RUTA_IMG + Main.crupier.getNombreDeCarta(2)));
        labelsCartasCrupier[1].setText(Main.crupier.getNombreDeCarta(2));
    }

    private static void prepararMesaParaNuevosPuestos() {

        int opcion = JOptionPane.showOptionDialog(null, "Jugamos mas?", "BlackJack",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Si", "No"}, null);
        if (opcion == 1) {
            System.exit(0);
        }

        Main.jugador1.balanceJugador += Main.jugador1.apuestoJugador * coeficienteDeGanancia;
        Main.jugador1.apuestoJugador = 0;

        for (int i = 0; i < Main.jugador1.cantidadCartasQueTiene; i++) {
            labelsCartasJugador[i].setIcon(new ImageIcon(""));
            labelsCartasJugador[i].setText("");
        }
        for (int i = 0; i < Main.crupier.cantidadCartasQueTiene; i++) {
            labelsCartasCrupier[i].setIcon(new ImageIcon(""));
            labelsCartasCrupier[i].setText("");
        }

        Main.jugador1.cantidadCartasQueTiene = 0;
        Main.crupier.cantidadCartasQueTiene = 0;

        distanciaFichsJugador = coordinateY_JpanelDeFichasJugador;
        distanciaFichasCrupier = coordinateY_JpanelDeFichasCrupier;
        jPanelFichasEnApuesto.setLocation(jPanelFichasEnApuesto.getX(), coordinateY_JpanelDeFichasJugador);
        jPanelFichasEnCrupier.setLocation(jPanelFichasEnCrupier.getX(), coordinateY_JpanelDeFichasCrupier);
        labelResultado.setText("");
        sacarTodosFichasDeMesa();

        if (Main.barajaDeCartas.cantidadCartasRepartidas > Main.barajaDeCartas.MAX_CARTAS_REPARTIDAS) {
            Main.barajaDeCartas.cantidadCartasRepartidas = 0;
            Main.barajaDeCartas.iniciarYbarajar();
            JOptionPane.showMessageDialog(null, "Nueva baraja de cartas!!!");
        }

        timerTuPierdes.stop();
        timerTuGanasOSorteo.stop();
        timerRepartir.stop();

        isRepartirPrincipal = false;
        isMas = false;
        isTurnoCrupier = false;
        isDoblar = false;

    }

    private static void mostrarResultMsg(String mensajeTitulo) {

        String ganas;
        if (coeficienteDeGanancia < 1) {
            ganas = "-$" + Math.abs(coeficienteDeGanancia * Main.jugador1.apuestoJugador - Main.jugador1.apuestoJugador);
            labelResultado.setForeground(Color.red);
        } else if (coeficienteDeGanancia > 1) {
            ganas = "+$" + Math.abs(coeficienteDeGanancia * Main.jugador1.apuestoJugador - Main.jugador1.apuestoJugador);
            labelResultado.setForeground(Color.green);
        } else {
            ganas = "";
            labelResultado.setForeground(Color.yellow);
        }

        labelResultado.setText("<html>" +
                mensajeTitulo + "<p> <br>" +
                "<p align=\"center\">" + ganas + "</p>" +
                "</html>");
    }

    public static void darleYMostrarCartaA(Jugador jugador) {
        Main.barajaDeCartas.darleCartaA(jugador);
        if (jugador.isCrupier && jugador.cantidadCartasQueTiene == 2) {
            labelsCartasCrupier[jugador.cantidadCartasQueTiene - 1].setIcon(new ImageIcon(RUTA_IMG + CART_CUBIERTA_PNG));
            labelsCartasCrupier[jugador.cantidadCartasQueTiene - 1].setText(RUTA_IMG + CART_CUBIERTA_PNG);
        } else if (jugador.isCrupier) {
            labelsCartasCrupier[jugador.cantidadCartasQueTiene - 1].setIcon(new ImageIcon(RUTA_IMG + jugador.getNombreDeCarta(jugador.cantidadCartasQueTiene)));
            labelsCartasCrupier[jugador.cantidadCartasQueTiene - 1].setText(jugador.getNombreDeCarta(jugador.cantidadCartasQueTiene));
        }
        if (!jugador.isCrupier) {
            labelsCartasJugador[jugador.cantidadCartasQueTiene - 1].setIcon(new ImageIcon(RUTA_IMG + jugador.getNombreDeCarta(jugador.cantidadCartasQueTiene)));
            labelsCartasJugador[jugador.cantidadCartasQueTiene - 1].setText(jugador.getNombreDeCarta(jugador.cantidadCartasQueTiene));
        }
    }

    private static void pasosSiHayBlackJack() {

        if (Main.jugador1.sumaPuntos() == 21 && Main.crupier.sumaPuntos() == 21) {
            //sorteo 1x
            resultarJuego(1, "Tenes Black Jack y crupier tmb. Sorteo.");
        }

        if (Main.jugador1.sumaPuntos() == 21 && (Main.crupier.sumaPuntos() < 21 || Main.crupier.sumaPuntos() > 21)) {
            //ganas 2.5x
            resultarJuego(2.5, "Tenes Black Jack, tu ganas.");
        }
    }


}
