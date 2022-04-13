package ro.ase.cts.lab11apr2;

public class DealerAuto {
    MasinaElectrica masinaElectrica;
    MasinaClasica masinaClasica=new MasinaClasica("AUDI","mic","rosu","aditiv1");
    MasinaHibrid masinaHibrid;


    public String getDetailsMasinaClasica() {
        return masinaClasica.getDetails();
    }

    public String getDetailsMasinaHibrid(){
        return masinaHibrid.getDetails();
    }

    public String getDetailsMasinaElectrica(){
        return  masinaElectrica.getDetails();
    }
}
