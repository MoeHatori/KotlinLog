package jp.techacademy.moe.hatori.kotlinlog

abstract class Animal {
    //抽象クラス

    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    //抽象クラスの宣言
    abstract fun say()
}