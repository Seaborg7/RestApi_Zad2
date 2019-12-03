package com.example.stringapi;

public class Counter {

    private final String content;

    Counter(String content) {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }

    public int getUpper()
    {
        int count = 0;
        for (char character : content.toCharArray()) {
            if (Character.isUpperCase(character)) {
                count++;
            }
        }
        return count;
    }

    public int getLower()
    {
        int count = 0;
        for (char character : content.toCharArray())
        {
            if (Character.isLowerCase(character))
            {
                count++;
            }
        }
        return count;
    }

    public int getNumbers()
    {
        int count = 0;
        for (Character character : content.toCharArray())
        {
            try
            {
                Integer.parseInt(character.toString());
                count++;
            } catch (NumberFormatException ignored)
            {
            }
        }
        return count;
    }

    public int getSpecial()
    {
        return content.length() - (getNumbers() + getLower() + getUpper());
    }
}