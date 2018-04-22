package com.sergeylappo.encryptionservice

import android.content.Intent

/**
 * TODO write docu
 */
interface IntentContract {
    class EncryptMessage {
        fun createIntent(): Intent {
            TODO("Implement method")
        }
    }

    class DecryptMessage {
        fun createIntent(): Intent {
            TODO("Implement method")
        }
    }
}