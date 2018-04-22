package com.sergeylappo.encryptionuilib

import android.content.Context
import android.support.v7.widget.AppCompatEditText
import android.text.Editable
import android.util.AttributeSet

class EditText : AppCompatEditText {
    //TODO add constructors or setter methods to determine which encryption key should be use

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun getText(): Editable {
        TODO("encrypt text here")
    }
}