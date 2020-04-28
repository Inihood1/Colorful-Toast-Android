# Colorful-Toast-Android
### Create a simple toast with different styles.
## screenshots

<p float="center">
  <img src="https://user-images.githubusercontent.com/15949588/80463491-3ba00600-8930-11ea-9181-014edb146039.png" width="200"/>
  <img src="https://user-images.githubusercontent.com/15949588/80463498-3e026000-8930-11ea-8ea1-5f42064b0339.png" width="200" /> 
  <img src="https://user-images.githubusercontent.com/15949588/80463504-3f338d00-8930-11ea-8ca5-5652a171ed0f.png" width="200" /> 
  <img src="https://user-images.githubusercontent.com/15949588/80463507-3fcc2380-8930-11ea-9a35-53b440daef66.png" width="200" />
</p>

# Usage
```java
 new ColorfulToast.Builder(this)
                .setText(sms)
                .setStroke(2, Color.BLUE)
                .setBackgroundColor(Color.GRAY)
                .setToastPosition(Gravity.BOTTOM)
                .setTextColor(Color.BLACK)
                .setTextBold()
                .font(R.font.dosis)
                .iconStart(getIcon())
                .iconEnd(getIcon())
                .setCornerRadius(5)
                .setTextSize(18)
                .show();
```
# Installation
Add in your `build.gradle` project level file
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	    }
	}
```

Add in your `build.gradle` app level file
```gradle
dependencies {
  implementation 'com.github.Inihood1:Colorful-Toast-Android:1.0.1'
}
```
