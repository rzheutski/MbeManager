package by.ifanbel;

public class LayerFromJsp {
    LayerFromJsp() {
        number = 58;
        growthMode = "74";
    }

    LayerFromJsp(String s) {
        growthMode = s;
    }

    private Integer number = 5;
    private String growthMode;
    private Double thickness;
    private String x;
    private String y;
    private String temperature;
    private String heat;
    private String Nflow;
    private String dopant;
    private String layerComment;



    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getGrowthMode() {
        return growthMode;
    }
    public void setGrowthMode(String growthMode) {
        this.growthMode = growthMode;
    }

    public Double getThickness() {
        return thickness;
    }
    public void setThickness(Double thickness) {
        this.thickness = thickness;
    }

    public String getX() {
        return x;
    }
    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }
    public void setY(String y) {
        this.y = y;
    }

    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHeat() {
        return heat;
    }
    public void setHeat(String heat) {
        this.heat = heat;
    }

    public String getNflow() {
        return Nflow;
    }
    public void setNflow(String nflow) {
        Nflow = nflow;
    }

    public String getDopant() {
        return dopant;
    }
    public void setDopant(String dopant) {
        this.dopant = dopant;
    }

    public String getLayerComment() {
        return layerComment;
    }
    public void setLayerComment(String layerComment) {
        this.layerComment = layerComment;
    }
}
