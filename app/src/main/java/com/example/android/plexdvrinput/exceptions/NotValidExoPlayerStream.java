package com.example.android.plexdvrinput.exceptions;

/**
 * Created by Nick on 1/3/2016.
 */
@Deprecated
public class NotValidExoPlayerStream extends Exception {
    public NotValidExoPlayerStream() {
        super("Not a valid ExoPlayer Stream");
    }
}
