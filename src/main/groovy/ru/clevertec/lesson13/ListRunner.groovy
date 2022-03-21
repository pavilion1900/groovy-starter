package ru.clevertec.lesson13

class ListRunner {
    static void main(String[] args) {
        def list = [1, 2, 3, 4, 5, 7, 6, 7, 8, 7]
        assert list.getClass() == ArrayList

        assert list[5] == 7
        assert list.get(2) == 3
        assert list[-1] == 7
        assert list[1..3] == [2, 3, 4]
        assert list[10] == null

        list += 9
        list += 7
        assert list == [1, 2, 3, 4, 5, 7, 6, 7, 8, 7, 9, 7]
        list -= 7
        assert list == [1, 2, 3, 4, 5, 6, 8, 9]
        list -= [1, 3]
        assert list == [2, 4, 5, 6, 8, 9]
        list *= 3
        assert list == [2, 4, 5, 6, 8, 9, 2, 4, 5, 6, 8, 9, 2, 4, 5, 6, 8, 9]
        list.push(999)
        assert list.pop() == 999
        assert list.head() == 2
        assert list.tail() == [4, 5, 6, 8, 9, 2, 4, 5, 6, 8, 9, 2, 4, 5, 6, 8, 9]
        assert list.last() == 9

        assert [1, 2, [4, 6, 7], 9].flatten() == [1, 2, 4, 6, 7, 9]
        assert [1, 2, 3, 4].reverse() == [4, 3, 2, 1]
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]
        assert [1, 2, 3].disjoint([5, 6, 7])

        def (a, b, c) = [3, 5, 7, 9, 10]
        assert a == 3
        assert b == 5
        assert c == 7

        func(*[8, 10])
    }

    static def func(def a, def b) {
        println a
        println b
    }
}
