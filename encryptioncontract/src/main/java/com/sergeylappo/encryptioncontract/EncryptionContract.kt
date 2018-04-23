package com.sergeylappo.encryptioncontract

class EncryptionContract {
    object EncryptContract {
        const val TABLE_NAME = "encrypt"

        const val ENCRYPTED_MESSAGE = "encryptedMessage"
        const val DECRYPTED_MESSAGE = "decryptedMessage"
        const val CHAT_ID = "chatID"
    }

    object DecryptContract {
        const val TABLE_NAME = "decrypt"

        const val ENCRYPTED_MESSAGE = "encryptedMessage"
        const val DECRYPTED_MESSAGE = "decryptedMessage"
        const val CHAT_ID = "chatID"
    }
}