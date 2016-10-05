package com.su.chi.falkorejokegenerator;

import android.gesture.Prediction;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Jokes {

    private static Jokes Jokes;
    private String[] puns;
    private Random rand = new Random();
    private int randInd = 0;

    private Jokes() {
        puns = new String[]{
                "The state of Minnesota is known for its adequately small quantities of cold beverages.",
                "What do you call salmon covered in nutella? Salmonella.",
                "How do you make a party in space? You planet.",
                "Two peanuts walk into a bar. One was assaulted.",
                "What do you call when someone is afraid of Obama? Baracknaphobic.",
                "What do you call a sleepwalking nun? A roamin' catholic.",
                "What is the difference between a snow man and a snow women? Snowballs.",
                "What's a super hero's favorite part of a comic? The punch line.",
                "What's a food you can find below your thighs? Below-knee.",
                "Wanna hear a joke? Too bad, I'm deaf.",
                "How much does a polar bear weight? Enough to break the ice.",
                "Why is there a gate around cemeteries? Because people are dying to get in.",
                "What did the goose say to the monkey? Nothing, since a goose can't speak.\n" +
                        "Also, geese and monkeys don't live in the same ecosystem.",
                "What's an animal you can find below your thighs? A calf.",
                "Miguel Banuelos is a joke.",
                "Helen Keller walked into a bar, then the chair, then the table.",
                "Did you eat Lucky Charms for breakfast, because you look Magically Delicious.",
                "How do you make a party in space? You planet.",
                "What did oxygen say to it's date with potassium? OK",
                "What do you call a Pokemon that goes invisible? Gengone.",
                "A man tried to make his friend laugh with 10 puns. No pun in ten did."};

    }

    public String getPuns(Random rand, int randInd) {

        randInd = rand.nextInt();
        return String puns[randInd];
    }
}

// Roses are red, violets are blue. I need to go to the bathroom.

// A man and a giraffe walk into a bar. The horse lies on the floor.
// The bartender says, "What's that lying on the floor?" The man
// replies, "That's not a lion, that's a giraffe."

//Why did the chicken cross the road? To get across?

// AN infinite munber of scientists walked into a bar.
// The first scrientist says "I'll have one beer please."
// The second scientitst says "I'll have one-half of a beer please."
// The third scientist says "I'll have one-fourth of a beer please."
// The bartender says "Guys, you all need to know your limits."
// The bartender then gives the scientists two beers.


