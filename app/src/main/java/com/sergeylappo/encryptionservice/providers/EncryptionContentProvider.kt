package com.sergeylappo.encryptionservice.providers

import android.content.ContentProvider
import android.content.ContentValues
import android.content.UriMatcher
import android.database.Cursor
import android.database.MatrixCursor
import android.net.Uri
import com.sergeylappo.encryptioncontract.EncryptionContract.*
import com.sergeylappo.encryptionservice.providers.data.DecryptedMessageCursor
import com.sergeylappo.encryptionservice.providers.data.EncryptedMessageCursor

/**
 * TODO write documentation
 */
class EncryptionContentProvider : ContentProvider() {

    /**
     * TODO potentially should check communicated app package (Should we have allowed apps only???)
     */
    override fun onCreate(): Boolean {
        return true
    }

    override fun query(uri: Uri?, projection: Array<out String>?, selection: String?, selectionArgs: Array<out String>?, sortOrder: String?): Cursor {
        val match = URI_MATCHER.match(uri)
        when (match) {
            ENCRYPT -> {
                val cursor = EncryptedMessageCursor()
                val columnValue = listOf("encryptedMessage")
                cursor.addRow(columnValue)
            }
            DECRYPT -> {
                val cursor = DecryptedMessageCursor()
                val columnValue = listOf("decryptedMessage")
                cursor.addRow(columnValue)
            }
        }
        return MatrixCursor(emptyArray(), 0)
    }

    override fun insert(uri: Uri?, values: ContentValues?): Uri {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(uri: Uri?, values: ContentValues?, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(uri: Uri?, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getType(uri: Uri?): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    //TODO FIX "standard"
    companion object {
        private val ENCRYPT = 1
        private val DECRYPT = 2
        private val URI_MATCHER: UriMatcher = UriMatcher(UriMatcher.NO_MATCH).apply {
            addURI("standard", EncryptContract.TABLE_NAME, ENCRYPT)
            addURI("standard", DecryptContract.TABLE_NAME, DECRYPT)
        }
    }
}