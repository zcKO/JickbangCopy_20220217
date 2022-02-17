package com.jc.jickbangcopy_20220217.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

/**
 * @param price 방 가격
 * @param address 방 주소
 * @param floor 층 수
 * @param description 설명 문구
 */
class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String
): Serializable {

    fun getFormattedPrice(): String {
        if (this.price < 10000) {
            return NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
        } else {
            // 26500 => 2억 6,500
            val uk = this.price / 10000
            // 나머지 천 단위
            val rest = this.price % 10000

            return "${uk}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)}"

        }
    }

    // 층 수를 봐서 다른 문장을 얻는 함수
    fun getFormattedFloor(): String {

        if (this.floor > 0) {
            return "${this.floor}층"
        } else if (this.floor == 0) {
            return "반지하"
        } else {
            // 음수를 양수로 변환
            return "지하 ${-this.floor}층"
        }

    }

}