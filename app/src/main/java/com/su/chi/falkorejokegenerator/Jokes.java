package com.su.chi.falkorejokegenerator;

import android.gesture.Prediction;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Jokes {

    private static Jokes Jokes;
    private String[] puns;

    private Jokes() {
        puns = new String[] {
                "The state of Minnesota is known for its adequately small quantities of cold beverages.",
                "What do you call salmon covered in nutella? Salmonella.",
                "How do you make a party in space? You planet."};
    }

    public int nextInt(int Jokes) {
        if (Jokes <= 0)
            throw new IllegalArgumentException("n must be positive");

        if ((Jokes & -Jokes) == Jokes)  // i.e., n is a power of 2
            return (int)((Jokes * (long)nextInt(31)) >> 31);

        int bits, val;
        do {
            bits = nextInt(31);
            val = bits % Jokes;
        } while (bits - val + (Jokes-1) < 0);
        return val;
    }

    public static Jokes get() {
        if (Jokes == null) {
            Jokes = new Jokes();
        }
        return Jokes;
    }

    public String getJokes() {
        return puns[1];
    }

}

// Roses are red, violets are blue. I need to go to the bathroom.

// What do you salmon covered in nutella? Salmonella.

// A man and a giraffe walk into a bar. The horse lies on the floor.
// The bartender says, "What's that lying on the floor?" The man
// replies, "That's not a lion, that's a giraffe."

// How do you make a party in space? You planet.

//What's a super hero's favorite part of a comic? The punch line.

//Did you eat Lucky Charms for breakfast, because you look Magically Delicious.

// What's a food you can find below your thighs? Bologna.

// What's an animal you can find below your thighs? A calf.

//Why did the chicken cross the road? To get across?

// How much does a polar bear weight? Enough to break the ice.

// Wanna hear a joke? Too bad, I'm deaf.

// What did the goose say to the monkey? Nothing, since a goose can't speak.
// Also, geese and monkeys don't live in the same ecosystem.

// What did oxygen say to it's date with potassium? OK

// Helen Keller walked into a bar, then the chair, then the table.

// Why is there a gate around cemeteries? Because people are dying to get in.

// What do you call a Pokemon that goes invisible? Gengone.

// A man tried to make his friend laugh with 10 puns. No pun in ten did.

// What is the difference between a snowman and a snowwomen? Snowballs.

// What do you call when someone is afraid of Obama? Baracknaphobic.

// Two peanuts walk into a bar. One was assalted.

// AN infinite munber of scientists walked into a bar.
// The first scrientist says "I'll have one beer please."
// The second scientitst says "I'll have one-half of a beer please."
// The third scientist says "I'll have one-fourth of a beer please."
// The bartender says "Guys, you all need to know your limits."
// The bartender then gives the scientists two beers.

// What do you call a sleepwalking nun? A roamin' catholic.

// Miguel Banuelos is a joke.

