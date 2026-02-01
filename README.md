# DialogHelper

[![](https://jitpack.io/v/jumanto14/dialoghelper.svg)](https://jitpack.io/#jumanto14/dialoghelper)

Simple, lightweight, and modern Android dialog helper library written in Kotlin.  
Designed to work seamlessly with **Jetpack Compose**, **Material3**, and **XML-based Android projects**.

---

## ✨ Features

- ✅ Ready for Jetpack Compose & XML projects
- 🎨 Material Design dialog (Material Components)
- 🧩 Predefined dialog styles (Info, Success, Warning, Error)
- ⚙️ Global dialog configuration
- 🪶 Lightweight & easy to use
- 🚫 No AppCompat theme crash

---

## 📦 Installation

Add the dependency to your module `build.gradle`:

```gradle
dependencies {
    implementation("com.github.jumanto14:dialoghelper:v1.0.1")
}
```

### Required dependencies

DialogHelper uses **Material Components**:

```gradle
implementation("com.google.android.material:material:1.11.0")
implementation("androidx.appcompat:appcompat:1.7.1")
```

---

## 🎨 Theme Requirement

Your application **must use a Material-based theme**, such as:

- `Theme.Material3.DayNight`
- `Theme.Material3.Light`
- `Theme.MaterialComponents.DayNight`
- `Theme.MaterialComponents.Light`

❗ DialogHelper will **NOT work** with:
- `Theme.Holo`
- `Theme.DeviceDefault`
- Non-Material themes

---

## 🚀 Usage

### Show Alert Dialog

```kotlin
DialogHelper.showAlert(
    context = this,
    message = "Data berhasil disimpan",
    style = DialogStyle.SUCCESS
)
```

### Show Confirm Dialog

```kotlin
DialogHelper.showConfirm(
    context = this,
    message = "Hapus data ini?",
    style = DialogStyle.WARNING,
    onConfirm = {
        // do delete
    },
    onCancel = {
        // cancelled
    }
)
```

---

## 🧩 Dialog Styles

Available styles:

```kotlin
DialogStyle.INFO
DialogStyle.SUCCESS
DialogStyle.WARNING
DialogStyle.ERROR
```

---

## ⚙️ Global Configuration

You can customize dialog behavior globally:

```kotlin
DialogConfig.cancelable = false

DialogConfig.infoTitle = "Info"
DialogConfig.successTitle = "Berhasil"
DialogConfig.warningTitle = "Peringatan"
DialogConfig.errorTitle = "Kesalahan"

DialogConfig.positiveText = "OK"
DialogConfig.negativeText = "Batal"
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

## 🆕 Changelog

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
