# Welcome to the GitHub Flavored Markdown Constructor!
This package will allow you to dynamically create GitHub Flavored Markdown pages.

## How to use
There is a really nice, easy way to preview these pages using [grip](https://github.com/joeyespo/grip).
Instructions on how to use it are very simple. It was used a lot in the testing of this package.

Everything begins with a MDPage object:
```java
MDPage page = new MDPage(filename);
```
Then you just add anything you want to this page in the order that you want it.
For example, to add text, just do
```java
page.addText("I am text on the page!");
```

## Features

### Text

Normal Text: `page.addText("example normal text");`
Bold Text: `page.addBoldText("example bold text");`
Italicized Text: `page.addItalicizedText("example italicized text");`
Links: `page.addLink("Here is a surprise for you", "https://upload.wikimedia.org/wikipedia/commons/0/0b/Cat_poster_1.jpg")`

### Tables
Tables

### Images