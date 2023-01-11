package com.example.test.models.escenario;

public class Escenario {
    public String nombre;
    public String background; //ruta de la imagen

    private static Escenario me;

    private Escenario(String nombre, String background) {
        this.nombre = nombre;
        this.background = background;
        this.me = this;
    }

    public static Escenario getInstance() {
        if(me == null){
            me = new Escenario("Ciudad", "/Assets/FondosEscenario/Escenario1.jpg");
        }
        return me;
    }

    public static Void elegirEscena(String escena) {
        switch (escena) {
            case "1":
            case "ciudad":
                getInstance().setEscenario("/Assets/FondosEscenario/Escenario1.jpg", "ciudad");
                break;
            case "2":
            case "Arasaka":
                getInstance().setEscenario("/Assets/FondosEscenario/Escenario2.jpg", "Arasaka");
                break;
            case "3":
            case "HackerDen":
                getInstance().setEscenario("/Assets/FondosEscenario/Escenario3.jpg", "HackerDen");
                break;
            case "4":
            case "Alley":
                getInstance().setEscenario("/Assets/FondosEscenario/Escenario4.jpg", "Alley");
                break;

            default:
                getInstance().setEscenario("/Assets/FondosEscenario/Escenario1.jpg", "ciudad");
                break;


        }
        return null;
    }
    public void setEscenario(String path, String nombre){
        this.background = path;
        this.nombre = nombre;
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
