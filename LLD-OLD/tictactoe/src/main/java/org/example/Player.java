package org.example;

public class Player {
    String name;
    Token token;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Player(String name, Token token){
        this.name = name;
        this.token = token;
    }

}
