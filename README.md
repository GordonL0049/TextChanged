# TextChanged

**:computer: Introduction**

An App Inventor non-visible extension that detects text changes events for your visible components.

:package: **Package name:** com.gordonlu.textchanged.aix

:clock1: **Version:** 1

:date: **Release date:** [date=2022-03-21 time=18:00:00 timezone="Asia/Hong_Kong"]

**:fountain_pen: Supports:**

* **User Interface:**  Button, Checkbox, DatePicker, Label, ListPicker, PasswordTextBox, Switch, TextBox, TimePicker. 

* **Media:** ImagePicker

* **Social:** ContactPicker, EmailPicker, PhoneNumberPicker

If you look in the Android Developers documentation for EditText (TextBox) and Button, you will see that they are all subclasses of TextView (Label), so technically, Button = TextView.

There might be a Clock solution for this, but when your app gets bigger and bigger, you don't want to check text changed events for 10 times or have 10 Clocks in your app. 

**:open_book: Documentation**

***Event blocks***

>
>**OnTextChanged**
>
>![image](https://user-images.githubusercontent.com/88015331/159249898-b0ecf2fc-191d-482a-8023-57ad8e8e81ec.png)
>
>This event is invoked when a component's text is changed.
>
>*Parameters:* component = component

***Method blocks***

>
>**AddTextChangedListener**
>
>![image](https://user-images.githubusercontent.com/88015331/159249904-708c735f-e10e-440f-aed9-948d8edfdc69.png)
>
>Listenes to text changed events for the given component and fires the OnTextChanged event when necessary.
>
>*Parameters:* component = component

**:link: More info**

Visit the official App Inventor community post for more info.

https://community.appinventor.mit.edu/t/free-textchanged-detect-text-changes-for-your-components/53974?u=gordon_lu
