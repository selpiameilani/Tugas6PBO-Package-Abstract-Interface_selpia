public class LaptopUser {
    
    private Laptop laptop;
    
    private LaptopUser(Laptop Laptop){
        this.laptop = Laptop ;
    }
    
    void trunOnLaptop (){
        this.laptop.powerOn();
    }
    
    void trunOffLaptop () {
        this.laptop.powerOff();
    }
    
    void makeLaptopLouder() {
        this.laptop.VolumeUp();
    }
    
    void makeLaptopSilence() {
        this.laptop.VolumeDown();
    }
    
}
