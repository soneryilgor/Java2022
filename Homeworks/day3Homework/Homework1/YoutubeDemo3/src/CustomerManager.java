public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer=customer;
        _creditManager=creditManager;
    }
    public String nameChoice(){
        return (_customer.getFirstName() == null ? _customer.getCompanyName() : _customer.getFirstName());
    }
    public void save(){
        System.out.println("Müşteri kaydedildi : "+nameChoice());
    }
    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("Kredi verildi : "+nameChoice());
    }
    public void delete(){
        System.out.println("Müşteri silindi : "+nameChoice());
    }
}