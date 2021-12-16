package be.intecbrussel;

public class StreamMethodsImplementation {
    public static void main(String[] args) {
        Person[] pArr;

        pArr = new Person[]{
                new Person("Jeans-Pierre", 25),
                new Person("Jeans-Pierre", 25),
                new Person("Jeans-Pierre", 25),
                new Person("Jeans-Ali", 75),
                new Person("Jeans-Zara", 15),
                new Person("Jeans-Maya", 28),
                new Person("Jeans-Luc", 30),
                new Person("Jeans-Lara", 31),
                new Person("Jeans-Nena", 30),
                new Person("Jeans-Marie", 50)};
//distinct method implementation
        Person[] newArray = new Person[pArr.length];
        int count = 0;
        for (int i = 0; i < pArr.length; i++) {
            boolean isExist = false;
            for (int j = 0; j < newArray.length; j++) {
                if (newArray[j] != null && (pArr[i].equals(newArray[j]))) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                newArray[count] = pArr[i];
                count++;
            }
        }
        for (Person person : newArray) {
            if (person != null)
                System.out.println(person);
        }

        //mapToInt() method
        // implementation of count() Method (number of elements in an array)
        //implementation of average() method
        int sum = 0;
        double average;
        int numberOfElements = 0;
        int length = newArray.length;
        for (Person person : newArray) {
            if (person != null) {
                int ageOfPerson = person.getAge();
                sum += ageOfPerson;
                numberOfElements++;
                System.out.println(ageOfPerson);
            }
        }
        average = sum / numberOfElements;
        System.out.println(numberOfElements);
        System.out.println(average);
        int limit = 0;
        //implementation of limit method
        //Implementation of filter method
        for (Person person : newArray) {
            if (person!=null){
                limit++;
          if ( person.getName().startsWith("Jeans")&&limit<=3){
              System.out.println(person.getName());
          }

        }}
    }
}