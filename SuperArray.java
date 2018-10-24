public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(String[] data) {
    data = new String[10];
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
    }
    return true;
  }
}
