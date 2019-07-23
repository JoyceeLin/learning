///*
// *
// */
//package learning.utils.lombok;
//
//import lombok.val;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
///**
// * @Description: TODO
// * @Author: JingHui Lin
// * @Date: 2019/6/6 16:35
// * @Version V1.0
// */
//public class Val {
//    public String example() {
//        val example = new ArrayList<String>();
//        example.add("Hello, World!");
//        val foo = example.get(0);
//        return foo.toLowerCase();
//    }
//
//    public void example2() {
//        val map = new HashMap<Integer, String>();
//        map.put(0, "zero");
//        map.put(5, "five");
//        for (val entry : map.entrySet()) {
//            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
//        }
//    }
//    public static void main(String[] args) {
//        val example = new ArrayList<String>();
//        example.add("Hello, World!");
//        val foo = example.get(0);
//    }
//}
