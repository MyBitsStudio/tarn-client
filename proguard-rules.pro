-injars build/libs/Tarn-1.0.jar
-outjars build/libs/Tarn-Obf.jar
-libraryjars <java.home>/lib/rt.jar

#noinspection ShrinkerUnresolvedReference

-keep class net.runelite.client.** {*;}

-printseeds

-keepclasseswithmembernames,includedescriptorclasses class org.necrotic.client.** {
    native <methods>;
}

-keep public class org.necrotic.client.Client

-keepclassmembers class org.necrotic.client.** implements java.io.Serializable {
    static final long serialVersionUID;
    static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keepclassmembers enum org.necrotic.client.** {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class com.google.** { *; }
-keep class org.pushingpixels.** { *; }
-keep class com.sun.** { *; }
-keep class ch.qos.** { *; }
-keep class org.slf4j.** { *; }
-keep class club.** { *; }
-keep class net.runelite.** { *; }
-keep class org.projectlombok.** { *; }


-dontwarn java.lang.invoke.MethodHandle
-dontwarn lombok.**
-dontwarn ch.qos.**
-dontwarn com.google.common.hash.**
