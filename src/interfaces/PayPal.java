
package interfaces;


public class PayPal extends Pago implements Pagable {
    private String email;
    
    public PayPal(double monto, String email){
        super(monto);
        this.email = email;
        
    }
    
    @Override
    public void pagar(){
        System.out.println("Pagando $" + monto + "a traves de PayPal " + email);
    }
}
