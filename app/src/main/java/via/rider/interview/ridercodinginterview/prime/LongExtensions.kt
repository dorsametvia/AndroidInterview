package via.rider.interview.ridercodinginterview.prime

val Long.isPrime: Boolean
get() {
    if (this <= 1) return false
    if (this <= 3) return true
    if (this % 2L == 0L || this % 3L == 0L) return false

    var i = 5
    while (i * i <= this) {
        if (this % i == 0L || this % (i + 2L) == 0L) return false
        i += 6
    }

    return true
}