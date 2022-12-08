package com.example.manifestpermission

object TagPermission {
    private val TAG = TagPermission::class.java.getSimpleName()

    const val PERMISSION_DENIED = -1
    const val PERMISSION_GRANTED = 0
    const val SETTINGS_PERMISSION_CODE = 1000
    const val ALL_PERMISSION_CODE = 1001
    const val TELEPHONY_PERMISSION_CODE = 1002
    const val MICROPHONE_PERMISSION_CODE = 1003
    const val CAMERA_PERMISSION_CODE = 1004
    const val VIDEO_CALL_PERMISSION_CODE = 1005
    const val VIDEO_RECORD_PERMISSION_CODE = 1006
    const val GALLERY_PERMISSION_CODE = 1007
    const val CONTACT_PERMISSION_CODE = 1008
}