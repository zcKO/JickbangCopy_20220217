package com.jc.jickbangcopy_20220217.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.jc.jickbangcopy_20220217.R
import com.jc.jickbangcopy_20220217.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    resId: Int,
    val roomList: ArrayList<RoomData>
): ArrayAdapter<RoomData>(mContext, resId, roomList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val data = roomList[position]

        val price = row.findViewById<TextView>(R.id.roomPriceTextView)
        val address = row.findViewById<TextView>(R.id.roomAddressTextView)

        price.text = data.getFormattedPrice()
        address.text = "${data.address}, ${data.getFormattedFloor()}"

        // 방 설명
        val description = row.findViewById<TextView>(R.id.roomDescTextView)
        description.text = data.description



        return row

    }

}