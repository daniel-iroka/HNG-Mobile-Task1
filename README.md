# HNG-MOBILE-TASK1

This is the first Task in the HNG ZURI INTERNSHIP for the Mobile Track. This was built entirely using Kotlin.

# Technical Requirements

These are the setup instructions to run this Project. Ensure you have the Android Studio IDE Installed. If you
don't, you can download it from here [Download Android Studio](https://developer.android.com/studio)

Ensure these Dependencies are also in the Project :
```
implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
implementation "androidx.navigation:navigation-fragment-ktx:2.7.2"
implementation "androidx.navigation:navigation-ui-ktx:2.7.2"
```

Follow this steps to run this Project :
- Git clone this project.
- Use Android Studio 3.3 or later.
- Use Compile SDK 34(required by the Navigation component version).

Other details include :
```
minSdk 24
targetSdk 32
Android Gradle Plugin Version : '7.4.0-beta01'
```

## Important Note

Layout Preview does not show up sometimes when opening Android Studio for the first time due to an internal
bug. In case this happens, an easy fix can be achieved by one of this two below :
- Force Refresh Layout in the Design Tab.
- Clean Project or Clean and Rebuild.
