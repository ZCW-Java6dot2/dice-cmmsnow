
public class Bins {
    Integer binOf2, binOf3, binOf4, binOf5, binOf6, binOf7, binOf8, binOf9, binOf10, binOf11, binOf12;

    public Bins(){
        this.binOf2 = 0;
        this.binOf3 = 0;
        this.binOf4 = 0;
        this.binOf5 = 0;
        this.binOf6 = 0;
        this.binOf7 = 0;
        this.binOf8 = 0;
        this.binOf9 = 0;
        this.binOf10 = 0;
        this.binOf11 = 0;
        this.binOf12 = 0;
    }

    public void addNumToBin(Integer binNum){
        switch (binNum){
            case 2:
                binOf2 += 1;
                break;
            case 3:
                binOf3 += 1;
                break;
            case 4:
                binOf4 += 1;
                break;
            case 5:
                binOf5 += 1;
                break;
            case 6:
                binOf6 += 1;
                break;
            case 7:
                binOf7 += 1;
                break;
            case 8:
                binOf8 += 1;
                break;
            case 9:
                binOf9 += 1;
                break;
            case 10:
                binOf10 += 1;
                break;
            case 11:
                binOf11 += 1;
                break;
            case 12:
                binOf12 += 1;
                break;
        }
    }

    public Integer getNumInBin(Integer binNum){
        switch (binNum){
            case 2:
                return binOf2;
            case 3:
                return binOf3;
            case 4:
                return binOf4;
            case 5:
                return binOf5;
            case 6:
                return binOf6;
            case 7:
                return binOf7;
            case 8:
                return binOf8;
            case 9:
                return binOf9;
            case 10:
                return binOf10;
            case 11:
                return binOf11;
            case 12:
                return binOf12;
            default:
                return null;
        }
    }
}
