package com.kabouzeid.gramophone.ui.fragments.player;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import com.kabouzeid.gramophone.R;

public enum NowPlayingScreen {
    CARD(R.string.card, R.drawable.np_card, 0),
    FLAT(R.string.flat, R.drawable.np_flat, 1),
    MIXED(R.string.mixed, R.drawable.np_mixed, 2);

    @StringRes
    public final int titleRes;
    @DrawableRes
    public final int drawableResId;
    public final int id;

    NowPlayingScreen(@StringRes int titleRes, @DrawableRes int drawableResId, int id) {
        this.titleRes = titleRes;
        this.drawableResId = drawableResId;
        this.id = id;
    }
}
