package com.udacity.gradle.builditbigger.backend;

import net.aicee.javaJokelib.Joke;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeBean {
    private Joke joke;
    public JokeBean() {
        joke = new Joke();
    }
    public String getJoke() {
        return joke.tellMeAJoke();
    }
}