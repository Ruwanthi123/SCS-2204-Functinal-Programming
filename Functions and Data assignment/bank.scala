//Q3,Q4
package test1

object bank {

  class account(name:String, accNo:Int, bal:Int){

    def Name = name
    def Acc_No = accNo
    var balance = bal

    def transfer(a:account, amount:Int) = {
      this.balance = this.balance-amount
      a.balance = a.balance+amount
    }

    def +(a:account) = new account(Name, Acc_No, this.balance + a.balance)

    def <(n:Int) = if(this.balance < n) true else false

    def interest:Double = if(balance > 0) this.balance*105/100 else this.balance*110/100

    override def toString = ""+balance

  }

  def main(args: Array[String]): Unit = {



    var a1 = new account("Kamal", 20015004, 1800)
    var a2 = new account("sunil", 20015005, 5000)
    var a3 = new account("Amal", 20015006, -800)

    var bank:List[account]=List(a1, a2, a3)

    val totalBalance=(b:List[account])=> b.reduce((x,y)=>x+y)
    val finalBalance=(b:List[account])=> b.map(_.interest)
    val overDraft = (b:List[account])=> b.filter(x=>x<0)

    println("sum of acc balances : " + totalBalance(bank))
    println("overDraft List = " + overDraft(bank))
    println("final balances of accounts : "+finalBalance(bank))
    println("transfer 100 a1 to a2")
    a1.transfer(a2, 100)
    println("final balances of accounts : "+finalBalance(bank))
  }

}