package run;

public class ConstructionWorker extends AngajatCompanieTelecomunicatii implements Angajat, Runner {

    @Override
    public void lucreaza() {
        System.out.println("construeste");
    }

    @Override
    String descrieFunctiaSa() {
        return "Construesc blocuri locative";
    }

    public void method() {

    }
}
