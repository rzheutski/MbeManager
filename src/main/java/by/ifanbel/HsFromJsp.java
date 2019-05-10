package by.ifanbel;

import java.util.ArrayList;
import java.util.List;

public class HsFromJsp {

    public HsFromJsp() {
        growersLastNames = "some growers";
        /*layersFromJsp.add(new LayerFromJsp("kolya"));
        layersFromJsp.add(new LayerFromJsp("privet"));*/
        layerId = new ArrayList<Integer>();
        layerId.add(1);
        layerId.add(2);
        thickness = new ArrayList<Double>();
        thickness.add(12.0);
        thickness.add(1500.0);
        growthMode = new ArrayList<String>();
        growthMode.add("1");
        growthMode.add("2");
}

    private String sampleNumber;
    private String date;
    private String growersLastNames;
    private String waferNumber;
    private String waferSize;
    private String substrate;
    private String comments;

/*    private List<LayerFromJsp> layersFromJsp = new ArrayList<LayerFromJsp>();
    public List<LayerFromJsp> getLayersFromJsp() {
         return layersFromJsp;
    }
    public void setLayersFromJsp(List<LayerFromJsp> layersFromJsp) {
        this.layersFromJsp = layersFromJsp;
    }*/


    private  List<Integer> layerId;
    private List<String> growthMode;
    private List<Double> thickness;
    private List<String> x;
    private List<String> y;
    private List<String> temperature;
    private List<String> heat;
    private List<String> Nflow;
    private List<String> dopant;
    private List<String> layerComment;

    public String getSampleNumber() {
        return sampleNumber;
    }
    public void setSampleNumber(String sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getGrowersLastNames() {
        return growersLastNames;
    }
    public void setGrowersLastNames(String growersLastNames) {
        this.growersLastNames = growersLastNames;
    }

    public String getWaferNumber() {
        return waferNumber;
    }
    public void setWaferNumber(String waferNumber) {
        this.waferNumber = waferNumber;
    }

    public String getWaferSize() {
        return waferSize;
    }
    public void setWaferSize(String waferSize) {
        this.waferSize = waferSize;
    }

    public String getSubstrate() {
        return substrate;
    }
    public void setSubstrate(String substrate) {
        this.substrate = substrate;
    }

    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<Integer> getLayerId() {
        return layerId;
    }

    public void setLayerId(List<Integer> layerId) {
        this.layerId = layerId;
    }

    public List<String> getGrowthMode() {
        return growthMode;
    }
    public void setGrowthMode(List<String> growthMode) {
        this.growthMode = growthMode;
    }

    public List<Double> getThickness() {
        return thickness;
    }
    public void setThickness(List<Double> thickness) {
        this.thickness = thickness;
    }

    public List<String> getX() {
        return x;
    }
    public void setX(List<String> x) {
        this.x = x;
    }

    public List<String> getY() {
        return y;
    }
    public void setY(List<String> y) {
        this.y = y;
    }

    public List<String> getTemperature() {
        return temperature;
    }
    public void setTemperature(List<String> temperature) {
        this.temperature = temperature;
    }

    public List<String> getHeat() {
        return heat;
    }
    public void setHeat(List<String> heat) {
        this.heat = heat;
    }

    public List<String> getNflow() {
        return Nflow;
    }
    public void setNflow(List<String> nflow) {
        Nflow = nflow;
    }

    public List<String> getDopant() {
        return dopant;
    }
    public void setDopant(List<String> dopant) {
        this.dopant = dopant;
    }

    public List<String> getLayerComment() {
        return layerComment;
    }
    public void setLayerComment(List<String> layerComment) {
        this.layerComment = layerComment;
    }




/*    class LayerFromJsp {

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
    }*/
}
