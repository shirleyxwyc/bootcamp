public class SuperArrayList<T> {
  private T[] values;

  // Constructor
  // public SuperArrayList(T[]values){
  // this.values=values;
  // }
  
  public SuperArrayList() {
    this.values = (T[]) new Object[0];
  }

  // get
  // public T[] getValueT (){
  // return this.values;
  // }
  public T get(int index) {
    if (index < 0 || index >= this.values.length)
      return null;
    return this.values[index];
  }

  public int size() {
    return this.values.length;
  }

  // set
  //public void setValue(T[] values) {
    //this.values = values;
  //}

  // add
  // public void add(T value){
  // T[] superArrayList = new T<>[this.values.length+1];
  // for(int i=0; i<this.values.length;i++){
  // superArrayList[i]=this.values[i];
  // }
  // superArrayList[superArrayList.length-1]=value;
  // this.values=superArrayList;
  // }

  public void add(T value) {
    T[] newValues = (T[]) new Object[this.values.length + 1];
    for (int i = 0; i < this.values.length; i++) {
      newValues[i] = this.values[i];
    }
    newValues[newValues.length - 1] = value;
    this.values = newValues;
  }

  public static void main(String[] args) {
    SuperArrayList<String> strings = new SuperArrayList<>();
    strings.add("abc");
    strings.add("def");
    // ArrayList -> naturally support for-each
    // for (String s : strings) { }

    for (int i = 0; i < strings.size(); i++) {
      System.out.println(strings.get(i));
    }


  }
}
