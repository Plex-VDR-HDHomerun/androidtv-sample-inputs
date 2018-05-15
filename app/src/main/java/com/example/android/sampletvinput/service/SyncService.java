package com.example.android.sampletvinput.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.example.android.sampletvinput.sync.ChannelSyncAdapter;

/**
 * Service which provides the SyncAdapter implementation to the framework on request.
 */
public class SyncService extends Service {
    private static final Object syncAdapterLock = new Object();
    private static ChannelSyncAdapter syncAdapter = null;

    @Override
    public void onCreate() {
        super.onCreate();
        synchronized (syncAdapterLock) {
            if (syncAdapter == null) {
                syncAdapter = new ChannelSyncAdapter(getApplicationContext(), true);
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return syncAdapter.getSyncAdapterBinder();
    }
}
