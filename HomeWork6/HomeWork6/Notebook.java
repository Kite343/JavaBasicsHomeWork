package HomeWork6;

public class Notebook {
    private String company;
    private String model;
    private String color;
    private float diagonal;
    private int hardDriveV;
    private int ramVol;
    private String os;
    private int price;

    public Notebook(){

    }

    public Notebook(String company, String model){
        this.company = company;
        this.model = model;
    }

    public Notebook(String company, String model, String color, float diagonal, int hardDriveV, int ramVol, String os, int price){
        this.company = company;
        this.model = model;
        this.color = color;
        this.diagonal = diagonal;
        this.hardDriveV = hardDriveV;
        this.ramVol = ramVol;
        this.os = os;
        this.price = price;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return company;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setDiagonal(float diagonal){
        this.diagonal = diagonal;
    }

    public float getDiagonal(){
        return diagonal;
    }

    public void setHardDriveV(int hardDriveV){
        this.hardDriveV = hardDriveV;
    }

    public int getHardDriveV(){
        return hardDriveV;
    }

    public void setRAMvol(int ramVol){
        this.ramVol = ramVol;
    }

    public int getRAMvol(){
        return ramVol;
    }

    public void setOS(String os){
        this.os = os;
    }

    public String getOS(){
        return os;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getName(){
        return this.company + " " + this.model;
    }

    public String getInfo(){
        return this.company + " " + this.model + "\nЦвет " + color + "\nДиагональ " + diagonal +
         "\nОбъем жесткого диска " + hardDriveV + "\nОбъем оперативной памяти " + ramVol + "\nОперационная система " + os + "\nЦена " + price;
    }
}
