class DecimalPound : OldPound(){

    fun convertToDecimalPound()
    {
        print("Enter Old Pound Value : ${163.toChar()}")
        var newPoundString = readLine()

        var cleaned = newPoundString?.replace("\\s".toRegex(), " ")
        cleaned = cleaned?.replace("[^£.\\d]".toRegex(), "")

        newPoundValues = cleaned?.split("£")
            ?.filter { it.isNotBlank() }
            ?.toMutableList()

        newPoundValues?.removeAll { it.count { ch -> ch == '.' } > 2 }

        for(i in newPoundValues!!)
        {
            print("£${i} in decimal pounds : ${163.toChar()}")

            var subParts =  i.split("\\.".toRegex()).toMutableList()

            var newPounds = 0.0

            when(subParts.count())
            {
                1->
                {
                    newPounds = subParts.get(0).toDouble() * 240/100
                }

                2->
                {
                    Pounds = subParts.get(0).toInt()
                    Shillings = subParts.get(1).toInt()
                    if(Shillings>19)
                    {
                        println("Wrong input")
                        return
                    }

                    var totalPence = Shillings * 12 + Pounds * 12 * 20
                    newPounds = totalPence.toDouble() / 240.0

                }

                3->
                {
                    Shillings = subParts.get(1).toInt()
                    Pence = subParts.get(2).toInt()
                    if(Shillings>19 || Pence>11)
                    {
                        println("Wrong input")
                        return
                    }
                    Pounds = subParts.get(0).toInt()

                    var totalPence = Pence + Shillings * 12 + Pounds * 12 * 20
                    newPounds = totalPence.toDouble() / 240.0

                }

            }
            println("£${newPounds}")

        }

    }

}