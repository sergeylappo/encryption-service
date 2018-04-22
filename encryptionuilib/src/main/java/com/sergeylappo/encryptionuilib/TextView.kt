package com.sergeylappo.encryptionuilib

import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet

class TextView : AppCompatTextView {
    //TODO add constructors or setter methods to determine which decription key should be use

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun setText(text: CharSequence, type: BufferType) {
        TODO("add request to text decoder in app")
    }
}