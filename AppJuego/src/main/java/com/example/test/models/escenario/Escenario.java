package com.example.test.models.escenario;

public class Escenario {
    public String nombre;
    public String background; //ruta de la imagen

    private static Escenario me;

    public Escenario(String nombre, String background) {
        this.nombre = nombre;
        this.background = background;
        this.me = this;
    }

    public static Escenario getInstance() {
        if(me == null){
            me = new Escenario("Ciudad", "com/example/test/models/escenario/backgrounds/ciudad8bit.jpg");
        }
        return me;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBackgroundPath(String background) {
        this.background = background;
    }


}
