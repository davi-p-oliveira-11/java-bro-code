package CopyObjects;

public class Car {

  private String make;
  private String model;
  private int year;

  public Car(String make, String model, int year) {
     this.setMake(make);
     this.setModel(model);
     this.setYear(year);
  }

  Car(Car x) {
    this.copy(x);
  }
  
  // getter methods

  public String getMake() {
     return make;
  }

  public String getModel() {
     return model;
  } 

  public int getYear() {
     return year;
  }

  // setter methods

  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void copy(Car x) {
    this.setMake(x.getMake());
    this.setModel(x.getModel());
    this.setYear(x.getYear());
  }

}
