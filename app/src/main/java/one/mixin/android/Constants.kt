package one.mixin.android

object Constants {

    object API {
        const val URL = "https://api.mixin.one/"
        const val WS_URL = "wss://blaze.mixin.one"
    }

    object Account {
        const val PREF_SESSION = "pref_session"
        const val PREF_PIN_TOKEN = "pref_pin_token"
        const val PREF_NAME_ACCOUNT = "pref_name_account"
        const val PREF_NAME_TOKEN = "pref_name_token"
        const val PREF_PIN_CHECK = "pref_pin_check"
        const val PREF_PIN_INTERVAL = "pref_pin_interval"
        const val PREF_PIN_ITERATOR = "pref_pin_iterator"
    }

    const val SLEEP_MILLIS: Long = 1000
    const val INTERVAL_24_HOURS: Long = 1000 * 60 * 60 * 24
    const val INTERVAL_48_HOURS: Long = 1000 * 60 * 60 * 48
    const val INTERVAL_10_MINS: Long = 1000 * 60 * 10

    const val ARGS_USER = "args_user"

    const val Mixin_Conversation_ID_HEADER = "Mixin-Conversation-ID"
    val KEYS = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "", "0", "<<")

    const val BATCH_SIZE = 700
}