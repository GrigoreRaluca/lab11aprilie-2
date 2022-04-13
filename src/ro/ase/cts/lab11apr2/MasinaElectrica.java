package ro.ase.cts.lab11apr2;

public class MasinaElectrica extends Masina{
    private float autonomie;
    public MasinaElectrica(String producator, String sasiu, String culoare,float autonomie) {
        super(producator, sasiu, culoare);
        this.autonomie=autonomie;
    }

    @Override
    public String getDetails() {
        return "MasinaElectrica{" +
                "producator='" + producator + '\'' +
                ", sasiu='" + sasiu + '\'' +
                ", culoare='" + culoare + '\'' +
                ", autonomie=" + autonomie +
                '}';

    }
}
