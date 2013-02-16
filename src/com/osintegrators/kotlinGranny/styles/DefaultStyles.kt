
package com.osintegrators.kotlinGranny.styles

import kara.styles.*

class DefaultStyles() : Stylesheet() {
    override fun render() {
        s("body") {
            backgroundColor = c("#f0f0f0")
            fontFamily = "\"Lucida Sans Unicode\", \"Lucida Grande\", sans-serif"
        }
        s("h1") {
            marginLeft = 1.em
        }
        s("#main") {
            width = 85.percent
            backgroundColor = c("#fff")
            margin = box(0.px, auto)
            padding = box(1.em)
            border = "1px solid #ccc"
            borderRadius = 5.px
        }
    }
}

