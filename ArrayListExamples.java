import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(3, 4); // pridam dalso prvek na 4. misto index 3 a pridam cislo 4

        nums.remove(1);        // smazi cislo na indexu 1, takze smazu cislo 2 a
        nums.add(1, 5); // tady pridam na index 1 kde byla puvodne 2 tak tam dam petka 5

       // System.out.println(nums);


//        //prohodit dva prvekky
//        int temp = nums.get(0); //vytvorim novou promennou doktery vlozim cislo na nultzm indexu coz je jedna 1
//        nums.set(0, nums.get(2)); // metodou nums.set dam na index 0, prvek ktery je na indexu 2
//        nums.set(2, temp); // a na index dva 2 dam to co bylo na indexu 0  a ted to mame v promenne temp


        //  System.out.println(nums); // vysledek je teda ze se prohodili cisla z
        // indexu 0 a 2, takze se prohodi cisla 1 z nultyho
        //    s cislem 3 y druhyho indexu


        // udela mi tabulku se slovem Index: a cislo indexu
//        for (int i=0; i < nums.size(); i++) {
//            System.out.printf("Index: %d  ;  Number: %d\n", i, nums.get(i));
//        }
//
//        System.out.println("----------");

//        Iterator individual = nums.iterator();
//
//        while(individual.hasNext()) {     // tahle metoda tiskne jedno cislo po druhem, pod sebe
//            System.out.println(individual.next());
//        }
        // Copy an entire collection into a new one with "new.addAll(original)" method
        // Zkopírujte celou kolekci do nové pomocí metody "new.addAll(original)".
//        ArrayList<Integer> copyNums = new ArrayList<>();
//        copyNums.addAll(nums);
//
//        System.out.println(nums);           // Output: [3, 2, 1, 4]
//        System.out.println(copyNums);       // Same output

//        int lookingfotNumber = 4;
//       // nums.add(lookingfotNumber);
//        if (nums.contains(lookingfotNumber)) {
//            System.out.println("Number " + lookingfotNumber + " is in the ArrayList.");
//         //   System.out.println(nums);
//        }else{
//            System.out.println("Number");
//        }

//        nums.clear();
//        if (nums.isEmpty()) {
//            System.out.println("ArrayList is empty.");
//
//        } else {
//            System.out.println("ArrayList is not empty");
//        }
        ArrayList<Integer> copyNums = new ArrayList<>();
        copyNums.addAll(nums);

       // System.out.println(nums);           // Output: [1, 5, 2, 4]
      //  System.out.println(copyNums);       // Same output

        Object[] moreNums = new Object[4];
        moreNums = copyNums.toArray();
      //  System.out.println(Arrays.toString(moreNums));

        nums.addAll(Arrays.asList(1, 2, 3, 4)); //kratsi ypusob jak pridat hodnoty do listu
        nums.addAll(Arrays.asList(new Integer[] {1, 2, 3, 4})); //delsi zpusob
       // System.out.println(nums);

        //timhle prepisu co jsem do ted udelala vytvorim novy list s nazvem List Example a hodnoty 1,2,3,4
        List<Integer> ListExample = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        System.out.println(ListExample);


        // kdyz chci zjisti jestli v listu tam je cislo 4


//        boolean isFound = false;
//
//        for (int i = 0; i < nums.size(); i++) {
//            if (nums.get(i) == 4) {
//                isFound = true;
//                System.out.println("In array list is number 8");
//
//            }
//
//        }
//            if (!isFound) {
//                System.out.println("In arraylist is not number 8");
//            }

//            }
//        }


        // vypise mi to jen cisla indexu
//        System.out.println("---ELEMENT SWAP----");
//        for (int number : nums) {  // nums je pocet kolikrat se to udela kdyz jsou tam 4 prvkz tak 4x
//                                    // number je to cislo daneho indexu jak jdou po sobe,
//                                    //muze byt jakykoliv cislo, je to jako u normalni loopy i
//            System.out.printf("Number: %d\n", number);
//       }
    }
}
