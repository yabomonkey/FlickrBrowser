package yabomonkey.example.flickrbrowser

import android.os.AsyncTask

private const val TAG = "GetRawData"

enum class DownloadStatus {
    OK, IDLE, NOT_INITALIZED, FAILED_OR_EMPTY, PERMISSIONS_ERROR, ERROR
}

class GetRawData : AsyncTask<String, Void, String>() {
    private val downloadStatus = DownloadStatus.IDLE
}