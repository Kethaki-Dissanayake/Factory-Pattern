
public class FactoryDemoPattern {

    public static void main(String[] args){
        PhoneFactory phoneFactory= new PhoneFactory();

        Phone myPhone = phoneFactory.getPhone("low price");
        myPhone.showSpec();

        Phone myPhone2 = phoneFactory.getPhone("Middle range price");
        myPhone2.showSpec();

        Phone myPhone3 = phoneFactory.getPhone("Expensive");
        myPhone3.showSpec();



    }
}

