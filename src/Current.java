/*
 * class:-Current class extends Account to accept & display data
 */
public class Current extends Account {
 Current()
 {
  
 }
 
 	public Current(int id, String name, String address, int phone_no,
 			int account_no) {
 			super(id, name, address, phone_no, account_no);

 	}
	//refer to superclass method accept
 	void accept(){
 			super.accept();
	}
	//refer to superclass method display
 	void display(){
 			super.display();
	}

}