public class Fruit {
    String name;
    String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "frukt: " + name;
    }
}
class Apple extends  Fruit{
    String applename;
    String applenum;

    public String getApplenum() {
        return applenum;
    }

    public void setApplenum(String applenum) {
        this.applenum = applenum;
    }



    public String getApplename() {
        return applename;
    }

    public void setApplename(String applename) {
        this.applename = applename;
    }
    @Override
    public String toString() {
        return "Apple: " +applename;
}

class Orenge extends Fruit{
    String orengename;
    String orangenum;

    public String getOrangenum() {
        return orangenum;
    }

    public void setOrangenum(String orangenum) {
        this.orangenum = orangenum;
    }



    public String getOrengename() {
        return orengename;
    }

    public void setOrengename(String orengename) {
        this.orengename = orengename;
    }
    @Override
    public String toString(){
        return "Orenge: "+ orengename;
    }


}

}
