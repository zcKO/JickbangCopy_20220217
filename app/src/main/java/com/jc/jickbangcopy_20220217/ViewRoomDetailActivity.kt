package com.jc.jickbangcopy_20220217

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jc.jickbangcopy_20220217.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val roomData = intent.getSerializableExtra("roomInfo")

        if (roomData is RoomData) {

            txtPrice.text = roomData.getFormattedPrice()
            txtDescription.text = roomData.description
            txtAddress.text = roomData.address
            txtFloor.text = roomData.getFormattedFloor()
        }

    }
}