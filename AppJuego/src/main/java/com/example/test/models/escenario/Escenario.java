package com.example.test.models.escenario;

public class Escenario {
    public String nombre;
    public String background; //ruta de la imagen

    public Escenario(String nombre, String background) {
        this.nombre = nombre;
        this.background = background;
    }

    public static Escenario elegirEscena(String escena) {
        switch (escena) {
            case "ciudad":
                return new Escenario("ciudad", "com/example/test/models/escenario/backgrounds/ciudad8bit.jpg");


            default:
                return new Escenario("ciudad", "com/example/test/models/escenario/backgrounds/ciudad8bit.jpg");


        }
    }
    public String getNombre() {
        return nombre;
    }

    public String getBackgroundPath() {
        return background;
    }


}
