fun main(args: Array<String>) {

    mainLoop()
}
fun mainLoop()
{


    val son=GenerateRandomList()
    var tahmin="3456"
    var pos=0
    var plus=0
    var negative=0
    for (i in tahmin)
    {
        println("i="+i)
        println("son="+son)
        if (son.contains(i.toString()))
        {
            var index=son.indexOf(i.toString())
            println(index)
            if(index==pos)
            {
                plus+=1
            }
            else{
                negative-=1
            }
        }
    }

    println("plus="+plus)
    println("negative="+negative)

}
fun GenerateRandomList():List<String> {
    val myset= mutableSetOf<String>()
    while (myset.size!=4)
    {
        myset.add((0..9).random().toString())
    }
    val list=myset.toList()
    println(list)
    return list

}