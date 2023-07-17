package com.ironhack.w2.d1;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main( String[] args )
    {
        Book theRaven = new Book("The Raven", 50);
        Book theBlackCat = new Book("The Black Cat", 60);
        List<Book> bookList = new ArrayList<>();
        bookList.add(theRaven);
        bookList.add(theBlackCat);
        Author author = new Author("Edgar", "Allan Poe", bookList);

        System.out.println(author);


//        GSON

        Gson gson = new Gson();
        String authorJSON = gson.toJson(author);
        System.out.println(authorJSON);


    }
}
