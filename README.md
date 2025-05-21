# Black-Jack ♠️

Black-Jack es una implementación en Java del clásico juego de Blackjack. Utiliza
una interfaz Swing para mostrar las cartas y permite apostar fichas contra un
crupier virtual.

## 🚀 Características

- Baraja de 52 cartas con barajado aleatorio.
- Interfaz gráfica con animaciones y control de velocidad (Rápido/Medio/Lento).
- Fichas de apuesta de 10, 25, 50 y 100.
- Botones **MAS** (hit), **PARAR** (stand) y **DOBLAR** (double).
- Indicadores de saldo, apuesta y puntos del jugador y del crupier.
- Dockerfile opcional para ejecutar el juego en un contenedor con servidor VNC.

## 🧱 Tecnologías usadas

- Java 22+
- Java Swing/AWT
- Docker + VNC (opcional)

## 📦 Instalación y ejecución

### Requisitos

- JDK 22 o superior
- Entorno con interfaz gráfica

### Ejecutar el JAR

```bash
java -jar BlackJack.jar
```

### Compilar desde el código fuente

```bash
javac -d out src/*.java
jar cfe BlackJack.jar Main -C out .
```

### Usar Docker

```bash
docker build -t blackjack .
docker run -p 5901:5901 blackjack
```

Conéctate via VNC al puerto `5901` para ver la interfaz.

## ⚙️ Cómo jugar

1. Selecciona la cantidad de fichas que deseas apostar.
2. Pulsa **REPARTIR** para iniciar la mano.
3. Utiliza **MAS**, **PARAR** o **DOBLAR** según tu estrategia.
4. Al finalizar la mano podrás escoger si juegas nuevamente.

## ⚠️ Advertencias

- Es solo un proyecto de demostración, no involucra dinero real.
- Se requiere un entorno gráfico o un contenedor con VNC para poder ver la interfaz.

## 👨‍💻 Autor

Gleb Ursol


## Capturas

![Captura de pantalla 2024-11-21 002727](https://github.com/user-attachments/assets/4d9c6a76-711f-41fa-b992-f189a73e3347)
![Captura de pantalla 2024-11-21 002921](https://github.com/user-attachments/assets/8765a3a3-f216-4835-b64b-190be2c0bfb6)
![Captura de pantalla 2024-11-21 002902](https://github.com/user-attachments/assets/b960b16b-d519-495b-95fb-ac415c5a55f4)
![Captura de pantalla 2024-11-21 002849](https://github.com/user-attachments/assets/885712d4-48a6-43dd-a88c-0b48c344a74c)
![Captura de pantalla 2024-11-21 002836](https://github.com/user-attachments/assets/17c79547-e548-4020-b012-7b9940ceff4b)
