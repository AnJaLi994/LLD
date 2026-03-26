package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Cache cache = new Cache(5);
        cache.add("1", "1");
        cache.add("2", "2");
        cache.add("3", "3");
        cache.add("4", "4");
        cache.add("5", "5");
        cache.add("6", "6");
        cache.add("7", "7");
        cache.get("4");
        cache.get("1");
        cache.add("9", "9");
    }
}