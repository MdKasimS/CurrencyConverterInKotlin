fun main()
{
    var choice: Int = 0

    do {
        println("Currency Converter")

        print("Choose Operation : ")

        choice = readLine()!!.toInt()
        when(choice)
        {
            1-> OldPound().convertToOldPounds()
//            2-> DecimalPound().convertToDecimalPounds()
        }

    }while(choice!=3)



}
