<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="00:00:00"
        android:textColor="#000"
        android:textSize="60sp"
        android:textStyle="bold" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/textView"
        android:layout_marginTop="20sp"
        android:layout_marginStart="20sp"
        android:layout_marginEnd="20sp"
        android:orientation="horizontal">

        <com.google.android.material.button.MaterialButton
            android:id="@+id/reset"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Reset"
            app:icon="@drawable/refresh_ccw_svgrepo_com" />

        <com.google.android.material.button.MaterialButton
            android:layout_width="0sp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Start"
            app:icon="@drawable/baseline_play_arrow_24"
            android:layout_marginStart="5sp"
            android:layout_marginEnd="5sp"
            android:id="@+id/start"/>

        <com.google.android.material.button.MaterialButton
            android:layout_width="0sp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Stop"
            android:enabled="false"
            app:icon="@drawable/media_player_ui_button_stop_svgrepo_com"
            android:layout_marginStart="5sp"
            android:layout_marginEnd="5sp"
            android:id="@+id/stop"/>

    </LinearLayout>

</RelativeLayout>
