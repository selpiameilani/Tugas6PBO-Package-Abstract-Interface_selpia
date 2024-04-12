public class MacBook implements Laptop {
    private int volume;
    private boolean is_power_on;
    
    public MacBook() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop menyala");
        System.out.println("Macbook Pro");
    }

    @Override
    public void powerOff() {
        is_power_on = false ;
        System.out.println("Proses shutdown sedang berlangsung... ");
    }

    @Override
    public void VolumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume sudah mencapao leve; maksimum");
            } else {
                this.volume += 10;
               System.out.println("Volume sekarang: " + this.getVolume());
            }
        }
    }

    @Override
    public void VolumeDown() {
        if (is_power_on) {
            if (this.volume == MIN_VOL) {
                System.out.println("Volume sekarang 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Laptop mati");
        }
    }

    public int getVolume() {
        return this.volume;
    }
    }
    
}
