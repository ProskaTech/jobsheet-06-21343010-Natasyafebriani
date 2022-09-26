/*
 created by 21343010-Natasya febriani
 */
package jobsheet6;

public class Grade2 {
    public static void main(String[] args){
       int grade = 92;
       
       switch(grade) {
            case 100:
               System.out.println("Excellent!");
               break;
            case 90:
               System.out.println("Good job!");
               break;
            case 80:
                System.out.println("Study harder!");
            default:
                System.out.println("Sorry, you failed.");
       }
    }
}
