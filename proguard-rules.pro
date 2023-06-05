-injars build/libs/Tarn_Client_unobfuscated-1.0.jar
-outjars build/libs/Tarn-Obf.jar
-libraryjars <java.home>/lib/rt.jar
-printmapping proguard.map

#noinspection ShrinkerUnresolvedReference

-keepclasseswithmembernames class * {
    native <methods>;
}


-keep public class * {
    public static void main(java.lang.String[]);
}

-keep public class * {
    public protected *;
}

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keepclassmembers,allowoptimization enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class net.runelite.client.plugins.** { *; }
-keep class com.apple.eio.FileManager { *; }
-keep class sun.** { *; }
-keep class org.apache.** { *; }
-keep class com.google.** { *; }
-keep class ch.qos.** { *; }

-dontwarn java.lang.invoke.MethodHandle
-dontwarn org.apache.**
-dontwarn com.fasterxml.**
-dontwarn ch.qos.**
-dontwarn javax.**
-dontwarn lombok.**

-overloadaggressively
-repackageclasses ''
-allowaccessmodification

-keepattributes InnerClasses,EnclosingMethod
-keepattributes Signature
-keepattributes SourceFile,LineNumberTable
-keepattributes *Annotation*

-verbose
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontskipnonpubliclibraryclassmembers
