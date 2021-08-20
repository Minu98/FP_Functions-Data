package mypackage4

object Q04 extends App {

    var bank : List[Account] = List( new Account("Minura" , 1 , -1000) , new Account("Ratnayake" , 2 , 2000) )

    val find = ( n : Int , b : List[Account]) => b.filter( x => x.accountNumber.equals( n ))

    val overdraft = ( b : List[Account] ) => b.filter( x => x.balance < 0)

    val balance = ( b: List[Account] ) => b.map( x => (x,x.balance) ).reduce( (a , c) => x = (1,2,4,5,6)  )
    
   

    val interest = ( b : List[Account] ) => b.map( x => {
        x.balance match {
            case a if a >= 0 => x.deposite(x.balance) * 0.05 == x.deposite(x.balance*0.05)
            case _ => x withdraw Math.abs(x.balance) * 0.01

        }
        x
    })


    println("bank " + bank )
    println()
    println("find " + find( 2 , bank) )
    println()
    println("overdraft " + overdraft( bank ) )
    println()
    println("balance " + balance( bank )._2 )
    println()

    bank = interest( bank )

    println("bank " + bank )
    println()
    println("balance " + balance( bank )._2 )
    println()

}