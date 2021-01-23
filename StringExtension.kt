fun String?.emptyToNull(): String? {
    return if (this == null || this.isEmpty()) null else this
}
