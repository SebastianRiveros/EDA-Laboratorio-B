class Objeto {
    private String tipoObjeto;
    private Color color;
    private Material material;

    public Objeto(String tipoObjeto, Color color, Material material) {
        this.tipoObjeto = tipoObjeto;
        this.color = color;
        this.material = material;
    }

    public void imprimir(){
        System.out.println("Esta es una "+tipoObjeto+" de color "+color.obtenerColor()+" y material de "+material.gettipoMaterial());
    }

    public String getTipoObjeto() {return tipoObjeto;}
    public void setTipoObjeto(String tipoObjeto) {this.tipoObjeto = tipoObjeto;}
    public Color getColor() {return color;}
    public void setColor(Color color) {this.color = color;}
    public Material getMaterial() {return material;}
    public void setMaterial(Material material) {this.material = material;}
}