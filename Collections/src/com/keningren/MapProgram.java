package com.keningren;

import javax.security.auth.callback.LanguageCallback;
import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A high-level lanuage");
        languages.put("Python", "A Script lanuage");
        languages.put("Algol", "An algorithmic lanuage");
        languages.put("BASIC", "An simple lanuage");
        languages.put("Lisp", "An weird lanuage");

        System.out.println(languages.get("Java"));
        languages.put("Java", "Update its description");
        System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        }

        languages.remove("Lisp");

        for(String key: languages.keySet()) {
            System.out.println(key + ":" + languages.get(key));
        }
        System.out.println("@@@@@@@@@@@@@");

        if (languages.remove("Algol", "A family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed. Key/Value pair not found");
        }

        languages.replace("Algol", "A family of algorithmic languages");
        for(String key: languages.keySet()) {
            System.out.println(key + ":" + languages.get(key));
        }
        System.out.println("@@@@@@@@@@@@@");

    }
}
