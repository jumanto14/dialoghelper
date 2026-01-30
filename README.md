# DialogHelper

Simple and lightweight Android dialog helper library written in Kotlin.  
Designed for clean, reusable, and beginner‑friendly dialog handling without boilerplate.

---

## ✨ Features

- Alert dialog
- Confirm dialog (Yes / No)
- Loading dialog
- DialogStyle (INFO, SUCCESS, WARNING, ERROR)
- Optional & custom title
- No Material dependency

---

## 📦 Installation

### Option 1: Local Module
Copy the `dialoghelper` module into your project and include it in `settings.gradle`.

```kotlin
include(":dialoghelper")
```

### Option 2: JitPack (recommended)
```gradle
implementation("com.github.jumanto14:dialoghelper:v1.0.0")
```

---

## 🚀 Usage

### Alert Dialog (Default)

```kotlin
DialogHelper.showAlert(
    context = this,
    message = "Data berhasil disimpan"
)
```

### Alert Dialog with Style

```kotlin
DialogHelper.showAlert(
    context = this,
    message = "Pembayaran berhasil",
    style = DialogStyle.SUCCESS
)
```

### Custom Title

```kotlin
DialogHelper.showAlert(
    this,
    message = "Saldo tidak mencukupi",
    title = "Peringatan",
    style = DialogStyle.WARNING
)
```

### Without Title

```kotlin
DialogHelper.showAlert(
    this,
    message = "Session expired",
    title = ""
)
```

---

## ❓ Confirm Dialog

```kotlin
DialogHelper.showConfirm(
    context = this,
    message = "Yakin ingin logout?",
    style = DialogStyle.WARNING,
    onConfirm = {
        logout()
    }
)
```

---

## ⏳ Loading Dialog

```kotlin
val loading = LoadingDialog(this)
loading.show()

// do async work

loading.dismiss()
```

---

## 🧠 Best Practices

- Reuse `LoadingDialog` instance
- Use `DialogStyle` for UX consistency
- Avoid heavy UI customization in helper layer
- Ideal for BaseActivity / BaseFragment

---

## 📁 Structure

```
dialoghelper/
├── DialogHelper.kt
├── DialogStyle.kt
├── DialogConfig.kt
└── LoadingDialog.kt
```

---

## 📄 License

MIT License — free to use in personal and commercial projects.

---

## 👨‍💻 Author

**Jumanto**  
Android Developer — Indonesia 🇮🇩  
GitHub: https://github.com/jumanto14
