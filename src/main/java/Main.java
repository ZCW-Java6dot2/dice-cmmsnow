public class Main {
    public static void main(String[] args) {
        Integer numOfSims = 10000;
        Simulation sim = new Simulation(numOfSims);
        sim.runSimulation(numOfSims);
        sim.printResults();
    }
}
