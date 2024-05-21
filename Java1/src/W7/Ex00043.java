package W7;
interface PhoneInterface {
    void printLogo() ;
}

public class Ex00043 implements PhoneInterface{
    
    @Override
    public void printLogo() {
        System.out.println("It is PhoneInterface Logo");
    }
    public static void main(String[] args) {
        Ex00043 myPhone = new Ex00043();
        myPhone.printLogo();
    }
}
