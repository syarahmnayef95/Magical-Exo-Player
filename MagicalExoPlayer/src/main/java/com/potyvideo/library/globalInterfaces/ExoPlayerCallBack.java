package com.potyvideo.library.globalInterfaces;

public interface ExoPlayerCallBack {

    void onError();
    void onPlayerStateChanged(boolean playWhenReady, int playbackState);
}
