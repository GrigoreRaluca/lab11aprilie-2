package ro.ase.cts.lab11apr2;

public abstract class Masina {
    String producator;
    String sasiu;
    String culoare;

    public Masina(String producator, String sasiu, String culoare) {
        this.producator = producator;
        this.sasiu = sasiu;
        this.culoare = culoare;
    }
    public abstract String getDetails();
    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}
