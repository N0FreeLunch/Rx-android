# Rx-android

## Windows environment
https://docs.microsoft.com/en-us/virtualization/hyper-v-on-windows/quick-start/enable-hyper-v
1. Right click on the Windows button and select 'Apps and Features'.
2. Select Programs and Features on the right under related settings.
3. Select Turn Windows Features on or off.
4. Select Hyper-V and click OK.


## Bios setting in asus motherboard
1. Turn ON the System.
2. Press F2 key at startup BIOS Setup.
3. Press the right arrow key to Advanced tab, Select Virtualization Technology and then press the Enter key.
4. Select Enabled and press the Enter key.
5. Press the F10 key and select Yes and press the Enter key to save changes and Reboot into Windows.

## check AVD setting
- check : Help -> SDK manager -> SDK Tools -> □ Intel x86 Emulator Accelerator (HAXM installer)

## Install RxJava
- V3. reference : https://github.com/ReactiveX/RxAndroid
- V2. reference : https://github.com/ReactiveX/RxAndroid/tree/2.x
- In build.gradle (Module : My_Application.app)
- Add this dependency
```
dependencies {
    implementation 'io.reactivex.rxjava3:rxandroid:3.0.0'
    // Because RxAndroid releases are few and far between, it is recommended you also
    // explicitly depend on RxJava's latest version for bug fixes and new features.
    // (see https://github.com/ReactiveX/RxJava/releases for latest 3.x.x version)
    implementation 'io.reactivex.rxjava3:rxjava:3.0.0'
}
```
```
dependencies {
  implementation 'io.reactivex.rxjava2:rxandroid:2.1.1'
  // Because RxAndroid releases are few and far between, it is recommended you also
  // explicitly depend on RxJava's latest version for bug fixes and new features.
  // (see https://github.com/ReactiveX/RxJava/releases for latest 2.x.x version)
  implementation 'io.reactivex.rxjava2:rxjava:2.x.x'
}
```

### build dependencies
```
android studio -> file -> Sync Project with Gradle Files
```


## remove JCenter
- In build.gradle (project : My_Application)
- comment JCenter
```
allprojects {
    repositories {
        google()
        mavenCentral()
//        jcenter() // Warning: this repository is going to shut down soon
    }
}
```

## Reference
\[Book\] RxJava 프로그래밍
[RxJava version2 document](http://reactivex.io/RxJava/2.x/javadoc/)
