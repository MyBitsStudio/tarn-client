-injars build/libs/Tarn-1.0.jar
-outjars build/libs/Tarn-Obf.jar
-libraryjars <java.home>/lib/rt.jar

#noinspection ShrinkerUnresolvedReference

-keep class net.runelite.** { *; }
-dontshrink
-dontoptimize
-dontobfuscate

-keepclasseswithmembernames,allowobfuscation,allowoptimization,allowshrinking class org.necrotic.** {
    native <methods>;
}

-keep,allowobfuscation,allowoptimization,allowshrinking public class org.necrotic.client.Client

-keepclassmembers,allowobfuscation,allowoptimization,allowshrinking  class org.necrotic.** implements java.io.Serializable {
    static final long serialVersionUID;
    static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keepclassmembers,allowobfuscation,allowoptimization,allowshrinking enum org.necrotic.** {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keepdirectories

-dontwarn lombok.**
-dontwarn com.google.**
-dontwarn proguard.gradle.**
-dontwarn org.pushingpixels.**
-dontwarn java.lang.invoke.MethodHandle
-dontwarn com.sun.**
-dontwarn org.apache.**
-dontwarn ch.qos.**

-keepattributes *Annotation*
