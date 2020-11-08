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

    public void printResults(){
        System.out.println("Bin of 2s contains " + bins.getNumInBin(2) + "occurrences.");
        System.out.println("Bin of 3s contains " + bins.getNumInBin(3) + "occurrences.");
        System.out.println("Bin of 4s contains " + bins.getNumInBin(4) + "occurrences.");
        System.out.println("Bin of 5s contains " + bins.getNumInBin(5) + "occurrences.");
        System.out.println("Bin of 6s contains " + bins.getNumInBin(6) + "occurrences.");
        System.out.println("Bin of 7s contains " + bins.getNumInBin(7) + "occurrences.");
        System.out.println("Bin of 8s contains " + bins.getNumInBin(8) + "occurrences.");
        System.out.println("Bin of 9s contains " + bins.getNumInBin(9) + "occurrences.");
        System.out.println("Bin of 10s contains " + bins.getNumInBin(10) + "occurrences.");
        System.out.println("Bin of 11s contains " + bins.getNumInBin(11) + "occurrences.");
        System.out.println("Bin of 12s contains " + bins.getNumInBin(12) + "occurrences.");
    }

}
