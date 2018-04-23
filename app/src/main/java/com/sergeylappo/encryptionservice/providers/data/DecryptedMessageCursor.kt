package com.sergeylappo.encryptionservice.providers.data

import android.database.MatrixCursor
import com.sergeylappo.encryptioncontract.EncryptionContract.*

class DecryptedMessageCursor
    : MatrixCursor(arrayOf(DecryptContract.DECRYPTED_MESSAGE), 1)