package cats;

public abstract class Furniture {
private Double length;
private Double height;

public Furniture(Double length, Double height) {

this.setLength(length);
this.setHeight(height);
}

public Double getLength() {
return length;
}
public void setLength(Double length) {
this.length = length;
}
public Double getHeight() {
return height;
}
public void setHeight(Double height) {
this.height = height;
}
}