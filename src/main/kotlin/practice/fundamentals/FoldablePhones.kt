package practice.fundamentals

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, private var isFolded: Boolean = false) : Phone(isScreenLightOn) {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}

fun main() {
    val phone = Phone()
    phone.switchOn()
    phone.checkPhoneScreenLight()
    phone.switchOff()
    phone.checkPhoneScreenLight()

    val foldablePhone = FoldablePhone()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.fold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.unfold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()
}
