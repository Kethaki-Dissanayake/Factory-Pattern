
public class PhoneFactory {
    public Phone getPhone(String shapeType){
        if(shapeType==null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("Low Price")) {
            return new HuaweiPhone();
        }

        else if(shapeType.equalsIgnoreCase("Middle range price")) {
            return new SamsungPhone();
        }

        else if(shapeType.equalsIgnoreCase("Expensive")) {
            return new Iphone();
        }
        return null;

    }

}


