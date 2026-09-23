# Creating a website with Kotlin

this repo is used to create easily a website with Kotlin.

## How make that ?

To create your own website, make sure that:
- In `webApp/src/webMain/kotlin`, put your Kotlin code. It will be compiled into `webApp.js`.
- In `webApp/src/webMain/resources`, put at least `index.html`. This HTML file will launch your website.

> [!NOTE]
> In the `<body>` of the `index.html`, you must at least this `<script>` :

```html
<script type="application/javascript" src="webApp.js"></script>
```
