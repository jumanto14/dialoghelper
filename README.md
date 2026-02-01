# DialogHelper

[![](https://jitpack.io/v/jumanto14/dialoghelper.svg)](https://jitpack.io/#jumanto14/dialoghelper)

Simple, lightweight, and **Compose-safe** dialog helper for Android.  
Designed to work seamlessly with **Jetpack Compose Material3**, **XML Views**, and **custom themes**.

---

## ✨ Features

- Alert & Confirm dialogs
- Multiple dialog styles (Info, Success, Warning, Error)
- Safe for **Compose Material3**
- No AppCompat requirement for application theme
- Zero setup configuration
- Lightweight & beginner-friendly

---

## 📦 Installation

Add the dependency to your module `build.gradle`:

```gradle
dependencies {
    implementation("com.github.jumanto14:dialoghelper:v1.0.2")
}
```

### Required dependencies

DialogHelper uses **Material Components**:

```gradle
implementation("com.google.android.material:material:1.12.0")
implementation("androidx.appcompat:appcompat:1.7.1")
```

---

## 🚀 Usage

### Alert Dialog

```kotlin
DialogHelper.showAlert(
    context = context,
    message = "Data berhasil disimpan",
    style = DialogStyle.SUCCESS
)
```

### Confirm Dialog

```kotlin
DialogHelper.showConfirm(
    context = context,
    message = "Yakin ingin menghapus?",
    onConfirm = {
        // confirmed
    }
)
```

---

## 🎨 Dialog Styles

* `DialogStyle.INFO`
* `DialogStyle.SUCCESS`
* `DialogStyle.WARNING`
* `DialogStyle.ERROR`

---

## 🧩 Compose Support

Fully compatible with **Jetpack Compose Material3**:

```kotlin
val context = LocalContext.current

Button(onClick = {
    DialogHelper.showAlert(
        context,
        "Hello from Compose!"
    )
}) {
    Text("Show Dialog")
}
```

---

## ⏳ Loading Dialog

```kotlin
val loadingDialog = LoadingDialog(this)

loadingDialog.show()

// do something...

loadingDialog.dismiss()
```

---

## 🧪 Compatibility

- Jetpack Compose
- XML-based Android Views
- AppCompatActivity
- ComponentActivity
- Material3 & Material Components themes

---

## 🛡️ Theme Safety

DialogHelper automatically wraps context with a safe Material AppCompat theme, so:

* No crash on non-AppCompat activities
* No forced theme changes
* Safe for libraries & SDK usage


## 🆕 Changelog

### v1.0.2

* Fix crash on Compose Material3
* Safe for non-AppCompat themes
* Internal theme wrapping

---

### v1.0.1
- Fixed crash on Compose / Material3 / non-AppCompat themes
- Replaced AppCompat AlertDialog with MaterialAlertDialogBuilder
- Compatible with both Compose and XML projects

### v1.0.0
- Initial release

---

## 📄 License

MIT License — free to use in personal and commercial projects.

---

## 👨‍💻 Author

**Jumanto**  
Android Developer — Indonesia 🇮🇩  
GitHub: https://github.com/jumanto14
