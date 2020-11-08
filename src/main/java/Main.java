public class Main {
    public static void main(String[] args) {
        Integer numOfSims = 1000;
        Simulation sim = new Simulation(numOfSims);
        sim.runSimulation(numOfSims);
        sim.printResults();
    }
}
