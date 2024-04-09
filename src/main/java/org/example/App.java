package org.example;


import com.google.gson.Gson;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //JSON simple text format, easy to understand
        String jsonToClass = "{\"name\":\"Juan\",\"age\":30}";
        System.out.println(jsonToClass);

        Gson gson = new Gson();
        User user = gson.fromJson(jsonToClass, User.class);
        System.out.println(user.toString());

        User user1 = new User("Ana", 67);
        String classToJson = gson.toJson(user1);
        System.out.println(classToJson);


        // TDD Test Driven Development
        // Red Green *Refactor
        // Throw and handle exception

        //Calculator calculator = new Calculator();
        //int sum = calculator.positiveAddition(-1,1);

        try {
            Calculator calculator = new Calculator();
            int sum2 = calculator.positiveAddition(-1, 1);
        } catch (IllegalArgumentException e) {
            //System.out.println("Error, you have input a negative number");
            System.err.println("Error, you have input a negative number");
        }

      /*  try {
            FileWriter writer = new FileWriter("example");
        } catch (IOException e){
            System.out.println("oye erorr");
        }*/

        try {
            //User.concatenateName("Lisa","Medina");
            User.concatenateName(null, "Medina");
        } catch (IllegalArgumentException e) {
            System.err.println("Error, you have input a null value");
        }
    }
}
