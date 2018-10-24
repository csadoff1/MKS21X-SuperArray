public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(String[] data, int size) {
    data = new String[10];
    this.size = size;
  }
  public void clear() {
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return (size == 0);
  }
  public boolean add(String a) {
    if (size < data.length) {
      for (int i=0; i<data.length; i++) {
        if (data[i]== null) {
          data[i] = a;
        }
      }
      size++;
    }
    return true;
  }
  public String toString() {
    String newStr = "";
    newStr = newStr + "[";
    for (int i=0; i<data.length; i++) {
      if (i<data.length-1) {
        newStr = newStr + data[i] + ", ";
      }
      else {
        newStr = newStr + data[i] + "]";
      }
    }
    return newStr;
  }
}
