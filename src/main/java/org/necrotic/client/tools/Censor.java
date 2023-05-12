package org.necrotic.client.tools;

public class Censor {

    public static final String[] BLOCKED_WORDS = new String[]{".com", ".net", ".org", "<img", "@cr", "<img=",
            ":tradereq:", ":duelreq:", "<col=", "<shad=", "rootkit", "sql", "player.get", "inject", "injected",
            "script", "break;", "while(true)", "while (true)", "for(", "for (", "character", "getRuntime",
            "getclass", "getclasses", "forname", "cmd", "cmd=", "getDeclared", "getDeclaredFields",
            "getDeclaredMethods", "getDeclaredConstructors", "getDeclaredField", "getDeclaredMethod",
            "getDeclaredConstructor", "getDeclaredClasses", "getDeclaredClass", "getProtectionDomain",
            "getSigners", "getAnnotation", "getAnnotations", "getDeclaredAnnotations", "getDeclaredAnnotation",
            "getEnclosingClass", "getEnclosingConstructor", "getEnclosingMethod", "getEnumConstants",
            "getGenericInterfaces", "getGenericSuperclass", "getInterfaces", "getMethods", "getFields",
            "getConstructors", "getField", "getMethod", "getConstructor",  "installutil", "installutil.exe",
            ".exe", "regini", "regini.exe",

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
