import java.util.ArrayList;
class Student{
    int roll;
    String name;

//    public Student(int roll, String said) { // constructor of student
//        this.roll =roll;
//        this.name =name;
//
//    }
}

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList(); // Type specific for Strins
        list1.add("Said");
        list1.add("Mama");
        list1.add("Mohamed");
        list1.add("Hicham");
        list1.add("Lahsen");
//        list1.add(3);
//        list1.add(3);


//        Student student = new Student(123,"said"); // with constructor
        Student student = new Student();
        student.name="said";
        student.roll = 123;

        ArrayList list2 = new ArrayList(); // for any types of datas

        list2.add("Ali");
        list2.add("Youssef");
        list2.add(2);
        list2.add(4);
        list2.add(student);

//  1. display elements
//        System.out.println("String types list only:"+list1);
//        System.out.println("Any type in this list:"+list2);

//  2. get elements
//        String name =list1.get(0);
//        System.out.println("The name of the first element in the list1 is: "+name);
//
//        Object o = list2.get(2);
//        System.out.println("The object of the second element in the list2 is: "+o);


//  3. Set element in the list
        list1.set(0,"Souad");
        System.out.println("The new list after set of new element  "+list1);

//  4. remove element in the list
//        list1.remove(0);
//        System.out.println("The list1 after removing the first element   "+list1);

//  5. to remove all elements in the list1
//        list1.clear();

//  6. to know if an elements exist in the list

        if(list1.contains("Souad")){
            System.out.println("Souad is in the list "+list1);
        }else {
            System.out.println("Souad is NOT in the list "+list1);

        }

    }
}
