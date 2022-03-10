# Test-Mobile-Dafiti
This project is a technical challenge with Appium Screenplay to Dafiti Apk

**MOBILE AUTOMATION TESTS:**

1. Enter the mobile application "Dafiti"
2. Register in the app, accessing My account / Register / Create account
3. Add a certain product to the cart and validate that said product is really
seen in the cart.

**The following APP will be used:**

• APP: [Dafiti](https://play.google.com/store/apps/details?id=br.com.dafiti&hl=en&gl=US)

Carry out the scenarios and validations that you consider pertinent.


**Table of Contents**  
- [Introduction](#introduction)
- [Testing Appium](#testing_Appium)
- [Prerequisites](#prerequisites)
- [Run the tests locally](#run-the-tests-locally)


# Introduction

Appium is an open-source, cross-platform test automation tool for native,
hybrid, and mobile web and desktop apps. We support simulators (iOS), emulators
(Android), and real devices (iOS, Android, Windows, Mac).

Want to skip straight to the action? Check out our [getting
started](/docs/en/about-appium/getting-started.md) doc.


# Testing Appium

Appium supports app automation across a variety of platforms, like iOS,
Android, and Windows. Each platform is supported by one or more "drivers",
which know how to automate that particular platform.

Please refer to [Appium Platform Support](/docs/en/about-appium/platform-support.md) for more details.


### Prerequisites

On top of standard Appium requirements UiAutomator2 driver also expects the following prerequisites:

- Windows, Linux and macOS are supported as hosts
- [Android SDK Platform tools](https://developer.android.com/studio/releases/platform-tools) must be installed. [Android Studio IDE](https://developer.android.com/studio) also provides a convenient UI to install and manage the tools.
- ANDROID_HOME or ANDROID_SDK_ROOT [environment variable](https://developer.android.com/studio/command-line/variables) must be set
- Java JDK must be installed and [JAVA_HOME](https://www.baeldung.com/java-home-on-windows-7-8-10-mac-os-x-linux) environment variable must be set. Android SDK below API 30 requires Java 8. Android SDK 30 and above requires Java 9 or newer.
- [Emulator](https://developer.android.com/studio/run/managing-avds) platform image must be installed if you plan to run your tests on it. [Android Studio IDE](https://developer.android.com/studio) also provides a convenient UI to install and manage emulators.
- Real Android devices must have [USB debugging enabled](https://developer.android.com/studio/debug/dev-options) and should be visible as `online` in `adb devices -l` output.
- The minimum version of Android API must be 5.0 (API level 21) (6.0 is recommended as version 5 has some known compatibility issues).

Since version 2.0.0 this driver is only compatible to Appium 2. 
  
## Run the tests locally

To try to run the demo in the local system, enter the root folder and execute the following commands to install the dependencies and start up the test runners one by one.

```
.\gradlew.bat clean test aggregate

clean test aggregate is the command that will run the tests and generate the report in the /target/site/serenity/ folder
