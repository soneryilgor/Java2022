public abstract class BaseCreditManager implements ICreditManager{
    //Calculate fonksiyonu abstract olduğu için alt sınıflarda tanımlanmalıdır!
    public abstract void calculate();
    public void save(){
        System.out.println("Kaydedildi");
    }
}