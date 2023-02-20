package run;

public class Manager extends AngajatCompanieTelecomunicatii implements Angajat, Runner {
    @Override
    public void lucreaza() {
        System.out.println("Conduce proicte");
    }

    @Override
    public String descrieFunctiaSa() {
        return "Lucrez la proiecte IT";
    }
}
