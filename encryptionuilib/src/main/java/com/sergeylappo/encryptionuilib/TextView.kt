package com.sergeylappo.encryptionuilib

import android.content.Context
import android.net.Uri
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import com.sergeylappo.encryptioncontract.EncryptionContract.*

/**
 * TODO write documentation
 */
class TextView : AppCompatTextView {
    //TODO add constructors or setter methods to determine which decription key should be use

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun setText(text: CharSequence, type: BufferType) {
        val uri = Uri.withAppendedPath(Uri.parse("content://standard"), DecryptContract.TABLE_NAME)
        context.contentResolver.query(uri, null, null, null, null).use {
            super.setText(it.getString(it.getColumnIndex(EncryptContract.ENCRYPTED_MESSAGE)), type)
        }
    }
}