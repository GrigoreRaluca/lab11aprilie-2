package ro.ase.cts.lab11apr2;

public class MasinaHibrid extends Masina{
    private boolean plugin;
    public MasinaHibrid(String producator, String sasiu, String culoare,boolean plugin) {
        super(producator, sasiu, culoare);
        this.plugin=plugin;
    }


    @Override
    public String getDetails() {
        return "MasinaHibrid{" +
                "producator='" + producator + '\'' +
                ", sasiu='" + sasiu + '\'' +
                ", culoare='" + culoare + '\'' +
                ", plugin=" + plugin +
                '}';
    }
}
