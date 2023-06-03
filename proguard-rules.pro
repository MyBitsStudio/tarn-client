-injars build/libs/Tarn-1.0.jar
-outjars build/libs/Tarn-Obf.jar
-libraryjars <java.home>/lib/rt.jar

#noinspection ShrinkerUnresolvedReference

-keepclasseswithmembernames,includedescriptorclasses class * {
    native <methods>;
}

-keepclasseswithmembers public class * {
    public static void main(java.lang.String[]);
}

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

-keepclassmembers,allowoptimization enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keepattributes *Annotation*

-dontwarn org.apache.**
-dontwarn org.slf4j.**
-dontwarn javax.xml.**
-dontwarn lombok.**
-dontwarn com.google.**
-dontwarn ch.qos.**
-dontwarn java.lang.invoke.MethodHandle
-dontwarn proguard.**

-optimizationpasses 5
-repackageclasses ''
