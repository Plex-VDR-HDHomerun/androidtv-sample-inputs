package com.example.android.sampletvinput.player.source;

import android.os.Handler;

import com.google.android.exoplayer2.upstream.DataSource;

import com.example.msgexchange.Packet;
import com.example.msgexchange.SessionListener;
import org.robotv.client.Connection;

import java.io.IOException;

public class RoboTvDataSourceFactory implements DataSource.Factory {

    final private Connection connection;
    final private Listener listener;
    final private PositionReference position;
    final private String language;

    public interface Listener {

        void onDisconnect();

        void onStreamError(int status);

        void onServerTuned(int status);
    }

    private SessionListener sessionListener = new SessionListener() {

        private Handler handler = new Handler();

        public void onNotification(Packet p) {
        }

        public void onDisconnect() {
            if(listener == null) {
                return;
            }

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    listener.onDisconnect();
                }
            }, 3000);
        }
    };

    public RoboTvDataSourceFactory(PositionReference position, String language, Listener listener) {
        this.listener = listener;
        this.position = position;
        this.language = language;

        connection = new Connection("roboTV:streaming", language);
        connection.setCallback(sessionListener);
    }

    @Override
    public DataSource createDataSource() {
        return new RoboTvDataSource(position, connection, language, new RoboTvDataSource.Listener() {
            @Override
            public void onOpenStreamError(int status) {
                if(RoboTvDataSourceFactory.this.listener != null) {
                    RoboTvDataSourceFactory.this.listener.onStreamError(status);
                }
            }

            @Override
            public void onServerTuned(int status) {
                if(RoboTvDataSourceFactory.this.listener != null) {
                    RoboTvDataSourceFactory.this.listener.onServerTuned(status);
                }
            }
        });
    }

    public boolean connect(String server) throws IOException {
        if(connection.isOpen()) {
            return true;
        }

        if(connection.open(server)) {
            return true;
        }

        connection.close();

        if(listener != null) {
            listener.onStreamError(Connection.STATUS_CONNECTION_FAILED);
        }

        return false;
    }

    public void release() {
        connection.close();
    }

    public Connection getConnection() {
        return connection;
    }
}
