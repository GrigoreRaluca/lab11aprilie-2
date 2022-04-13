package ro.ase.cts.lab11apr2;

public class MasinaClasica extends Masina{
    private String aditivCompatibil;
    public MasinaClasica(String producator, String sasiu, String culoare,String aditiv) {
        super(producator, sasiu, culoare);
        this.aditivCompatibil=aditiv;
    }


    @Override
    public String getDetails() {
        return "MasinaClasica{" +
                "producator='" + producator + '\'' +
                ", sasiu='" + sasiu + '\'' +
                ", culoare='" + culoare + '\'' +
                ", aditivCompatibil='" + aditivCompatibil + '\'' +
                '}';
    }
}
