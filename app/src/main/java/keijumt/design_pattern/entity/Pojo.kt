package keijumt.design_pattern.entity


class Pojo() {

    var obj1: String = ""
    var obj2: String = ""
    var obj3: String = ""

    fun print() {
        println("obj1 : $obj1, obj2 : $obj2, obj3 : $obj3")
    }

    /**
     * effectiveJavaで記載されているBuilderパターン
     */
    internal class Builder {

        // TODO : privateにしてconstractorからアクセスできるようにする
        var obj1: String = ""
        var obj2: String = ""
        var obj3: String = ""

        fun addObj1(obj1: String): Builder {
            this.obj1 = obj1
            return this
        }

        fun addObj2(obj2: String): Builder {
            this.obj2 = obj2
            return this
        }

        fun addObj3(obj3: String): Builder {
            this.obj3 = obj3
            return this
        }

        /**
         * Pojoのprivateなconstractorを利用してインスタンス化する
         */
        fun build(): Pojo {
            return Pojo(this)
        }
    }

    /**
     * builderから呼び出されるprivateなconstractor
     */
    private constructor(builder: Builder) : this() {
        obj1 = builder.obj1
        obj2 = builder.obj2
        obj3 = builder.obj3
    }
}