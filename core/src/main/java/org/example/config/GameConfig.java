package org.example.config;


import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@Import(Main.class)
@ComponentScan(basePackages = "org.example")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    @Value("${game.maxNumber}")
    private int maxNumber;

    @Value("${game.guessCount}")
    private int guessCount;

    @Value("${game.minNumber}")
    private int minNumber;

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }

    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }

}
