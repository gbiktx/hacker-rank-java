package medium

/**
 * There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0.
 * Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
 *
 * When you visit a room, you may find a set of distinct keys in it.
 * Each key has a number on it, denoting which room it unlocks,
 * and you can take all of them with you to unlock the other rooms.
 *
 * Given an array rooms where rooms[i] is the set of keys that you can obtain
 * if you visited room i, return true if you can visit all the rooms, or false otherwise.
 *
 * https://leetcode.com/problems/keys-and-rooms?envType=study-plan-v2&envId=leetcode-75
 */
class KeysRooms {
    // 0
    //[[1],[2],[3],[]]
    fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
        val roomsMap = hashMapOf<Int, Boolean>()
        getKeys(0, rooms, roomsMap)
        return rooms.size == roomsMap.size
    }

    private fun getKeys(index: Int, rooms: List<List<Int>>, roomsMap: HashMap<Int, Boolean>) {
       if(roomsMap[index] == null) {
          roomsMap[index] = true
           val n = rooms[index].size
           for (x in 0 until n) {
             getKeys(rooms[index][x], rooms, roomsMap)
           }
       }
    }

}
