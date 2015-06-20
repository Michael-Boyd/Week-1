//import java.util.Arrays;
//
///**
// * Created by mikeboyd5 on 6/18/15.
// */
//public class GroupingArrays {
//    public static void main(String[] args) {
//        int age[] = new int[]{33,66,77,5,18,89,5,18,15,45};
//        int minorNumber = 0;
//        int majorNumber = 0;
//        int seniorNumber = 0;
//        for (int i = 0; i <age.length ; i++) {
//            if(age[i]<18){
//               minorNumber++;
//            }
//            if(age[i]>=18 && age[i]<65){
//                majorNumber++;
//            }
//            if(age[i]>=65){
//                seniorNumber++;
//            }
//        }
//        int minor[]= new int[minorNumber];
//        int major[]= new int[majorNumber];
//        int senior[]= new int[seniorNumber];
//        int minorPosition =0;
//        int majorPosition =0;
//        int seniorPosition =0;
//        int temp;
//        //int temp;
//        //int temp;
//        for (int i = 0; i < age.length; i++) {
//            if(age[i]<18){
//            temp = age[i];
//                minor[minorPosition] = temp;
//                minorPosition++;
//            }
//            if(age[i]>=18 && age[i]<65){
//                temp = age[i];
//                major[majorPosition] = temp;
//                majorPosition++;
//            }
//            if(age[i]>=65){
//                temp = age[i];
//                senior[seniorPosition] = temp;
//                seniorPosition++;
//            }
//        }
//        System.out.println("Age of Minors = " + Arrays.toString(minor));
//        System.out.println("Age of Majors = " + Arrays.toString(major));
//        System.out.println("Age of Seniors = " + Arrays.toString(senior));
//    }
//}
