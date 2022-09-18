import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans;
        do {
            System.out.print("Task No. ");
            ans = scan.nextInt();
            switch(ans) {
                case 0 -> System.out.println("Exiting the programme...");
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                case 6 -> task6();
                case 7 -> task7();
                case 8 -> task8();
                case 9 -> task9();
                case 10 -> task10();
            }
        } while (ans != 0);
    }
    static void task1(){
        HashSetCreator.defaultdata();
        System.out.println(HashSetCreator.colour1);
        System.out.println(HashSetCreator.colour2);
    }
    static void task2(){
        System.out.println(HashSetCreator.colour1.size());
        System.out.println(HashSetCreator.colour2.size());
    }
    static void task3(){
        HashSetCreator.colour1.clear();
        HashSetCreator.colour2.clear();
        System.out.println("Clear successful.");
    }
    static void task4(){
        System.out.println(HashSetCreator.colour1.isEmpty());
        System.out.println(HashSetCreator.colour2.isEmpty());
    }
    static void task5(){
        HashSet clone1, clone2;
        clone1 = (HashSet) HashSetCreator.colour1.clone();
        clone2 = (HashSet) HashSetCreator.colour2.clone();
//        System.out.println(clone1 + " " + (clone1 == HashSetCreator.colour1));
        System.out.println(clone1);
        System.out.println(clone2);
    }
    static void task6(){
        String[] array1 = HashSetCreator.colour1.toArray(new String[0]);
        String[] array2 = HashSetCreator.colour2.toArray(new String[0]);
        for (String temp: array1) System.out.print(temp + ", ");
        System.out.println();
        for (String temp: array2) System.out.print(temp + ", ");
        System.out.println();
    }
    static void task7(){
        TreeSet treeSet1 = new TreeSet<>(HashSetCreator.colour1);
        TreeSet treeSet2 = new TreeSet<>(HashSetCreator.colour2);
        System.out.println(treeSet1);
        System.out.println(treeSet2);
    }
    static void task8(){
        List list1 = new ArrayList(HashSetCreator.colour1);
        List list2 = new ArrayList(HashSetCreator.colour2);
        System.out.println(list1);
        System.out.println(list2);
    }
    static void task9(){
        for (String temp: HashSetCreator.colour1) {
            System.out.println(temp + " " + HashSetCreator.colour2.contains(temp));
        }
    }
    static void task10(){
        HashSetCreator.colour1.retainAll(HashSetCreator.colour2);
        System.out.println(HashSetCreator.colour1);
        HashSetCreator.colour2.retainAll(HashSetCreator.colour1);
        System.out.println(HashSetCreator.colour2);
    }

}
