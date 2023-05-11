package org.necrotic.client.tools;

public class Censor {

    public static final String[] BLOCKED_WORDS = new String[]{".com", ".net", ".org", "<img", "@cr", "<img=",
            ":tradereq:", ":duelreq:", "<col=", "<shad=", "rootkit", "sql", "player.get", "inject", "injected",
            "script", "break;", "while(true)", "while (true)", "for(", "for (", "character", "getRuntime",
            "getclass", "getclasses", "forname"
    };

    public static String clean(String clean){
        String[] words = clean.split(" ");
        for(int i = 0; i < words.length; i++){
            for(String word : BLOCKED_WORDS){
                if (words[i].contains(word)) {
                    words[i] = "ae!ae";
                    break;
                }
            }
        }
        return String.join(" ", words);
    }
}
