package com.company;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public int getRandomNumber() {
        return random.nextInt(max - min) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator(this);
    }
}
