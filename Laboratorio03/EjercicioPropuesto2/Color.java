import java.util.HashMap;
import java.util.Map;

class Color {
    private int rojo;
    private int verde;
    private int azul;

    public Color(int rojo, int verde, int azul) {
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    //Metodo para obtener el color a travez de la configuracion rgb dada.
    public String obtenerColor() {
        //Mapa que contendra algunos valores de colores segun el codigo rgb
        Map<Integer, String> colorRgb = new HashMap<>(); 
        colorRgb.put(0, "Negro");
        colorRgb.put(255255255, "Blanco");
        colorRgb.put(25500, "Rojo");
        colorRgb.put(2550, "Verde");
        colorRgb.put(255, "Azul");
        colorRgb.put(2552550, "Amarillo");
        colorRgb.put(255255, "Cian");
        colorRgb.put(2550255, "Magenta");

        //Acomoda la los 3 valores rgb para poder comparar el valor en el mapa
        int clave = Integer.parseInt(String.format("%03d%03d%03d", rojo, verde, azul)); 

        //Devuelve el valor del mapa si existe, de lo contrario regresa la otra cadena.
        return colorRgb.getOrDefault(clave, "color desconocido");
    }

    public int getRojo() {return rojo;}
    public void setRojo(int rojo) {this.rojo = rojo;}
    public int getVerde() {return verde;}
    public void setVerde(int verde) {this.verde = verde;}
    public int getAzul() {return azul;}
    public void setAzul(int azul) {this.azul = azul;}
}