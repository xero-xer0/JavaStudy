public class Ex00022 {
    public static void main(String[] args) {
        int[] nums = { 3, 7, 4, 9, 5, 12, 8, 2 };

        int nMax = -999;
        int nSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(nMax < num){
                nMax = nums[i];
            }
                
            System.out.print(" " + nums[i]);
            nSum += nums[i];

        }



        System.out.println("\n합계   : " + nSum);
        System.out.println("최댓값 : " + nMax);
        System.out.println("평균   : " + nSum / nums.length);

    }
}
