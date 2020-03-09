package SimpleFactory;
/*
简单工厂模式
* */
public class FactoryCar {
    public   static Car carType(String type){
        Car car=null;
        if (type == "奥迪") {
            Car aoDi = new AoDi();
            car=aoDi;
        }
        if (type == "奔驰") {
            BenChi benChi = new BenChi();
            car=benChi;
        }
        return car;
    }

    public static void main(String[] args) {
        FactoryCar factoryCar = new FactoryCar();
        Car aoDi = factoryCar.carType("奥迪");
        aoDi.run();
        Car 奔驰 = factoryCar.carType("奔驰");
        奔驰.run();
    }
}
