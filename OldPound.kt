open class OldPound {
    var Pounds:Int = 0
    var Shillings:Int = 0
    var Pence:Int = 0

    var newPoundValues: MutableList<String>? = mutableListOf<String>()

    fun convertToOldPound()
    {
        print("Enter Decimal Pound Value : ${163.toChar()}")
        var newPoundString = readLine()

        var cleaned = newPoundString?.replace("\\s".toRegex(), " ")
        cleaned = cleaned?.replace("[^£.\\d]".toRegex(), "")

        newPoundValues = cleaned?.split("£")
            ?.filter { it.isNotBlank() }
            ?.toMutableList()

        newPoundValues?.removeAll { it.count { ch -> ch == '.' } > 1 }

        for(i in newPoundValues!!)
        {
            print("£${i} in old pounds is ")

                var totalPence = i.toDouble() * 240

                Pence = totalPence.toInt() % 12

                Shillings = totalPence.toInt()/12

                if(Shillings>=20)
                {
                    Pounds = Shillings/20
                    Shillings = Shillings%20
                }

                println("£${Pounds}.${Shillings}.${Pence}")

        }
    }

    override fun toString():String
    {
        return "${163.toChar()}${Pounds}.${Shillings}.${Pence}"
    }
}