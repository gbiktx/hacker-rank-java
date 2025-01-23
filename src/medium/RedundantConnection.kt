package medium

/*
* In this problem, a tree is an undirected graph that is connected and has no cycles.

* You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added.
* The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed.
* The graph is represented as an array edges of length n
* where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.

* Return an edge that can be removed so that the resulting graph is a tree of n nodes.
* If there are multiple answers, return the answer that occurs last in the input.
*
* */

// https://www.geeksforgeeks.org/union-find/
// Find: Determine which subset a particular element is in. This can be used for determining if two elements are in the same subset.
// Union: Join two subsets into a single subset. Here first we have to check if the two subsets belong to same set. If no, then we cannot perform union.
class RedundantConnection {
    fun findRedundantConnection(edges: Array<IntArray>): IntArray {
        val parents = IntArray(edges.size + 1) { -1 }

        edges.forEach { edge ->
            val a = edge[0]
            val b = edge[1]
            val parentA = findParent(parents, a)
            val parentB = findParent(parents, b)

            if (parentA == parentB) {
                return edge
            }

            // parentB is now the parent of parentA
            parents[parentA] = parentB
        }
        return edges[0]
    }

    fun findParent(parents: IntArray, child: Int): Int {
        return if (parents[child] == -1) {
            // if child doesn't have a parent, the child is its own parent
            child
        } else {
            // find parent of the child's parent
            findParent(parents, parents[child])
        }
    }
}