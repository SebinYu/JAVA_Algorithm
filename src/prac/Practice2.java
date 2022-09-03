package prac;
import java.util.Arrays;


public class Practice2 {
    //배열
    //같은 내용_첫 인덱스번호로 뒤에 연결되는 인덱스 번호 변경
    //중복 중 뒤에 붙이는 문자열에서 중복부분 제거하고 -> 붙이기
    public synchronized static void main(String[] args) {
        String[] s1 = {"A","x","A"};
        String[] s2 = {"A","y","A"};

        String answer = ArrayP(s1, s2);
        System.out.println(answer);
    }


    public synchronized static String ArrayP(String[] s1, String[] s2){
        String finalAnswer = " ";
        String[] arr1 = new String[0];
        String[] arr2 = new String[0];

        for(int i = 0; i < s1.length; i++){
            for(int j =0; j< s2.length; j++){
                if( (s1[i]==s2[j]) && (i < j)) {
                    arr1 = Arrays.copyOfRange(s1, i+1, s1.length);
                }
                if( (s1[i]==s2[j]) && (i > j)) {
                    arr2 = Arrays.copyOfRange(s2, j+1, s2.length);
                }
            }

        }


        int lenArray1 = s2.length;
        int lenArray2 = arr1.length;
        String[] concate1 = new String[lenArray1 + lenArray2];
        System.arraycopy(s2, 0, concate1, 0, lenArray1);
        System.arraycopy(arr1, 0, concate1, lenArray1, lenArray2);
        String str1 = String.join("", concate1);
        System.out.println("First Concatenated Array: " + Arrays.toString(concate1));


        int lenArray3 = arr2.length;
        int lenArray4 = s1.length;
        String[] concate2 = new String[lenArray3 + lenArray4];
        System.arraycopy(s1, 0, concate2, 0, lenArray4);
        System.arraycopy(arr2, 0, concate2, lenArray4, lenArray3);
        String str2 = String.join("", concate2);
        System.out.println("Second Concatenated Array: " + Arrays.toString(concate2));


        if(concate1.length ==  concate2.length){
            int comparedResult = str1.compareTo(str2);
            if (comparedResult > 0 ) {
                finalAnswer = str2;
            } else{
                finalAnswer = str2;
            }
        }else if(concate1.length < concate2.length) {
            finalAnswer = str1;
        }else {
            finalAnswer = str2;
        }


        return finalAnswer;
    }
}
