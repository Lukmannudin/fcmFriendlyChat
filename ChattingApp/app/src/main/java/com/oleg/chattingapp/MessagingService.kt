package com.oleg.chattingapp

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MessagingService : FirebaseMessagingService() {
    private val TAG = "FirebaseService"


    override fun onNewToken(token: String?) {
        super.onNewToken(token)
        Log.d(TAG, "Refreshed token: $token")
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        // Handle data payload of FCM messages.

        Log.d(TAG, "FCM Message Id: ${remoteMessage.messageId} ")
        Log.d(TAG, "FCM Notification Id: ${remoteMessage.notification}")
        Log.d(TAG, "FCM Data Message: ${remoteMessage.data}")
    }

}