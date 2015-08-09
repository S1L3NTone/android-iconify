package com.joanzapata.android.iconify.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.joanzapata.android.iconify.Iconify;

public class IconButton extends Button {

    public IconButton(Context context) {
        super(context);
        init();
    }

    public IconButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public IconButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        if (isInEditMode()) return;
        Iconify.addIcons(this);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(Iconify.compute(getContext(), text), type);
    }
}