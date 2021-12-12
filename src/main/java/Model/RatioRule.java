package Model;

public class RatioRule {
    private int low;
    private int high;
    private int size;

    public RatioRule(String csv){
        String[] item = csv.split(",");
        low = Integer.parseInt(item[0]);
        high = Integer.parseInt(item[1]);
        size = Integer.parseInt(item[2]);
    }

    public int getLow(){return low;}
    public int getHigh(){return  high;}
    public int getSize(){return size;}
    public boolean inRange(int age){
        return (low<=age && age < high);
    }
}
