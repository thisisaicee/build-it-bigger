package net.aicee.javaJokelib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joke {
    private List<String> jokes;

    public Joke() {
        this.jokes = new ArrayList<>();
        this.jokes.add("Java and C were telling jokes. It was C's turn, so he writes something on the wall, points to it and says \"Do you get the reference?\" But Java didn't");
        this.jokes.add("Q: How many programmers does it take to screw in a light bulb?\nA: None. It's a hardware problem");
        this.jokes.add("Definition, Programmer: An organism that turns caffeine and pizza into software");
        this.jokes.add("Software developers like to solve problems. If there are no problems available, they will create their own problems. It’s an addiction");
        this.jokes.add("We should thank the inventor of hardware - the part of the computer programmers can kick");
        this.jokes.add("Programmer (noun.)\nA machine that turns coffee into code");
        this.jokes.add("Definition, Algorithm: Word used by programmers when they do not want to explain what they did");
        this.jokes.add("I'd like to make the world a better place, but they won't give me the source code...");

    }

    public String tellMeAJoke() {
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size() - 1));
    }

}
