package hard

import medium.RedundantConnection

// In this problem, a rooted tree is a directed graph such that, there is exactly one node (the root) for which all other nodes are descendants of this node,
// plus every node has exactly one parent, except for the root node which has no parents.
//
// The given input is a directed graph that started as a rooted tree with n nodes (with distinct values from 1 to n),
// with one additional directed edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed.
//
// The resulting graph is given as a 2D-array of edges.
// Each element of edges is a pair [ui, vi] that represents a directed edge connecting nodes ui and vi,
// where ui is a parent of child vi.
//
// Return an edge that can be removed so that the resulting graph is a rooted tree of n nodes. If there are multiple answers,
// return the answer that occurs last in the given 2D-array.


data class Edge(val src: Int, val dest: Int)
class Graph(size: Int) {
    private val list: Array<MutableList<Int>>

    init {
        list = Array(size) { mutableListOf() }
    }

    fun next(i: Int) = list[i]

    fun add(src: Int, dest: Int) {
        list[src].add(dest)
    }
}

class RedundantConnection2 {
    fun findRedundantDirectedConnection(edges: Array<IntArray>): IntArray {
        val n = edges.size + 1
        val graph = Graph(n)
        edges.forEach { array ->
            graph.add(array[0], array[1])
        }

        val parents = Array(n) { mutableListOf<Int>() }
        val children = Array(n) { mutableListOf<Int>() }
        val visited = Array(n) { false }
//        for (i in 1..n) {
//            val target = graph.next(i)
//            val visitedNodes = hashSetOf(i)
//            val result = explore(graph, i, target, visitedNodes, false)
//            if (result != null) {
//                return result
//            }
//
////        }
//        edges.forEach { edge ->
//            val dad = edge[0]
//            if (!visited[dad]) {
//                val result = dfs(graph, visited, parents, dad, dad)
//                if (result != null) {
//                    return result
//                }
//            }
//        }

        edges.forEach { edge ->
            val dad = edge[0]
            if (!visited[dad]) {
                bfs(graph, visited, parents, children, dad)
            }
        }
//        for (i in 1 until n) {
//            if (!visited[i]) {
//                val result = dfs(graph, visited, parents, i, i)
//                if (result != null) {
//                    return result
//                }
//            }
//        }

        var doubleParentIndex: Int? = null
        parents.forEachIndexed { i, parentList ->
//            println("i: $i, parents: ${parents[i]}")
            if (parentList.size >= 2) {
               doubleParentIndex  = i
                return@forEachIndexed
            }
        }

//        children.forEachIndexed { i, list ->
//            println("i: $i parents: ${parents[i]} children: $list")
//        }

        if (doubleParentIndex != null) {
            val index = doubleParentIndex!!
            val parentA = parents[index][0]
            val parentB = parents[index][1]
            val isBRoot = parents[parentB].size == 0
            return if (children[index].size == 1 && children[index][0] == parentA) {
                intArrayOf(parentA, index)
            } else if (!isBRoot || children[parentB].size != 1) {
                intArrayOf(parentB, index)
            } else {
                intArrayOf(parentA, index)
            }
        } else {
            return RedundantConnection().findRedundantConnection(edges)
        }
    }

    fun dfs(graph: Graph, visited: Array<Boolean>, parents: Array<ArrayDeque<Int>>, u: Int, root: Int): IntArray? {
        visited[u] = true
        for (i in graph.next(u)) {
            if (i != root) {
                parents[i].add(u)
            }
            if (!visited[i]) {
                val r = dfs(graph, visited, parents, i, root)
//                if (r != null) {
//                    return r
//                }
            }

            println("root: $root, u: $u, v: $i parents: ${parents[i]}")
//            if (i == root && parents[u].isNotEmpty()) {
//                println("return $u $i")
//                return intArrayOf(u, i)
//            }
        }

        return null
    }

    fun bfs(graph: Graph, visited: Array<Boolean>, parents: Array<MutableList<Int>>, children: Array<MutableList<Int>>, startNode: Int) {
        val queue = ArrayDeque<Int>()
        visited[startNode] = true
        queue.add(startNode)
        while (!queue.isEmpty()) {
            val x = queue.removeFirst()

            for (i in graph.next(x)) {
                parents[i].add(x)
                children[x].add(i)
                if (!visited[i]) {
                    visited[i] = true
                    queue.add(i)
                }

                println("start: $startNode, p: $x, c: $i parents of $i: ${parents[i]}")
            }
        }
    }

    fun explore(graph: Graph, u: Int, target: HashSet<Int>, visitedNodes: HashSet<Int>, checkTarget: Boolean): IntArray? {
        println("u: $u")
        println("target: $target")
        println("children: ${graph.next(u)}")

        visitedNodes.add(u)
        for (x in graph.next(u)) {
            println("x: $x")

            if (visitedNodes.contains(x)) {
                println("node already visited in this run")
                return intArrayOf(u, x)
            } else if (graph.next(x).size > 0) {
                println("exploring $x children")
                return explore(graph, x, target, visitedNodes, true)
            } else if (checkTarget && target.contains(x)) {
                println("target found")
                return intArrayOf(u, x)
            }

            println("not found in targets")
        }

        return null
    }
}