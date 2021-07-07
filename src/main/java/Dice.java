public class Dice {
    Integer faceValue;
    Integer summedFaceValue;
    Integer numOfDice;

    public Dice(Integer numOfDice) {
        this.numOfDice = numOfDice;
    }

    public Integer tossAndSum(Integer numOfDice){
       summedFaceValue = 0;
        for (int i = 0; i<numOfDice; i++){
            faceValue = (int)(Math.random() * (6 - 1)) + 1;
            summedFaceValue += faceValue;
        }
        return summedFaceValue;
    }

    public Integer getNumOfDice(){
        return numOfDice;
    }

    public void setNumOfDice(Integer numOfDice){
        this.numOfDice = numOfDice;
    }
}
