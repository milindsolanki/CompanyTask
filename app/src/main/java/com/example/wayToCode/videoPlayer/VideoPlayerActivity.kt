package com.example.wayToCode.videoPlayer

import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.MediaController
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_video_player.*

class VideoPlayerActivity : AppCompatActivity(), View.OnClickListener,
    MediaPlayer.OnPreparedListener, SeekBar.OnSeekBarChangeListener {
    var mediaPlayer: MediaPlayer? = null
    var mediaController: MediaController? = null
    var handler: Handler? = null
    var runnable: Runnable? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_player)
        intiView()
    }

    fun setHandler() {
        runnable.run {
            if (mediaPlayer!!.duration > 0) {
                val currentVideoDuration = mediaPlayer!!.currentPosition
                seekBar.setProgress(currentVideoDuration)
                txtStartTime.setText("" + convertIntoTime(currentVideoDuration))
                txtEndTime.setText("-" + convertIntoTime(mediaPlayer!!.duration - currentVideoDuration))

                /*
                    * mediaPlayer.getDuration() = Total Time of Video
                    * currentVideoDuration = currentTime of Video
                    * */
            }

            handler?.postDelayed(this!!, 0)
        }
    }

    /*
    * This function can convert the time from int milliSecond/ long milliSecond to String format  like 12:00, 23:00
    * */
    private fun convertIntoTime(ms: Int): String {
        val time: String
        var x: Int
        val seconds: Int
        val minutes: Int
        val hours: Int
        x = (ms / 1000)
        seconds = x % 60
        x /= 60
        minutes = x % 60
        x /= 60
        hours = x % 24
        time = if (hours != 0) String.format("%02d", hours) + ":" + String.format(
            "%02d",
            minutes
        ) + ":" + String.format("%02d", seconds) else String.format(
            "%02d",
            minutes
        ) + ":" + String.format("%02d", seconds)
        return time
    }

    private fun intiView() {
        mediaController = MediaController(this)
        mediaController?.setAnchorView(vdVw)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.video
        val uri =
            Uri.parse(videoPath)
        vdVw.setVideoURI(uri)
        vdVw.setMediaController(mediaController)
        mediaController?.setAnchorView(vdVw)
        vdVw.start()

    }

    override fun onClick(v: View?) {
        when (v) {
            imgPlay -> {
                mediaPlayer?.start()
            }
            imgStop -> {
                mediaPlayer?.stop()
            }
            imgPause -> {
                mediaPlayer?.pause()

            }
            btnPlus -> {

            }
        }
    }


    override fun onPrepared(mp: MediaPlayer?) {
        mediaPlayer?.start()
        seekBar.max = mediaPlayer?.duration!!
    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        seekBar?.progress.let { mediaPlayer?.seekTo(it!!) }
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {

    }
}