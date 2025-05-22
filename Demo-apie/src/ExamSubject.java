import java.util.Objects;

public class ExamSubject {
  private static int EXAM_CODE=0; //accross objects
  private SubjectName subject;
  private int score;
  private long id;
  

  public static ExamSubject ofEnglish(){
    return new ExamSubject(SubjectName.ENGLISH, ++EXAM_CODE);
  }

  public static ExamSubject ofMATHS(){
    return new ExamSubject(SubjectName.MATHS, ++EXAM_CODE);
  }

  public static ExamSubject ofHISTORY(){
    return new ExamSubject(SubjectName.HISTORY, ++EXAM_CODE);
  }

  //!private Constructor
  private ExamSubject (SubjectName subject, long id){
    this.subject=subject;
    this.id=id;
  }

  public String getName() {
    return this.subject.name();
  }

  public int getScore(){
    return this.score;
  }
  public long getId(){
    return this.id;
  }

  public void setScore(int score){
    this.score=score;
  }

  //The default equals() method in Object checks for reference equality, 
  //meaning it only returns true when both references point to the same instance. 
  //To compare object content, you need to override this method as below:
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof ExamSubject))
      return false;
      ExamSubject subjectScore = (ExamSubject) obj;
    return this.id==subjectScore.getId();
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject,id); 
  }

  @Override
  public String toString() {
    return "ExamSubject(" 
      + "id=" + this.id
      + ",name=" + this.subject.name()
      + ",score=" + this.score
      + ")";
  }

  


  //!Class inside a Class
  public enum SubjectName {
    ENGLISH, MATHS, HISTORY,;
  }



  public static void main(String[] args) {
    //ExamSubject e1 =new ExamSubject(SubjectName.ENGLISH, 90);-added static method
    //ExamSubject e2 =new ExamSubject(SubjectName.ENGLISH, 90);-added static method
    //System.out.println(e1.equals(e2));//true-added static method
    ExamSubject es1 = ExamSubject.ofEnglish();
    System.out.println(es1.getName());//ENGLISH

    //System.out.println(e1.hashCode());//1282132903
    //System.out.println(e2.hashCode());//1282132903

    es1.setScore(80);
    System.out.println(es1.getScore());

    System.out.println(es1); // ExamSubject(id=1,name=ENGLISH,score=80)


  }

}
