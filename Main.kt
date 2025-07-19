fun main()
{
    var choice: Int = 0

    do {
        println("Currency Converter")

        println("1. Convert New Decimal Pounds To Old British Pound")
        println("2. Convert Old British Pound To New Decimal Pounds")
        println("3. Add Old Pounds")
        println("4. Add New Pounds")
        println("5. Exit")
        print("Choose Operation : ")

        choice = readLine()!!.toInt()
        when(choice)
        {
            1-> OldPound().convertToOldPound()
            2-> DecimalPound().convertToDecimalPound()
        }

    }while(choice!=3)
}
