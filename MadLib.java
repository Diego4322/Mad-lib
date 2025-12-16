import java.util.Scanner;

public class MadLib {
    public static void main(String[] args){
        System.out.println("WELCOME TO MAD LIBS");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a name(noun:names a person, place, thing, or idea. Robot, donkey, Jojo, freedom, Voorhees): ");
        String name = input.nextLine().toLowerCase();
        System.out.print("Please enter a verb(an action or state of being. (Past tense): Ate, squished, danced, ran, thought): ");
        String verb1 = input.nextLine().toLowerCase();;
        System.out.print("Please enter a persons name (noun: names a person): ");
        String name2 = input.nextLine().toLowerCase();;
        System.out.print("Please enter an adjective(describes or modifies a noun. Bright, tired, enormous, happy): ");
        String adj = input.nextLine().toLowerCase();;
        System.out.print("Please enter an adjective(describes or modifies a noun. Bright, tired, enormous, happy): ");
        String adj2 = input.nextLine().toLowerCase();;
        System.out.print("Please enter a verb(an action or state of being. (Past tense) Recommended: shrinking, growing, thinking, not working): ");
        String verb2 = input.nextLine().toLowerCase();;
        System.out.print("Please enter a noun(names a person, place, thing, or idea. Recommended: table, chair, desk, seat, couch): ");
        String noun = input.nextLine().toLowerCase();
        System.out.print("Please enter a noun(names a person, place, thing, or idea. Recommended: homework, papers, pencils, backpack): ");
        String noun2 = input.nextLine().toLowerCase();
        System.out.print("Please enter a noun(names a person, place, thing, or idea. Recommended: decribes someone, something that can move): ");
        String noun3 = input.nextLine().toLowerCase();
        System.out.print("Please enter an adjective(describes or modifies a noun. Recommended: done): ");
        String adj3 = input.nextLine().toLowerCase();

        

        

        System.out.println("\n\tOnce I, " + capitalize(name) + ", genuinely " + verb1 + "." + " \n\tMy fortnite duo, " + capitalize(name2) + ", was " + adj + ".\n\tWe were " + adj2 + " and jolly! \n\tOur brains were " + verb2 + "!\n\tPut the homework on the " + noun + ".\n\tMy dog stole my " + noun2 + ", and then ran away from " + noun3 + ".\n\tEven the GPT saying 'boi, you're so o din din " + adj3 + "'.");


    }
    public static String capitalize(String word){
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }
}