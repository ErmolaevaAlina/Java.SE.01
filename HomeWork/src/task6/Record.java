package task6;

public class Record {
    String record = new String();
    Record (String s){
        record  = s;
    }

    @Override
    public String toString() {
        return record;
    }
}
