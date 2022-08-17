package com.iqiyi.qigsaw.sample.downloader;

import com.iqiyi.android.qigsaw.core.splitdownload.DownloadCallback;
import com.iqiyi.android.qigsaw.core.splitdownload.DownloadRequest;
import com.iqiyi.android.qigsaw.core.splitdownload.Downloader;

import java.util.List;

/**
 * Copyright 2020 ke.com. All rights reserved.
 *
 * @author gaofeng058
 * @date 8/17/22 4:43 PM
 * @desc
 */
public class EmptyDowloader implements Downloader {
    @Override
    public void startDownload(int sessionId, List<DownloadRequest> requests, DownloadCallback callback) {

    }

    @Override
    public void deferredDownload(int sessionId, List<DownloadRequest> requests, DownloadCallback callback, boolean usingMobileDataPermitted) {

    }

    @Override
    public boolean cancelDownloadSync(int sessionId) {
        return false;
    }

    @Override
    public long getDownloadSizeThresholdWhenUsingMobileData() {
        return 0;
    }

    @Override
    public boolean isDeferredDownloadOnlyWhenUsingWifiData() {
        return false;
    }
}
