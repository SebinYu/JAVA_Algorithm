package stringLength;

//import java.util.*;
//class StringLengthMax {
//    public String solution(String str){
//        String answer="";
//        int maxLength =Integer.MIN_VALUE;
//        String[] splitedWordArr = str.split(" ");
//        for(String x : splitedWordArr){
//            int lenTmp = x.length();
//            if(lenTmp > maxLength){
//                maxLength = lenTmp;
//                answer = x;
//
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        StringLengthMax T = new StringLengthMax();
//        Scanner kb = new Scanner(System.in);
//        String str=kb.nextLine();
//        System.out.print(T.solution(str));
//    }
//}




import java.util.*;

class StringLengthMax {
    public String solution(String str){
        String answer="";
        int maxLength =Integer.MIN_VALUE, spaceIndex;
        while((spaceIndex =str.indexOf(' '))!=-1){
            String stringTmp=str.substring(0, spaceIndex);
            int lenTmp= stringTmp.length();
            if(lenTmp>maxLength){
                maxLength=lenTmp;
                answer=stringTmp;
            }
            str=str.substring(spaceIndex+1);
        }
        if(str.length()>maxLength) answer=str;
        return answer;
    }

    public static void main(String[] args){
        StringLengthMax T = new StringLengthMax();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.print(T.solution(str));
    }
}