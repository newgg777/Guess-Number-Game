package org.example;

import org.example.config.MaxNumber;
import org.example.config.MinNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {

    private static final Logger log = LoggerFactory.getLogger(NumberGeneratorImpl.class);

    private final Random random = new Random();


    private final int maxNumber;

    private final int minNumber;

    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber,@MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    @Override
    public int getMinNumber() {
        return minNumber;
    }

    @Override
    public int next() {
        return random.nextInt((maxNumber - minNumber) +minNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }


}
