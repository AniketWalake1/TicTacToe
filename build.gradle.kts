buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
        // Other dependencies...
        configurations.all {
            exclude(group = "com.sun.activation", module = "javax.activation")
        }
    }
}