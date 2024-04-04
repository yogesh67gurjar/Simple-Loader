# Simple Loader Library

Simple Loader is a lightweight library for Android that provides easy-to-use methods for showing and hiding loader animations in your app.

## Installation

### Gradle

Step 1. Add the JitPack repository to your build file.

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

```
Step 2. Add the dependency

```gradle
	dependencies {
	        implementation 'com.github.yogesh67gurjar:Simple-Loader:Latest-Version'
	}
```
   Replace `Latest-Version` with the specific tag or release version of the project you want to use.
   
## Usage Example

**Display Loader**: Use the `showLoader` method to display a loader animation in your app. Provide the parent layout (`ViewGroup`), context, and optional parameters such as the Lottie JSON animation file and size in density-independent pixels (dp).

    // Example: Show loader with default animation and size
    showLoader(parentLayout, context)

    // Example: Show loader with custom animation and size
    showLoader(parentLayout, context, R.raw.custom_loader, 150)


**Hide Loader**: When the loading process is complete, use the `hideLoader` method to hide the loader animation. Provide the parent layout (`ViewGroup`) where the loader was displayed.

    // Example: Hide loader
    hideLoader(parentLayout)

By following these steps, you can easily integrate the Simple Loader library into your Android project to display and hide loader animations as needed.

