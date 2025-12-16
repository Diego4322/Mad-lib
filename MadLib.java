import java.util.Scanner;

public class MadLib {
    public static void main(String[] args){
        System.out.println("WELCOME TO MAD LIBS");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a name(noun:names a person, place, thing, or idea. Robot, donkey, Jojo, freedom, Voorhees): ");
        String name = input.nextLine();
        System.out.print("Please enter a verb(an action or state of being. (Past tense): Ate, squished, danced, ran, thought): ");
        String verb1 = input.nextLine();
        System.out.print("Please enter a persons name (noun: names a person): ");
        String name2 = input.nextLine();
        System.out.print("Please enter an adjective(describes or modifies a noun. Bright, tired, enormous, happy): ");
        String adj = input.nextLine();
        System.out.print("Please enter an adjective(describes or modifies a noun. Bright, tired, enormous, happy): ");
        String adj2 = input.nextLine();
        System.out.print("Please enter a verb(an action or state of being. (Past tense) Recommended: shrinking, growing, thinking, not working): ");
        String verb2 = input.nextLine();
        System.out.print("Please enter a noun(names a person, place, thing, or idea. Recommended: table, chair, desk, seat, couch): ");
        String noun = input.nextLine();
        System.out.print("Please enter a noun(names a person, place, thing, or idea. Recommended: homework, papers, pencils, backpack): ");
        String noun2 = input.nextLine();
        System.out.print("Please enter a noun(names a person, place, thing, or idea. Recommended: decribes someone, something that can move): ");
        String noun3 = input.nextLine();
        System.out.print("Please enter an adjective(describes or modifies a noun. Recommended: done): ");
        String adj3 = input.nextLine();

        

        

        System.out.println("Once I, " + name + ", genuinely " + verb1 + ".");
        System.out.println("My fortnite duo, " + name2 + ", is " + adj + ".");
        System.out.println("We are " + adj2 + " and jolly!");
        System.out.println("Our brains are " + verb2 + "!"); 
        System.out.println("Put the homework on the " + noun + ".");
        System.out.println("My dog stole my " + noun2 + ", and then ran away from " + noun3 + ".");
        System.out.println("Even the GPT saying 'boi, you're so o din din " + adj3 + "'.");


    }

}