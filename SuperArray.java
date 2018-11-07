public class SuperArray{
  private String[] data;
  private int size=0;

  public SuperArray() {
    data = new String[10];
  }

  public SuperArray(int startingCapacity) {
    if (startingCapacity < 0){
      throw new IllegalArgumentException();
    }
    data = new String[startingCapacity];
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
        if (data[i] == null) {
          data[i] = a;
          break;
        }
      }
      size++;
    }
    else {
      this.resize();
      for (int i=0; i<data.length; i++) {
        if (data[i] == null) {
          data[i] = a;
          break;
        }
      }
      size++;
    }
    return true;
  }

  public String toString() {
    String newStr = "";
    newStr = newStr + "[";
    for (int i=0; i<size; i++) {
      if (i<size-1) {
        newStr = newStr + data[i] + ", ";
      }
      else {
        newStr = newStr + data[i] + "]";
      }
    }
    return newStr;
  }

  public String toStringDebug() {
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

  public String get(int i) {
    if (i < 0 || i >= size()) {
      throw new IndexOutOfBoundsException("get from invalid index");
    }
    else {
      return data[i];
    }
  }

  public String set(int i, String str) {
    String orig = "";
    if (i < 0 || i >= size()) {
      throw new IndexOutOfBoundsException("set to invalid index");
    }
    else {
      orig = data[i];
      data[i] = str;
    }
    return orig;
  }

  private void resize() {
    String[] newData = new String[(data.length * 2) + 1];
    for (int i=0; i<data.length; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }

  public boolean contains(String target) {
    for (int i=0; i<size(); i++) {
      if (data[i].equals(target)) {
        return true;
      }
    }
    return false;
  }

  public int indexOf(String element) {
    int index = -1;
    for (int i=0; i<data.length; i++) {
      if (data[i].equals(element)) {
        index=i;
        break;
      }
    }
    return index;
  }

  public int lastIndexOf(String element) {
    int index = -1;
    for (int i=0; i<data.length; i++) {
      if (data[i].equals(element)) {
        index=i;
      }
    }
    return index;
  }

  public void add(int a, String element) {
    if (a < 0 || a > size()) {
      throw new IndexOutOfBoundsException("added to invalid index");
    }
    else {
    if (size >= data.length) {
      this.resize();
      for (int i=a; i<data.length-1; i++) {
        data[i+1] = data[i];
      }
    }
    else if (size < data.length) {
      for (int i=this.size(); i<data.length-1; i++) {
        data[i+1] = data[i];
      }
    }
      data[a] = element;
    }
    size++;
  }

  public String remove(int a) {
    String orig = data[a];
    if (a < 0 || a >= size()) {
      throw new IndexOutOfBoundsException("removed from invalid index");
    }
    else {
      for (int i=a+1; i<data.length; i++) {
        data[i-1] = data[i];
      }
    }
    return orig;
  }

  public boolean remove(String element) {
      this.remove(indexOf(element));
      return true;
  }

}
