public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 0;
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
      return null;
    }
    else {
      return data[i];
    }
  }

  public String set(int i, String str) {
    if (i < 0 || i >= size()) {
      return "Error";
    }
    else {
      data[i] = str;
    }
    return data[i];
  }

  private void resize() {
    String[] newData = new String[data.length * 2];
    for (int i=0; i<data.length; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }

  public boolean contains(String target) {
    boolean contain = false;
    for (int i=0; i<data.length; i++) {
      if (data[i].equals(target)) {
        contain = true;
      }
    }
    return contain;
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

}
