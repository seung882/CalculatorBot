package com.github.andrew.calculator.bot;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import java.util.ArrayList;

public class Main {

    public static void main(String[] arg){
        System.out.println(1"+"1);
        String token = "ODA1MjYwNzA5MzYxNDgzNzc2.YBYTeg.kI4WvfJCtrqQg_Zqyuhzl_PmJko";
        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Character> equasion = new ArrayList<Character>();

        api.addMessageCreateListener(event -> {
            String x =  event.getMessageContent();
            if (event.getMessageContent().contains("=>")) {
                int y = x.length();
                int z = 3;
                if(x.substring(3,4)=="-"){
                    while(z<y){
                        equasion.add(x.charAt(z))

                    }
                }
                else{

                }
            }
        });

    }
}
