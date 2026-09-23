package com.hautotq.website.template

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform