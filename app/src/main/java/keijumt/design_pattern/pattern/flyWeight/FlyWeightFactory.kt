package keijumt.design_pattern.pattern.flyWeight

class FlyWeightFactory {

    val pool = HashMap<Int, FlyWeight>()

    fun get(key: Int): FlyWeight {

        // poolからkeyを元にインスタンスを取得する
        var flyWeight = pool.get(key)

        // flyWeightがpoolになかった場合
        if (flyWeight == null) {
            flyWeight = FlyWeight(key)
            // poolにkeyとインスタンスを保存する
            pool.put(key, flyWeight)
        }

        return flyWeight
    }
}