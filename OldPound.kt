class OldPound {
    var Pounds:Int = 0
    var Shillings:Int = 0
    var Pence:Int = 0

    var newPoundValues: MutableList<String>? = mutableListOf<String>()

    fun convertToOldPounds()
    {
        print("Enter Decimal Pound Value : ")
        var newPoundString = readLine()

        var cleaned = newPoundString?.replace("\\s".toRegex(), "")
        cleaned = cleaned?.replace("[^£.\\d]".toRegex(), "")

        println(cleaned)

        newPoundValues = cleaned?.split("£")
            ?.filter { it.isNotBlank() }
            ?.toMutableList()

        if(newPoundValues!!.count()>1)
        {
            println("Contains only 1 value : ${newPoundValues[0]}")
        }

        println(newPoundValues)
    }


    override fun toString():String
    {
        return "${163.toChar()}${Pounds}.${Shillings}.${Pence}"
    }
}