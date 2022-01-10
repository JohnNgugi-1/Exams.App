package com.somakcpe.app;

import android.content.Context;
import android.media.MediaPlayer;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class Play {
    public Context mContext;

    /** Instantiate the interface and set the context */
    public Play(Context c) {
        mContext = c;
    }

    /** Show a toast from the web page */
    @JavascriptInterface
    public void playAudio(String audio) {
        MediaPlayer mediaPlayer = MediaPlayer.create(mContext, R.raw.bell);
        mediaPlayer.start();
        Toast.makeText(mContext, audio, Toast.LENGTH_LONG).show();
    }
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_LONG).show();
    }
}
