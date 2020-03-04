package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Phase one
        String name;
        String classs;
        String responce;
        String direction;
        String verb;
        String petOrSlash;
        String scary;
        String bodypart;
        String adjectives;
        String verbTwo;
        String phrase;
        String bodypartTwo;
        String otherName;
        String niceAdjective;
        String adverb;
        String verbEndingInIng;
        String grossAdjective;
        String directionTwo;
        String adverbTwo;
        String weapon;
        String responceTwo;


        //phase two
        //this is my test run of the type feature :)
        String userName;
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Hail, adventurer! What's your name?");
        userName = keyboard.nextLine();
        System.out.println ( userName + "? Ah! A fine name for a fine young person! What's your class?");
        classs = keyboard.nextLine();
        System.out.println ("How exciting! My name is Tilla, and Ill be your dungeon master for today! Are you ready to go?");
        responce = keyboard.nextLine();
        System.out.println ("I’ll take your " + responce + " as a definitely absolutely lets go! So, let's get to it!");
        System.out.println ("Firstly, do you go left or right?");
        direction = keyboard.nextLine();
        System.out.println ("Alright, what sounds fun, to jump, roll, maybe slide? Gimme a verb!");
        verb = keyboard.nextLine();
        System.out.println ("Do you carefully pet, or do you take a slash?");
        petOrSlash = keyboard.nextLine();
        System.out.println ("Whats a sound that really scares you? Screaming? Babies crying? Nickelback?");
        scary = keyboard.nextLine();
        System.out.println ("Whats a part of your body wouldn't you mind loosing? Just kidding. Maybe.");
        bodypart = keyboard.nextLine();
        System.out.println ("what about adverbs, got any good ones?");
        adjectives = keyboard.nextLine();
        System.out.println ("Hows about another verb, " + userName + "?");
        verbTwo = keyboard.nextLine();
        System.out.println ("Oo, i know! Gimme a phrase you shout when you're mad!");
        phrase = keyboard.nextLine();
        System.out.println ("Gimme another body part! What? its nothing suspicious, i swear!");
        bodypartTwo = keyboard.nextLine();
        System.out.println ("How about someone elses name?");
        otherName = keyboard.nextLine();
        System.out.println ("Can you give me a nice adjective? Something to make you feel good.");
        niceAdjective = keyboard.nextLine();
        System.out.println ("Ok. how about an adverb?");
        adverb = keyboard.nextLine();
        System.out.println ("Hows about a verb ending in ‘ing”?");
        verbEndingInIng = keyboard.nextLine();
        System.out.println ("Ok, now a gross adjective, something crusty.");
        grossAdjective = keyboard.nextLine();
        System.out.println ("Good one! Now choose a direction!");
        directionTwo = keyboard.nextLine();
        System.out.println ("Sweet! Almost done, " + userName + "! Now, i need another adverb.");
        adverbTwo = keyboard.nextLine();
        System.out.println("Alright, now how about your weapon, adventurer! You didn't leave without one, right?");
        weapon = keyboard.nextLine();
        System.out.println ("Alright! Calculating your adventure now… are you excited?");
        responceTwo = keyboard.nextLine();
        // phase three
        System.out.println ("Your adventure went as follows:");
        System.out.println("You chose to go " + direction + ". As you did, you nearly fell off a cliff!");
        System.out.println("You chose to " + verb + " down it, splashing into the water below. You swam to shore, and found a Griffin taking a drink!");
        System.out.println("You chose to " + petOrSlash +" but before you could, the Griffin made a noise resembling " + scary +  " at you, and you hesitated. The griffin huffed, and stared at you, before going back to taking a drink.");
        System.out.println ("You reached your " + bodypart + " out to the griffin, and it jumped up again.");
        System.out.println ("You decided to jump " + adjectives + " onto the griffins back before it could run, and it started to " +verbTwo + "!");
        System.out.println ("It ran, starting to take air, and you shouted '" + phrase + "!', still holding onto the Griffins feathers.");
        System.out.println ("As the Griffin started to get high enough, it turned itself upside down, you felt the blood rushing to your " + bodypartTwo + " as it barrel rolled around the canyon.");
        System.out.println ("You felt your feet dangling in the air, looking down, you could swear you could see " +otherName +"’s house from here! ");
        System.out.println ("You would have been in awe of the " + niceAdjective +" sights in birds eye view, had your grip not been slipping!");
        System.out.println ("You looked down to see the water getting deeper, it was let go or loose the chance, so you " + adverb + " let go of the griffin and fell back into the water. ");
        System.out.println ("You swam back up to the surface, " +verbEndingInIng + " down air.");
        System.out.println ("Just as you were catching your breath, something " + grossAdjective + " brushed past your foot. ");
        System.out.println ("You swam as fast as you could to the edge of the lake, stopping when you could stand on the bottom. ");
        System.out.println ("You saw the water ripple to your " + directionTwo + ", and you " + adverbTwo + " drew your " + weapon + ", recalling your " + classs + " training.");
        System.out.println ("You saw the water rippled again, coming straight at you!");
        System.out.println ("You readied your stance, preparing your " + weapon + " when... The jaws of the beast snapped closed. ");
        System.out.println ("Turns out, you were standing right by its teeth, preparing to attack its tongue.");
        System.out.println ("You died, better luck next time, " + userName +"!");








    }
}
