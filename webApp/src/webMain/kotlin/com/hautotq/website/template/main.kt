package com.hautotq.website.template

import kotlinx.browser.document

fun main() {
    val title = document.createElement("h1")
    title.textContent = "Hello World !"
    document.body?.appendChild(title)
}