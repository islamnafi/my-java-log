package methods;

public class ParameterPassing {

    public static void main(String[] args) {

        int i = 10;

        changeIntValue(i);
        System.out.println(i);



    }

    private static void changeIntValue(int i) {
        i += 100;
    }

}
