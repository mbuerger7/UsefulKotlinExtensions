import timber.log.Timber

fun Any.logD(message: String?) {
    Timber.tag(this::class.java.simpleName).d(message)
}

fun Any.logE(message: String?) {
    Timber.tag(this::class.java.simpleName).e(message)
}
