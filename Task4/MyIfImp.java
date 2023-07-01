package Task4;

public class MyIfImp implements MyIf, MyIf2{
    @Override
    public int getUserId() {
        return 100;
    }

    @Override
    public int getAdminId() {
        return 50;
    }

    @Override
    public int getSuperAdmin() {
        return 0;
    }
}
