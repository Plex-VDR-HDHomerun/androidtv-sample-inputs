package com.example.android.sampletvinput.player.utils;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.media.tv.TvContract;
import android.os.Bundle;
import android.util.Log;

import com.example.android.sampletvinput.service.AccountService;
import com.example.android.sampletvinput.sync.ChannelSyncAdapter;

/**
 * Static helper methods for working with the ChannelSyncAdapter framework.
 */
public class SyncUtil {
    private static final String TAG = "SyncUtil";
    private static final String CONTENT_AUTHORITY = TvContract.AUTHORITY;
    public static final String ACCOUNT_TYPE = "at.pansy.iptv.account";

    public static void setUpPeriodicSync(Context context, String inputId) {
        Account account = AccountService.getAccount(ACCOUNT_TYPE);
        AccountManager accountManager =
                (AccountManager) context.getSystemService(Context.ACCOUNT_SERVICE);
        if (!accountManager.addAccountExplicitly(account, null, null)) {
            Log.e(TAG, "Account already exists.");
        }
        ContentResolver.setIsSyncable(account, CONTENT_AUTHORITY, 1);
        ContentResolver.setSyncAutomatically(account, CONTENT_AUTHORITY, true);
        Bundle bundle = new Bundle();
        bundle.putString(ChannelSyncAdapter.BUNDLE_KEY_INPUT_ID, inputId);
        ContentResolver.addPeriodicSync(account, CONTENT_AUTHORITY, bundle,
                ChannelSyncAdapter.FULL_SYNC_FREQUENCY_SEC);
    }

    public static void requestSync(String inputId, boolean currentProgramOnly) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(ContentResolver.SYNC_EXTRAS_MANUAL, true);
        bundle.putBoolean(ContentResolver.SYNC_EXTRAS_EXPEDITED, true);
        bundle.putString(ChannelSyncAdapter.BUNDLE_KEY_INPUT_ID, inputId);
        bundle.putBoolean(ChannelSyncAdapter.BUNDLE_KEY_CURRENT_PROGRAM_ONLY, currentProgramOnly);
        ContentResolver.requestSync(AccountService.getAccount(ACCOUNT_TYPE), CONTENT_AUTHORITY,
                bundle);
    }
}
