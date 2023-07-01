package Task1;

public class Test implements MyInterface{

    int start;
    int value;
    int prev;

    public Test() {
        start = 0;
        value = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = value;
        value += 2;
        return value;
    }


    @Override
    public void reset() {
        start = 0;
        value = 0;
        prev = -2;
    }

    public void setStart(int x) {
        prev = x - 2;
        start = x;
        value = x;
    }
    int getPrev(){
        return prev;
    }

}
