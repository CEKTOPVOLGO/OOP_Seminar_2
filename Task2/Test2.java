package Task2;
public class Test2 implements IConst {
    public static void main(String[] args) {


        int nums[] = new int[MAX];
        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) {
                System.out.println(ERR);
            } else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
