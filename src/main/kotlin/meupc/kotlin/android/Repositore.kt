package meupc.kotlin.android

class Repositore<T>{
    private val map = mutableMapOf<String, T>()

    fun create (id: String, value: T){
        map[id] = value
    }

    fun remove (id: String) = map.remove(id)

    fun findAll () =  map.values
}