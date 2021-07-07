import java.io.PrintStream;
import java.io.PrintWriter;
import javax.xml.bind.PrintConversionEvent;
import com.sun.codemodel.internal.JPrimitiveType;

public class Simulation {

    Integer numOfDice = 2;
    Dice dice = new Dice(numOfDice);
    Bins bins = new Bins();
    Integer numOfSims;

    public Simulation(Integer numOfSims){
        this.numOfSims = numOfSims;
    }

    public void runSimulation(Integer numOfSims){
        for (int i=1; i<=numOfSims; i++){
            Integer sum = dice.tossAndSum(numOfDice);
            bins.addNumToBin(sum);
        }
    }

    public String printStars(float percentage){
        StringBuilder stars = new StringBuilder();
        float percent = percentage * 100;
        int starsNum = (int) percent;
        for (int i=0; i<starsNum; i++){
            stars.append("*");
        }
        return stars.toString();
    }

    public void printResults(){

        System.out.println("***\nSimulation of " + numOfDice + " dice tossed " + numOfSims + " times\n***\n");
        for (int i = 2; i<=(6*numOfDice); i++){
            float percentage = (float) bins.getNumInBin(i)/numOfSims;
            int timesTossed = bins.getNumInBin(i);
            String stars = printStars(percentage);
            System.out.printf("\n %2d:  %5d:   %.2f %s ",i,timesTossed,percentage,stars);
        }
    }
}
