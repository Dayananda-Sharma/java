class Device extends ElectronicDevice{
  public String deviceName;
  public int devicePrice;
  public char grade;
  public long years;
  public boolean goodDevice;
  public double deviceGst;
  public float expirydate;
  
  public Device(String deviceName,int devicePrice,char grade,long years,boolean goodDevice,double deviceGst,float expirydate){
  super();
  this.deviceName=deviceName;
  this.devicePrice=devicePrice;
  this.grade=grade;
  this.years=years;
  this.goodDevice=goodDevice;
  this.deviceGst=deviceGst;
  this.expirydate=expirydate;
  }
  public void displayDevice(){
   System.out.println("About Device"+this.deviceName);
   System.out.println("About ElectronicDevice"+super.deviceName);
   System.out.println("About Device"+this.devicePrice);
   System.out.println("About ElectronicDevice"+super.devicePrice);
   System.out.println("About Device"+this.grade);
   System.out.println("About ElectronicDevice"+super.grade);
   System.out.println("About Device"+this.years);
   System.out.println("About ElectronicDevice"+super.years);
   System.out.println("About Device"+this.goodDevice);
   System.out.println("About ElectronicDevice"+super.goodDevice);
   System.out.println("About Device"+this.deviceGst);
   System.out.println("About ElectronicDevice"+super.deviceGst);
   System.out.println("About Device"+this.expirydate);
    System.out.println("About ElectronicDevice"+super.expirydate);
    }
  }
