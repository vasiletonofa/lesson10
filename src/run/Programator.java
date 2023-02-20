package run;

public class Programator extends AngajatCompanieTelecomunicatii implements Angajat, Runner {
    @Override
    public void lucreaza() {
        System.out.println("Scrie cod");
    }

    @Override
    public String descrieFunctiaSa() {  // modificator egal sau mai mare(accesibil)
        return "Scrie cod in Java";
    }
}
