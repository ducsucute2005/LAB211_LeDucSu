/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.HashMap;

/**
 *
 * @author selu3
 */
public class CharLetterCount {

    private String sentence;

    public CharLetterCount() {
    }
    
    

    public CharLetterCount(String sentence) {
        this.sentence = sentence;
    }
    
    HashMap<String, Integer> wordCount = new HashMap<>();
    HashMap<Character, Integer> letterCount = new HashMap<>();

    public void wordCount(String sentence) {
        String words[] = sentence.split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }

    public void letterCount(String sentence) {
        for (char ch : sentence.replaceAll("\\s", "").toCharArray()) {
            letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
        }
    }

    public void display() {
        System.out.println("Word :");
        for (String word : wordCount.keySet()) {
            System.out.println(word + " = " + wordCount.get(word));
        }

        System.out.println("\nCharacter :");
        for (char ch : letterCount.keySet()) {
            System.out.println(ch + " = " + letterCount.get(ch));
        }
    }

}
