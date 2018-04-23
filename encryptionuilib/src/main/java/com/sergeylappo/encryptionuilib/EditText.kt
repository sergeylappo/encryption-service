package com.sergeylappo.encryptionuilib

import android.content.Context
import android.net.Uri
import android.support.v7.widget.AppCompatEditText
import android.text.Editable
import android.text.SpannableStringBuilder
import android.util.AttributeSet
import com.sergeylappo.encryptioncontract.EncryptionContract.*

/**
 *TODO write documentation
 */
class EditText : AppCompatEditText {
    //TODO add constructors or setter methods to determine which encryption key should be use

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun getText(): Editable {
        val uri = Uri.withAppendedPath(Uri.parse("content://standard"), EncryptContract.TABLE_NAME)
        context.contentResolver.query(uri, null, null, null, null).use {
            return SpannableStringBuilder(it.getString(it.getColumnIndex(EncryptContract.ENCRYPTED_MESSAGE)))
        }
    }
}