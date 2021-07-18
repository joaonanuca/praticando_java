package entities;

/**
 *
 * @author João Nanuca
 */
public class Aluno {

    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double finalNote() {
        return (this.note1 + this.note2 + this.note3);
    }

    public void result(double finalNote) {
        if (finalNote >= 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60-finalNote);
        }
    }

}
