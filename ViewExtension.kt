import android.view.View
import android.view.ViewGroup

fun View.setMargin(left: Int, top: Int, right: Int, bottom: Int) {
    val params = layoutParams as ViewGroup.MarginLayoutParams
    params.setMargins(left, top, right, bottom)
    layoutParams = params
}

fun View.setMarginLeft(leftMargin: Int) {
    val params = layoutParams as ViewGroup.MarginLayoutParams
    params.setMargins(leftMargin, params.topMargin, params.rightMargin, params.bottomMargin)
    layoutParams = params
}

fun View.setMarginTop(topMargin: Int) {
    val params = layoutParams as ViewGroup.MarginLayoutParams
    params.setMargins(params.leftMargin, topMargin, params.rightMargin, params.bottomMargin)
    layoutParams = params
}

fun View.setMarginRight(rightMargin: Int) {
    val params = layoutParams as ViewGroup.MarginLayoutParams
    params.setMargins(params.leftMargin, params.topMargin, rightMargin, params.bottomMargin)
    layoutParams = params
}

fun View.setMarginBottom(bottomMargin: Int) {
    val params = layoutParams as ViewGroup.MarginLayoutParams
    params.setMargins(params.leftMargin, params.topMargin, params.rightMargin, bottomMargin)
    layoutParams = params
}
