package mypackage3

object Q03 {
  def main(args:Array[String]){
    val x=new Account(3245667,10000);
    val y=new Account(3325791,6000);
    x.Transfer(y,1500);
    
  }
  
  class Account(ac:Int,v:Int){
    val acnum:Int=ac;
    var amount:Int=v;
    
    def NewValues( a:Account,sender:Int,receiver:Int) {
      new Account(this.acnum,sender);
      new Account(a.acnum,receiver);
      println("Account Number : "+this.acnum,"Amount : "+this.amount);
      println("Account Number : "+a.acnum,"Amount : "+a.amount);
    }
    
    
    def Transfer(a:Account,value:Int) {
      this.amount=this.amount-value;
      a.amount=a.amount+value;
      NewValues(a,this.amount,a.amount);
    }
    
  }
}