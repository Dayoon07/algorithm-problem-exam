package ap;

public class 특별한이차원배열2 {

    public static void main(String[] args) {
        int[][] arr1 = {
            {5, 192, 33},
            {192, 72, 95},
            {33, 95, 999}
        };
        int[][] arr2 = {
            {19, 498, 258, 587},
            {63, 93, 7, 754},
            {258, 7, 1000, 723},
            {587, 754, 723, 81}
        };
        System.out.println(new 특별한이차원배열2().solution(arr1));
        System.out.println(new 특별한이차원배열2().solution(arr2));
    }

    public int solution(int[][] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }

}