//package prac;
//
//public class Practice {
//    public static void main(String[] args) {
//        int[][] office = {{1,0,0,0},{0,0,0,1},{0,0,1,0},{0,1,1,0}};
//        int k = 2;
//        int answer = Solution(office, k);
//        System.out.println("결과: "+answer);
//    }
//
//    public static int Solution(int[][] office, int k){
//        int maxNum = 0;
//        for(int i = 0; i < office.length-k+1; i++){
//            for(int j = 0; j<office.length-k+1; j++){
//                System.out.println("-------------------------");
//                System.out.println("--ij: "+i+"|"+j);
//                int num = 0;
//                for(int x=i;x<i+k;x++){
//                    for(int y=j; y<j+k;y++){
//                        System.out.println("xy: "+x+"|"+y);
//                        num += office[x][y];
//                    }
//                }
//                maxNum=(maxNum>num)?maxNum:num;
//                System.out.println(num);
//            }
//        }
//
//        return maxNum;
//    }
//}
