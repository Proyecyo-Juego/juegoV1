package com.example.test.escenario;

public class escenario {
    public String nombre;
    public String background; //ruta de la imagen

    public escenario(String nombre, String background) {
        this.nombre = nombre;
        this.background = background;
    }

    public static escenario elegirEscena(String escena) {
        switch (escena) {
            case "ciudad":
                return new escenario("ciudad", "com/example/test/escenario/backgrounds/ciudad8bit.jpg");


            default:
                return new escenario("ciudad", "com/example/test/escenario/backgrounds/ciudad8bit.jpg");


        }
    }
    public String getNombre() {
        return nombre;
    }

    public String getBackgroundPath() {
        return background;
    }


}
