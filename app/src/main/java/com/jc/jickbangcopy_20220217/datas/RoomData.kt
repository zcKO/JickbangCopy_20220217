package com.jc.jickbangcopy_20220217.datas

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
) {

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