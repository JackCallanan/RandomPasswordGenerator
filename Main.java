
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void numbersonlypassword(int passwordlength) {
        int[] numbers = new int[passwordlength];
        int randominteger;
        for (int i = 0; i < passwordlength; i++) {
            randominteger = random.nextInt(10);
            numbers[i] = randominteger;
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j]);
        }
    }
    public static void lettersonlypassword(int passwordlength) {
        System.out.println("Do you want your password to include:");
        System.out.println("1. lowercase letters");
        System.out.println("2. uppercase letters");
        System.out.println("3. both");
        int choice = scanner.nextInt();

        char[] characters = new char[passwordlength];
        char randomcharacter;

        switch (choice) {
            case 1:
                for (int i = 0; i < passwordlength; i++) {
                    randomcharacter = (char)(random.nextInt(26) + 'a');
                    characters[i] = randomcharacter;
                }
                for (int j = 0; j < characters.length; j++) {
                    System.out.print(characters[j]);
                }
                break;
            case 2:
                for (int i = 0; i < passwordlength; i++) {
                    randomcharacter = (char)(random.nextInt(26) + 'a');
                    characters[i] = Character.toUpperCase(randomcharacter);
                }
                for (int j = 0; j < characters.length; j++) {
                    System.out.print(characters[j]);
                }
                break;
            case 3:
                for (int i = 0; i < passwordlength; i++) {
                    randomcharacter = (char)(random.nextInt(26) + 'a');
                    int randomizeupperorlower = random.nextInt(2);
                    if (randomizeupperorlower == 0){
                        characters[i] = randomcharacter;
                    } else if (randomizeupperorlower == 1){
                        characters[i] = Character.toUpperCase(randomcharacter);
                    }
                }
                for (int j = 0; j < characters.length; j++) {
                    System.out.print(characters[j]);
                }
                break;
            default:
                System.out.println("Invalid choice. Please restart the program and try again.");
                break;
        }

    }

    public static void numandletterpassword(int passwordlength) {
        System.out.println("Do you want your password to include:");
        System.out.println("1. lowercase letters");
        System.out.println("2. uppercase letters");
        System.out.println("3. both");
        int choice = scanner.nextInt();

        String[] numandletterpassword = new String[passwordlength];
        char randomcharacter;
        int randominteger;

        switch (choice) {
            case 1:
                for (int i = 0; i < passwordlength; i++) {
                    int randomizenumorletter = random.nextInt(2);
                    if (randomizenumorletter == 0){
                        randominteger = random.nextInt(10);
                        numandletterpassword[i] = Integer.toString(randominteger);
                    } else if (randomizenumorletter == 1){
                        randomcharacter = (char)(random.nextInt(26) + 'a');
                        numandletterpassword[i] = Character.toString(randomcharacter);
                    }
                }
                for (int j = 0; j < numandletterpassword.length; j++) {
                    System.out.print(numandletterpassword[j]);
                }
                break;
            case 2:
                for (int i = 0; i < passwordlength; i++) {
                    int randomizenumorletter = random.nextInt(2);
                    if (randomizenumorletter == 0){
                        randominteger = random.nextInt(10);
                        numandletterpassword[i] = Integer.toString(randominteger);
                    } else if (randomizenumorletter == 1){
                        randomcharacter = (char)(random.nextInt(26) + 'a');
                        char uppercasechar = Character.toUpperCase(randomcharacter);
                        numandletterpassword[i] = Character.toString(uppercasechar);
                    }
                }
                for (int j = 0; j < numandletterpassword.length; j++) {
                    System.out.print(numandletterpassword[j]);
                }
                break;
            case 3:
                for (int i = 0; i < passwordlength; i++) {
                    int randomizenumorletter = random.nextInt(2);
                    if (randomizenumorletter == 0){
                        randominteger = random.nextInt(10);
                        numandletterpassword[i] = Integer.toString(randominteger);
                    } else if (randomizenumorletter == 1){
                        randomcharacter = (char)(random.nextInt(26) + 'a');
                        int randomizeupperorlower = random.nextInt(2);
                        if (randomizeupperorlower == 0){ //lowercase character
                            numandletterpassword[i] = Character.toString(randomcharacter);
                        }
                        else if(randomizeupperorlower == 1){ //uppercase character
                            char uppercasechar = Character.toUpperCase(randomcharacter);
                            numandletterpassword[i] = Character.toString(uppercasechar);

                        }
                    }
                }
                for (int j = 0; j < numandletterpassword.length; j++) {
                    System.out.print(numandletterpassword[j]);
                }
                break;
            default:
                System.out.println("Invalid choice. Please restart the program and try again.");
                break;
        }    }

    public static void main(String[] args) {

        System.out.println("Welcome to the random password generator!");
        System.out.println("Please enter the minimum length you want your password to be:");
        int min = 0;
        while (min <= 0) {
            min = scanner.nextInt();
            if(min <=0){
                System.out.println("Your min length must be greater than zero.");
            }
        }
        System.out.println("Please enter the maximum length you want your password to be:");
        int max = 0;
        while (max <= 0 || max < min) {
            max = scanner.nextInt();
            if (max < min) {
                System.out.println("Your max length must be equal to or greater than your minimum length.");
            }
            if(max<=0){
                System.out.println("Your max length must be greater than zero.");
            }
        }
        System.out.println("The minimum length of your password is: " + min);
        System.out.println("The maximum length of your password is: " + max);

        int passwordlength = random.nextInt(max - min + 1) + min;
        System.out.println("The random length of your password was determined to be: " + passwordlength);
        System.out.println("Do you want your password to include:");
        System.out.println("1. Numbers only");
        System.out.println("2. Letters only");
        System.out.println("3. Both numbers and letters");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                numbersonlypassword(passwordlength);
                break;
            case 2:
                lettersonlypassword(passwordlength);
                break;
            case 3:
                numandletterpassword(passwordlength);
                break;
            default:
                System.out.println("Invalid choice. Please restart the program and try again.");
                break;
        }

        scanner.close();
        
        System.out.println("Do you want your password to include special characters?");



    }


}