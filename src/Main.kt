fun main(){
    var mas1: Array<IntArray> = Array(5) { IntArray(5) }
    for(i in mas1.indices){
        for(j in mas1[i].indices){
            mas1[i][j] = (Math.random() * 5).toInt()
            print(mas1[i][j])
        }
        println()
    }
    //12.62
    var sumVertical: Int = 0
    var sumHorizontal: Int = 0
    for(i in mas1.indices) {
        for (j in mas1[i].indices) {
            sumHorizontal += mas1[i][j]
            sumVertical += mas1[j][i]
        }
        println("сумма строки ${i + 1} = $sumHorizontal")
        sumHorizontal = 0
        println("сумма столбца ${i + 1} = $sumVertical")
        sumVertical =0
    }
    //11.65
    var mas2: Array<Int> = Array(28) {0}
    var kolOsadkov: Int = 0
    for(i in mas2.indices){
        mas2[i] = (Math.random() * 60).toInt()
        if(mas2[i] == 0) kolOsadkov += 1
    }
    print("в феврале было осадков = ${kolOsadkov}")
}