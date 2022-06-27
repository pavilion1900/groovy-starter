package ru.clevertec.lesson26.task2

class Ex2 {
    private static Object firstOptions() {
        use(IntegerMethods) {
            Integer result = 3.cm + 1.m - 25.mm
            assert result == 1005
        }
    }

    static void main(String[] args) {
        Integer.metaClass {
            getCm = {
                delegate * 10
            }
            getM = {
                delegate.cm * 100
            }
            getMm = {
                delegate
            }
        }
        Integer result = 3.cm + 1.m - 25.mm
        assert result == 1005
    }
}
