package by.ifanbel;

import by.ifanbel.guiValidation.PatternForListOfString;

import java.util.ArrayList;
import java.util.List;

public class HsFromJsp {

    public HsFromJsp() {
      layerId.add(1);
      growthMode.add("1");
      thickness.add(0.0);
      x.add("");
      y.add("");
      temperature.add("");
      heat.add("");
      nflow.add("");
      dopant.add("1");
      layerComment.add("");
}

    private String sampleNumber;
    private String date;
    private String growersLastNames;
    private String waferNumber;
    private String waferSize;
    private String substrate;
    private String comments;

    private List<Integer> layerId = new ArrayList<Integer>();
    private List<String> growthMode = new ArrayList<String>();
    private List<Double> thickness = new ArrayList<Double>();

    @PatternForListOfString (regexp = "((1(\\.0+)?)|(0\\.\\d*))(-((1(\\.0+)?)|(0\\.\\d*)))?", message = "Неверно задан параметр x")
    private List<String> x = new ArrayList<String>();

    private List<String> y = new ArrayList<String>();
    private List<String> temperature = new ArrayList<String>();
    private List<String> heat = new ArrayList<String>();
    private List<String> nflow = new ArrayList<String>();
    private List<String> dopant = new ArrayList<String>();
    private List<String> layerComment = new ArrayList<String>();

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
        return nflow;
    }
    public void setNflow(List<String> nflow) {
        this.nflow = nflow;
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
        private String nflow;
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
            return nflow;
        }
        public void setNflow(String nflow) {
            nflow = nflow;
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
