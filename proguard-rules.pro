-injars build/libs/Tarn-1.0.jar
-outjars build/libs/Tarn-Obf.jar
-libraryjars runtime/rt.jar
-printmapping proguard.map

#noinspection ShrinkerUnresolvedReference

-optimizationpasses 2
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontskipnonpubliclibraryclassmembers
-verbose

-keepattributes *Annotation*
-renamesourcefileattribute SourceFile
-keepattributes SourceFile,LineNumberTable
-keepattributes InnerClasses,EnclosingMethod
-keepattributes Signature

-dontshrink
-dontoptimize

-keep class net.runelite.** { *; }

-keepclassmembers,includedescriptorclasses class net.runelite.** { *; }

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keepclasseswithmembers,includedescriptorclasses public class * {
    public static void main(java.lang.String[]);
}

-keepclasseswithmembernames,includedescriptorclasses class * {
    native <methods>;
}

#-keepclassmembers,includedescriptorclasses class **.R$* {
#  public static <fields>;
#}

-keepclassmembers class * extends java.lang.Enum {
    <fields>;
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class org.necrotic.client.accounts.** { *; }
-keep class org.necrotic.client.ui.skin.** { *; }
-keep class com.sun.** { *; }
-keep class org.pushingpixels.** { *; }
-keep class com.google.** { *; }
-keep class javax.swing.** { *; }
-keep class java.awt.** { *; }

-dontwarn java.lang.invoke.MethodHandle
-dontwarn org.apache.**
-dontwarn ch.qos.**
-dontwarn lombok.**
-dontwarn javax.crypto.**
-dontwarn org.yaml.snakeyaml.**
