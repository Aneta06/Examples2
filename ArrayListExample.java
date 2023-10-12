import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(1);  // nums.add(number) - Adds a number at the end of the ArrayList
        nums.add(2);
        nums.add(3);
        nums.add(3, 4); // nums.add(index, number) -Adds a number at the specified index and shifts the rest
        nums.remove(2);    // nums.remove(index) - Removes a value from ArrayList at index and reformats indexes in ArrayList

       // System.out.println(nums);


        // to print value at i, we need to use nums.get(i) method, NOT nums[i] unlike Arrays
        // To find the amount of values stored in ArrayList we need nums.size() method, NOT nums.lenght() unlike Arrays

//        for (int i=0; i < nums.size(); i++) {
//            System.out.printf("Index: %d  ;  Number: %d\n", i, nums.get(i));
//        }
//
//        System.out.println("----------");



        for (int number : nums) {
            System.out.printf("Number: %d\n", number); // We can still use the enhanced for loop just like
                                                       // with Arrays (if we don't need index count)
        }

    }


}
