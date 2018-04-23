package com.sergeylappo.encryptionservice.providers.data

import android.database.MatrixCursor
import com.sergeylappo.encryptioncontract.EncryptionContract.*

class EncryptedMessageCursor
    : MatrixCursor(arrayOf(EncryptContract.ENCRYPTED_MESSAGE), 1)