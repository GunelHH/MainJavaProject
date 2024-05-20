package lesson40;

import java.util.HashMap;
import java.util.function.BiFunction;

public class WordWithCount {
    public static void main(String[] args) {

        String word="Azerbaijan".toLowerCase();
        char[]charArray=word.toCharArray();
        HashMap<Character,Integer>hashMap=new HashMap<>();
//        for (char c : charArray) {
//            if (hashMap.containsKey(c)) {
//                Integer count=hashMap.get(c);
//                hashMap.put(c,count+1);
//            }else{
//                hashMap.put(c,1);
//            }
//        }

//        orrrrr
        for (char c : charArray) {
           hashMap.merge(c, 1, Integer::sum);
//            hashMap.merge(c, 1, new BiFunction<Integer, Integer, Integer>() {
//                @Override
//                public Integer apply(Integer integer, Integer integer2) {
//                    return integer+integer2;
//                }
//            });
        }
        System.out.println(hashMap);

    }
}
