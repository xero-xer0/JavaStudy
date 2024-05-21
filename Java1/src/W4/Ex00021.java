public class Ex00021 {
    public static void main(String[] args) {

        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] refValue;
        refValue = array1;


        System.out.println(array1[0]);
        System.out.println(array1[array1.length-1]);
        // System.out.println(array1[[-1]]); 0보다 작은 인덱스는 사용할 수 없다.
        refValue[2] = 9;
        System.out.println(array1[2]);
    }
}
