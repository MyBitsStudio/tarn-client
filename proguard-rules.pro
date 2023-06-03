-injars build/libs/Tarn_Client_unobfuscated-1.0.jar
-outjars build/libs/Tarn-Obf.jar
-libraryjars <java.home>/lib/rt.jar

#noinspection ShrinkerUnresolvedReference

-keep class net.runelite.client.** {*;}

-printseeds

-keepclasseswithmembernames class * {
    native <methods>;
}

-keep public class org.necrotic.client.Client {
    public static void main(java.lang.String[]);
}

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keepclassmembers enum org.necrotic.client.** {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep public class com.apple.eio.FileManager

-dontwarn com.google.common.**
-dontwarn java.lang.invoke.MethodHandle
-dontwarn org.apache.**
-dontwarn ch.qos.**
-dontwarn lombok.**