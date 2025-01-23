package medium

import kotlin.math.tan

/**
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 *
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station.
 *
 * You begin the journey with an empty tank at one of the gas stations.
 *
 * Given two integer arrays gas and cost, return the starting gas station's index
 * if you can travel around the circuit once in the clockwise direction, otherwise return -1.
 *
 * If there exists a solution, it is guaranteed to be unique.
 *
 * https://leetcode.com/problems/gas-station?envType=study-plan-v2&envId=top-interview-150
 */
class GasStation {
    // gas = [6,1,4,3,5], cost = [3,8,2,4,2]
    // [3,-7,2,-1,3] 2
    //
    // tank = gas[i] - cost[i] + gas[j]
    // do we have have gas to move to the next stating?
    // we know we can complete circuit if the total of all tank is >= 0
    // the question is where to start?
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        val n = gas.size
        var start = 0
        var tank = 0
        var tankTrack = 0
        var total = 0
        var t: Boolean
        gas.forEach { n ->  }
        for (i in 0 until n) {
            tank = gas[i] - cost[i]
            tankTrack += tank
            if (tankTrack < 0) {
                start = i + 1
                tankTrack = 0
            }
            total += tank
        }
        if (total >= 0) {
            return start
        }

        return -1
    }


}