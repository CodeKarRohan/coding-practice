package com.rnl.prc.design.buiilder;



public class Computer {


    //required
    private String HDD;
    private String RAM;


    //optional
    private boolean isGraphicEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder cb){
        this.RAM = cb.RAM;
        this.HDD = cb.HDD;
        this.isBluetoothEnabled = cb.isBluetoothEnabled;
        this.isGraphicEnabled = cb.isGraphicEnabled;
    }


    public static  class ComputerBuilder{
        //required
        private String HDD;
        private String RAM;


        //optional
        private boolean isGraphicEnabled;
        private boolean isBluetoothEnabled;

        public  ComputerBuilder(String hdd, String ram){
            this.HDD = hdd;
            this.RAM = ram;
        }

        public  ComputerBuilder setIsGraphicEnabled(boolean g){
            this.isGraphicEnabled = g;
            return this;
        }
        public  ComputerBuilder setIsBluetoothEnabled(boolean b){
            this.isBluetoothEnabled = b;
            return this;
        }

        public  Computer build(){
            return  new Computer(this);
        }
    }


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicEnabled() {
        return isGraphicEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicEnabled=" + isGraphicEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }


}
