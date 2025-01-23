package easy

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock?envType=study-plan-v2&envId=top-interview-150
 */
class BestTimeToBuySellStock {

    fun maxProfit(prices: IntArray): Int {
        var buy = prices[0]
        var sell = 0
        var profit = 0
        for (i in 1 until prices.size) {
            val price = prices[i]
            if (price < buy) {
                buy = price
                sell = 0
            } else if (sell <= price) {
                sell = price
                val newProfit = sell - buy
                if (newProfit > profit) {
                    profit = newProfit
                }
            }
        }

        return profit
    }
}